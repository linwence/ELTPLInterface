package com.el.action.eleme.impl;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Holder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.el.action.eleme.IElemeOrderDoSave;
import com.el.entity.F0005L;
import com.el.entity.F55wsd02;
import com.el.entity.F55wsd02Id;
import com.el.entity.F55wsd03;
import com.el.entity.F55wsd03Id;
import com.el.entity.Fe14101a;
import com.el.entity.Fe14710a;
import com.el.entity.Fe14710aId;
import com.el.entity.eleme.OrderDetail;
import com.el.entity.eleme.OrderExtra;
import com.el.entity.eleme.OrderFood;
import com.el.entity.eleme.OrderGarnish;
import com.el.entity.eleme.OrderGroup;
import com.el.entity.eleme.OrderInfo;
import com.el.service.IJDEWebService;
import com.el.service.IOrderService;
import com.el.util.BaiduMapUtil;
import com.el.util.CalculateSignHelp;
import com.el.util.CommonHelper;
import com.el.util.ElemeHelper;
import com.el.util.HttpRequestUtil;
import com.google.gson.Gson;

@Component("elemeOrderDoSave")
@Scope("prototype")
public class ElemeOrderDoSave implements IElemeOrderDoSave {
	Logger logger = Logger.getLogger(ElemeOrderDoSave.class);

	private OrderInfo orderInfo;
	private OrderDetail orderDetail;

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	private String code;
	private String message;
	private String request_id;
	private String orderJsonString;

	private IOrderService orderServiceImpl;
	private IJDEWebService jdeWebServiceImpl;

	public IOrderService getOrderServiceImpl() {
		return orderServiceImpl;
	}

	@Autowired
	public void setOrderServiceImpl(IOrderService orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}

	public IJDEWebService getJdeWebServiceImpl() {
		return jdeWebServiceImpl;
	}

	@Autowired
	public void setJdeWebServiceImpl(IJDEWebService jdeWebServiceImpl) {
		this.jdeWebServiceImpl = jdeWebServiceImpl;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getOrderJsonString() {
		return orderJsonString;
	}

	public void setOrderJsonString(String orderJsonString) {
		this.orderJsonString = orderJsonString;
	}

	public ElemeOrderDoSave() {
		// TODO Auto-generated constructor stub
	}

	public void convertOrderDetail() {
		orderDetail = new OrderDetail();
		Gson gson = new Gson();
		JSONObject jsonObj = JSONObject.fromObject(orderJsonString);
		String data = jsonObj.getString("data");
		// String data =
		// "{\"status_code\":-1,\"deliver_fee\":0,\"delivery_poi_address\":\"八里庄东里1809(八里庄路东)\",\"detail\":{\"abandoned_extra\":[],\"extra\":[],\"group\":[[{\"id\":42534249,\"price\":46,\"name\":\"黑笋烧牛肉\",\"garnish\":[{\"id\":42534251,\"price\":55,\"name\":\"葱香龙俐鱼柳\",\"category_id\":1,\"quantity\":1,\"specs\":[]}],\"category_id\":1,\"quantity\":2,\"specs\":[]},{\"id\":42534261,\"price\":45,\"name\":\"辣子鸡\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[]},{\"id\":42534264,\"price\":56,\"name\":\"泡椒牛蛙\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[]}]]},\"invoice\":\"\",\"consignee\":\"下单测试 先生\",\"original_price\":248,\"restaurant_id\":62028381,\"phone_list\":[\"15010138804\"],\"order_id\":\"100154890279162185\",\"total_price\":248,\"user_name\":\"37eac8ab4\",\"address\":\"八里庄东里1809\",\"description\":\"测试\",\"created_at\":\"2015-11-12 13:52:47\",\"user_id\":15061391,\"deliver_time\":\"2015-11-12 16:00:00\",\"delivery_geo\":\"39.915852,116.498398\",\"is_online_paid\":0,\"restaurant_name\":\"常平九江水美宜佳\",\"is_book\":1}";
		orderInfo = gson.fromJson(data, OrderInfo.class);
		JSONObject jobj = JSONObject.fromObject(data);
		JSONObject detailJsonObj = JSONObject.fromObject(jobj.get("detail"));
		List<OrderExtra> lstOrderExtra = convertToOrderExtra(detailJsonObj);
		List<OrderGroup> lstGroup = convertToOrderGroup(detailJsonObj);
		orderDetail.setGroup(lstGroup);
		orderDetail.setExtra(lstOrderExtra);
	}

	public List<OrderGroup> convertToOrderGroup(JSONObject jsonDetailObj) {
		JSONArray gropJsonObj = JSONArray
				.fromObject(jsonDetailObj.get("group"));
		Object[] oarray = new Object[gropJsonObj.size()];
		List<OrderGroup> lstGroup = new ArrayList<OrderGroup>();
		for (int i = 0; i < oarray.length; i++) {
			oarray[i] = gropJsonObj.get(i);
			System.out.println(oarray[i]);
			JSONArray foodJsonArray = JSONArray.fromObject(oarray[i]);
			List<OrderFood> lstFood = new ArrayList<OrderFood>();
			Map<String, Class> classMap = new HashMap<String, Class>();
			classMap.put("garnish", OrderGarnish.class);
			for (int j = 0; j < foodJsonArray.size(); j++) {
				JSONObject foodJsonObj = foodJsonArray.getJSONObject(j);
				OrderFood orderFood = (OrderFood) JSONObject.toBean(
						foodJsonObj, OrderFood.class, classMap);
				lstFood.add(orderFood);
			}
			OrderGroup orderGroup = new OrderGroup();
			orderGroup.setFoods(lstFood);
			lstGroup.add(orderGroup);

		}
		return lstGroup;
	}

	public List<OrderExtra> convertToOrderExtra(JSONObject jsonDetailObj) {
		JSONArray gropJsonObj = JSONArray
				.fromObject(jsonDetailObj.get("extra"));
		List<OrderExtra> lstExtra = new ArrayList<OrderExtra>();
		for (int i = 0; i < gropJsonObj.size(); i++) {
			System.out.println(gropJsonObj.getJSONObject(i));
			Object id=gropJsonObj.getJSONObject(i).get("id");
			//由于饿了么平台修改了，发过来的红包优惠id是null，这样导致转换失败，所以做个判断并且转换2016-3-16
			if(id instanceof JSONObject &&((JSONObject) id).isNullObject()){
				gropJsonObj.getJSONObject(i).remove("id");
				gropJsonObj.getJSONObject(i).put("id", 0);
			}
			OrderExtra orderExtra = (OrderExtra) JSONObject.toBean(
					gropJsonObj.getJSONObject(i), OrderExtra.class);
			lstExtra.add(orderExtra);

		}
		return lstExtra;
	}

	@Override
	public void orderCreate(String strJson) throws Exception {
		
		this.orderJsonString = strJson;

		convertOrderDetail();

		
		/*
		 * 增加判断是不是已经生成过订单了，防止饿了么多次推送同一张单子 2016-4-18
		 */
		String[] params = new String[3];
		params[0] = "B2C";
		params[1] = Long.toString(orderInfo.getOrder_id());
		params[2]="1006";
		List<F55wsd02> lstF55wsd02 = orderServiceImpl.queryF55wsd02(params);
		if (lstF55wsd02 != null && lstF55wsd02.size() > 0) {
			return;
		}
		//================================
		
		
		F55wsd02 f55wsd02 = new F55wsd02();
		F55wsd02Id f55wsd02id = new F55wsd02Id();
		Holder<Integer> ukid = new Holder<Integer>();
		Holder<String> tableName = new Holder<String>("F55WSD02");
		int ihukid = jdeWebServiceImpl.GetNextUniqueID(ukid, tableName);
		if (ihukid == 0) {
			throw new Exception("获取UKID失败");
		}
		f55wsd02id.setIhukid(new BigDecimal(ihukid));// 双方流水号
		f55wsd02id.setIhe58hedid("B2C");// 交互方向类型 B2C:商城写；JDE:JDE系统写；
		f55wsd02id.setIhedln(new BigDecimal(1000));// 行号，默认1
		f55wsd02.setId(f55wsd02id); // 将来如果1个UKID传多个order_id的时候可以自增此行号，进行订单批量传送
									// .官网写入规则：行号为1，需要乘以1000，再写入;官网取数规则：行号除以1000，再获取；
		// f55wsd02.setIhprukid(ihprukid);// JDE订单唯一编号
		String ihe58eboid = Long.toString(orderInfo.getOrder_id());
		f55wsd02.setIhe58eboid(ihe58eboid);// B2C订单唯一编号order_id 网单号
		f55wsd02.setIhe58huf06("2");// 接单直接就是确定
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String ihe58hboct = sdf2.format(orderInfo.getCreated_at());

		f55wsd02.setIhe58hboct(ihe58hboct);// 订单生成日期 格式为YYYY-MM-DD

		f55wsd02.setIhe58ssot("L1");// 订单种类(58E|OT) JDE提供编码： L1 销售单
		//
		f55wsd02.setIhe58hoca("W");// 下单渠道(58H|OC)W-网络下单；
		// f55wsd02.setIhe58eroid(ihe58eroid);// 记录原始的网单号，退单或者转单时使用

		String ihe58mcno = orderInfo.getPhone_list()[0];
		f55wsd02.setIhe58mcno(ihe58mcno);// 会员编号

		f55wsd02.setIhe58hbmno(new BigDecimal(0));// B2C订单所有人编号
		// f55wsd02.setIhco(ihco);// 下单公司
		//
		// f55wsd02.setIhan8(ihan8);//
		// 网店号1-对于淘宝、京东等第三方平台来的订单，这个字段不需要填写；2-对于官网开店的(包括1919自营店)，需要将开店的商户编号传进来；商户信息会通过接口，同步到官网
		//
		f55wsd02.setIhe58hus25(Integer.toString(orderInfo.getRestaurant_id()));// 商户号
		//
		 f55wsd02.setIhmcu("1006");// 表头经营单位
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

		f55wsd02.setIhe58hmn(orderInfo.getConsignee());// 订单收货人，例如：张三
		f55wsd02.setIhph1(ihe58mcno);// 顾客联系电话
		// f55wsd02.setIhe58mpst(ihe58mpst);// 收货人邮编ship_zip
		// f55wsd02.setIhe58hmail(ihe58hmail);// 收货人邮箱ship_email
		String address=orderInfo.getDelivery_poi_address();// 顾客送餐详情地址，例如：近铁城市广场（普陀区金沙江路1518弄)
		if(address==null||address.trim().equals("")){
			address=orderInfo.getAddress();
		}
		f55wsd02.setIhe58hxxdz(address);
		// JDE E58MADD
		Date d = new Date();
		String ihe58hdrqd = sdf2.format(d);
		f55wsd02.setIhe58hdrqd(ihe58hdrqd);// 要求送货日期，格式为YYYY-MM-DD

		// if (body.getOrder().getDelivery_party() == 2) {
		f55wsd02.setIhe58hshm("R1");// 送货方式（B2C的配送方式）(58H|SM) R1-配送； //
									// R2-自提；R3-百度配送 默认 R1 物流 1 百度 2 自配送
		if (orderInfo.getInvoice() != null && !orderInfo.getInvoice().isEmpty()) {
			f55wsd02.setIhe58hinty("1");// "发票类型(58H|IT)1-普票-正常发票；2-普票-红字发票；3-普票-废票；4-增票；默认1"
		} else {
			f55wsd02.setIhe58hinty("2");// "发票类型(58H|IT)1-普票-正常发票；2-普票-红字发票；3-普票-废票；4-增票；默认1"
		}
		f55wsd02.setIhe58huf07("20");// 开票方法(E1|IM) 10-按明细开； 20-按表头开； 默认20
		f55wsd02.setIhe58hintl(orderInfo.getInvoice());// 发票抬头tax_company
		f55wsd02.setIhe58hos("516");// 订单总状态 516 未处理
		f55wsd02.setIhe58hus14("00001");// 开票内容，同步到F58H0401.E58HUS14 E1|IL
										// 00001-餐费；如果开票方式为20，则此字段必须有值，默认00001

		if (orderInfo.getDescription() != null) {
			String remark = orderInfo.getDescription().trim();
			if (remark.length() > 40) {
				remark = remark.substring(0, 39);
			}
			f55wsd02.setIhe58hus24(remark);// 买家留言 备注
			
			String memo=orderInfo.getDescription().trim();
			if(memo.length()>100){
				memo=memo.substring(0,99);
			}
			f55wsd02.setIhe58hus26(memo);//订单备注
		}
		f55wsd02.setIhev01("N");// 读取标示 默认传N N代表未读，Y表示已读，B2C只读N

		// SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
		String ihe58hsjut = sdf1.format(orderInfo.getCreated_at());
		System.out.println(ihe58hsjut);
		f55wsd02.setIhe58hsjut(ihe58hsjut);// 订单生成时间 格式：hh:mm:ss 订单创建时间
											// order.create_time
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ihe58hsbut = sdf3.format(orderInfo.getCreated_at());
		f55wsd02.setIhe58hsbut(ihe58hsbut);// "B2C更新时间		数据格式：yyyy-MM-dd HH:mm:SS"
		f55wsd02.setIhcomitlvl(new BigDecimal("2"));// 订单配送优先级(01|PT)2 普通送；

		if (orderInfo.getIs_online_paid() == 0) {
			f55wsd02.setIhe58gpayf("1");// 付款标识 未付款为1；已付款为3；
			f55wsd02.setIhe58huf02("1");// "支付方式   对应JDE E58HSSPF1， 货到付款2， 在线支付 "
		} else {
			f55wsd02.setIhe58gpayf("3");// 付款标识 未付款为1；已付款为3；
			f55wsd02.setIhe58huf02("2");// "支付方式   对应JDE E58HSSPF1， 货到付款2， 在线支付 "
		}

		f55wsd02.setIhe58hpaym("01");// "付款方式 对应JDE 付款方式表FE4PT001 JDE处理 01
										// 现金 02 POS刷卡 04 微信支付 07 支付宝

		BigDecimal discountfee = orderInfo.getTotal_price().subtract(
				orderInfo.getOriginal_price());
		f55wsd02.setIhe58oda(discountfee.multiply(new BigDecimal(100)));// 整单折让金额

		f55wsd02.setIhe58hus23("1006");// " 1001 官网    1002 微信 E1/WT	F58H0401.MCU 1003 百度 1010美团 1006饿了么"
		// orderDetail = orderInfo.getDetail();
		// int ihe58jua01 = orderInfo.getDetail().size() * 100;

		f55wsd02.setIhdl01(ihe58hsjut);// 要求送货时间从，格式为HH:mm:ss

		String Longitude = "";
		String Latitude = "";
		JSONObject mapJsonObj = null;
		String deliverygeo = orderInfo.getDelivery_geo();// 订单收货地址经纬度，例如：31.2538,121.4185
		String[] geoarray = deliverygeo.split(",");
		if (deliverygeo != null && geoarray != null && geoarray.length > 0) {

			Latitude = geoarray[0];// 纬度
			Longitude = geoarray[1];// 经度
			mapJsonObj = BaiduMapUtil.calcGeocoding(Latitude, Longitude,
					"gcj02ll");
		}
		f55wsd02.setIhdl02(Longitude);// 经度 接百度
		f55wsd02.setIhdl03(Latitude);// 纬度
		f55wsd02.setIhe58brd2("CN");// 国家,默认CN(中国)
		if (mapJsonObj != null) {
			Object[] mapParams = new Object[2];
			mapParams[0] = "PR";// CT// PR// PT
			mapParams[1] = mapJsonObj.getString("province");
			List<F0005L> lstF0005ls = orderServiceImpl
					.queryLstF0005L(mapParams);
			if (lstF0005ls != null && lstF0005ls.size() > 0) {
				f55wsd02.setIhe58hproc(lstF0005ls.get(0).getId().getDrky());// 省（58|PR），省的编码，必填
			}

			mapParams[0] = "CT";// CT
			mapParams[1] = mapJsonObj.getString("city");
			lstF0005ls = orderServiceImpl.queryLstF0005L(mapParams);
			if (lstF0005ls != null && lstF0005ls.size() > 0) {
				f55wsd02.setIhe58hcity(lstF0005ls.get(0).getId().getDrky());// 市

			}

			mapParams[0] = "PT";
			mapParams[1] = mapJsonObj.getString("district");
			lstF0005ls = orderServiceImpl.queryLstF0005L(mapParams);
			if (lstF0005ls != null && lstF0005ls.size() > 0) {
				f55wsd02.setIhe58hpref(lstF0005ls.get(0).getId().getDrky());// 区
			}
		} else {
			f55wsd02.setIhe58hproc("2");// 省（58|PR），省的编码，必填 商户所在省名称 province
			f55wsd02.setIhe58hcity("52");// 市
			f55wsd02.setIhe58hpref("500");// 区（县）
			f55wsd02.setIhe58hbzne(null);// 区域编码
		}
		// f55wsd02.setIhe58jua01(new BigDecimal(ihe58jua01));// 订单明细行的行数
		// 传入时，需要将计算出的行数*100后，写入该字段

		String sendtime = "";// 要求送货时间
		if (orderInfo.getDeliver_time() == null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(orderInfo.getCreated_at());
			cal.add(Calendar.HOUR_OF_DAY, 1);
			sendtime = sdf1.format(cal.getTime());
		} else {
			sendtime = sdf1.format(orderInfo.getDeliver_time());// *************

			Calendar cal = Calendar.getInstance();
			cal.setTime(orderInfo.getDeliver_time());
			cal.add(Calendar.HOUR_OF_DAY, -1);
			String sendstarttime = sdf1.format(cal.getTime());

			f55wsd02.setIhdl01(sendstarttime);// 要求送货时间从，格式为HH:mm:ss
		}
		f55wsd02.setIhtxt2(sendtime);// 要求送货时间到，格式为HH:mm:ss

		List<F55wsd03> lstF55wsd03 = genF55wsd03(f55wsd02);

		List<Fe14710a> lstFe14710a = new ArrayList<Fe14710a>();
		double discount = orderInfo.getTotal_price()
				.subtract(orderInfo.getOriginal_price()).doubleValue();

		Fe14710a fe14710a = new Fe14710a();
		Fe14710aId fe14710aid = new Fe14710aId();
		fe14710aid.setLsukid(f55wsd02.getId().getIhukid());
		// ihe58huf02 支付类型，1 下线 2 在线
		// 付款方式UDC：E1/PT 01 现金 ; 10 饿了么
		if (orderInfo.getIs_online_paid() == 0) {
			fe14710aid.setLse58pt("01");
		} else {
			fe14710aid.setLse58pt("10");
		}
		fe14710a.setId(fe14710aid);
		fe14710a.setLsflg("N");

		// 应收金额
		fe14710a.setLsaap(orderInfo.getTotal_price().multiply(
				new BigDecimal(100)));
		// 实收金额
		 fe14710a.setLsag(fe14710a.getLsaap());
		lstFe14710a.add(fe14710a);
		// 应收金额
		double sumReduce = 0;
		// 红包或者餐厅活动优惠放到饿了么挂账
		if (orderDetail.getExtra() != null && orderDetail.getExtra().size() > 0) {

			for (OrderExtra extra : orderDetail.getExtra()) {
				// 13红包;12餐厅活动
				if (extra.getCategory_id() == 13
						|| extra.getCategory_id() == 12) {
					sumReduce = sumReduce
							+ extra.getPrice().multiply(extra.getQuantity())
									.doubleValue();
				}

			}
			sumReduce = sumReduce * -1;
			if (sumReduce > 0) {
				Fe14710a fe14710aDiscount = new Fe14710a();
				Fe14710aId fe14710aDiscountid = new Fe14710aId();
				fe14710aDiscountid.setLsukid(f55wsd02.getId().getIhukid());
				// ihe58huf02 支付类型，1 下线 2 在线
				// 付款方式UDC：E1/PT 01 现金 ; 10 饿了么；25饿了么挂账

				fe14710aDiscountid.setLse58pt("25");

				fe14710aDiscount.setId(fe14710aDiscountid);
				fe14710aDiscount.setLsflg("N");

				// 应收金额

				fe14710aDiscount.setLsaap(new BigDecimal(sumReduce * 100));
				// 实收金额
				 fe14710aDiscount.setLsag(fe14710aDiscount.getLsaap());
				lstFe14710a.add(fe14710aDiscount);
			}

		}
		f55wsd02.setIhe58tsua(orderInfo.getTotal_price()
				.add(new BigDecimal(sumReduce)).multiply(new BigDecimal(100)));// 应收总金额

		orderServiceImpl.saveOrder(f55wsd02, lstF55wsd03, lstFe14710a);

		orderServiceImpl.callWebservice(f55wsd02, lstF55wsd03);

	}

	public List<F55wsd03> genF55wsd03(F55wsd02 f55wsd02) throws Exception {
		int i = 0;
		List<F55wsd03> lstF55wsd03 = new ArrayList<F55wsd03>();
		for (OrderGroup g : orderDetail.getGroup()) {
			for (OrderFood f : g.getFoods()) {
				Object[] params1 = new Object[2];
				params1[0] = "03";
				// params1[1] = orderInfo.getRestaurant_id();
				params1[1] = f.getName();
				List<Fe14101a> lstFe14101a = orderServiceImpl
						.queryFe14101a(params1);
				if (lstFe14101a == null || lstFe14101a.size() == 0) {
					throw new Exception("饿了么:创建订单失败，根据商品名称:" + f.getName()
							+ ";商户ID:" + orderInfo.getRestaurant_id()
							+ ";找不到系统中对应的商品数据(Fe14101a)");
				}
				// 单品原价-（单品汇总价值-组合菜品总价）*（单品原价/组合菜品总价）单品汇总价值=单品单价*份数 组合菜品总价
				// =汇总菜品单价*数量

				// 单品汇总价值
				double sumTotal = CommonHelper.calcSumTotal(lstFe14101a);
				double reduceTotal = 0;
				// 组合菜品总价
				double combineTotal = f.getPrice().doubleValue() * 100;
				for (int j = 0; j < lstFe14101a.size(); j++) {
					i++;
					// 单品原价
					double singlePrice = lstFe14101a.get(j).getPtuprc()
							.intValue() / 100;
					double price = 0;
					if (j == (lstFe14101a.size() - 1)) {
						price = (combineTotal - reduceTotal)
								/ lstFe14101a.get(j).getPtqnty().intValue();
					} else {
						price = singlePrice - (sumTotal - combineTotal)
								* singlePrice / combineTotal;
					}

					reduceTotal = reduceTotal + price
							* lstFe14101a.get(j).getPtqnty().intValue();

					F55wsd03 f55wsd03 = genFood(f55wsd02, i, f,
							lstFe14101a.get(j), price);
					lstF55wsd03.add(f55wsd03);
				}

				/******************* 处理food中的浇头 **************************************/
				for (OrderGarnish garnish : f.getGarnish()) {
					params1[0] = "03";
					// params1[1] = orderInfo.getRestaurant_id();
					params1[1] = garnish.getName();

					lstFe14101a = orderServiceImpl.queryFe14101a(params1);
					if (lstFe14101a == null || lstFe14101a.size() == 0) {
						throw new Exception("饿了么:创建订单失败，根据商品名称:"
								+ garnish.getName() + ";商户ID:"
								+ orderInfo.getRestaurant_id()
								+ ";找不到系统中对应的商品数据(Fe14101a)");
					}

					// 汇总单品价格
					double sumTotalGarnish = CommonHelper
							.calcSumTotal(lstFe14101a);
					double reduceTotalGarnish = 0;
					double combineTotalGarnish = garnish.getPrice()
							.doubleValue() * 100;

					for (int k = 0; k < lstFe14101a.size(); k++) {
						i++;

						double singlePriceGarnish = lstFe14101a.get(k)
								.getPtuprc().intValue() / 100;
						double priceGarnish = 0;
						if (k == (lstFe14101a.size() - 1)) {
							priceGarnish = (combineTotalGarnish - reduceTotalGarnish)
									/ lstFe14101a.get(k).getPtqnty().intValue();
						} else {
							priceGarnish = singlePriceGarnish
									- (sumTotalGarnish - combineTotalGarnish)
									* singlePriceGarnish / combineTotalGarnish;
						}

						reduceTotalGarnish = reduceTotalGarnish + priceGarnish
								* lstFe14101a.get(k).getPtqnty().intValue();

						F55wsd03 f55wsd03Garnish = genGarnish(f55wsd02, i,
								lstFe14101a.get(k), garnish, priceGarnish);
						lstF55wsd03.add(f55wsd03Garnish);
					}
				}

			}

		}

		/***************** 对extra处理 ************************/
		for (OrderExtra extra : orderDetail.getExtra()) {
			// 13红包;12餐厅活动;
			if (extra.getCategory_id() == 13 || extra.getCategory_id() == 12) {
				continue;

			}
			Object[] params1 = new Object[2];
			params1[0] = "03";
			// params1[1] = orderInfo.getRestaurant_id();
			params1[1] = extra.getName();

			List<Fe14101a> lstFe14101a = orderServiceImpl
					.queryFe14101a(params1);
			if (lstFe14101a == null || lstFe14101a.size() == 0) {
				throw new Exception("饿了么:创建订单失败，根据商品名称:" + extra.getName()
						+ ";商户ID:" + orderInfo.getRestaurant_id()
						+ ";找不到系统中对应的商品数据(Fe14101a)");
			}

			// 汇总单品价格
			double sumTotalExtra = CommonHelper.calcSumTotal(lstFe14101a);
			double reduceTotalExtra = 0;
			double combineTotalExtra = extra.getPrice().doubleValue() * 100;

			for (int m = 0; m < lstFe14101a.size(); m++) {
				i++;

				double singlePriceGarnish = lstFe14101a.get(m).getPtuprc()
						.intValue() / 100;
				double priceExtra = 0;
				if (m == (lstFe14101a.size() - 1)) {
					priceExtra = (combineTotalExtra - reduceTotalExtra)
							/ lstFe14101a.get(m).getPtqnty().intValue();
				} else {
					priceExtra = singlePriceGarnish
							- (sumTotalExtra - combineTotalExtra)
							* singlePriceGarnish / combineTotalExtra;
				}

				reduceTotalExtra = reduceTotalExtra + priceExtra
						* lstFe14101a.get(m).getPtqnty().intValue();

				F55wsd03 f55wsd03 = genExtra(f55wsd02, i, extra,
						lstFe14101a.get(m), priceExtra);
				lstF55wsd03.add(f55wsd03);
			}

		}
		return lstF55wsd03;
	}

	public F55wsd03 genExtra(F55wsd02 f55wsd02, int i, OrderExtra extra,
			Fe14101a fe14101a, double price) {
		F55wsd03 f55wsd03 = new F55wsd03();
		F55wsd03Id f55wsd03id = new F55wsd03Id();

		f55wsd03id.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
															// 自然数流水如：1,2，3。。。

		f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

		f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03id.setIdlnic(new BigDecimal(i * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		f55wsd03.setId(f55wsd03id);
		// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

		f55wsd03.setIde58eboid(Long.toString(orderInfo.getOrder_id()));// 网单编号Order_id
																		// 网单号
		f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

		f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

		f55wsd03.setIde58hoca("W");// "下单渠道(58H|OC)				W-网络下单；"

		// f55wsd03.setIdco(idco);//下单公司

		String idlitm = fe14101a.getPtlitm();
		f55wsd03.setIdlitm(idlitm);// B2C商品的唯一标示ID，bn JDE商品编号

		// String ide58hbitm = Integer.toString(extra.getId());
		// ide58hbitm = "121";
		// if (ide58hbitm == null || ide58hbitm.equals("")) {
		// throw new Exception("饿了么创建订单失败，没有商品ID，商品名称:" + extra.getName());
		// }

		// f55wsd03.setIde58hbitm(new BigDecimal(ide58hbitm));// B2C商品唯一代码
		// 网站商品编号
		long ptQnty=fe14101a.getPtqnty().intValue();
		f55wsd03.setIdtxtlfu3(ptQnty);//插入转换系数
		
		int iduorg = fe14101a.getPtqnty().intValue()
				* extra.getQuantity().intValue();
		f55wsd03.setIduorg(new BigDecimal(iduorg * 1000));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		// int price = extra.getPrice().intValue() * 100;
		f55wsd03.setIde58pael(new BigDecimal(price));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"
		// int productFee = extra.getPrice().intValue()*
		// extra.getQuantity().intValue() * 100;
		double productFee = price * iduorg;
		f55wsd03.setIde58aexp(new BigDecimal(productFee));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

		f55wsd03.setIde58hos("516");// "商品行状态			516"

		f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

		f55wsd03.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

		f55wsd03.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

		f55wsd03.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
		// hh:mm:ss

		f55wsd03.setIde58hus21(extra.getName());// 商品打印名称

		f55wsd03.setIdan03(new BigDecimal(price));// 会员价
		f55wsd03.setIdan04(new BigDecimal(productFee));// 会员金额
		return f55wsd03;
	}

	public F55wsd03 genGarnish(F55wsd02 f55wsd02, int i, Fe14101a fe14101a,
			OrderGarnish garnish, double priceGarnish) {
		F55wsd03 f55wsd03Garnish = new F55wsd03();
		F55wsd03Id f55wsd03idGarnish = new F55wsd03Id();

		f55wsd03idGarnish.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
		// 自然数流水如：1,2，3。。。

		f55wsd03idGarnish.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

		f55wsd03idGarnish.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03idGarnish.setIdlnic(new BigDecimal(i * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		f55wsd03Garnish.setId(f55wsd03idGarnish);
		// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

		f55wsd03Garnish.setIde58eboid(Long.toString(orderInfo.getOrder_id()));
		;// 网单编号Order_id 网单号
		f55wsd03Garnish.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

		f55wsd03Garnish.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

		f55wsd03Garnish.setIde58hoca("W");// "下单渠道(58H|OC)				W-网络下单；"

		// f55wsd03.setIdco(idco);//下单公司

		// String idlitmGarnish = Integer.toString(garnish
		// .getTp_food_id());
		// idlitmGarnish = "MX";

		String idlitmGarnish = fe14101a.getPtlitm();

		f55wsd03Garnish.setIdlitm(idlitmGarnish);// B2C商品的唯一标示ID，bn
													// JDE商品编号

		// String ide58hbitmGarnish = Integer.toString(garnish
		// .getTp_food_id());
		// ide58hbitmGarnish = "121";
		// if (ide58hbitmGarnish == null
		// || ide58hbitmGarnish.equals("")) {
		// throw new Exception("创建订单失败，没有商品ID，商品名称:"
		// + garnish.getName());
		// }

		// f55wsd03Garnish.setIde58hbitm(new
		// BigDecimal(ide58hbitm));// B2C商品唯一代码
		// 网站商品编号

		int iduorgGarnish = fe14101a.getPtqnty().intValue()
				* garnish.getQuantity().intValue();
		f55wsd03Garnish.setIduorg(new BigDecimal(iduorgGarnish * 1000));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		// int priceGarnish = garnish.getPrice().intValue() * 100;
		f55wsd03Garnish.setIde58pael(new BigDecimal(priceGarnish));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"
		// int productFeeGarnish = garnish.getQuantity().intValue()*
		// garnish.getPrice().intValue() * 100;
		double productFeeGarnish = iduorgGarnish * priceGarnish;
		f55wsd03Garnish.setIde58aexp(new BigDecimal(productFeeGarnish));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

		f55wsd03Garnish.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

		f55wsd03Garnish.setIde58hos("516");// "商品行状态			516"

		f55wsd03Garnish.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

		f55wsd03Garnish.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

		f55wsd03Garnish.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

		f55wsd03Garnish.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
		// hh:mm:ss

		f55wsd03Garnish.setIde58hus21(garnish.getName());// 商品打印名称

		f55wsd03Garnish.setIdan03(new BigDecimal(priceGarnish));// 会员价
		f55wsd03Garnish.setIdan04(new BigDecimal(productFeeGarnish));// 会员金额
		return f55wsd03Garnish;
	}

	public F55wsd03 genFood(F55wsd02 f55wsd02, int i, OrderFood f,
			Fe14101a fe14101a, double price) {
		String idlitm = fe14101a.getPtlitm();

		F55wsd03 f55wsd03 = new F55wsd03();
		F55wsd03Id f55wsd03id = new F55wsd03Id();

		f55wsd03id.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
															// 自然数流水如：1,2，3。。。

		f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

		f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03id.setIdlnic(new BigDecimal(i * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		f55wsd03.setId(f55wsd03id);
		// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

		f55wsd03.setIde58eboid(Long.toString(orderInfo.getOrder_id()));// 网单编号Order_id
																		// 网单号
		f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

		f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

		f55wsd03.setIde58hoca("W");// "下单渠道(58H|OC)				W-网络下单；"

		// f55wsd03.setIdco(idco);//下单公司

		// String idlitm = Integer.toString(f.getTp_food_id());

		// idlitm = "MX";
		f55wsd03.setIdlitm(idlitm);// B2C商品的唯一标示ID，bn JDE商品编号

		// String ide58hbitm = Integer.toString(f.getTp_food_id());
		// ide58hbitm = "121";
		// if (ide58hbitm == null || ide58hbitm.equals("")) {
		// throw new Exception("创建订单失败，没有商品ID，商品名称:" + f.getName());
		// }

		// f55wsd03.setIde58hbitm(new BigDecimal(ide58hbitm));//
		// B2C商品唯一代码
		// 网站商品编号
		long ptQnty=fe14101a.getPtqnty().intValue();
		f55wsd03.setIdtxtlfu3(ptQnty);//插入转换系数
		
		double iduorg = fe14101a.getPtqnty().intValue()
				* f.getQuantity().intValue();
		f55wsd03.setIduorg(new BigDecimal(iduorg * 1000));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		// int price = f.getPrice().intValue() * 100;
		f55wsd03.setIde58pael(new BigDecimal(price));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"
		// int productFee = f.getQuantity().intValue() *
		// f.getPrice().intValue()* 100;
		double productFee = iduorg * price;
		f55wsd03.setIde58aexp(new BigDecimal(productFee));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

		f55wsd03.setIde58hos("516");// "商品行状态			516"

		f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

		f55wsd03.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

		f55wsd03.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

		f55wsd03.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
															// hh:mm:ss

		f55wsd03.setIde58hus21(f.getName());// 商品打印名称

		f55wsd03.setIdan03(new BigDecimal(price));// 会员价
		f55wsd03.setIdan04(new BigDecimal(productFee));// 会员金额
		return f55wsd03;
	}

	@Override
	public String doConfirmOrder(String url, String consumer_key,
			String consumerSecret) {
		Map<String, String> params = new HashMap<String, String>();
		long ltimestamp = CalculateSignHelp.calcTimestamp();
		params.put("timestamp", Long.toString(ltimestamp));
		params.put("consumer_key", consumer_key);
		params.put("status", "2");
		String strError = "";
		String sign = "";
		try {
			sign = ElemeHelper.genSig(url, params, consumerSecret);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		if (sign == null || sign.isEmpty()) {
			strError = "计算饿了么sig出错";
			return strError;
		}

		String requrl = url + "?consumer_key=" + params.get("consumer_key")
				+ "&sig=" + sign + "&timestamp=" + params.get("timestamp");
		String code = "";
		String message = "";
		try {
			logger.info("调用饿了么‘确认订单API’,url:" + requrl);
			params.clear();
			// 2 STATUS_CODE_PROCESSED_AND_VALID（订单已处理）
			params.put("status", "2");
			JSONObject jsonObj = HttpRequestUtil.httpPUT(requrl, params);
			code = jsonObj.getString("code");
			message = jsonObj.getString("message");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			if (e.getMessage() != null) {
				strError = e.getMessage();
			}

		} finally {
			if (!code.equals("200")) {
				strError = "调用饿了么确认订单接口失败，url=" + requrl + ";code=" + code
						+ ";message=" + message + "错误信息:" + strError;
			}
		}

		return strError;
	}

}
