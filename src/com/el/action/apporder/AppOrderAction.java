package com.el.action.apporder;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.xml.ws.Holder;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;

import com.el.connect.DBContextHolder;
import com.el.dao.IF55wsd02DAO;
import com.el.entity.F0005L;
import com.el.entity.F55wsd02;
import com.el.entity.F55wsd02Id;
import com.el.entity.F55wsd03;
import com.el.entity.F55wsd03Id;
import com.el.entity.Fe14710a;
import com.el.entity.Fe14710aId;
import com.el.entity.apporder.AppOrderEnum;
import com.el.entity.apporder.Coord;
import com.el.entity.apporder.Inventory;
import com.el.entity.apporder.InventorySearch;
import com.el.entity.apporder.Member;
import com.el.entity.apporder.OrderCancelByApp;
import com.el.entity.apporder.OrderData;
import com.el.entity.apporder.OrderDiscount;
import com.el.entity.apporder.OrderPay;
import com.el.entity.apporder.Payment;
import com.el.entity.apporder.Product;
import com.el.entity.apporder.Shop;
import com.el.entity.erpdb.F58h0401;
import com.el.entity.erpdb.FE4PT001;
import com.el.entity.erpdb.FE4PT001PK;
import com.el.entity.jde.F58h0101;
import com.el.service.IJDEWebService;
import com.el.service.IOrderService;
import com.el.service.apporder.IOrderCancelByAppService;
import com.el.service.apporder.IOrderCreateService;
import com.el.service.apporder.IOrderPayService;
import com.el.service.apporder.IStationService;
import com.el.util.BaiduMapUtil;
import com.el.util.CalculateSignHelp;
import com.el.util.CommonHelper;
import com.el.util.PropertiesUtil;
import com.el.webservice.getnextukid.client.BusinessServiceException_Exception;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

@Scope("prototype")
public class AppOrderAction extends ActionSupport {
	private static Logger logger = Logger.getLogger(AppOrderAction.class);
	private String cmd;
	private String sign;
	private String source;
	private long timestamp;
	private TreeMap<String, Object> body;
	private IOrderService orderServiceImpl;
	private IJDEWebService jdeWebServiceImpl;
	private IStationService stationServiceImpl;
	private IF55wsd02DAO f55wsd02DAO;
	private IOrderPayService orderPayService;
	private IOrderCreateService orderCreateService;
	private IOrderCancelByAppService orderCancelByAppServiceImpl;
	private int errno = 0;
	private String error = "success";
	private String errorMessage = "true";
	private String secret = "";
	/**
	 * 会员及多地址返回命令
	 */
	private final String RESP_MEMBER = "resp.member.create";
	/**
	 * 经纬度查找站点返回命令
	 */
	private final String RESP_STATION_SEARCH = "resp.station.search";
	/**
	 * 订单结算返回命令
	 */
	private final String RESP_ORDER_CREATE = "resp.order.create";
	/**
	 * 站点库存查询返回命令
	 */
	private final String RESP_STATION_INVENTORY = "station.inventory";
	/**
	 * 订单支付返回命令
	 */
	private final String RESP_ORDER_PAY = "resp.order.pay";

	/**
	 * 订单取消返回命令，app调用；只有未生成订单的才能取消（未付款）
	 */
	private final String RESP_ORDER_CANCELBYAPP = "order.cancelbyapp";

	/**
	 * 返回json
	 */
	private SortedMap<String, Object> data;

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public TreeMap<String, Object> getBody() {
		return body;
	}

	public void setBody(TreeMap<String, Object> body) {
		this.body = body;
	}

	public IOrderService getOrderServiceImpl() {
		return orderServiceImpl;
	}

	@Resource
	public void setOrderServiceImpl(IOrderService orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}

	public IJDEWebService getJdeWebServiceImpl() {
		return jdeWebServiceImpl;
	}

	@Resource
	public void setJdeWebServiceImpl(IJDEWebService jdeWebServiceImpl) {
		this.jdeWebServiceImpl = jdeWebServiceImpl;
	}

	public int getErrno() {
		return errno;
	}

	public void setErrno(int errno) {
		this.errno = errno;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public SortedMap<String, Object> getData() {
		return data;
	}

	public void setData(SortedMap<String, Object> data) {
		this.data = data;
	}

	public IStationService getStationServiceImpl() {
		return stationServiceImpl;
	}

	@Resource
	public void setStationServiceImpl(IStationService stationServiceImpl) {
		this.stationServiceImpl = stationServiceImpl;
	}

	public IF55wsd02DAO getF55wsd02DAO() {
		return f55wsd02DAO;
	}

	@Resource
	public void setF55wsd02DAO(IF55wsd02DAO f55wsd02dao) {
		f55wsd02DAO = f55wsd02dao;
	}

	public IOrderPayService getOrderPayService() {
		return orderPayService;
	}

	@Resource
	public void setOrderPayService(IOrderPayService orderPayService) {
		this.orderPayService = orderPayService;
	}

	public IOrderCreateService getOrderCreateService() {
		return orderCreateService;
	}

	@Resource
	public void setOrderCreateService(IOrderCreateService orderCreateService) {
		this.orderCreateService = orderCreateService;
	}

	public IOrderCancelByAppService getOrderCancelByAppServiceImpl() {
		return orderCancelByAppServiceImpl;
	}

	@Resource
	public void setOrderCancelByAppServiceImpl(
			IOrderCancelByAppService orderCancelByAppServiceImpl) {
		this.orderCancelByAppServiceImpl = orderCancelByAppServiceImpl;
	}

	/**
	 * App请求的入口,对不同的cmd做不同的处理
	 * 
	 * @return
	 */
	public String appAccess() {
		// 一进入就先做一次数据源切换，默认为接口的临时库；如果需要访问erp数据库时，再做一次切换
		DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);

		// 输出请求的字符串
		writeRequestLog();
		// 检查cmd参数
		if (cmd == null || cmd.isEmpty()) {
			GenerateBodyMap_paramMissError("cmd");
			return SUCCESS;

		} else if (source == null || source.isEmpty()) {
			GenerateBodyMap_paramMissError("source");
			return SUCCESS;
		} else if (timestamp == 0) {
			GenerateBodyMap_paramMissError("timestamp");
			return SUCCESS;
		} else if (body == null) {
			GenerateBodyMap_paramMissError("body");
			return SUCCESS;
		}

		PropertiesUtil properties = new PropertiesUtil("application.properties");
		secret = properties.getPropertyByKey("appsecret");
		// String strSource = properties.getPropertyByKey("appsource");
		// String url = properties.getPropertyByKey("appurl");
		Object respBodyData = null;
		if (cmd.equals("member.create")) {
			respBodyData = createMember();
		} else if (cmd.equals("station.search")) {
			respBodyData = searchStation();
		} else if (cmd.equals("station.inventory")) {
			respBodyData = searchStationInventory();
		} else if (cmd.equals("order.create")) {
			respBodyData = orderCreate();
		} else if (cmd.equals("order.pay")) {
			respBodyData = orderPay();
		} else if (cmd.equals("order.cancelbyapp")) {
			respBodyData = orderCancelByApp();
		}
		genResponseData(respBodyData);
		return SUCCESS;
	}

	public void writeRequestLog() {
		String strCmdName = "";
		if (cmd != null && cmd.equals("member.create")) {
			strCmdName = "会员接口," + cmd;
		} else if (cmd != null && cmd.equals("station.search")) {
			strCmdName = "查找站点接口," + cmd;
		} else if (cmd != null && cmd.equals("station.inventory")) {
			strCmdName = "查找库存接口," + cmd;
		} else if (cmd != null && cmd.equals("order.create")) {
			strCmdName = "订单结算接口," + cmd;
		} else if (cmd != null && cmd.equals("order.pay")) {
			strCmdName = "订单支付接口," + cmd;
		} else if (cmd != null && cmd.equals("order.cancelbyapp")) {
			strCmdName = "未付款订单取消接口," + cmd;
		}
		// 记录请求的数据
		TreeMap<String, Object> dataSorted = new TreeMap<String, Object>();
		dataSorted.put("cmd", cmd);
		dataSorted.put("timestamp", timestamp);
		dataSorted.put("source", source);
		dataSorted.put("sign", sign);
		dataSorted.put("body", body);
		Gson gson = new Gson();
		String strData = gson.toJson(dataSorted);
		logger.info("App下单：" + strCmdName + "请求串:" + strData);
	}

	/**
	 * 返回参数格式错误的数据
	 * 
	 * @param paramName
	 */
	public void GenerateBodyMap_paramMissError(String paramName) {
		errno = -1;
		error = "failure";
		errorMessage = "App下单:参数格式错误,缺少" + paramName;
		logger.error(errorMessage);
		genResponseData(errorMessage);
	}

	/**
	 * 会员及多地址接口
	 * 
	 * @param secret
	 */
	public Object createMember() {
		String bodydata = "true";
		try {
			JSONObject bodyJsonObj = JSONObject.fromObject(body);
			Member member = (Member) bodyJsonObj.toBean(bodyJsonObj,
					Member.class);
			// 对请求的body数据进行排序
			TreeMap<String, Object> memberDataSorted = member.toMap();
			// 检查sign是否正确
			if (!checkSign(memberDataSorted)) {
				return null;
			}

			orderServiceImpl.saveMememberInfo(member);

			orderServiceImpl.callMemberWebservice(member.getPhone());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errno = -1;
			error = "failure";
			e.printStackTrace();
			errorMessage = "App下单:调用会员及多地址接口失败";
			logger.error(errorMessage + ",错误信息:" + e.getMessage());
			logger.error(e.getMessage(), e);
		}
		return bodydata;
	}

	/**
	 * 检查请求参数的sign是否一致
	 * 
	 * @param bodydataSorted
	 *            body排好序的数据
	 * @return
	 */
	public boolean checkSign(TreeMap<String, Object> bodydataSorted) {
		TreeMap<String, Object> dataSorted = new TreeMap<String, Object>();
		dataSorted.put("cmd", cmd);
		dataSorted.put("timestamp", timestamp);
		dataSorted.put("source", source);
		dataSorted.put("secret", secret);
		dataSorted.put("body", bodydataSorted);

		// 计算sign
		String calcSign = CalculateSignHelp.CalculateSign(dataSorted);
		if (!sign.equals(calcSign)) {
			errno = -1;
			error = "failure";
			errorMessage = "App下单:加密不正确";
			logger.error(errorMessage + "；请求的sign=" + sign + ";计算的sign="
					+ calcSign);
			genResponseData(errorMessage);
			return false;
		}
		return true;
	}

	/**
	 * 根据经纬度查找最近的站点
	 * 
	 * @return
	 */
	public Object searchStation() {

		// 返回的body数据
		Map<String, Object> respBodydata = new TreeMap<String, Object>();

		try {
			JSONObject bodyJsonObj = JSONObject.fromObject(body);
			Coord coord = (Coord) bodyJsonObj.toBean(bodyJsonObj, Coord.class);
			// 排序
			TreeMap<String, Object> coordDataSorted = coord.toMap();
			// 检查加密
			if (!checkSign(coordDataSorted)) {
				return null;
			}

			JSONObject mapJsonObj = BaiduMapUtil.calcGeocoding(
					coord.getLatitude(), coord.getLongitude(), "bd09ll");
			String province = "";
			String city = "";
			String district = "";
			if (mapJsonObj != null) {
				Object[] mapParams = new Object[2];
				mapParams[0] = "PR";// CT// PR// PT
				mapParams[1] = mapJsonObj.getString("province");
				List<F0005L> lstF0005ls = orderServiceImpl
						.queryLstF0005L(mapParams);
				if (lstF0005ls != null && lstF0005ls.size() > 0) {
					province = lstF0005ls.get(0).getId().getDrky();// 省（58|PR），省的编码，必填
				}

				mapParams[0] = "CT";// CT
				mapParams[1] = mapJsonObj.getString("city");
				lstF0005ls = orderServiceImpl.queryLstF0005L(mapParams);
				if (lstF0005ls != null && lstF0005ls.size() > 0) {
					city = lstF0005ls.get(0).getId().getDrky();// 市
				}

				mapParams[0] = "PT";
				mapParams[1] = mapJsonObj.getString("district");
				lstF0005ls = orderServiceImpl.queryLstF0005L(mapParams);
				if (lstF0005ls != null && lstF0005ls.size() > 0) {
					district = lstF0005ls.get(0).getId().getDrky();// 区
				}
			}

			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);

			F58h0101 f58h0101 = stationServiceImpl.getNearestStation(coord,
					province, city, district);

			Shop shop = new Shop();
			if (f58h0101 != null) {
				shop.setId(f58h0101.getId().getSmmcu().trim());
				shop.setName(f58h0101.getShopname().trim());
			}
			respBodydata.put("shop", shop);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			errno = -1;
			error = "failure";
			e.printStackTrace();
			errorMessage = "App下单:根据经纬度查找站点失败";
			logger.error(errorMessage + ",错误信息:" + e.getMessage());
			logger.error(e.getMessage(), e);
		}
		return respBodydata;
	}

	/**
	 * 根据站点查找库存
	 */
	public Object searchStationInventory() {
		List<Inventory> lstInventory = null;
		Map<String, Object> bodydata = new TreeMap<String, Object>();
		try {
			JSONObject bodyJsonObj = JSONObject.fromObject(body);
			Map<String, Object> classMap = new HashMap<String, Object>();
			classMap.put("shop", Shop.class);
			classMap.put("products", Product.class);
			InventorySearch inventorySearchData = (InventorySearch) JSONObject
					.toBean(bodyJsonObj, InventorySearch.class, classMap);
			/*
			 * JSONObject shopJsonObj = bodyJsonObj.getJSONObject("shop");
			 * JSONArray productsJsonArray =
			 * bodyJsonObj.getJSONArray("products"); Shop shop = (Shop)
			 * JSONObject.toBean(shopJsonObj, Shop.class); List<Product>
			 * lstProduct = new ArrayList<>(); if (productsJsonArray.size() > 0)
			 * { for (int i = 0; i < productsJsonArray.size(); i++) { JSONObject
			 * productJsonObj = productsJsonArray .getJSONObject(i); Product
			 * product = (Product) JSONObject.toBean( productJsonObj,
			 * Product.class); lstProduct.add(product);
			 * 
			 * } }
			 */

			TreeMap<String, Object> inventorySearchDataSorted = inventorySearchData
					.toMap();
			if (!checkSign(inventorySearchDataSorted)) {
				return null;
			}

			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			lstInventory = stationServiceImpl.queryInventory(
					inventorySearchData.getShop(),
					inventorySearchData.getProducts());
			bodydata.put("shop", inventorySearchData.getShop());
			// 进行排序处理
			List<Object> lstInventoryMap = new ArrayList<Object>();
			for (Inventory inventory : lstInventory) {
				lstInventoryMap.add(inventory.toMap());
			}
			// bodydata.put("inventory", lstInventory);
			bodydata.put("inventory", lstInventoryMap);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			errno = -1;
			error = "failure";
			e.printStackTrace();
			errorMessage = "App下单:根据站点ID查找商品库存失败";
			logger.error(errorMessage + ",错误信息:" + e.getMessage());
			logger.error(e.getMessage(), e);
		}

		return bodydata;
	}

	/**
	 * 订单创建，app结算时调用
	 */
	public Object orderCreate() {
		String bodydata = "true";
		try {
			JSONObject bodyJsonObj = JSONObject.fromObject(body);
			Map<String, Class> classMap = new HashMap<String, Class>();
			classMap.put("products", Product.class);
			classMap.put("discount", OrderDiscount.class);
			OrderData orderData = (OrderData) bodyJsonObj.toBean(bodyJsonObj,
					OrderData.class, classMap);
			// 对请求的body参数进行排序
			TreeMap<String, Object> orderDataSorted = orderData.toMap();
			// 检查签名是否正确
			if (!checkSign(orderDataSorted)) {
				return null;
			}
			String orderid = orderData.getOrder().getOrder_id();
			if (checkOrderIsExists(orderid)) {
				logger.info("APP下单:订单号=" + orderid + "已经生成过了！");
				return null;
			}

			F55wsd02 f55wsd02 = genF55wsd02(orderData);

			List<F55wsd03> lstF55wsd03 = genF55wsd03(orderData, f55wsd02);

			List<Fe14710a> lstfe14710a = new ArrayList<Fe14710a>();

			/*
			 * 对于是线下支付，就是货到付款的要生成付款信息；在线支付的单独提供接口调用生成付款信息
			 */
			// if (f55wsd02.getIhe58huf02().equals("1")) {
			// Fe14710a fe14710a = genFe14710a(f55wsd02);
			// lstfe14710a.add(fe14710a);
			// }

			orderServiceImpl.saveAppOrder(f55wsd02, lstF55wsd03, lstfe14710a);

			orderServiceImpl.callWebservice(f55wsd02, lstF55wsd03);

			long prukid = getPrukid(orderData.getOrder().getOrder_id());

			// 切换到ERP数据源
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			int ckStock = orderCreateService
					.CallProcedures_DeductInventory(prukid);
			if (ckStock != 1) {
				logger.error("调用扣减可供量存储过程失败");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errno = -1;
			error = "failure";
			e.printStackTrace();
			errorMessage = "App下单:调用订单结算接口失败";
			logger.error(errorMessage + ",错误信息:" + e.getMessage());
			logger.error(e.getMessage(), e);
		}
		return bodydata;
	}

	public F55wsd02 genF55wsd02(OrderData orderData)
			throws BusinessServiceException_Exception, Exception {
		F55wsd02 f55wsd02 = new F55wsd02();
		F55wsd02Id f55wsd02id = new F55wsd02Id();
		Holder<Integer> ukid = new Holder<Integer>();
		Holder<String> tableName = new Holder<String>("F55WSD02");
		int ihukid = jdeWebServiceImpl.GetNextUniqueID(ukid, tableName);
		if (ihukid == 0) {
			// errno = 10208;
			throw new Exception("获取UKID失败");
		}
		f55wsd02id.setIhukid(new BigDecimal(ihukid));// 双方流水号
		f55wsd02id.setIhe58hedid("B2C");// 交互方向类型 B2C:商城写；JDE:JDE系统写；
		f55wsd02id.setIhedln(new BigDecimal(1000));// 行号，默认1
		f55wsd02.setId(f55wsd02id); // 将来如果1个UKID传多个order_id的时候可以自增此行号，进行订单批量传送
									// .官网写入规则：行号为1，需要乘以1000，再写入;官网取数规则：行号除以1000，再获取；
		// f55wsd02.setIhprukid(ihprukid);// JDE订单唯一编号
		String ihe58eboid = orderData.getOrder().getOrder_id();
		f55wsd02.setIhe58eboid(ihe58eboid);// B2C订单唯一编号order_id 网单号

		f55wsd02.setIhe58huf06("2");// 接单直接就是确定
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String ihe58hboct = sdf2.format(new Date(orderData.getOrder()
				.getCreate_time() * 1000L));

		f55wsd02.setIhe58hboct(ihe58hboct);// 订单生成日期 格式为YYYY-MM-DD

		f55wsd02.setIhe58ssot("L1");// 订单种类(58E|OT) JDE提供编码： L1 销售单
		//
		f55wsd02.setIhe58hoca("A");// 下单渠道(58H|OC)W-网络下单、A-App下单；
		// f55wsd02.setIhe58eroid(ihe58eroid);// 记录原始的网单号，退单或者转单时使用

		String ihe58mcno = orderData.getUser().getPhone();
		f55wsd02.setIhe58mcno(ihe58mcno);// 会员编号

		f55wsd02.setIhe58hbmno(new BigDecimal(0));// B2C订单所有人编号
		// f55wsd02.setIhco(ihco);// 下单公司
		//
		// f55wsd02.setIhan8(ihan8);//
		// 网店号1-对于淘宝、京东等第三方平台来的订单，这个字段不需要填写；2-对于官网开店的(包括1919自营店)，需要将开店的商户编号传进来；商户信息会通过接口，同步到官网
		//
		f55wsd02.setIhe58hus25(orderData.getShop().getId());// 商户号
		//
		f55wsd02.setIhmcu(AppOrderEnum.MCU_APP);// 1018表头经营单位
		//
		f55wsd02.setIhdcto("DS");// 订单类型(00|DT)DS 网上销售单；
		//
		f55wsd02.setIhkcoo("00100");// 订单公司
		//
		// f55wsd02.setIhdoco(ihdoco);// 订单号
		//
		// f55wsd02.setIhodoc(ihodoc);// JDE订单号
		// f55wsd02.setIhodct(ihodct);// JDE订单类型
		// f55wsd02.setIhokco(ihokco);// JDE订单公司

		f55wsd02.setIhe58hmn(orderData.getUser().getName());// 收货人姓名ship_name
		f55wsd02.setIhph1(orderData.getUser().getPhone());// 收货人电话ship_mobile移动电话
		// f55wsd02.setIhe58mpst(ihe58mpst);// 收货人邮编ship_zip
		// f55wsd02.setIhe58hmail(ihe58hmail);// 收货人邮箱ship_email
		f55wsd02.setIhe58hxxdz(orderData.getUser().getAddress());// 收货人地址ship_addr详细地址
		// JDE E58MADD

		f55wsd02.setIhe58hshm("R1");// 送货方式（B2C的配送方式）(58H|SM) R1-配送； //
									// R2-自提；R3-百度配送 默认 R1 物流 1 百度 2 自配送
		// 发票的处理

		if (orderData.getInvoice() != null) {
			// 需要开发票
			if (orderData.getInvoice().getNeed_invoice() == 1) {
				f55wsd02.setIhe58hinty("1");// "发票类型(58H|IT)1-普票-正常发票；2-普票-红字发票；3-普票-废票；4-增票；默认1"
				f55wsd02.setIhe58huf07("20");// 开票方法(E1|IM) 10-按明细开；//
												// 20-按表头开；// 默认20
				f55wsd02.setIhe58hintl(orderData.getInvoice()
						.getInvoice_title());// 发票抬头tax_company
				f55wsd02.setIhtxt3("Y");// "是否需要发票Y：客户需要开发票，N：不需要开发票"

			} else {
				f55wsd02.setIhe58hinty("2");// "发票类型(58H|IT)1-普票-正常发票；2-普票-红字发票；3-普票-废票；4-增票；默认1"
				f55wsd02.setIhtxt3("N");// "是否需要发票Y：客户需要开发票，N：不需要开发票"
			}

		}

		f55wsd02.setIhe58hos("518");// 订单总状态 516 未处理/ 订单总状态518
									// 生成（app下单直接变成518）
		f55wsd02.setIhe58hus14("00001");// 开票内容，同步到F58H0401.E58HUS14 E1|IL
										// 00001-餐费；如果开票方式为20，则此字段必须有值，默认00001
		if (orderData.getOrder().getRemark() != null) {
			String remark = orderData.getOrder().getRemark().trim();
			if (remark.length() > 40) {
				remark = remark.substring(0, 39);
			}
			f55wsd02.setIhe58hus24(remark);// 买家留言 备注
			String memo = orderData.getOrder().getRemark().trim();
			if (memo.length() > 100) {
				memo = memo.substring(0, 99);
			}
			f55wsd02.setIhe58hus26(memo);// 订单备注

		}
		// 配送门店，F58H0401.EMCU
		f55wsd02.setIhe58hshs(new BigDecimal(orderData.getShop().getId()));

		f55wsd02.setIhev01("N");// 读取标示 默认传N N代表未读，Y表示已读，B2C只读N

		// SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		String ihe58hsjut = sdf1.format(new Date(orderData.getOrder()
				.getCreate_time() * 1000L));
		// System.out.println(ihe58hsjut);
		f55wsd02.setIhe58hsjut(ihe58hsjut);// 订单生成时间 格式：hh:mm:ss 订单创建时间
											// order.create_time
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ihe58hsbut = sdf3.format(new Date(orderData.getOrder()
				.getCreate_time() * 1000L));
		f55wsd02.setIhe58hsbut(ihe58hsbut);// "B2C更新时间		数据格式：yyyy-MM-dd HH:mm:SS"
		f55wsd02.setIhcomitlvl(new BigDecimal("2"));// 订单配送优先级(01|PT)2 普通送；
		int ihe58huf02 = orderData.getOrder().getPay_type();
		// if (ihe58huf02 == 1) {
		// // f55wsd02.setIhe58gpayf("1");// 付款标识 未付款为1；已付款为3；
		// f55wsd02.setIhe58hpaym("01");// "付款方式 对应JDE 付款方式表FE4PT001 JDE处理
		// // 01 现金 02 POS刷卡 04 微信支付 07 支付宝
		// }
		// 生成的订单都是未支付，支付时会调用支付接口，这时候再更新支付标志为已支付
		f55wsd02.setIhe58gpayf("1");// 付款标识 未付款为1；已付款为3；

		f55wsd02.setIhe58huf02(Integer.toString(ihe58huf02));// "支付方式   对应JDE E58HSSPF1， 货到付款2， 在线支付 "

		f55wsd02.setIhe58tsua(new BigDecimal(orderData.getOrder().getShop_fee()));// 应收总金额
		// int discountfee = body.getOrder().getDiscount_fee();
		// f55wsd02.setIhe58oda(new BigDecimal(discountfee));// 整单折让金额

		f55wsd02.setIhe58hus23(AppOrderEnum.MCU_APP);// " 1001 官网    1002 微信 E1/WT	F58H0401.MCU 1003 百度 1010美团 1006饿了么1018APP下单"
		int ihe58jua01 = orderData.getProducts().size() * 100;
		String sendtime = sdf1.format(new Date(orderData.getOrder()
				.getSend_time() * 1000L));
		f55wsd02.setIhdl01(sendtime);// 要求送货时间从，格式为HH:mm:ss

		String Longitude = "";
		String Latitude = "";
		// JSONObject mapJsonObj = null;
		if (orderData.getUser().getLatitude() != null) {
			Longitude = orderData.getUser().getLongitude();// 经度
			Latitude = orderData.getUser().getLatitude();// 纬度
			// mapJsonObj = BaiduMapUtil.calcGeocoding(Latitude,
			// Longitude,"bd09ll");
		}
		f55wsd02.setIhdl02(Longitude);// 经度 接百度
		f55wsd02.setIhdl03(Latitude);// 纬度

		f55wsd02.setIhe58brd2("CN");// 国家,默认CN(中国)
		// 根据传入的省市区查找jde中的省市区编码
		// if (mapJsonObj != null) {
		// Object[] mapParams = new Object[2];
		// mapParams[0] = "PR";// CT// PR// PT
		// mapParams[1] = mapJsonObj.getString("province");
		// List<F0005L> lstF0005ls = orderServiceImpl
		// .queryLstF0005L(mapParams);
		// if (lstF0005ls != null && lstF0005ls.size() > 0) {
		// f55wsd02.setIhe58hproc(lstF0005ls.get(0).getId().getDrky());//
		// 省（58|PR），省的编码，必填
		// }
		//
		// mapParams[0] = "CT";// CT
		// mapParams[1] = mapJsonObj.getString("city");
		// lstF0005ls = orderServiceImpl.queryLstF0005L(mapParams);
		// if (lstF0005ls != null && lstF0005ls.size() > 0) {
		// f55wsd02.setIhe58hcity(lstF0005ls.get(0).getId().getDrky());// 市
		//
		// }
		//
		// mapParams[0] = "PT";
		// mapParams[1] = mapJsonObj.getString("district");
		// lstF0005ls = orderServiceImpl.queryLstF0005L(mapParams);
		// if (lstF0005ls != null && lstF0005ls.size() > 0) {
		// f55wsd02.setIhe58hpref(lstF0005ls.get(0).getId().getDrky());// 区
		// }
		// } else {
		// f55wsd02.setIhe58hproc("2");// 省（58|PR），省的编码，必填 商户所在省名称 province
		// f55wsd02.setIhe58hcity("52");// 市
		// f55wsd02.setIhe58hpref("500");// 区（县）
		// f55wsd02.setIhe58hbzne(null);// 区域编码
		// }
		f55wsd02.setIhe58hproc(orderData.getUser().getProvince());// 省（58|PR），省的编码，必填
																	// 商户所在省名称
																	// province
		f55wsd02.setIhe58hcity(orderData.getUser().getCity());// 市
		f55wsd02.setIhe58hpref(orderData.getUser().getDistrict());// 区（县）

		f55wsd02.setIhe58jua01(new BigDecimal(ihe58jua01));// 订单明细行的行数
															// 传入时，需要将计算出的行数*100后，写入该字段
		String sendtotime = "";// 要求送货时间
		Date d = new Date();
		String ihe58hdrqd = sdf2.format(d);// 要求送货日期，格式为YYYY-MM-DD
		{
			try {
				long lsendTime = orderData.getOrder().getSend_time();
				long lsendtoTime = orderData.getOrder().getSend_totime();
				sendtotime = sdf1.format(new Date(lsendtoTime * 1000L));
				ihe58hdrqd = sdf2.format(new Date(lsendTime * 1000L));
				// String sendstarttime = sdf1.format(new Date(lsendTime));
				Calendar calCreatedate = Calendar.getInstance();
				// Date createDate = new Date(orderData.getOrder()
				// .getCreate_time() * 1000L);
				Date createDate = new Date(lsendTime * 1000L);
				calCreatedate.setTime(createDate);
				ihe58hdrqd = sdf2.format(calCreatedate.getTime());
				// f55wsd02.setIhdl01(sendstarttime);// 要求送货时间从，格式为HH:mm:ss
			} catch (Exception e) {
				sendtotime = ihe58hsjut;
				ihe58hdrqd = sdf2.format(d);// 要求送货日期，格式为YYYY-MM-DD
				logger.error("要求送货时间，转换失败，发送的send_time为"
						+ orderData.getOrder().getSend_time(), e);
			}

		}
		f55wsd02.setIhe58hdrqd(ihe58hdrqd);// 要求送货日期，格式为YYYY-MM-DD
		f55wsd02.setIhtxt2(sendtotime);// 要求送货时间到，格式为HH:mm:ss
		f55wsd02.setIhe58hus27(orderData.getShop().getId());// 收入门店，F58H0401.SLMCU
		// 发票邮寄地址处理
		if (orderData.getInvoice().getNeed_invoice() == 1) {
			int invoiceUkid = 0;
			invoiceUkid = orderServiceImpl.saveInvoiceMememberInfo(f55wsd02,
					orderData.getInvoice());
			f55wsd02.setIhe58hun05(new BigDecimal(invoiceUkid));
		}
		return f55wsd02;
	}

	/**
	 * 检查订单是否已经生成，已经生成返回true,否则返回false
	 * 
	 * @param orderid
	 *            网单号
	 * @return
	 */
	public boolean checkOrderIsExists(String orderid) {
		String[] params = new String[3];
		params[0] = "B2C";
		params[1] = orderid;
		params[2] = AppOrderEnum.MCU_APP;
		List<F55wsd02> lstF55wsd02 = orderServiceImpl.queryF55wsd02(params);
		if (lstF55wsd02 != null && lstF55wsd02.size() > 0) {
			return true;
		}
		return false;
	}

	private Fe14710a genFe14710a(F55wsd02 f55wsd02) {

		Fe14710a fe14710a = new Fe14710a();
		Fe14710aId fe14710aid = new Fe14710aId();
		fe14710aid.setLsukid(f55wsd02.getId().getIhukid());
		// ihe58huf02 支付类型，1 下线 2 在线
		// 付款方式UDC：E1/PT 01 现金 ; 09 百度外卖在线支付
		if (f55wsd02.getIhe58huf02().equals("1")) {
			fe14710aid.setLse58pt("01");
		}
		fe14710a.setId(fe14710aid);
		fe14710a.setLsflg("N");
		// 应收金额
		fe14710a.setLsaap(f55wsd02.getIhe58tsua());
		// 实收金额
		fe14710a.setLsag(fe14710a.getLsaap());

		return fe14710a;
	}

	/**
	 * 生成临时订单的订单明细数据
	 * 
	 * @param orderData
	 *            请求参数
	 * @param f55wsd02
	 *            临时订单的订单表头数据
	 * @return
	 */
	public List<F55wsd03> genF55wsd03(OrderData orderData, F55wsd02 f55wsd02) {
		List<F55wsd03> lstF55wsd03 = new ArrayList<F55wsd03>();
		int i = 0;
		for (Product p : orderData.getProducts()) {

			// f55wsd03.setIdco(idco);//下单公司

			F55wsd03 f55wsd03 = new F55wsd03();
			F55wsd03Id f55wsd03id = new F55wsd03Id();
			i = i + 1;
			f55wsd03id.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
																// 自然数流水如：1,2，3。。。

			f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

			f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

			f55wsd03id.setIdlnic(new BigDecimal(i * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
			f55wsd03.setId(f55wsd03id);
			// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

			f55wsd03.setIde58eboid(orderData.getOrder().getOrder_id());// 网单编号Order_id
																		// 网单号
			f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

			f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

			f55wsd03.setIde58hoca("A");// "下单渠道(58H|OC) W-网络下单；A-下单App"
			String str = orderData.getShop().getId().trim();
			str = CommonHelper.leftAdd(str, 12);

			f55wsd03.setIdemcu(str);// 出货仓库
			String idlitm = p.getProduct_id();
			// idlitm = "MX";
			f55wsd03.setIdlitm(idlitm);// B2C商品的唯一标示ID，bn JDE商品编号
			// 网站商品编号
			long changerate = p.getProduct_changerate();
			if (changerate <= 0) {
				changerate = 1;
			}
			f55wsd03.setIdtxtlfu3(changerate);// 插入转换系数,默认1
			f55wsd03.setIde58hshs(f55wsd02.getIhe58hshs());// 配送门店
			double iduorg = p.getProduct_amount() * 1000L;
			f55wsd03.setIduorg(new BigDecimal(iduorg));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
			// int price = p.getProduct_price();
			f55wsd03.setIde58pael(new BigDecimal(p.getProduct_price()));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"

			f55wsd03.setIde58aexp(new BigDecimal(p.getProduct_fee()));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

			f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

			f55wsd03.setIde58hos("518");// "商品行状态	516、518生成"

			f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

			f55wsd03.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

			f55wsd03.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

			f55wsd03.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
			// hh:mm:ss
			String printName = p.getProduct_printname();
			if (printName.isEmpty()) {
				printName = p.getProduct_name();
			}
			f55wsd03.setIde58hus21(printName);// 商品打印名称

			f55wsd03.setIdan03(new BigDecimal(p.getProduct_price()));// 会员价
			f55wsd03.setIdan04(new BigDecimal(p.getProduct_fee()));// 会员金额
			lstF55wsd03.add(f55wsd03);
		}

		if (orderData.getOrder().getSend_fee() > 0) {
			i = i + 1;
			F55wsd03 f55wsd03 = genWaiSongFei(f55wsd02, orderData, i, orderData
					.getOrder().getSend_fee());
			lstF55wsd03.add(f55wsd03);
		}
		return lstF55wsd03;
	}

	/**
	 * 订单支付
	 */
	public Object orderPay() {
		List<Inventory> lstInventory = null;
		String bodydata = "true";
		try {
			JSONObject bodyJsonObj = JSONObject.fromObject(body);
			Map<String, Class> classMap = new HashMap<String, Class>();
			classMap.put("payment", Payment.class);
			OrderPay orderPay = (OrderPay) JSONObject.toBean(bodyJsonObj,
					OrderPay.class, classMap);

			// 对请求的body参数进行排序
			TreeMap<String, Object> orderPayDataSorted = orderPay.toMap();
			// 检查签名是否正确
			if (!checkSign(orderPayDataSorted)) {
				return null;
			}

			// 获取生成到jde系统中的订单ukid
			// long prukid = getPrukid(orderPay.getOrder_id());

			F55wsd02 f55wsd02 = getF55wsd02(orderPay.getOrder_id());
			if (f55wsd02 == null) {
				return null;
			}
			long prukid = f55wsd02.getIhprukid().longValue();
			String e58huf02 = f55wsd02.getIhe58huf02().trim();// 支付方式：1：货到付款；2在线支付

			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);
			// 根据临时表的jde处理过的ukid获取jde系统中的订单信息
			F58h0401 f58h0401 = orderPayService.queryF58h0401ByUkid(prukid);

			// 已经支付过了不要重复支付
			if (f58h0401 != null && f58h0401.getChe58gpayf().trim().equals("3")) {
				return bodydata;
			}
			List<FE4PT001> lstFe4pt001 = new ArrayList<FE4PT001>();
			// 插入jde系统中的付款表,并且更新订单为已支付

			for (Payment payment : orderPay.getPayment()) {
				FE4PT001 fe4pt001 = new FE4PT001();
				FE4PT001PK fe4pt001pk = new FE4PT001PK();
				fe4pt001pk.setPtdcto(f58h0401.getChdcto());
				fe4pt001pk.setPtdoco(f58h0401.getChdoco());
				fe4pt001pk.setPte58pt(payment.getPaytype());
				fe4pt001pk.setPtkcoo(f58h0401.getChkcoo());
				fe4pt001.setFe4pt001pk(fe4pt001pk);
				fe4pt001.setPtaap((double) payment.getPayfee());
				fe4pt001.setPtag(fe4pt001.getPtaap());

				lstFe4pt001.add(fe4pt001);
			}
			// 往JDE中插入付款信息表，并且更新订单上的状态
			orderPayService.doPay(e58huf02, prukid, lstFe4pt001);

			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);
			// 更新中间库的临时表状态为已付款状态
			if (e58huf02.equals("2")) {
				orderPayService.updateF55wsd02(prukid);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errno = -1;
			error = "failure";
			e.printStackTrace();
			errorMessage = "App下单:调用订单支付接口失败";
			logger.error(errorMessage + ",错误信息:" + e.getMessage());
			logger.error(e.getMessage(), e);
		}
		return bodydata;
	}

	/**
	 * 获取生成到jde系统中回写到临时表的订单ukid，是jde订单的ukid！
	 * 
	 * @param orderid
	 *            网单号
	 * @return
	 * @throws Exception
	 */
	public long getPrukid(String orderid) throws Exception {
		String[] params = new String[3];
		params[0] = "B2C";
		params[1] = orderid;
		params[2] = AppOrderEnum.MCU_APP;// 1018 App下单
		// 根据网单号，去查中间库订单主表临时表F55wsd02
		List<F55wsd02> lstF55wsd02 = orderServiceImpl.queryF55wsd02(params);
		if (lstF55wsd02 == null || lstF55wsd02.size() == 0) {
			new Exception("没有找到ID=" + params[1] + "的订单");
		}

		long prukid = lstF55wsd02.get(0).getIhprukid().longValue();
		return prukid;
	}

	public F55wsd02 getF55wsd02(String orderid) throws Exception {
		String[] params = new String[3];
		params[0] = "B2C";
		params[1] = orderid;
		params[2] = AppOrderEnum.MCU_APP;// 1018 App下单
		// 根据网单号，去查中间库订单主表临时表F55wsd02
		List<F55wsd02> lstF55wsd02 = orderServiceImpl.queryF55wsd02(params);
		if (lstF55wsd02 == null || lstF55wsd02.size() == 0) {
			new Exception("没有找到ID=" + params[1] + "的订单");
		}

		return lstF55wsd02.get(0);
	}

	/**
	 * 订单支付
	 */
	public Object orderCancelByApp() {
		String bodydata = "true";
		try {
			JSONObject bodyJsonObj = JSONObject.fromObject(body);

			OrderCancelByApp orderCancelByApp = (OrderCancelByApp) JSONObject
					.toBean(bodyJsonObj, OrderCancelByApp.class);

			// 对请求的body参数进行排序
			TreeMap<String, Object> orderCancelByAppDataSorted = orderCancelByApp
					.toMap();
			// 检查签名是否正确
			if (!checkSign(orderCancelByAppDataSorted)) {
				return null;
			}

			// 获取处理过的临时表中记录的生成的订单的ukid

			F55wsd02 f55wsd02 = getF55wsd02(orderCancelByApp.getOrder_id());
			if (f55wsd02 == null) {
				return null;
			}
			// 已经取消过了，直接返回
			if (f55wsd02.getIhe58hos().trim().equals("980")) {
				logger.info("APP下单:订单号=" + orderCancelByApp.getOrder_id()
						+ "重复取消,不再次处理该请求");
				return null;
			}
			long ukid = f55wsd02.getId().getIhukid().longValue();
			// 更新临时表f55wsd02和03的状态为980
			orderCancelByAppServiceImpl.cancelF55wsd02AndF55wsd03(ukid);

			long prukid = f55wsd02.getIhprukid().longValue();
			// 取消的逻辑，调用存储过程
			DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_ERP);

			int result = orderCancelByAppServiceImpl.OrderCancelByApp(prukid);
			if (result == 0) {
				errno = -1;
				error = "failure";
				errorMessage = "App下单:调用订单取消接口失败";
				logger.error(errorMessage);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			errno = -1;
			error = "failure";
			e.printStackTrace();
			errorMessage = "App下单:调用订单取消接口失败";
			logger.error(errorMessage + ",错误信息:" + e.getMessage());
			logger.error(e.getMessage(), e);
		}

		return bodydata;
	}

	public void genResponseData(Object bodydata) {
		data = new TreeMap<String, Object>();

		data.put("cmd", "resp." + cmd);
		long ltimestamp = CalculateSignHelp.calcTimestamp();
		data.put("timestamp", ltimestamp);
		data.put("source", this.getSource());
		data.put("secret", secret);
		// data.put("sign", this.getSign());
		Map<String, Object> bodyMap = new TreeMap<String, Object>();
		// Map<String, Object> bodydata = new TreeMap<String, Object>();

		if (errno == -1) {
			bodyMap.put("data", errorMessage);
		} else {
			// bodydata.put("shop", object);
			if (bodydata != null) {
				bodyMap.put("data", bodydata);
			} else {
				bodyMap.put("data", "true");
			}

		}

		bodyMap.put("errno", errno);
		bodyMap.put("error", error);
		data.put("body", bodyMap);
		// 计算sign
		String sign = CalculateSignHelp.CalculateSign(data);
		data.put("sign", sign);
		data.remove("secret");
	}

	private F55wsd03 genWaiSongFei(F55wsd02 f55wsd02, OrderData orderData,
			int rownum, int price) {
		F55wsd03 f55wsd03 = new F55wsd03();
		F55wsd03Id f55wsd03id = new F55wsd03Id();

		f55wsd03id.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
															// 自然数流水如：1,2，3。。。

		f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

		f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03id.setIdlnic(new BigDecimal(rownum * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		f55wsd03.setId(f55wsd03id);
		// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

		f55wsd03.setIde58eboid(orderData.getOrder().getOrder_id());// 网单编号Order_id
																	// 网单号
		f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

		f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

		f55wsd03.setIde58hoca("A");// "下单渠道(58H|OC)W-网络下单；A-下单App"

		// f55wsd03.setIdco(idco);//下单公司
		String str = orderData.getShop().getId().trim();
		str = CommonHelper.leftAdd(str, 12);
		f55wsd03.setIdemcu(str);// 出货仓库

		f55wsd03.setIde58hshs(f55wsd02.getIhe58hshs());// 配送门店
		String idlitm = "WSF";// 外送费
		f55wsd03.setIdlitm(idlitm);// B2C商品的唯一标示ID，bn JDE商品编号

		/*
		 * String ide58hbitm = p.getProduct_id(); ide58hbitm = "121"; if
		 * (ide58hbitm == null || ide58hbitm.equals("")) { throw new
		 * Exception("创建订单失败，没有商品ID，商品名称:" + p.getProduct_name()); }
		 */

		// f55wsd03.setIde58hbitm(new BigDecimal(idlitm));// B2C商品唯一代码
		// 网站商品编号

		Long iduorg = 1 * 1000L;

		f55wsd03.setIduorg(new BigDecimal(iduorg));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03.setIde58pael(new BigDecimal(price));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58aexp(new BigDecimal(price));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

		f55wsd03.setIde58hos("518");// "商品行状态516、518生成"

		f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

		f55wsd03.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

		f55wsd03.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

		f55wsd03.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
		// hh:mm:ss

		f55wsd03.setIde58hus21("外送费");// 商品打印名称

		f55wsd03.setIdan03(new BigDecimal(price));// 会员价
		f55wsd03.setIdan04(new BigDecimal(price));// 会员金额
		return f55wsd03;
	}
}
