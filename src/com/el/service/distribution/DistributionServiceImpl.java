package com.el.service.distribution;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.ws.Holder;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.action.distribution.IDistributionConstants;
import com.el.action.distribution.RequestParameterBody;
import com.el.action.distribution.reponseModel.DeliverymanModel;
import com.el.action.distribution.reponseModel.DistributionModel;
import com.el.action.distribution.reponseModel.PaymentModel;
import com.el.action.distribution.reponseModel.ProductModel;
import com.el.action.distribution.reponseModel.ReponseOrderData;
import com.el.action.distribution.reponseModel.ShopModel;
import com.el.action.distribution.reponseModel.UserModel;
import com.el.dao.Procedures.IProceDAO;
import com.el.dao.Procedures.ProceWork;
import com.el.dao.distribution.IF4101DAO;
import com.el.dao.distribution.IF41021DAO;
import com.el.dao.distribution.IF58h0401DAO;
import com.el.dao.distribution.IF58h0411DAO;
import com.el.dao.distribution.IFE1DM11DAO;
import com.el.dao.distribution.IFE1DM12DAO;
import com.el.dao.distribution.IFE1DM19DAO;
import com.el.dao.distribution.IFE4DS001DAO;
import com.el.dao.distribution.IFE4LN001DAO;
import com.el.dao.distribution.IFE4PT001DAO;
import com.el.dao.distribution.IMcuDAO;
import com.el.dao.distribution.IMyTest2DAO;
import com.el.dao.distribution.IMyTestDAO;
import com.el.dao.distribution.IUdcDAO;
import com.el.entity.Fe14710a;
import com.el.entity.erpdb.F00022;
import com.el.entity.erpdb.F4101;
import com.el.entity.erpdb.F41021;
import com.el.entity.erpdb.F58h0401;
import com.el.entity.erpdb.F58h0411;
import com.el.entity.erpdb.FE1DM19;
import com.el.entity.erpdb.FE1dm11;
import com.el.entity.erpdb.FE1dm12;
import com.el.entity.erpdb.FE4DS001;
import com.el.entity.erpdb.FE4PT001;
import com.el.entity.erpdb.FE4ln001;
import com.el.entity.erpdb.FE4ln001PK;
import com.el.service.IJDEWebService;
import com.el.util.CalculateSignHelp;
import com.el.util.HttpRequestUtil;
import com.el.util.JDType;
import com.el.util.Md5;
import com.el.util.PropertiesUtil;
import com.el.util.TH;
import com.google.gson.Gson;

@Service("distributionService")
public class DistributionServiceImpl implements IDistributionService {

	public enum ORDER_TYPE {// 订单状态:待抢,已抢,已配送
		TODO, OBTAIN, DELIVERIED
	}

	@Autowired
	private IMyTestDAO myTestDAO;
	@Autowired
	private IMyTest2DAO myTest2DAO;
	@Autowired
	private IFE1DM11DAO fe1dm11DAO;
	@Autowired
	private IFE1DM12DAO fe1dm12DAO;
	@Autowired
	private IUdcDAO udcDAO;
	@Autowired
	private IMcuDAO mcuDAO;
	@Autowired
	private IF58h0401DAO f58h0401DAO;
	@Autowired
	private IF58h0411DAO f58h0411DAO;
	@Autowired
	private IF4101DAO f410DAO;
	@Autowired
	private IFE1DM19DAO fe1dm19DAO;
	@Autowired
	private IFE4DS001DAO fe4ds001DAO;
	@Autowired
	private IFE4PT001DAO fe4pt001DAO;
	@Autowired
	private IJDEWebService jdeWebServiceImpl;
	@Autowired
	private IProceDAO proceDAO;
	@Autowired
	private IFE4LN001DAO fe4ln001DAO;
	@Autowired
	private IF41021DAO f41021DAO;

	@Override
	@Transactional
	public int test_interfaceDB() throws Exception {
		Object[] params = new Object[1];
		params[0] = "400";
		String hql = "from Fe14710a where LSUKID>? and LSUKID<500 order by LSUKID";
		List<Fe14710a> list = myTestDAO.queryForList(hql, params);
		int count = list.size();
		return count;
	}

	@Override
	@Transactional
	public int test_erpDB() {
		Object[] params = new Object[1];
		params[0] = "1";
		String hql = "from F00022 where ukukid=? order by UKOBNM";
		List<F00022> list = myTest2DAO.queryForList(hql, params);
		int count = list.size();
		return count;
	}

	/**
	 * 获取订单列表
	 * 
	 * @param body
	 *            接收到的请求对象，包含用于查询的参数条件
	 * @param orderType
	 *            查询订单的类型（待抢、已抢、已配送）
	 * @return
	 */
	private TreeMap<String, Object> getOrderList(RequestParameterBody body,
			ORDER_TYPE orderType) {
		List<FE1dm11> fe1dm11List = new ArrayList<FE1dm11>();
		Map<String, String> moneyMap = new HashMap<String, String>();
		Map<String, String> uomMap = new HashMap<String, String>();
		Map<String, String> mcuMap = new HashMap<String, String>();// mcu信息的Map对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df = new DecimalFormat("0.00");
		try {
			/**
			 * 由数据库查询出配送单相关信息
			 */
			fe1dm11List = getFE1dm11List(body, orderType);// 配送单表头数据
			moneyMap = udcDAO.getUdc("E1", "PT");// 付款方式
			uomMap = udcDAO.getUdc("00", "UM");// 计量单位
			mcuMap = mcuDAO.getAllMcu();
			/**
			 * 将查询出的数据，整理组装，存入List中
			 */
			List<ReponseOrderData> dataList = new ArrayList<ReponseOrderData>();
			ShopModel shop = null;
			DistributionModel distribution = null;
			UserModel user = null;
			ArrayList<PaymentModel> payment = new ArrayList<PaymentModel>();
			DeliverymanModel deliveryman = null;
			ArrayList<ProductModel> products = new ArrayList<ProductModel>();
			// 遍历数据
			for (FE1dm11 fe1dm11 : fe1dm11List) {
				// 清空旧数据
				payment = new ArrayList<PaymentModel>();
				products = new ArrayList<ProductModel>();
				// 站点信息
				shop = new ShopModel(TH.getStr(fe1dm11.getDomcu()),
						TH.getStr(mcuMap.get(fe1dm11.getDomcu())));
				// 配送单信息
				F58h0401 f58h0401 = f58h0401DAO
						.queryByDoco(fe1dm11.getDororn());// 查找对应的订单表头信息
				double che58tsua = f58h0401.getChe58tsua() == null ? 0
						: f58h0401.getChe58tsua();// 应收总金额
				// double che58hpaam = f58h0401.getChe58hpaam() == null ? 0 :
				// f58h0401.getChe58hpaam();//已收款金额
				String remark = TH.getStr(f58h0401.getChe58hus24()) + " "
						+ TH.getStr(f58h0401.getChe58hus25());// 备注
				distribution = new DistributionModel(
						TH.getStr(fe1dm11.getDororn()),
						f58h0401.getChtrdj() == null ? "" : sdf.format(JDType
								.toDate(Integer.parseInt(String
										.valueOf(f58h0401.getChtrdj())))),
						fe1dm11.getFe1dm11pk().getDoe1psn() == null ? ""
								: fe1dm11.getFe1dm11pk().getDoe1psn()
										.toString(),
						fe1dm11.getDoe58hrsd() == null ? "" : sdf.format(JDType
								.toDate(Integer.parseInt(String.valueOf(fe1dm11
										.getDoe58hrsd())))),
						fe1dm11.getDoe58hrst() == null ? "" : JDType
								.toTimeString(Integer.parseInt(String
										.valueOf(fe1dm11.getDoe58hrst()))),
						fe1dm11.getDoe58hus01() == null ? ""
								: JDType.toTimeString(Integer.parseInt(String
										.valueOf(fe1dm11.getDoe58hus01().trim()))),
						TH.getStr(mcuMap.get(f58h0401.getChmcu())), f58h0401
								.getChe58gpayf(), df.format(che58tsua / 100),
						TH.getStr(remark), TH.getStr(fe1dm11.getDonxtr()));
				// 收货人信息
				user = new UserModel(TH.getStr(fe1dm11.getDoe58hmn()),
						TH.getStr(fe1dm11.getDoe58hrno()), 1, // TODO 暂时写死
						fe1dm11.getFullAddress());
				// 支付信息
				List<FE4PT001> fe4pt001List = fe4pt001DAO.queryByCondition(
						fe1dm11.getDororn(), fe1dm11.getDorcto(),
						fe1dm11.getDorkco());// 订单付款方式表
				for (FE4PT001 fe4pt001 : fe4pt001List) {
					payment.add(new PaymentModel(TH.getStr(fe4pt001
							.getFe4pt001pk().getPte58pt()),
							TH.getStr(moneyMap.get(fe4pt001.getFe4pt001pk()
									.getPte58pt().trim())),
							fe4pt001.getPtag() == null ? "0.0" : fe4pt001
									.getPtag() / 100 + ""));
				}
				// 配送员信息
				FE1DM19 fe1dm19 = fe1dm19DAO.queryByCondition(fe1dm11
						.getFe1dm11pk().getDoe1psn(),
						IDistributionConstants.NXTR_ASSIGN);// 配送单历史信息表
				FE4DS001 fe4ds001 = fe4ds001DAO.queryByAn8(fe1dm19.getDlurrf());// 配送员信息表
				deliveryman = new DeliverymanModel(TH.getStr(fe1dm19
						.getDlurrf()), TH.getStr(fe4ds001.getDsalph()),
						TH.getStr(fe4ds001.getDsph1()));
				// 配送商品信息
				switch (orderType) {
				case TODO:
					products.addAll(getProductList_f58h0411(fe1dm11, uomMap));
					break;
				case OBTAIN:
					products.addAll(getProductList_f58h0411(fe1dm11, uomMap));
					break;
				case DELIVERIED:
					// products.addAll( getProductList_fe1dm12(fe1dm11, uomMap)
					// );
					products.addAll(getProductList_f58h0411(fe1dm11, uomMap));
					break;
				}
				// 存入list中
				dataList.add(new ReponseOrderData(shop, distribution, user,
						payment, deliveryman, products));
			}
			/**
			 * 是否需要按配送员id进行筛选
			 */
			if (body.getDeliverymanid() != null
					&& !body.getDeliverymanid().trim().equals("")) {
				List<ReponseOrderData> tempList = new ArrayList<ReponseOrderData>();
				for (ReponseOrderData data : dataList) {
					String deliverymanId = data.getDeliveryman().getUrrf();
					if (deliverymanId.equals(body.getDeliverymanid().trim())) {
						tempList.add(data);
					}
				}
				dataList = tempList;
			}
			/**
			 * 构建返回的数据Map
			 */
			List<TreeMap<String, Object>> mapList = new ArrayList<TreeMap<String, Object>>();
			for (ReponseOrderData data : dataList) {
				mapList.add(data.toMap());
			}
			/**
			 * 构建返回的数据Map
			 */
			TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
			bodyMap.put("errno", 0);
			bodyMap.put("error", "success");
			bodyMap.put("data", mapList);
			return bodyMap;
		} catch (Exception e) {
			e.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 201);
			errorMap.put("error", "failure");
			errorMap.put("data", e.getMessage());
			return errorMap;
		}
	}

	/**
	 * 获取配送的商品明细数据 FE1DM11.NXTR IN (1，2，3，4，10)时：从F58H0411取数据，FE1DM11.E1PSN =
	 * F58H0411.E1PSN
	 * 
	 * @param fe1dm11
	 *            对应的配送信息
	 * @param uomMap
	 *            计量单位UDC的map对象
	 * @return
	 * @throws Exception
	 */
	private List<ProductModel> getProductList_f58h0411(FE1dm11 fe1dm11,
			Map<String, String> uomMap) throws Exception {
		ArrayList<ProductModel> products = new ArrayList<ProductModel>();
		List<F58h0411> f58h0411List = f58h0411DAO.queryByCondition(fe1dm11
				.getFe1dm11pk().getDoe1psn());
		for (F58h0411 f58h0411 : f58h0411List) {
			F4101 f4101 = f410DAO.queryByLitm(f58h0411.getChlitm());// 商品描述信息
			ProductModel product = new ProductModel(
					f58h0411.getChlnid().toString(),
					TH.getStr(f58h0411.getChlitm()),
					TH.getStr(f4101.getIMDSC1()),
					(f58h0411.getChsoqs() / 1000) + "",
					TH.getStr(uomMap.get(f58h0411.getChuom())),
					(f58h0411.getChe58lprc() / 10000) + "",
					(f58h0411.getChsoqs() / 1000 * f58h0411.getChe58lprc() / 100)
							+ "");
			products.add(product);
		}
		return products;
	}

	/**
	 * 获取配送的商品明细数据 FE1DM11.NXTR IN (5,6,7,8,9)时：从FE1DM12取数据，FE1DM11.E1PSN =
	 * FE1DM12.E1PSN
	 * 
	 * @param fe1dm11
	 *            对应的配送信息
	 * @param uomMap
	 *            计量单位UDC的map对象
	 * @return
	 * @throws Exception
	 */
	private List<ProductModel> getProductList_fe1dm12(FE1dm11 fe1dm11,
			Map<String, String> uomMap) throws Exception {
		ArrayList<ProductModel> products = new ArrayList<ProductModel>();
		List<FE1dm12> fe1dm12List = fe1dm12DAO.queryByCondition(fe1dm11
				.getFe1dm11pk().getDoe1psn());
		for (FE1dm12 fe1dm12 : fe1dm12List) {
			F4101 f4101 = f410DAO.queryByLitm(fe1dm12.getDllitm());// 商品描述信息
			ProductModel product = new ProductModel(fe1dm12.getFe1dm12pk()
					.getDllnid().toString(), TH.getStr(fe1dm12.getDllitm()),
					TH.getStr(f4101.getIMDSC1()), (fe1dm12.getDlsoqs() / 1000)
							+ "", TH.getStr(uomMap.get(fe1dm12.getDluom())),
					(fe1dm12.getDle58uprc() / 10000) + "", (fe1dm12.getDlsoqs()
							/ 1000 * fe1dm12.getDle58uprc() / 100)
							+ "");
			products.add(product);
		}
		return products;
	}

	/**
	 * 查询待抢订单
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> getOrder_todo(RequestParameterBody body) {
		return getOrderList(body, ORDER_TYPE.TODO);
	}

	/**
	 * 查询已抢或已配送订单
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> getOrder_done(RequestParameterBody body) {
		if (body.getStatus() != null && body.getStatus().equals("3")) {
			// 查询已配送订单
			return getOrderList(body, ORDER_TYPE.DELIVERIED);
		} else {
			// 查询已抢订单
			return getOrderList(body, ORDER_TYPE.OBTAIN);
		}
	}

	/**
	 * 配送员抢单
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> grabOrder(RequestParameterBody body) {
		String e1psn = body.getE1psn();
		String urrf = body.getDeliveryman().getUrrf();
		FE1dm11 fe1dm11 = null;
		try {
			// 根据e1psn找出配送单表头及明细数据
			fe1dm11 = fe1dm11DAO.queryByE1psn(e1psn);
		} catch (Exception e1) {
			e1.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 203);
			errorMap.put("error", "failure");
			errorMap.put("data", e1.getMessage());
			return errorMap;
		}
		if (fe1dm11.getFe1dm11pk() == null) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 204);
			errorMap.put("error", "failure");
			errorMap.put("data", "没有对应的配送单(id=" + e1psn + ")");
			return errorMap;
		}
		if (!TH.getStr(fe1dm11.getDonxtr()).equals(
				IDistributionConstants.NXTR_PROCESS)) {
			// 只有fe1dm11.donxtr=3（加工）的配送单，能够进行抢单
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 207);
			errorMap.put("error", "failure");
			errorMap.put("data",
					"配送单状态不能进行此操作(nxtr=" + TH.getStr(fe1dm11.getDonxtr()) + ")");
			return errorMap;
		}
		if (TH.getStr(urrf).equals("")) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 208);
			errorMap.put("error", "failure");
			errorMap.put("data", "配送员不能为空");
			return errorMap;
		}
		try {
			// 获取ukid
			Holder<Integer> holder_ukid = new Holder<Integer>();
			Holder<String> tableName = new Holder<String>("FE1DM19");
			int ukid = jdeWebServiceImpl
					.GetNextUniqueID(holder_ukid, tableName);
			if (ukid == 0) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 209);
				errorMap.put("error", "failure");
				errorMap.put("data", "获取UKID失败");
				return errorMap;
			}
			// 更新fe1dm11
			// fe1dm11.setDoe58htlid(Long.parseLong(plKcoo));//3PL公司
			fe1dm11.setDonxtr(IDistributionConstants.NXTR_ASSIGN);
			fe1dm11.setDoan85(Long.valueOf(urrf));
			// 插入fe1dm19
			FE1DM19 fe1dm19 = new FE1DM19();
			fe1dm19.setDlrmk("");
			fe1dm19.setDllttr("5");
			fe1dm19.setDlnxtr(IDistributionConstants.NXTR_ASSIGN);
			fe1dm19.setDlukid((long) ukid);
			fe1dm19.setDle1psn(Long.valueOf(e1psn));
			fe1dm19.setDldcto(fe1dm11.getFe1dm11pk().getDodcto());
			fe1dm19.setDlkcoo(fe1dm11.getDorkco());
			fe1dm19.setDle13pldoc("");// 3PL运单号
			fe1dm19.setDlurrf(urrf);
			fe1dm19.setDluser(IDistributionConstants.APP_USER);
			fe1dm19.setDlpid("JFE1dm19");// 程序号
			fe1dm19.setDljobn("APP");
			fe1dm19.setDlupmj(Long.parseLong(JDType.fromDate(new Date()) + ""));
			fe1dm19.setDlupmt(Long.parseLong(JDType.fromTime(new Date()) + ""));
			fe1dm19DAO.insert(fe1dm19);
			// 更新f58h0401
			F58h0401 f58h0401 = f58h0401DAO.queryByDoco(fe1dm11.getDororn());// 查找对应的订单表头信息
			f58h0401.setChe58hos("620");
			f58h0401.setChupmj(Long.parseLong(JDType.fromDate(new Date()) + ""));
			f58h0401.setChupmt(Long.parseLong(JDType.fromTime(new Date()) + ""));
			f58h0401.setChpid("doLeaflets");
			f58h0401.setChukid(fe1dm11.getDoukid());
			// 调用存储过程
			int result_callPro = CallProcedures_delivery05(Long.valueOf(e1psn));
			if (result_callPro != 1) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 211);
				errorMap.put("error", "failure");
				errorMap.put("data", "存储过程(更新销售单状态)失败:" + result_callPro);
				return errorMap;
			}
		} catch (Exception e) {
			e.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 210);
			errorMap.put("error", "failure");
			errorMap.put("data", e.getMessage());
			return errorMap;
		}
		// 成功
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 0);
		bodyMap.put("error", "success");
		bodyMap.put("data", "true");
		return bodyMap;
	}

	/**
	 * 确认出库 自动计算批次，并扣减可用量
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> reduceInventory(RequestParameterBody body) {
		String e1psn = body.getE1psn();
		FE1dm11 fe1dm11 = null;
		List<F58h0411> f58h0411List = new ArrayList<F58h0411>();
		try {
			// 根据e1psn找出配送单表头及明细数据
			fe1dm11 = fe1dm11DAO.queryByE1psn(e1psn);
			if (fe1dm11.getFe1dm11pk() == null) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 203);
				errorMap.put("error", "failure");
				errorMap.put("data", "没有对应的配送单(id=" + e1psn + ")");
				return errorMap;
			}
			f58h0411List = f58h0411DAO.queryByCondition(fe1dm11.getFe1dm11pk()
					.getDoe1psn());
			if (f58h0411List.size() == 0) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 204);
				errorMap.put("error", "failure");
				errorMap.put("data", "配送单没有明细数据(id=" + e1psn + ")");
				return errorMap;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 205);
			errorMap.put("error", "failure");
			errorMap.put("data", e1.getMessage());
			return errorMap;
		}
		if (!TH.getStr(fe1dm11.getDonxtr()).equals(
				IDistributionConstants.NXTR_ASSIGN)) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 206);
			errorMap.put("error", "failure");
			errorMap.put("data",
					"配送单状态不能进行此操作(nxtr=" + TH.getStr(fe1dm11.getDonxtr()) + ")");
			return errorMap;
		}
		// 为每一行配送单明细数据，计算其应该使用的批次，并写入FE4ln001表
		try {
			// 检查配送单批次表FE4LN001中是否已有同一配送单的数据，若有先删除
			fe4ln001DAO.delete(Long.valueOf(e1psn));
			// 遍历订单明细，计算并插入配送单批次FE4ln001的数据
			for (F58h0411 f58h0411 : f58h0411List) {
				calcAndInsertFE4ln001(fe1dm11, f58h0411);
			}
		} catch (Exception e) {
			e.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 207);
			errorMap.put("error", "failure");
			errorMap.put("data", "获取订单批次失败");
			return errorMap;
		}
		// 成功
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 0);
		bodyMap.put("error", "success");
		bodyMap.put("data", "true");
		return bodyMap;
	}

	/**
	 * 确认出库（调用存储过程来扣减可用量） 自动计算批次，并扣减可用量
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> reduceInventory_callPro(
			RequestParameterBody body) {
		String e1psn = body.getE1psn();
		FE1dm11 fe1dm11 = null;
		// 调用存储过程
		try {
			// 根据e1psn找出配送单表头及明细数据
			fe1dm11 = fe1dm11DAO.queryByE1psn(e1psn);
			int result_callPro = CallProcedures_delivery01(fe1dm11
					.getFe1dm11pk().getDoe1psn(), fe1dm11.getDoukid());
			if (result_callPro != 1) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 208);
				errorMap.put("error", "failure");
				errorMap.put("data", "存储过程(扣减库存)失败:" + result_callPro);
				return errorMap;
			}
			// 更新FE1dm11
			fe1dm11.setDonxtr(IDistributionConstants.NXTR_REMOVESTOCK);
			fe1dm11.setDotrdj(Long.parseLong(JDType.fromDate(new Date()) + ""));// 当前日期
			fe1dm11.setDotday(Long.parseLong(JDType.fromTime(new Date()) + ""));// 当前时间
		} catch (Exception e) {
			e.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 209);
			errorMap.put("error", "failure");
			errorMap.put("data", e.getMessage());
			return errorMap;
		}
		// 成功
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 0);
		bodyMap.put("error", "success");
		bodyMap.put("data", "true");
		return bodyMap;
	}

	/**
	 * 客户签收
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> distribute_complete(RequestParameterBody body) {
		String e1psn = body.getE1psn();
		String urrf = body.getDeliverymanid();// 配送员id
		FE1dm11 fe1dm11 = null;
		List<FE1dm12> fe1dm12List = null;
		try {
			// 根据e1psn找出配送单表头及明细数据
			fe1dm11 = fe1dm11DAO.queryByE1psn(e1psn);
			fe1dm12List = fe1dm12DAO.queryByCondition(fe1dm11.getFe1dm11pk()
					.getDoe1psn());
		} catch (Exception e1) {
			e1.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 203);
			errorMap.put("error", "failure");
			errorMap.put("data", e1.getMessage());
			return errorMap;
		}
		if (fe1dm11.getFe1dm11pk() == null) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 204);
			errorMap.put("error", "failure");
			errorMap.put("data", "没有对应的配送单(id=" + e1psn + ")");
			return errorMap;
		}
		if (fe1dm12List == null) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 205);
			errorMap.put("error", "failure");
			errorMap.put("data", "配送单没有明细行数据");
			return errorMap;
		}
		// if(!TH.getStr(fe1dm11.getDonxtr()).equals(IDistributionConstants.NXTR_ASSIGN)){//TODO
		// //只有fe1dm11.donxtr=6（已揽收）的配送单，能够进行签收
		// TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
		// errorMap.put("errno", 206);
		// errorMap.put("error", "failure");
		// errorMap.put("data",
		// "配送单状态不能进行此操作(nxtr="+TH.getStr(fe1dm11.getDonxtr())+")");
		// return errorMap;
		// }
		for (FE1dm12 fe1dm12 : fe1dm12List) {
			// 若明细行FE1DM12.SO02不全等于1，提示‘单据有错误不可以处理。’
			if (!TH.getStr(fe1dm12.getDlso02()).equals("1")) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 207);
				errorMap.put("error", "failure");
				errorMap.put("data", "配送单有错误不可以处理");
				return errorMap;
			}
		}
		if (TH.getStr(urrf).equals("")) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 208);
			errorMap.put("error", "failure");
			errorMap.put("data", "配送员不能为空");
			return errorMap;
		}
		try {
			// 获取ukid
			Holder<Integer> holder_ukid = new Holder<Integer>();
			Holder<String> tableName = new Holder<String>("FE1DM19");
			int ukid = jdeWebServiceImpl
					.GetNextUniqueID(holder_ukid, tableName);
			if (ukid == 0) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 209);
				errorMap.put("error", "failure");
				errorMap.put("data", "获取UKID失败");
				return errorMap;
			}
			// 更新fe1dm11.nxtr
			String lttr = fe1dm11.getDonxtr();// 上一状态
			fe1dm11.setDonxtr(IDistributionConstants.NXTR_SIGNIN);
			// 更新fe1dm12.e58huf05
			fe1dm12DAO.update_e58huf05(Long.valueOf(e1psn), "Y");
			// 插入fe1dm19表
			FE1DM19 fe1dm19 = new FE1DM19();// 配送单历史表
			fe1dm19.setDlukid((long) ukid);
			fe1dm19.setDle1psn(Long.valueOf(e1psn));
			fe1dm19.setDldcto(fe1dm11.getFe1dm11pk().getDodcto());
			fe1dm19.setDlkcoo(fe1dm11.getDorkco());
			fe1dm19.setDllttr(lttr);
			fe1dm19.setDlnxtr(IDistributionConstants.NXTR_SIGNIN);
			fe1dm19.setDlurrf(urrf);
			fe1dm19.setDlupmt(Long.parseLong(JDType.fromTime(new Date()) + ""));
			fe1dm19.setDlupmj(Long.parseLong(JDType.fromDate(new Date()) + ""));
			fe1dm19.setDltday(Long.parseLong(JDType.fromDate(new Date()) + ""));
			fe1dm19.setDluser(IDistributionConstants.APP_USER);
			fe1dm19.setDlpid("JFE1dm19");// 程序号
			fe1dm19.setDljobn("APP");
			fe1dm19DAO.insert(fe1dm19);
		} catch (Exception e) {
			e.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 210);
			errorMap.put("error", "failure");
			errorMap.put("data", e.getMessage());
			return errorMap;
		}
		// 成功
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 0);
		bodyMap.put("error", "success");
		bodyMap.put("data", "true");
		return bodyMap;
	}

	/**
	 * 客户拒收
	 */
	@Override
	@Transactional
	public TreeMap<String, Object> distribute_reject(RequestParameterBody body) {
		String e1psn = body.getE1psn();
		String urrf = body.getDeliverymanid();// 配送员id
		String reasontype = body.getReasontype();// 拒收原因码
		String reason = body.getReason();// 拒收原因说明
		FE1dm11 fe1dm11 = null;
		List<FE1dm12> fe1dm12List = null;
		try {
			// 根据e1psn找出配送单表头及明细数据
			fe1dm11 = fe1dm11DAO.queryByE1psn(e1psn);
			fe1dm12List = fe1dm12DAO.queryByCondition(fe1dm11.getFe1dm11pk()
					.getDoe1psn());
		} catch (Exception e1) {
			e1.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 203);
			errorMap.put("error", "failure");
			errorMap.put("data", e1.getMessage());
			return errorMap;
		}
		if (fe1dm11.getFe1dm11pk() == null) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 204);
			errorMap.put("error", "failure");
			errorMap.put("data", "没有对应的配送单(id=" + e1psn + ")");
			return errorMap;
		}
		if (fe1dm12List == null) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 205);
			errorMap.put("error", "failure");
			errorMap.put("data", "配送单没有明细行数据");
			return errorMap;
		}
		// if(!TH.getStr(fe1dm11.getDonxtr()).equals(IDistributionConstants.NXTR_ASSIGN)){//TODO
		// //只有fe1dm11.donxtr=6（已揽收）的配送单，能够进行签收
		// TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
		// errorMap.put("errno", 206);
		// errorMap.put("error", "failure");
		// errorMap.put("data",
		// "配送单状态不能进行此操作(nxtr="+TH.getStr(fe1dm11.getDonxtr())+")");
		// return errorMap;
		// }
		for (FE1dm12 fe1dm12 : fe1dm12List) {
			// 若明细行FE1DM12.SO02不全等于1，提示‘单据有错误不可以处理。’
			if (!TH.getStr(fe1dm12.getDlso02()).equals("1")) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 207);
				errorMap.put("error", "failure");
				errorMap.put("data", "配送单有错误不可以处理");
				return errorMap;
			}
		}
		if (TH.getStr(urrf).equals("")) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 208);
			errorMap.put("error", "failure");
			errorMap.put("data", "配送员不能为空");
			return errorMap;
		}
		if (TH.getStr(reasontype).equals("")) {
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 209);
			errorMap.put("error", "failure");
			errorMap.put("data", "拒收原因码不能为空");
			return errorMap;
		}
		try {
			// 获取ukid
			Holder<Integer> holder_ukid = new Holder<Integer>();
			Holder<String> tableName = new Holder<String>("FE1DM19");
			int ukid = jdeWebServiceImpl
					.GetNextUniqueID(holder_ukid, tableName);
			if (ukid == 0) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 210);
				errorMap.put("error", "failure");
				errorMap.put("data", "获取UKID失败");
				return errorMap;
			}
			// 更新fe1dm11
			String lttr = fe1dm11.getDonxtr();// 上一状态
			fe1dm11.setDoe1dmrcd(reasontype);// 拒收原因码
			fe1dm11.setDonxtr(IDistributionConstants.NXTR_REJECTALL);
			// 更新fe1dm12.e58huf05, fe1dm12.e58huf04
			fe1dm12DAO.update_e58huf05_e58huf04(Long.valueOf(e1psn), "Y", "1");
			// 插入Fe1dm19
			FE1DM19 fe1dm19 = new FE1DM19();
			fe1dm19.setDlukid((long) ukid);
			fe1dm19.setDle1psn(Long.valueOf(e1psn));
			fe1dm19.setDldcto(fe1dm11.getFe1dm11pk().getDodcto());
			fe1dm19.setDlkcoo(fe1dm11.getDorkco());
			fe1dm19.setDllttr(lttr);
			fe1dm19.setDle1dmrcd(reasontype);
			fe1dm19.setDle13pldoc("");
			fe1dm19.setDlurrf(urrf);
			fe1dm19.setDlupmj(Long.parseLong(JDType.fromDate(new Date()) + ""));
			fe1dm19.setDlupmt(Long.parseLong(JDType.fromTime(new Date()) + ""));
			fe1dm19.setDltday(Long.parseLong(JDType.fromDate(new Date()) + ""));
			fe1dm19.setDlrmk(reason);
			fe1dm19.setDlnxtr(IDistributionConstants.NXTR_REJECTALL);
			fe1dm19.setDluser(IDistributionConstants.APP_USER);
			fe1dm19.setDlpid("JFE1dm19");// 程序号
			fe1dm19.setDljobn("APP");
			fe1dm19DAO.insert(fe1dm19);
			// 调用存储过程
			int result_callPro = CallProcedures_inventoryReject(
					Long.valueOf(e1psn), fe1dm11.getFe1dm11pk().getDodcto());
			if (result_callPro != 1) {
				TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
				errorMap.put("errno", 211);
				errorMap.put("error", "failure");
				errorMap.put("data", "存储过程(保存拒收原因)失败:" + result_callPro);
				return errorMap;
			}
		} catch (Exception e) {
			e.printStackTrace();
			TreeMap<String, Object> errorMap = new TreeMap<String, Object>();
			errorMap.put("errno", 212);
			errorMap.put("error", "failure");
			errorMap.put("data", e.getMessage());
			return errorMap;
		}
		// 成功
		TreeMap<String, Object> bodyMap = new TreeMap<String, Object>();
		bodyMap.put("errno", 0);
		bodyMap.put("error", "success");
		bodyMap.put("data", "true");
		return bodyMap;
	}

	/**
	 * 查询配送单表头信息
	 * 
	 * @return
	 * @throws Exception
	 */
	private List<FE1dm11> getFE1dm11List(RequestParameterBody body,
			ORDER_TYPE orderType) throws Exception {
		// 判断nxtr的取值范围
		String nxtr_array = "";
		switch (orderType) {
		case TODO:
			nxtr_array = IDistributionConstants.NXTR_PROCESS;
			break;
		case OBTAIN:
			nxtr_array = IDistributionConstants.NXTR_ASSIGN;
			break;
		case DELIVERIED:
			nxtr_array = IDistributionConstants.NXTR_SIGNIN + ","
					+ IDistributionConstants.NXTR_REJECT + ","
					+ IDistributionConstants.NXTR_REJECTALL;
			break;
		}
		// 查询出基础数据
		List<FE1dm11> fe1dm11List = fe1dm11DAO.queryByCondition(
				body.getShop_id(), body.getStartdate(), body.getEnddate(),
				nxtr_array);
		// 查询UDC的Map数据
		Map<String, String> procMap = udcDAO.getUdc("58H", "PR");// 省
		Map<String, String> cityMap = udcDAO.getUdc("58H", "CT");// 市
		Map<String, String> prefMap = udcDAO.getUdc("58H", "PT");// 县
		// 遍历数据
		for (FE1dm11 fe1dm11 : fe1dm11List) {
			// 设置送货地址
			String doe58hproc = TH.getStr(procMap.get(TH.getStr(fe1dm11
					.getDoe58hproc())));// 省
			String doe58hcity = TH.getStr(cityMap.get(TH.getStr(fe1dm11
					.getDoe58hcity())));// 市
			String doe58hpref = TH.getStr(prefMap.get(TH.getStr(fe1dm11
					.getDoe58hpref())));// 区
			String address = fe1dm11.getDoe58madd() == null ? "" : fe1dm11
					.getDoe58madd().trim();// 地址明细
			String addressStr = doe58hproc + doe58hcity + doe58hpref + address;
			fe1dm11.setFullAddress(addressStr);
		}
		return fe1dm11List;
	}

	/**
	 * 调用存储过程EL_DELIVERY_AUTO.INVENTORY_REJECT,执行拒收操作
	 * 
	 * @param e1psn
	 *            配送单id
	 * @param dcto
	 *            配送单类型
	 * @return
	 * @throws Exception
	 */
	private int CallProcedures_inventoryReject(Long e1psn, String dcto)
			throws Exception {
		PropertiesUtil props = new PropertiesUtil("application.properties");
		String schema = props.getPropertyByKey("ojdbc2.username").trim();
		Object result = proceDAO.executePro(new ProceWork("{call " + schema
				+ ".EL_DELIVERY_AUTO.INVENTORY_REJECT(?,?,?)}", e1psn, dcto) {
			// 新建ProWork 抽象类 ，第一个参数为存储过程调用语句，之后的参数为不定长参数。游标参数不用传入！
			// 实现ProWork 抽象方法。
			@Override
			public void execute(Connection conn) throws SQLException {
				CallableStatement statement = conn.prepareCall(this.getProSql());
				// 为存储过程设置参数，用this.getParams(Index ) 获取传入参数。
				statement.setLong(1, Long.valueOf(this.getParams(1).toString()));
				statement.setString(2, this.getParams(2).toString());
				statement.registerOutParameter(3, Types.INTEGER);
				statement.execute();
				// 将存储过程返回结果赋值.
				this.setResult(statement.getInt(3));
			}
		});
		return Integer.valueOf(result.toString());
	}

	/**
	 * 调用存储过程EL_DELIVERY_UTL.EL_DELIVERY_05,更新销售单的配送单状态
	 * 
	 * @param e1psn
	 *            配送单id
	 * @return
	 * @throws Exception
	 */
	private int CallProcedures_delivery05(Long e1psn) throws Exception {
		PropertiesUtil props = new PropertiesUtil("application.properties");
		String schema = props.getPropertyByKey("ojdbc2.username").trim();
		// 生成文件的修改日期、时间
		int date = JDType.fromDate(new Date());
		int time = JDType.fromTime(new Date());
		String user = IDistributionConstants.APP_USER;
		Object result = proceDAO.executePro(new ProceWork("{call " + schema
				+ ".EL_DELIVERY_UTL.EL_DELIVERY_05( ? , ? , ? , ? , ? )}",
				e1psn, user, date, time) {
			// 新建ProWork 抽象类 ，第一个参数为存储过程调用语句，之后的参数为不定长参数。游标参数不用传入！
			// 实现ProWork 抽象方法。
			@Override
			public void execute(Connection conn) throws SQLException {
				CallableStatement statement = conn.prepareCall(this.getProSql());
				// 为存储过程设置参数，用this.getParams(Index ) 获取传入参数。
				statement.setLong(1, Long.valueOf(this.getParams(1).toString()));
				statement.setString(2, this.getParams(2).toString());
				statement.setString(3, this.getParams(3).toString());
				statement.setString(4, this.getParams(4).toString());
				statement.registerOutParameter(5, Types.INTEGER);
				statement.execute();
				// 将存储过程返回结果赋值.
				this.setResult(statement.getInt(5));
			}
		});
		return Integer.valueOf(result.toString());
	}

	/**
	 * 调用存储过程EL_DELIVERY_UTL.EL_DELIVERY_01,更新销售单的配送单状态
	 * 
	 * @param e1psn
	 *            配送单id
	 * @return
	 * @throws Exception
	 */
	private int CallProcedures_delivery01(Long e1psn, long ukid)
			throws Exception {
		PropertiesUtil props = new PropertiesUtil("application.properties");
		String schema = props.getPropertyByKey("ojdbc2.username").trim();
		// //生成文件的修改日期、时间
		int date = JDType.fromDate(new Date());
		int time = JDType.fromTime(new Date());
		String user = IDistributionConstants.APP_USER;
		Object result = proceDAO.executePro(new ProceWork("{call " + schema
				+ ".EL_DELIVERY_AUTO.SAVE_FE1DM12( ? , ? , ? , ? , ?, ? )}",
				e1psn, ukid, user, date, time) {
			// 新建ProWork 抽象类 ，第一个参数为存储过程调用语句，之后的参数为不定长参数。游标参数不用传入！
			// 实现ProWork 抽象方法。
			@Override
			public void execute(Connection conn) throws SQLException {
				CallableStatement statement = conn.prepareCall(this.getProSql());
				// 为存储过程设置参数，用this.getParams(Index ) 获取传入参数。
				statement.setLong(1, Long.valueOf(this.getParams(1).toString()));
				statement.setLong(2, Long.valueOf(this.getParams(2).toString()));
				statement.setString(3, this.getParams(3).toString());
				statement.setInt(4,
						Integer.valueOf(this.getParams(4).toString()));
				statement.setInt(5,
						Integer.valueOf(this.getParams(5).toString()));
				statement.registerOutParameter(6, Types.INTEGER);
				statement.execute();
				// 将存储过程返回结果赋值.
				this.setResult(statement.getInt(6));
			}
		});
		return Integer.valueOf(result.toString());
	}

	/**
	 * 在出库时，计算一个商品应该使用哪些批次，并插入FE4ln001表，以便之后调用存储过程
	 * 
	 * @param fe1dm11
	 *            配送单表头数据
	 * @param f58h0411
	 *            订单明细数据
	 * @throws Exception
	 */
	private void calcAndInsertFE4ln001(FE1dm11 fe1dm11, F58h0411 f58h0411)
			throws Exception {
		Long e1psn = fe1dm11.getFe1dm11pk().getDoe1psn();
		String mcu = fe1dm11.getDomcu().trim();
		long itm = f58h0411.getChitm();
		long uorg = f58h0411.getChuorg();// 订单数量
		// 从F41021表来查找商品的库存可用量
		List<F41021> f41021List = f41021DAO.queryByCondition(itm, mcu);
		// 由配送单批次表FE4ln001中获取该配送单已经存在的配送数据，即待发货的数量
		List<FE4ln001> fe4ln001List = fe4ln001DAO.queryByCondition(e1psn);
		// 计算真正的库存可用量 = 原库存可用量 - 待发货的数量
		for (F41021 f41021 : f41021List) {
			// 计算这个批次、这个商品已经写入FE4ln001表的发货数量
			long soqs = getSoqsFromFe4ln001(fe4ln001List, f41021.getF41021pk()
					.getLiitm(), f41021.getF41021pk().getLilotn());
			// 计算库存数量
			long pqoh = f41021.getLipqoh() - soqs;
			f41021.setLipqoh(pqoh);
		}
		// 递归插入Fe4ln001表的数据
		boolean result = recursionInsertFe4ln001(f41021List, 0, e1psn,
				f58h0411, uorg);
		if (!result)
			throw new Exception("插入Fe4ln001表失败");
	}

	/**
	 * 根据指定的项目号itm、指定的批次号lotn，来计算所对应的发货数量soqs
	 * 
	 * @param fe4ln001List
	 * @param itm
	 * @param lotn
	 * @return
	 */
	private long getSoqsFromFe4ln001(List<FE4ln001> fe4ln001List, long itm,
			String lotn) {
		long soqs = 0;
		for (FE4ln001 fe4ln001 : fe4ln001List) {
			if (fe4ln001.getLnitm().equals(itm)
					&& fe4ln001.getFe4ln001pk().getLnlotn().trim()
							.equals(lotn.trim())) {
				soqs += fe4ln001.getLnsoqs();
			}
		}
		return soqs;
	}

	/**
	 * 插入insertFe4ln001表的记录
	 * 
	 * @param e1psn
	 * @param f58h0411
	 */
	private void insertFe4ln001(long e1psn, F58h0411 f58h0411, String lotn,
			long soqs) {
		FE4ln001 fe4ln001 = new FE4ln001();
		FE4ln001PK fe4ln001pk = new FE4ln001PK();
		fe4ln001pk.setLne1psn(e1psn);// 配送单id
		fe4ln001pk.setLnlnid(f58h0411.getChlnid());// 订单行号
		fe4ln001pk.setLnlotn(lotn);// 批次号
		fe4ln001.setFe4ln001pk(fe4ln001pk);
		fe4ln001.setLnitm(f58h0411.getChitm());// 短项目号
		fe4ln001.setLnaitm(f58h0411.getChaitm());// 产品目录号
		fe4ln001.setLnlitm(f58h0411.getChlitm());// 产品编号
		fe4ln001.setLnsoqs(soqs);// 发货数量
		fe4ln001.setLnuom(f58h0411.getChuom());// 计量单位
		fe4ln001.setLnupmj(Long.parseLong(JDType.fromDate(new Date()) + ""));
		fe4ln001.setLnupmt(Long.parseLong(JDType.fromTime(new Date()) + ""));
		fe4ln001.setLnjobn("DataBuffer");
		fe4ln001.setLnpid("JFE4ln001");
		fe4ln001.setLnuser(IDistributionConstants.APP_USER);
		// fe4ln001.setLnurrf(" ");//备注
		fe4ln001DAO.insert(fe4ln001);
	}

	/**
	 * 根据订单数量uorg，以及目前的库存现有量数据f41021List，向Fe4ln001表中插入数据
	 * 如果第一个批次的现有量可以满足订单数量要求，则选择该批次；
	 * 如果第一个批次的现有量低于订单数量要求，则先扣减该批次，并递归调用此方法，来计算下一批次能否满足剩余数量要求。 该方法会递归调用
	 * 
	 * @param f41021List
	 *            商品的库存可用量
	 * @param listIndex
	 *            目前递归的次数
	 * @param e1psn
	 *            配送单号
	 * @param f58h0411
	 *            商品明细数据
	 * @param uorg
	 *            还需处理的订单数量
	 * @return
	 */
	private boolean recursionInsertFe4ln001(List<F41021> f41021List,
			int listIndex, long e1psn, F58h0411 f58h0411, long uorg) {
		if (listIndex >= f41021List.size()) {
			// 如果循环完f41021List，仍不能满足订单数量要求，则返回失败
			return false;
		}
		if (f41021List.get(listIndex).getLipqoh() >= uorg) {// 批次的库存数量>=订单数量
			// 插入配送单批次表FE4ln001
			insertFe4ln001(e1psn, f58h0411, f41021List.get(listIndex)
					.getF41021pk().getLilotn(), uorg);
			// 更新f41021List中的可用量，及重新计算目前待出库的商品数量
			f41021List.get(listIndex).setLipqoh(
					f41021List.get(listIndex).getLipqoh() - uorg);
			uorg = 0;
		} else {// 批次的库存数量<订单数量
			// 插入配送单批次表FE4ln001
			insertFe4ln001(e1psn, f58h0411, f41021List.get(listIndex)
					.getF41021pk().getLilotn(), f41021List.get(listIndex)
					.getLipqoh());
			// 更新f41021List中的可用量，及重新计算目前待出库的商品数量
			uorg -= f41021List.get(listIndex).getLipqoh();
			f41021List.get(listIndex).setLipqoh(0l);
		}
		if (uorg == 0) {// 商品数量全部处理完毕
			return true;
		}
		return recursionInsertFe4ln001(f41021List, listIndex + 1, e1psn,
				f58h0411, uorg);
	}

	@Override
	@Transactional
	public void callAppOrderChangeStatus(String type, String e1psn) {
		// TODO Auto-generated method stub
		FE1dm11 fe1dm11;
		try {
			fe1dm11 = fe1dm11DAO.queryByE1psn(e1psn);
			F58h0401 f58h0401 = f58h0401DAO.queryByDoco(fe1dm11.getDororn());// 查找对应的订单表头信息
			String orderid = f58h0401.getChe58hus12();
			String cmd = "";
			if (type.equals("distribution")) {
				cmd = "order.distribution";

			} else {
				cmd = "order.complete";
			}

			JSONObject jsonObj = doAppOrderChangeStatus(orderid, cmd);
			if (jsonObj != null) {
				System.out.println("调用下单app状态改变接口，返回" + jsonObj.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public JSONObject doAppOrderChangeStatus(String orderid, String cmd) {
		PropertiesUtil properties = new PropertiesUtil("application.properties");
		// 准备body数据
		String secret = properties.getPropertyByKey("appsecret");
		String strSource = properties.getPropertyByKey("appsource");
		String url = properties.getPropertyByKey("appurl");
		TreeMap<String, Object> data = new TreeMap<String, Object>();

		data.put("cmd", cmd);
		long ltimestamp = CalculateSignHelp.calcTimestamp();
		data.put("timestamp", ltimestamp);
		data.put("source", strSource);
		data.put("secret", secret);

		// Map<String, Object> bodyMap = new TreeMap<String, Object>();
		Map<String, Object> bodydata = new TreeMap<String, Object>();

		bodydata.put("order_id", orderid);

		data.put("body", bodydata);
		// 计算sign
		String sign = CalculateSignHelp.CalculateSign(data);
		data.put("sign", sign);
		data.remove("secret");

		Gson gson = new Gson();
		String requestJson = gson.toJson(data);
		// 对所有/进行转义
		requestJson = requestJson.replace("/", "\\/");
		// 中文字符转为unicode
		requestJson = Md5.chinaToUnicode(requestJson);

		System.out.println(requestJson);

		JSONObject jsonObj = HttpRequestUtil.httpAppPost(url, requestJson);

		JSONObject bodyJsonObj = null;
		if (jsonObj != null) {
			bodyJsonObj = jsonObj.getJSONObject("body");

		}
		return bodyJsonObj;
	}

}
