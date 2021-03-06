package com.el.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.dao.IF0005lDAO;
import com.el.dao.IF55wsd02DAO;
import com.el.dao.IF55wsd03DAO;
import com.el.dao.IFe14101aDAO;
import com.el.dao.IFe147106DAO;
import com.el.dao.IFe147107DAO;
import com.el.dao.IFe14710aDAO;
import com.el.entity.F0005L;
import com.el.entity.F55wsd02;
import com.el.entity.F55wsd03;
import com.el.entity.F55wsd03Id;
import com.el.entity.Fe14101a;
import com.el.entity.Fe147106;
import com.el.entity.Fe147106Id;
import com.el.entity.Fe147107;
import com.el.entity.Fe147107Id;
import com.el.entity.Fe14710a;
import com.el.entity.Fe14710aId;
import com.el.entity.WaiMaiWLBEnum;
import com.el.entity.apporder.AppOrderEnum;
import com.el.entity.apporder.Member;
import com.el.entity.apporder.OrderInvoice;
import com.el.service.IJDEWebService;
import com.el.service.IOrderService;
import com.el.util.CalculateJulianCalendar;
import com.el.util.CommonHelper;
import com.el.webservice.genereateretailorder.client.BusinessServiceException_Exception;

@Service("orderServiceImpl")
@Scope("prototype")
public class OrderServiceImpl implements IOrderService {

	private IF55wsd02DAO f55wsd02DAO;
	private IF55wsd03DAO f55wsd03DAO;
	private IFe147106DAO fe147106DAO;
	private IFe147107DAO fe147107DAO;
	private IF0005lDAO f0005lDAO;

	public IF0005lDAO getF0005lDAO() {
		return f0005lDAO;
	}

	@Autowired
	public void setF0005lDAO(IF0005lDAO f0005lDAO) {
		this.f0005lDAO = f0005lDAO;
	}

	private IFe14710aDAO fe14710aDAO;

	private IFe14101aDAO fe14101aDAO;

	public IFe14101aDAO getFe14101aDAO() {
		return fe14101aDAO;
	}

	@Autowired
	public void setFe14101aDAO(IFe14101aDAO fe14101aDAO) {
		this.fe14101aDAO = fe14101aDAO;
	}

	public IFe14710aDAO getFe14710aDAO() {
		return fe14710aDAO;
	}

	@Autowired
	public void setFe14710aDAO(IFe14710aDAO fe14710aDAO) {
		this.fe14710aDAO = fe14710aDAO;
	}

	public IFe147106DAO getFe147106DAO() {
		return fe147106DAO;
	}

	@Autowired
	public void setFe147106DAO(IFe147106DAO fe147106dao) {
		fe147106DAO = fe147106dao;
	}

	public IFe147107DAO getFe147107DAO() {
		return fe147107DAO;
	}

	@Autowired
	public void setFe147107DAO(IFe147107DAO fe147107dao) {
		fe147107DAO = fe147107dao;
	}

	public IF55wsd02DAO getF55wsd02DAO() {
		return f55wsd02DAO;
	}

	@Autowired
	public void setF55wsd02DAO(IF55wsd02DAO f55wsd02dao) {
		f55wsd02DAO = f55wsd02dao;
	}

	public IF55wsd03DAO getF55wsd03DAO() {
		return f55wsd03DAO;
	}

	@Autowired
	public void setF55wsd03DAO(IF55wsd03DAO f55wsd03dao) {
		f55wsd03DAO = f55wsd03dao;
	}

	private IJDEWebService jdeWebServiceImpl;

	public IJDEWebService getJdeWebServiceImpl() {
		return jdeWebServiceImpl;
	}

	@Resource
	public void setJdeWebServiceImpl(IJDEWebService jdeWebServiceImpl) {
		this.jdeWebServiceImpl = jdeWebServiceImpl;
	}

	@Override
	@Transactional
	public List<F55wsd02> queryF55wsd02(Object[] params) {
		// TODO Auto-generated method stub

		String hql = "from F55wsd02 where trim(IHE58HEDID)='B2C' and  trim(IHE58EBOID)="
				+ params[1]; // f55wsd02DAO.queryF55wsd02(params); //
		f55wsd02DAO.queryForList(hql, null);
		List<F55wsd02> lstF55wsd02 = f55wsd02DAO.queryF55wsd02(params);
		return lstF55wsd02;

	}

	/*
	 * @Override public void saveF55wsd02(F55wsd02 f55wsd02) throws Exception {
	 * // TODO Auto-generated method stub f55wsd02DAO.insert(f55wsd02);
	 * 
	 * }
	 * 
	 * @Override public void saveF55wsd03(F55wsd03 f55wsd03) throws Exception {
	 * // TODO Auto-generated method stub f55wsd03DAO.insert(f55wsd03); }
	 */
	@Override
	@Transactional
	public void saveOrder(F55wsd02 f55wsd02, List<F55wsd03> lstf55wsd03,
			List<Fe14710a> lstFe14710a) throws Exception {
		// TODO Auto-generated method stub
		f55wsd02DAO.insert(f55wsd02);

		// 物料包赠送策略
		F55wsd03 f55wsd03WLB = createWLB(f55wsd02, lstf55wsd03.size());
		if (f55wsd03WLB != null) {
			lstf55wsd03.add(f55wsd03WLB);
		}

		for (F55wsd03 f55wsd03 : lstf55wsd03) {

			f55wsd03DAO.insert(f55wsd03);
		}

		saveMememberInfo(f55wsd02);

		for (Fe14710a fe14710a : lstFe14710a) {
			fe14710aDAO.insert(fe14710a);
		}

	}

	public void saveMememberInfo(F55wsd02 f55wsd02) throws Exception {
		Holder<Integer> ukid = new Holder<Integer>();
		Holder<String> tableName = new Holder<String>("FE147106");
		int ihukid = jdeWebServiceImpl.GetNextUniqueID(ukid, tableName);
		if (ihukid == 0) {
			// errno = 10208;
			throw new Exception("获取FE147106的UKID失败");
		}

		Fe147106 fe147106 = new Fe147106();
		Fe147106Id fe147106Id = new Fe147106Id();
		// fe147106Id.setMmukid(f55wsd02.getId().getIhukid());
		fe147106Id.setMmukid(new BigDecimal(ihukid));

		// "交互方向 JDE：JDE向官网同步；B2C：官网向JDE同步"
		fe147106Id.setMme58hedid("B2C");
		fe147106.setId(fe147106Id);
		fe147106.setMme58mcno(f55wsd02.getIhe58mcno());
		// "会员编号，唯一值，可作为登录字段，数据库设置必填NN(58H|01)"
		// fe147106.setMme58mbno(mme58mbno);

		// 会员真实姓名
		fe147106.setMmalph(f55wsd02.getIhe58hmn());

		// "会员性别：07|SG空白-保密；F-女性；M-男性；"
		fe147106.setMmsex(" ");

		// "会员注册电话号码，如果会员电话没有，就写入收货人电话。必填，而且保证不能一个手机号注册两个会员		同时需要将此号码写入多电话列表中，并作为主电话（标识为P），数据库设置必填，（JDE处理）"
		fe147106.setMmph1(f55wsd02.getIhe58mcno());

		String strCreatedate = f55wsd02.getIhe58hboct();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date credate = sdf.parse(strCreatedate);
		// 创建日期转换成儒略历
		int julianCredate = CalculateJulianCalendar.CalculateJulian(credate);
		// "会员注册日期 匿名会员就写入订单日期"
		fe147106.setMmefff(julianCredate);
		// 会员更新日期
		fe147106.setMmefdj(julianCredate);
		// "会员状态：UDC  58E|AF    CS-沉睡；DJ-冻结；JH-激活；WJ-未激活 默认传JH-激活"

		fe147106.setMme58mbas("JH");
		// "会员属性（58E|MP） 默认传PE；"

		fe147106.setMme58urc2("PE");

		// "会员级别：UDC  58E|ML会员注册时，默认01；"

		fe147106.setMme58mblv("01");
		/*
		 * 会员出生 年月日 fe147106.setMmdoby(mmdoby); fe147106.setMmdobm(mmdobm);
		 * fe147106.setMmdobd(mmdobd);
		 */

		// "渠道来源(UDC:58L|MK)01 官网02 微信03 400电话 默认为01"
		// "04百度05美团06饿了么"Ihe58hus23("1003");//
		// " 1001 官网    1002 微信 E1/WT	F58H0401.MCU 1003 百度 1010美团 1006饿了么"

		String Ihe58hus23 = f55wsd02.getIhe58hus23();
		String mme58mjtp = "01";
		switch (Ihe58hus23) {
		case "1003":
			mme58mjtp = "04";
			break;
		case "1010":
			mme58mjtp = "05";
			break;
		case "1006":
			mme58mjtp = "06";
			break;
		case "1018":
			mme58mjtp = "07";
			break;
		default:
			break;
		}
		fe147106.setMme58mjtp(mme58mjtp);
		// "E-mail,用作登录，唯一值必填，保证同一个邮箱只能注册一个会员账号"
		// fe147106.setMme58hmail(mme58hmail);

		// "会员性质，是否正式会员默认为Y，正式会员；"

		fe147106.setMme58huf05("Y");
		// 网站会员ID号
		// fe147106.setMme58hun01(mme58hun01);

		// "会员类型，UDC：58N/MC 默认01		必传"
		fe147106.setMme58nmcc("01");
		// "会员注册日期(对应JDE的EFFF字段)格式：yyyy-MM-dd		必填"

		fe147106.setMme58hsctm(strCreatedate);
		// "读取标记默认写入N，数据读取同步后写入Y"
		fe147106.setMmev01("N");

		fe147106DAO.insert(fe147106);

		Holder<Integer> ukid2 = new Holder<Integer>();
		Holder<String> tableName2 = new Holder<String>("FE147107");
		int ihukid2 = jdeWebServiceImpl.GetNextUniqueID(ukid2, tableName2);
		if (ihukid2 == 0) {
			// errno = 10208;
			throw new Exception("获取FE147107的UKID失败");
		}

		Fe147107 fe147107 = new Fe147107();
		Fe147107Id fe147107id = new Fe147107Id();
		// "交互方向JDE：JDE向官网同步；B2C：官网向JDE同步"
		fe147107id.setMae58hedid("B2C");
		// "行号，从1开始，手工累加写入规则：如果行号为1，则传入1000，以此类推"

		fe147107id.setMalnic(new BigDecimal(1000));

		// 根据WebService获取UKID的值
		// fe147107id.setMaukid(fe147106.getId().getMmukid());
		fe147107id.setMaukid(new BigDecimal(ihukid2));
		fe147107.setId(fe147107id);

		//
		fe147107.setMae58mcno(fe147106.getMme58mcno());
		fe147107.setMalnid(new BigDecimal(1000));
		// 收货人姓名
		fe147107.setMaalph(fe147106.getMmalph());
		// 邮编
		fe147107.setMae58mpst(" ");
		fe147107.setMaaurst3(fe147106.getMmph1());

		fe147107.setMae58hproc(f55wsd02.getIhe58hproc());
		fe147107.setMae58hcity(f55wsd02.getIhe58hcity());
		fe147107.setMae58hpref(f55wsd02.getIhe58hpref());

		// 详细地址
		fe147107.setMae58hxxdz(f55wsd02.getIhe58hxxdz());

		fe147107.setMaev02("N");
		// "创建日期格式：yyyy-MM-dd"
		fe147107.setMae58hsctm(strCreatedate);
		// "更新日期格式：yyyy-MM-dd"
		fe147107.setMae58hsbut(strCreatedate);
		fe147107DAO.insert(fe147107);

	}

	@Transactional
	public void saveMememberInfo(Member member) throws Exception {
		Holder<Integer> ukid = new Holder<Integer>();
		Holder<String> tableName = new Holder<String>("FE147106");
		int ihukid = jdeWebServiceImpl.GetNextUniqueID(ukid, tableName);
		if (ihukid == 0) {
			throw new Exception("获取FE147106的UKID失败");
		}

		Fe147106 fe147106 = new Fe147106();
		Fe147106Id fe147106Id = new Fe147106Id();
		fe147106Id.setMmukid(new BigDecimal(ihukid));

		// "交互方向 JDE：JDE向官网同步；B2C：官网向JDE同步"
		fe147106Id.setMme58hedid("B2C");
		fe147106.setId(fe147106Id);
		fe147106.setMme58mcno(member.getPhone());
		// "会员编号，唯一值，可作为登录字段，数据库设置必填NN(58H|01)"
		// fe147106.setMme58mbno(mme58mbno);

		// 会员真实姓名
		fe147106.setMmalph(member.getName());

		// "会员性别：07|SG空白-保密；F-女性；M-男性；"
		String gender = " ";
		if (member.getGender() == 1) {
			gender = "M";
		} else if (member.getGender() == 2) {
			gender = "F";
		}
		fe147106.setMmsex(gender);

		// "会员注册电话号码，如果会员电话没有，就写入收货人电话。必填，而且保证不能一个手机号注册两个会员		同时需要将此号码写入多电话列表中，并作为主电话（标识为P），数据库设置必填，（JDE处理）"
		fe147106.setMmph1(member.getPhone());

		Calendar c = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date credate = c.getTime();
		// 创建日期转换成儒略历
		int julianCredate = CalculateJulianCalendar.CalculateJulian(credate);
		// "会员注册日期 匿名会员就写入订单日期"
		fe147106.setMmefff(julianCredate);
		// 会员更新日期
		fe147106.setMmefdj(julianCredate);
		// "会员状态：UDC  58E|AF    CS-沉睡；DJ-冻结；JH-激活；WJ-未激活 默认传JH-激活"

		fe147106.setMme58mbas("JH");
		// "会员属性（58E|MP） 默认传PE；"

		fe147106.setMme58urc2("PE");

		// "会员级别：UDC  58E|ML会员注册时，默认01；"

		fe147106.setMme58mblv("01");
		/*
		 * 会员出生 年月日 fe147106.setMmdoby(mmdoby); fe147106.setMmdobm(mmdobm);
		 * fe147106.setMmdobd(mmdobd);
		 */

		// "渠道来源(UDC:58L|MK)01 官网02 微信03 400电话 默认为01"
		// "04百度05美团06饿了么 ;08APP下单
		String mme58mjtp = AppOrderEnum.MEMBER_SOURCE_APP;

		fe147106.setMme58mjtp(mme58mjtp);
		// "E-mail,用作登录，唯一值必填，保证同一个邮箱只能注册一个会员账号"
		// fe147106.setMme58hmail(mme58hmail);

		// "会员性质，是否正式会员默认为Y，正式会员；"

		fe147106.setMme58huf05("Y");
		// 网站会员ID号
		// fe147106.setMme58hun01(mme58hun01);

		// "会员类型，UDC：58N/MC 默认01		必传"
		fe147106.setMme58nmcc("01");
		// "会员注册日期(对应JDE的EFFF字段)格式：yyyy-MM-dd		必填"

		fe147106.setMme58hsctm(sdf.format(credate));
		// "读取标记默认写入N，数据读取同步后写入Y"
		fe147106.setMmev01("N");

		fe147106DAO.insert(fe147106);
		String address = member.getAddress();
		if (address != null && !address.trim().isEmpty()) {
			Holder<Integer> ukid2 = new Holder<Integer>();
			Holder<String> tableName2 = new Holder<String>("FE147107");
			int ihukid2 = jdeWebServiceImpl.GetNextUniqueID(ukid2, tableName2);
			if (ihukid2 == 0) {
				// errno = 10208;
				throw new Exception("获取FE147107的UKID失败");
			}

			Fe147107 fe147107 = new Fe147107();
			Fe147107Id fe147107id = new Fe147107Id();
			// "交互方向JDE：JDE向官网同步；B2C：官网向JDE同步"
			fe147107id.setMae58hedid("B2C");
			// "行号，从1开始，手工累加写入规则：如果行号为1，则传入1000，以此类推"

			fe147107id.setMalnic(new BigDecimal(1000));

			// 根据WebService获取UKID的值
			// fe147107id.setMaukid(fe147106.getId().getMmukid());
			fe147107id.setMaukid(new BigDecimal(ihukid2));
			fe147107.setId(fe147107id);

			//
			fe147107.setMae58mcno(fe147106.getMme58mcno());
			fe147107.setMalnid(new BigDecimal(1000));
			// 收货人姓名
			fe147107.setMaalph(fe147106.getMmalph());
			// 邮编
			fe147107.setMae58mpst(" ");
			fe147107.setMaaurst3(fe147106.getMmph1());
			// String province = searchUDCByProCityDis("PR",
			// member.getProvince());
			// String city = searchUDCByProCityDis("CT", member.getCity());
			// String disctrict = searchUDCByProCityDis("PT",
			// member.getDistrict());
			String province = member.getProvince();
			String city = member.getCity();
			String disctrict = member.getDistrict();
			fe147107.setMae58hproc(province);
			fe147107.setMae58hcity(city);
			fe147107.setMae58hpref(disctrict);

			// 详细地址
			fe147107.setMae58hxxdz(member.getAddress());

			fe147107.setMaev02("N");
			// "创建日期格式：yyyy-MM-dd"
			fe147107.setMae58hsctm(sdf.format(credate));
			// "更新日期格式：yyyy-MM-dd"
			fe147107.setMae58hsbut(sdf.format(credate));
			fe147107DAO.insert(fe147107);
		}

	}

	/**
	 * 根据类型，查找省市区的udc值
	 * 
	 * @param type
	 *            类型，PR省，CT市，PT区
	 * @param val
	 *            中文名，例如北京市、朝阳区
	 * @return
	 */
	public String searchUDCByProCityDis(String type, String val) {
		Object[] mapParams = new Object[2];
		mapParams[0] = type;// CT// PR// PT
		mapParams[1] = val;
		List<F0005L> lstF0005ls = this.queryLstF0005L(mapParams);
		if (lstF0005ls != null && lstF0005ls.size() > 0) {
			return lstF0005ls.get(0).getId().getDrky();// 省（58|PR），省的编码，必填
		}
		return "";

	}

	/**
	 * 调用webservice，生成订单
	 * 
	 * @param f55wsd02
	 * @param lstf55wsd03
	 * @throws RuntimeException
	 */
	public void callWebservice(F55wsd02 f55wsd02, List<F55wsd03> lstf55wsd03)
			throws Exception {

		Holder<String> cErrorFlag = new Holder<String>("N");
		Holder<String> szAlternateDirectionType = new Holder<String>("B2C");
		Holder<String> szErrorCode = new Holder<String>("");
		Holder<String> szErrorMessage = new Holder<String>("");
		Holder<String> szMemberCardNumber = new Holder<>(
				f55wsd02.getIhe58mcno());

		jdeWebServiceImpl.MemberInforRevision(cErrorFlag,
				szAlternateDirectionType, szErrorCode, szErrorMessage,
				szMemberCardNumber);
		if (cErrorFlag.value.equals("Y")) {
			throw new Exception("调用会员主数据webservice失败,szErrorCode="
					+ szErrorCode.value + ";szErrorMessage="
					+ szErrorMessage.value);
		}

		Holder<String> cErrorFlag2 = new Holder<String>("N");
		Holder<String> szAlternateDirectionType2 = new Holder<String>("B2C");
		Holder<String> szErrorCode2 = new Holder<String>("");
		Holder<String> szErrorMessage2 = new Holder<String>("");
		Holder<String> szMemberCardNumber2 = new Holder<>(
				f55wsd02.getIhe58mcno());
		Holder<String> szValidateString2 = new Holder<String>("");

		jdeWebServiceImpl.MemberMutipleAddressRevision(cErrorFlag2,
				szAlternateDirectionType2, szMemberCardNumber2, szErrorCode2,
				szErrorMessage2, szValidateString2);
		if (cErrorFlag2.value.equals("Y")) {
			throw new Exception("调用会员多地址主档失败,szErrorCode=" + szErrorCode2.value
					+ ";szErrorMessage=" + szErrorMessage2.value);
		}

		// 调用生成订单的webservice
		Holder<Integer> mnNumberOfRowsNUR = new Holder<Integer>(
				lstf55wsd03.size());
		Holder<Integer> mnSerialNumberUKID = new Holder<Integer>(f55wsd02
				.getId().getIhukid().intValue());
		Holder<String> szStatusMessage = new Holder<String>("");
		Holder<String> szSuccessFLagYNDL01 = new Holder<String>("Y");
		// 调用webservice 生成订单
		try {
			jdeWebServiceImpl.GenerateRetailOrder(mnNumberOfRowsNUR,
					mnSerialNumberUKID, szStatusMessage, szSuccessFLagYNDL01);
		} catch (BusinessServiceException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			szSuccessFLagYNDL01.value = "N";
		}
		if (szSuccessFLagYNDL01.value.equals("N")) {
			throw new RuntimeException("调用生成订单WebService失败，statusMessage:"
					+ szStatusMessage.value);
		}
	}

	@Override
	@Transactional
	public List<Fe14101a> queryFe14101a(Object[] params) {
		String hql = "from Fe14101a where PTTYPD=?  and trim(ptdl01)||trim(ptdl02)=? order by ptuprc";
		List<Fe14101a> lstFe14101a = fe14101aDAO.queryForList(hql, params);
		return lstFe14101a;
	}

	@Override
	@Transactional
	public List<F0005L> queryLstF0005L(Object[] params) {
		// TODO Auto-generated method stub
		return f0005lDAO.queryLstF0005L(params);
	}

	@Override
	public F55wsd03 createWLB(F55wsd02 f55wsd02, int rownum) {
		double total = f55wsd02.getIhe58tsua().doubleValue() / 100;
		if (total >= 100 && total < 300) {
			return genWLB(f55wsd02, rownum, WaiMaiWLBEnum.BZWL);

		} else if (total >= 300) {
			// return genWLB(f55wsd02, rownum, WaiMaiWLBEnum.MBWL);
			return genWLB(f55wsd02, rownum, WaiMaiWLBEnum.BZWL);
		}

		return null;
	}

	public F55wsd03 genWLB(F55wsd02 f55wsd02, int rownum, String item) {
		rownum = rownum + 1;
		F55wsd03 f55wsd03 = new F55wsd03();
		F55wsd03Id f55wsd03id = new F55wsd03Id();

		f55wsd03id.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
															// 自然数流水如：1,2，3。。。

		f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

		f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03id.setIdlnic(new BigDecimal(rownum * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		f55wsd03.setId(f55wsd03id);
		// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

		f55wsd03.setIde58eboid(f55wsd02.getIhe58eboid());
		;// 网单编号Order_id 网单号
		f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

		f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

		f55wsd03.setIde58hoca(f55wsd02.getIhe58hoca());// "下单渠道(58H|OC)				W-网络下单；"

		// f55wsd03.setIdco(idco);//下单公司

		f55wsd03.setIdlitm(item);// B2C商品的唯一标示ID，bn JDE商品编号

		Long iduorg = 1 * 1000L;

		f55wsd03.setIduorg(new BigDecimal(iduorg));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03.setIde58pael(new BigDecimal(0));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58aexp(new BigDecimal(0));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"
		if (f55wsd02.getIhe58hoca().trim().equals("A")) {
			f55wsd03.setIde58hos("518");// "商品行状态			518 生成"
			String str = f55wsd02.getIhe58hshs().toString();

			str = CommonHelper.leftAdd(str, 12);

			f55wsd03.setIdemcu(str);
			f55wsd03.setIde58hshs(f55wsd02.getIhe58hshs());
		} else {
			f55wsd03.setIde58hos("516");// "商品行状态			516"
		}

		f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

		f55wsd03.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

		f55wsd03.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

		f55wsd03.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
		// hh:mm:ss
		// 标准物料套装（赠送）
		if (item.equals("BZWL")) {
			f55wsd03.setIde58hus21("标准物料套装（赠送）");// 商品打印名称
		} else {
			f55wsd03.setIde58hus21("麻布物料套装（赠送）");// 商品打印名称
		}

		f55wsd03.setIdan03(new BigDecimal(0));// 会员价
		f55wsd03.setIdan04(new BigDecimal(0));// 会员金额
		return f55wsd03;
	}

	@Override
	public void callMemberWebservice(String MemberCardNumber) throws Exception {

		Holder<String> cErrorFlag = new Holder<String>("N");
		Holder<String> szAlternateDirectionType = new Holder<String>("B2C");
		Holder<String> szErrorCode = new Holder<String>("");
		Holder<String> szErrorMessage = new Holder<String>("");
		Holder<String> szMemberCardNumber = new Holder<>(MemberCardNumber);

		jdeWebServiceImpl.MemberInforRevision(cErrorFlag,
				szAlternateDirectionType, szErrorCode, szErrorMessage,
				szMemberCardNumber);
		if (cErrorFlag.value.equals("Y")) {
			throw new Exception("调用会员主数据webservice失败,szErrorCode="
					+ szErrorCode.value + ";szErrorMessage="
					+ szErrorMessage.value);
		}

		Holder<String> cErrorFlag2 = new Holder<String>("N");
		Holder<String> szAlternateDirectionType2 = new Holder<String>("B2C");
		Holder<String> szErrorCode2 = new Holder<String>("");
		Holder<String> szErrorMessage2 = new Holder<String>("");
		Holder<String> szMemberCardNumber2 = new Holder<>(MemberCardNumber);
		Holder<String> szValidateString2 = new Holder<String>("");

		jdeWebServiceImpl.MemberMutipleAddressRevision(cErrorFlag2,
				szAlternateDirectionType2, szMemberCardNumber2, szErrorCode2,
				szErrorMessage2, szValidateString2);
		if (cErrorFlag2.value.equals("Y")) {
			throw new Exception("调用会员多地址主档失败,szErrorCode=" + szErrorCode2.value
					+ ";szErrorMessage=" + szErrorMessage2.value);
		}

	}

	@Override
	@Transactional
	public void saveAppOrder(F55wsd02 f55wsd02, List<F55wsd03> lstf55wsd03,
			List<Fe14710a> lstFe14710a) throws Exception {
		// TODO Auto-generated method stub
		f55wsd02DAO.insert(f55wsd02);

		// 物料包赠送策略
		F55wsd03 f55wsd03WLB = createWLB(f55wsd02, lstf55wsd03.size());
		if (f55wsd03WLB != null) {
			lstf55wsd03.add(f55wsd03WLB);
		}

		for (F55wsd03 f55wsd03 : lstf55wsd03) {

			f55wsd03DAO.insert(f55wsd03);
		}

		saveMememberInfo(f55wsd02);

		for (Fe14710a fe14710a : lstFe14710a) {
			fe14710aDAO.insert(fe14710a);
		}
	}

	@Override
	@Transactional
	public int saveInvoiceMememberInfo(F55wsd02 f55wsd02,
			OrderInvoice orderInvoice) throws Exception {

		Holder<Integer> ukid2 = new Holder<Integer>();
		Holder<String> tableName2 = new Holder<String>("FE147107");
		int ihukid2 = jdeWebServiceImpl.GetNextUniqueID(ukid2, tableName2);
		if (ihukid2 == 0) {
			// errno = 10208;
			throw new Exception("获取FE147107的UKID失败");
		}

		Fe147107 fe147107 = new Fe147107();
		Fe147107Id fe147107id = new Fe147107Id();
		// "交互方向JDE：JDE向官网同步；B2C：官网向JDE同步"
		fe147107id.setMae58hedid("B2C");
		// "行号，从1开始，手工累加写入规则：如果行号为1，则传入1000，以此类推"

		fe147107id.setMalnic(new BigDecimal(1000));

		// 根据WebService获取UKID的值
		// fe147107id.setMaukid(fe147106.getId().getMmukid());
		fe147107id.setMaukid(new BigDecimal(ihukid2));
		fe147107.setId(fe147107id);

		// 会员号
		fe147107.setMae58mcno(f55wsd02.getIhe58mcno());
		fe147107.setMalnid(new BigDecimal(1000));
		fe147107.setMaatype("IM");

		// 收货人姓名
		fe147107.setMaalph(orderInvoice.getUsername());
		// 邮编
		fe147107.setMae58mpst(" ");
		fe147107.setMaaurst3(orderInvoice.getUserphone());
//		// 省编码
//		String provinceCode = queryProvinceCityDisCode("PR",
//				orderInvoice.getProvince());
//		// 市编码
//		String cityCode = queryProvinceCityDisCode("CT", orderInvoice.getCity());
//		// 区编码
//		 String disCode = queryProvinceCityDisCode("PT",
//		 orderInvoice.getDistrict());
		String provinceCode = orderInvoice.getProvince();
		// 市编码
		String cityCode = orderInvoice.getCity();
		// 区编码
		String disCode = orderInvoice.getDistrict();
		fe147107.setMae58hproc(provinceCode);

		fe147107.setMae58hcity(cityCode);

		fe147107.setMae58hpref(disCode);

		// 详细地址
		fe147107.setMae58hxxdz(orderInvoice.getAddress());

		fe147107.setMaev02("N");

		String strCreatedate = f55wsd02.getIhe58hboct();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		// Date credate = sdf.parse(strCreatedate);
		// 创建日期转换成儒略历
		// int julianCredate = CalculateJulianCalendar.CalculateJulian(credate);

		// "创建日期格式：yyyy-MM-dd"
		fe147107.setMae58hsctm(strCreatedate);
		// "更新日期格式：yyyy-MM-dd"
		fe147107.setMae58hsbut(strCreatedate);
		fe147107DAO.insert(fe147107);
		return ihukid2;

	}

	public String queryProvinceCityDisCode(String type, String name) {
		Object[] mapParams = new Object[2];
		mapParams[0] = type;// CT// PR// PT
		mapParams[1] = name;
		List<F0005L> lstF0005ls = this.queryLstF0005L(mapParams);
		String retValue = "";
		if (type.equals("PR")) {

			if (lstF0005ls != null && lstF0005ls.size() > 0) {
				retValue = lstF0005ls.get(0).getId().getDrky();// 省（58|PR），省的编码，必填
			}
		} else if (type.equals("CT")) {
			if (lstF0005ls != null && lstF0005ls.size() > 0) {
				retValue = lstF0005ls.get(0).getId().getDrky();// 市
			}
		} else if (type.equals("PT")) {
			retValue = lstF0005ls.get(0).getId().getDrky();// 区
		}
		return retValue;

	}

}
