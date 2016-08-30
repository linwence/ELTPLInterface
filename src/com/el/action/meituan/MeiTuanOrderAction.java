package com.el.action.meituan;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Holder;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.el.connect.DBContextHolder;
import com.el.entity.F0005L;
import com.el.entity.F55wsd02;
import com.el.entity.F55wsd02Id;
import com.el.entity.F55wsd03;
import com.el.entity.F55wsd03Id;
import com.el.entity.Fe14101a;
import com.el.entity.Fe14710a;
import com.el.entity.Fe14710aId;
import com.el.entity.meituan.OrderDetail;
import com.el.entity.meituan.OrderExtras;
import com.el.service.IJDEWebService;
import com.el.service.IOrderService;
import com.el.util.BaiduMapUtil;
import com.el.util.CommonHelper;
import com.el.util.HttpRequestUtil;
import com.el.util.MeiTuanTimeUtil;
import com.el.util.MeituanUtils;
import com.el.util.PropertiesUtil;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
public class MeiTuanOrderAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(MeiTuanOrderAction.class);
	private String app_id;// APPID
	private long timestamp;// 时间戳
	private String sig;// 签名
	private IOrderService orderServiceImpl;
	private int code = 0;
	private String wm_order_id_view = "";
	private String order_id = "";
	private double total = 0;
	private String recipient_name;
	private String shipping_fee;

	private String recipient_phone;
	private String recipient_address;
	private String wm_poi_phone;
	private String wm_poi_address;
	private String wm_poi_name;
	private String app_poi_code;

	private String original_price;
	private String caution;
	private String shipper_phone;
	private String status;
	private String city_id;
	private String has_invoiced;
	private String invoice_title;
	private String ctime;
	private String utime;
	private String delivery_time;
	private String is_third_shipping;
	private String pay_type;
	private String latitude;
	private String longitude;
	private String strdDetail;
	private String strExtras;
	private String msg = "内部错误";
	private List<OrderDetail> lstOrderDtl;
	private List<OrderExtras> lstOrderExtras;

	public String getStrExtras() {
		return strExtras;
	}

	public void setStrExtras(String strExtras) {
		this.strExtras = strExtras;
	}

	public String getOrder_id() {
		return order_id;
	}

	public String getShipping_fee() {
		return shipping_fee;
	}

	public void setShipping_fee(String shipping_fee) {
		this.shipping_fee = shipping_fee;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getWm_order_id_view() {
		return wm_order_id_view;
	}

	public void setWm_order_id_view(String wm_order_id_view) {
		this.wm_order_id_view = wm_order_id_view;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getRecipient_name() {
		return recipient_name;
	}

	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}

	public String getRecipient_phone() {
		return recipient_phone;
	}

	public void setRecipient_phone(String recipient_phone) {
		this.recipient_phone = recipient_phone;
	}

	public String getRecipient_address() {
		return recipient_address;
	}

	public void setRecipient_address(String recipient_address) {
		this.recipient_address = recipient_address;
	}

	public String getWm_poi_phone() {
		return wm_poi_phone;
	}

	public void setWm_poi_phone(String wm_poi_phone) {
		this.wm_poi_phone = wm_poi_phone;
	}

	public String getWm_poi_address() {
		return wm_poi_address;
	}

	public void setWm_poi_address(String wm_poi_address) {
		this.wm_poi_address = wm_poi_address;
	}

	public String getWm_poi_name() {
		return wm_poi_name;
	}

	public void setWm_poi_name(String wm_poi_name) {
		this.wm_poi_name = wm_poi_name;
	}

	public String getApp_poi_code() {
		return app_poi_code;
	}

	public void setApp_poi_code(String app_poi_code) {
		this.app_poi_code = app_poi_code;
	}

	public String getOriginal_price() {
		return original_price;
	}

	public void setOriginal_price(String original_price) {
		this.original_price = original_price;
	}

	public String getCaution() {
		return caution;
	}

	public void setCaution(String caution) {
		this.caution = caution;
	}

	public String getShipper_phone() {
		return shipper_phone;
	}

	public void setShipper_phone(String shipper_phone) {
		this.shipper_phone = shipper_phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCity_id() {
		return city_id;
	}

	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}

	public String getHas_invoiced() {
		return has_invoiced;
	}

	public void setHas_invoiced(String has_invoiced) {
		this.has_invoiced = has_invoiced;
	}

	public String getInvoice_title() {
		return invoice_title;
	}

	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getUtime() {
		return utime;
	}

	public void setUtime(String utime) {
		this.utime = utime;
	}

	public String getDelivery_time() {
		return delivery_time;
	}

	public void setDelivery_time(String delivery_time) {
		this.delivery_time = delivery_time;
	}

	public String getIs_third_shipping() {
		return is_third_shipping;
	}

	public void setIs_third_shipping(String is_third_shipping) {
		this.is_third_shipping = is_third_shipping;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStrdDetail() {
		return strdDetail;
	}

	public void setStrdDetail(String strdDetail) {
		this.strdDetail = strdDetail;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<OrderExtras> getLstOrderExtras() {
		return lstOrderExtras;
	}

	public void setLstOrderExtras(List<OrderExtras> lstOrderExtras) {
		this.lstOrderExtras = lstOrderExtras;
	}

	public List<OrderDetail> getLstOrderDtl() {
		return lstOrderDtl;
	}

	public void setLstOrderDtl(List<OrderDetail> lstOrderDtl) {
		this.lstOrderDtl = lstOrderDtl;
	}

	public IOrderService getOrderServiceImpl() {
		return orderServiceImpl;
	}

	@Autowired
	public void setOrderServiceImpl(IOrderService orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}

	private IJDEWebService jdeWebServiceImpl;

	public IJDEWebService getJdeWebServiceImpl() {
		return jdeWebServiceImpl;
	}

	@Autowired
	public void setJdeWebServiceImpl(IJDEWebService jdeWebServiceImpl) {
		this.jdeWebServiceImpl = jdeWebServiceImpl;
	}

	/**
	 * 返回json
	 */
	private SortedMap<String, Object> data;

	public SortedMap<String, Object> getData() {
		return data;
	}

	public void setData(SortedMap<String, Object> data) {
		this.data = data;
	}

	public String getApp_id() {
		return app_id;
	}

	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getSig() {
		return sig;
	}

	public void setSig(String sig) {
		this.sig = sig;
	}

	public String orderCreate() {
		//先切换一下数据库连接
		DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);
				
		System.out.println("美团外卖:订单推送.................");
		logger.info("美团外卖:订单推送.................");
		data = new TreeMap<String, Object>();
		data.put("data", "ok");
		try {
			lstOrderDtl = new ArrayList<OrderDetail>();
			// 获取参数的值
			setRequestParams();
			if (order_id == null || order_id.isEmpty()) {
				return SUCCESS;
			}
			String printReqparams = "order_id=" + order_id
					+ "&wm_order_id_view=" + wm_order_id_view
					+ "&app_poi_code=" + app_poi_code + "&wm_poi_name="
					+ wm_poi_name + "&wm_poi_address=" + wm_poi_address
					+ "&wm_poi_phone=" + wm_poi_phone + "&recipient_address="
					+ recipient_address + "&recipient_phone=" + recipient_phone
					+ "&recipient_name=" + recipient_name + "&shipping_fee="
					+ shipping_fee + "&total=" + total + "&original_price="
					+ original_price + "&caution=" + caution
					+ "&shipper_phone=" + shipper_phone + "&status=" + status
					+ "&city_id=" + city_id + "&has_invoiced=" + has_invoiced
					+ "&invoice_title=" + invoice_title + "&ctime=" + ctime
					+ "&utime=" + utime + "&delivery_time=" + delivery_time
					+ "&is_third_shipping=" + is_third_shipping + "&pay_type="
					+ pay_type + "&latitude=" + latitude + "&longitude="
					+ longitude + "&detail=" + strdDetail + "&extras="
					+ strExtras;
			System.out.println("美团:订单推送详情=" + printReqparams);
			logger.info("美团:订单推送详情=" + printReqparams);
			if (null == strdDetail || strdDetail.isEmpty()) {
				System.out.println("美团:美团接口平台异常,发送过来的detail参数是Null");
				logger.error("美团:美团接口平台异常,发送过来的detail参数是Null");
				return SUCCESS;
			}
			strdDetail = URLDecoder.decode(strdDetail, "UTF-8");
			JSONArray jsonArray = JSONArray.fromObject(strdDetail);
			for (int i = 0; i < jsonArray.size(); i++) {
				// JSONArray.toList(jsonArray, OrderDetail.class);
				OrderDetail orderDtl = (OrderDetail) JSONObject.toBean(
						jsonArray.getJSONObject(i), OrderDetail.class);
				lstOrderDtl.add(orderDtl);
			}

			if (lstOrderDtl == null || lstOrderDtl.size() == 0) {
				throw new Exception("无法将detail参数转换成OrderDtl,detail参数的值为:"
						+ strdDetail);
			}

			strExtras = URLDecoder.decode(strExtras, "UTF-8");
			JSONArray extrasJsonArray = JSONArray.fromObject(strExtras);

			List<OrderExtras> fromJson2 = JSONArray.toList(extrasJsonArray,
					OrderExtras.class);

			lstOrderExtras = fromJson2;

			/*
			 * String[] params = new String[2]; params[0] = "B2C"; params[1] =
			 * body.getOrder().getOrder_id(); List<F55wsd02> lstF55wsd02 =
			 * orderServiceImpl.queryF55wsd02(params); if (lstF55wsd02 != null
			 * && lstF55wsd02.size() > 0) { throw new Exception("重复发送数据"); }
			 */

			F55wsd02 f55wsd02 = new F55wsd02();
			F55wsd02Id f55wsd02id = new F55wsd02Id();
			Holder<Integer> ukid = new Holder<Integer>();
			Holder<String> tableName = new Holder<String>("F55WSD02");
			int ihukid = jdeWebServiceImpl.GetNextUniqueID(ukid, tableName);
			// POST请求：
			// {"data":"ok"} 或者 {"data":"ng"}
			// error情况下返回{"code":600, "msg":"内部错误"}，error情况下返回{"code":600,
			// "msg":"内部错误"} 后增加文字：更多错误码请参考12.4
			if (ihukid == 0) {
				code = 600;
				throw new Exception("获取UKID失败");
			}
			f55wsd02id.setIhukid(new BigDecimal(ihukid));// 双方流水号
			f55wsd02id.setIhe58hedid("B2C");// 交互方向类型 B2C:商城写；JDE:JDE系统写；
			f55wsd02id.setIhedln(new BigDecimal(1000));// 行号，默认1
			f55wsd02.setId(f55wsd02id); // 将来如果1个UKID传多个order_id的时候可以自增此行号，进行订单批量传送
										// .官网写入规则：行号为1，需要乘以1000，再写入;官网取数规则：行号除以1000，再获取；
			// f55wsd02.setIhprukid(ihprukid);// JDE订单唯一编号
			String ihe58eboid = wm_order_id_view;
			f55wsd02.setIhe58eboid(ihe58eboid);// B2C订单唯一编号order_id 网单号
			f55wsd02.setIhe58hbmno(new BigDecimal(order_id));// 美团的订单号，用来确定、取消

			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");

			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			String ihe58hboct = "";
			if (ctime == null || ctime.isEmpty()) {
				ihe58hboct = sdf2.format(new Date().getTime());
			} else {
				try {
					long lctime = Long.parseLong(ctime);
					ihe58hboct = sdf2.format(new Date(lctime * 1000L));
				} catch (Exception e) {
					ihe58hboct = sdf2.format(new Date().getTime());
				}
			}

			f55wsd02.setIhe58hboct(ihe58hboct);// 订单生成日期 格式为YYYY-MM-DD

			f55wsd02.setIhe58ssot("L1");// 订单种类(58E|OT) JDE提供编码： L1 销售单
			//
			f55wsd02.setIhe58hoca("W");// 下单渠道(58H|OC)W-网络下单；
			// f55wsd02.setIhe58eroid(ihe58eroid);// 记录原始的网单号，退单或者转单时使用

			String ihe58mcno = recipient_phone;
			f55wsd02.setIhe58mcno(ihe58mcno);// 会员编号

			// f55wsd02.setIhco(ihco);// 下单公司
			//
			// f55wsd02.setIhan8(ihan8);//
			// 网店号1-对于淘宝、京东等第三方平台来的订单，这个字段不需要填写；2-对于官网开店的(包括1919自营店)，需要将开店的商户编号传进来；商户信息会通过接口，同步到官网
			//
			// f55wsd02.setIhan81(new BigDecimal(body.getShop().getId()));// 商户号
			//
			 f55wsd02.setIhmcu("1010");// 表头经营单位
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

			f55wsd02.setIhe58hmn(recipient_name);// 收货人姓名ship_name
			f55wsd02.setIhph1(recipient_phone);// 收货人电话ship_mobile移动电话
			// f55wsd02.setIhe58mpst("100001");// 收货人邮编ship_zip
			// f55wsd02.setIhe58hmail(ihe58hmail);// 收货人邮箱ship_email
			f55wsd02.setIhe58hxxdz(recipient_address);// 收货人地址ship_addr详细地址
														// JDE E58MADD
			Date d = new Date();
			String ihe58hdrqd = sdf2.format(d);
			f55wsd02.setIhe58hdrqd(ihe58hdrqd);// 要求送货日期，格式为YYYY-MM-DD
			// 是否为美团商家、APP方配送（0：否；1：是）
			if (is_third_shipping.equals("0")) {
				f55wsd02.setIhe58hshm("R1");// 送货方式（B2C的配送方式）(58H|SM) R1-配送； //
											// R2-自提；R3-百度配送 默认 R1 物流 1 百度 2 自配送
			} else {
				f55wsd02.setIhe58hshm("R3");//
			}

			if (has_invoiced.equals("1")) {
				f55wsd02.setIhe58hinty("1");// "发票类型(58H|IT)1-普票-正常发票；2-普票-红字发票；3-普票-废票；4-增票；默认1"
			} else {
				f55wsd02.setIhe58hinty("2");// "发票类型(58H|IT)1-普票-正常发票；2-普票-红字发票；3-普票-废票；4-增票；默认1"
			}
			f55wsd02.setIhe58huf07("20");// 开票方法(E1|IM) 10-按明细开； 20-按表头开； 默认20
			f55wsd02.setIhe58hintl(invoice_title);// 发票抬头tax_company
			f55wsd02.setIhe58hos("516");// 订单总状态 516 未处理
			f55wsd02.setIhe58hus14("00001");// 开票内容，同步到F58H0401.E58HUS14 E1|IL
											// 00001-餐费；如果开票方式为20，则此字段必须有值，默认00001

			if (caution != null) {
				String remark = caution.trim();
				if (remark.length() > 40) {
					remark = remark.substring(0, 39);
				}
				f55wsd02.setIhe58hus24(remark);// 买家留言 备注
				
				String memo=caution.trim();
				if(memo.length()>100){
					memo=memo.substring(0,99);
				}
				f55wsd02.setIhe58hus26(memo);//订单备注
			}
			// f55wsd02.setIhe58hshs(ihe58hshs);
			f55wsd02.setIhev01("N");// 读取标示 默认传N N代表未读，Y表示已读，B2C只读N

			// SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
			String ihe58hsjut = "";

			if (ctime == null || ctime.isEmpty()) {
				ihe58hsjut = sdf1.format(new Date().getTime());
			} else {
				try {
					long lctime = Long.parseLong(ctime);
					ihe58hsjut = sdf1.format(new Date(lctime * 1000L));
				} catch (Exception e) {
					ihe58hsjut = sdf1.format(new Date().getTime());
					logger.error("转换订单创建时间失败，参数是:" + ctime, e);
				}
			}
			f55wsd02.setIhe58hsjut(ihe58hsjut);// 订单生成时间 格式：hh:mm:ss 订单创建时间
												// order.create_time
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String ihe58hsbut = "";
			if (ctime == null || ctime.isEmpty()) {
				ihe58hsbut = sdf3.format(new Date().getTime());
			} else {
				try {
					long lctime = Long.parseLong(ctime);
					ihe58hsbut = sdf3.format(new Date(lctime * 1000L));
				} catch (Exception e) {
					ihe58hsbut = sdf3.format(new Date().getTime());
					logger.error("美团:转换B2C更新时间失败，参数是:" + ctime, e);
				}
			}
			f55wsd02.setIhe58hsbut(ihe58hsbut);// "B2C更新时间		数据格式：yyyy-MM-dd HH:mm:SS"
			f55wsd02.setIhcomitlvl(new BigDecimal("2"));// 订单配送优先级(01|PT)2 普通送；
			String ihe58huf02 = pay_type;// 支付类型（1：货到付款；2：在线支付）
			if (ihe58huf02.equals("1")) {
				f55wsd02.setIhe58gpayf("1");// 付款标识 未付款为1；已付款为3；
			} else {
				f55wsd02.setIhe58gpayf("3");// 付款标识 未付款为1；已付款为3；
			}

			f55wsd02.setIhe58huf02(ihe58huf02);// "支付方式   对应JDE E58HSSPF1， 货到付款2， 在线支付 "
			f55wsd02.setIhe58hpaym("01");// "付款方式 对应JDE 付款方式表FE4PT001 JDE处理 01
											// 现金 02 POS刷卡 04 微信支付 07 支付宝

			f55wsd02.setIhe58hus23("1010");// " 1001 官网    1002 微信 E1/WT	F58H0401.MCU 1003 百度 1010美团 1006饿了么"
			int ihe58jua01 = lstOrderDtl.size() * 100;

			f55wsd02.setIhdl01(ihe58hsjut);// 要求送货时间从，格式为HH:mm:ss

			f55wsd02.setIhdl02(longitude);// 经度
			f55wsd02.setIhdl03(latitude);// 纬度

			JSONObject mapJsonObj = null;
			if (longitude != null && !longitude.isEmpty()) {
				mapJsonObj = BaiduMapUtil.calcGeocoding(latitude, longitude,
						"gcj02ll");
			}

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
			f55wsd02.setIhe58jua01(new BigDecimal(ihe58jua01));// 订单明细行的行数
																// 传入时，需要将计算出的行数*100后，写入该字段

			String sendtime = "";// 要求送货时间
			if (delivery_time == null || delivery_time.equals("0")) {
				if (ctime == null || ctime.isEmpty()) {
					// sendtime = sdf1.format(new Date().getTime());
					sendtime = sdf1
							.format(new Date().getTime() * 1000L + 3600 * 1000L);// *******默认是加1个小时
				} else {
					try {
						long lctime = Long.parseLong(ctime);
						sendtime = sdf1.format(lctime * 1000L + 3600 * 1000L);// *******默认是加1个小时
					} catch (Exception e) {
						sendtime = sdf1.format(new Date().getTime());
						logger.error("美团:转换要求送货时间失败，参数是:" + ctime, e);
					}
				}
			} else {
				try {

					long lsendTime = Long.parseLong(delivery_time);
					sendtime = sdf1.format(new Date(lsendTime * 1000L));

					ihe58hdrqd = sdf2.format(new Date(lsendTime * 1000L));

					String sendstarttime = sdf1.format(new Date(
							lsendTime * 1000L - 3600 * 1000L));
					Calendar calSenddate = Calendar.getInstance();
					Calendar calCreatedate = Calendar.getInstance();

					Date sendStartdate = new Date(
							lsendTime * 1000L - 3600 * 1000L);
					long lctime = Long.parseLong(ctime);
					Date createDate = new Date(lctime * 1000L);

					calSenddate.setTime(sendStartdate);
					calCreatedate.setTime(createDate);
					// 如果 是减去1个小时，变成当天，要求送货日期就要改成当天
					if (calSenddate.get(Calendar.DAY_OF_MONTH) == calCreatedate
							.get(Calendar.DAY_OF_MONTH)) {
						ihe58hdrqd = sdf2.format(calCreatedate.getTime());
					} else {
						ihe58hdrqd = sdf2.format(calSenddate.getTime());
					}
					f55wsd02.setIhdl01(sendstarttime);// 要求送货时间从，格式为HH:mm:ss

				} catch (Exception e) {
					sendtime = ihe58hsjut;
					logger.error("美团:要求送货时间，转换失败，发送的delivery_time为"
							+ delivery_time, e);
				}

			}
			f55wsd02.setIhe58hdrqd(ihe58hdrqd);// 要求送货日期，格式为YYYY-MM-DD
			f55wsd02.setIhtxt2(sendtime);// 要求送货时间到，格式为HH:mm:ss
			int i = 0;
			double yingshouTotal = 0;
			List<F55wsd03> lstF55wsd03 = new ArrayList<F55wsd03>();
			for (OrderDetail p : lstOrderDtl) {

				// f55wsd03.setIdco(idco);//下单公司
				Object[] params1 = new Object[2];
				params1[0] = "02";

				String skuid = p.getSku_id();
				if (skuid == null || skuid.isEmpty()) {
					skuid = "";
				}
				params1[1] = p.getFood_name() + skuid;
				List<Fe14101a> lstFe14101a = orderServiceImpl
						.queryFe14101a(params1);
				if (lstFe14101a == null || lstFe14101a.size() == 0) {
					throw new Exception("美团:创建订单失败，根据商品名称:" + p.getFood_name()
							+ ";skuid=" + skuid + ";找不到系统中对应的商品数据(Fe14101a)");
				}

				// 单品汇总价值
				double sumTotal = CommonHelper.calcSumTotal(lstFe14101a);
				double reduceTotal = 0;
				// 组合菜品总价
				double combineTotal = p.getPrice();
				for (int j = 0; j < lstFe14101a.size(); j++) {
					F55wsd03 f55wsd03 = new F55wsd03();
					F55wsd03Id f55wsd03id = new F55wsd03Id();
					i++;
					f55wsd03id.setIdukid(new BigDecimal(ihukid));// 双方流水号
																	// 自然数流水如：1,2，3。。。

					f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

					f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

					f55wsd03id.setIdlnic(new BigDecimal(i * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
					f55wsd03.setId(f55wsd03id);
					// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

					f55wsd03.setIde58eboid(wm_order_id_view);// 网单编号wm_order_id_view
																// 网单号
					f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

					f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

					f55wsd03.setIde58hoca("W");// "下单渠道(58H|OC)				W-网络下单；"
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

					String idlitm = lstFe14101a.get(j).getPtlitm();

					f55wsd03.setIdlitm(idlitm);// B2C商品的唯一标示ID，bn JDE商品编号

					// f55wsd03.setIdtxtlfu3(1L);
					long ptQnty=lstFe14101a.get(j).getPtqnty().intValue();
					f55wsd03.setIdtxtlfu3(ptQnty);//插入转换系数
					
					double iduorg = lstFe14101a.get(j).getPtqnty().intValue()
							* p.getQuantity();
					f55wsd03.setIduorg(new BigDecimal(iduorg * 1000L));// "nums	JDE是整数的，包含3位小数，B2C转化成乘以1000；官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

					f55wsd03.setIde58pael(new BigDecimal(price * 100));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"
					double productFee = iduorg * price;
					f55wsd03.setIde58aexp(new BigDecimal(productFee * 100));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

					f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

					f55wsd03.setIde58hos("516");// "商品行状态			516"

					f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

					f55wsd03.setIde58hsctm(sdf3.format(d));// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

					f55wsd03.setIde58hsjut(ihe58hsjut);// "订单生成时间格式：hh:mm:ss"

					f55wsd03.setIde58hsbut(ihe58hsbut);// B2C更新时间，数据格式：yyyy-MM-dd
														// hh:mm:ss

					f55wsd03.setIde58hus21(p.getFood_name());// 商品打印名称

					f55wsd03.setIdan03(new BigDecimal(price * 100));// 会员价
					f55wsd03.setIdan04(new BigDecimal(productFee * 100));// 会员金额
					lstF55wsd03.add(f55wsd03);

					yingshouTotal = yingshouTotal + productFee;
				}

			}

			if (shipping_fee != null && !shipping_fee.isEmpty()) {
				i = i + 1;
				double waisongFee = Double.parseDouble(shipping_fee);
				if (waisongFee > 0) {
					F55wsd03 f55wsd03 = genWaiSongFei(f55wsd02, i, waisongFee);
					lstF55wsd03.add(f55wsd03);
				}
				yingshouTotal = yingshouTotal + waisongFee;
			}

			f55wsd02.setIhe58tsua(new BigDecimal(yingshouTotal * 100));// 应收总金额

			List<Fe14710a> lstFe14710a = new ArrayList<Fe14710a>();
			/**
			 * 生成付款明细表
			 */
			lstFe14710a = genFe14710a(total, f55wsd02, ihe58huf02);

			orderServiceImpl.saveOrder(f55wsd02, lstF55wsd03, lstFe14710a);
			orderServiceImpl.callWebservice(f55wsd02, lstF55wsd03);

			// 确定
			meituanConfirm();

		} catch (Exception e) {
			code = 600;
			msg = msg + ";错误信息:" + e.getMessage();
			e.printStackTrace();
			logger.error(msg, e);
		} finally {

			// if (code > 0) {
			// data.put("code", code);
			// data.put("msg", msg);
			// } else {
			// data.put("data", "ng");
			// }

		}
		return SUCCESS;
	}

	public void meituanConfirm() {
		try {
			JSONObject jsonConfirmObj = doConfirm(order_id);
			if (jsonConfirmObj != null) {
				System.out.println("美团：确定订单返回信息:" + jsonConfirmObj.toString());
				logger.info("美团：确定订单返回信息:" + jsonConfirmObj.toString());
				if (jsonConfirmObj.containsKey("error")) {
					String refmsg = jsonConfirmObj.getJSONObject("error")
							.getString("msg");

					System.out.println("美团:确认订单失败,订单ID=" + wm_order_id_view
							+ ";msg=" + refmsg);
					logger.error("美团:确认订单失败,订单ID=" + wm_order_id_view + ";msg="
							+ refmsg);

				} else {

					String refData = jsonConfirmObj.getString("data");
					if (refData.equals("ok")) {
						System.out
								.println("美团:确认订单成功,订单ID=" + wm_order_id_view);
						logger.info("美团:确认订单成功,订单ID=" + wm_order_id_view);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("美团:确认订单失败,订单ID=" + wm_order_id_view + ";msg="
					+ e.getMessage());
			logger.error("美团:确认订单失败,订单ID=" + wm_order_id_view + ";msg="
					+ e.getMessage());
		}
	}

	private void setRequestParams() throws UnsupportedEncodingException {
		HttpServletRequest request = ServletActionContext.getRequest();

		order_id = request.getParameter("order_id");
		if (order_id == null || order_id.isEmpty()) {
			return;
		}
		wm_order_id_view = request.getParameter("wm_order_id_view");
		app_poi_code = request.getParameter("app_poi_code");
		wm_poi_name = request.getParameter("wm_poi_name");
		if (null == wm_poi_name) {
			wm_poi_name = "";
		}
		wm_poi_name = URLDecoder.decode(wm_poi_name, "UTF-8");
		wm_poi_address = request.getParameter("wm_poi_address");

		if (null == wm_poi_address) {
			wm_poi_address = "";
		}
		wm_poi_address = URLDecoder.decode(wm_poi_address, "UTF-8");
		wm_poi_phone = request.getParameter("wm_poi_phone");
		recipient_address = request.getParameter("recipient_address");
		if (null == recipient_address) {
			recipient_address = "";
		}
		recipient_address = URLDecoder.decode(recipient_address, "UTF-8");
		recipient_phone = request.getParameter("recipient_phone");
		recipient_name = request.getParameter("recipient_name");
		if (recipient_name == null) {
			recipient_name = "";
		}
		recipient_name = URLDecoder.decode(recipient_name, "UTF-8");
		shipping_fee = request.getParameter("shipping_fee");
		if (shipping_fee == null || shipping_fee.isEmpty()) {
			shipping_fee = "0";
		}
		total = Double.parseDouble(request.getParameter("total"));// 总价
		// 原价
		original_price = request.getParameter("original_price");
		if (original_price == null || original_price.isEmpty()) {
			original_price = "0";
		}
		// 忌口或备注
		caution = request.getParameter("caution");
		if (caution == null) {
			caution = "";
		}
		caution = URLDecoder.decode(caution, "UTF-8");
		// 送餐员电话
		shipper_phone = request.getParameter("shipper_phone");
		// 订单状态
		status = request.getParameter("status");

		// 城市ID（目前暂时用不到此信息）
		city_id = request.getParameter("city_id");
		// 是否开发票
		has_invoiced = request.getParameter("has_invoiced");
		// 发票抬头
		invoice_title = request.getParameter("invoice_title");
		if (invoice_title == null) {
			invoice_title = "";
		}
		invoice_title = URLDecoder.decode(invoice_title, "UTF-8");
		// 创建时间
		ctime = request.getParameter("ctime");
		// 更新时间
		utime = request.getParameter("utime");
		// 用户预计送达时间，“立即送达”时为0
		delivery_time = request.getParameter("delivery_time");
		// 是否为美团商家、APP方配送（0：否；1：是）
		is_third_shipping = request.getParameter("is_third_shipping");
		// 支付类型（1：货到付款；2：在线支付）
		pay_type = request.getParameter("pay_type");
		// 实际送餐地址纬度
		latitude = request.getParameter("latitude");
		// 实际送餐地址经度
		longitude = request.getParameter("longitude");

		strdDetail = request.getParameter("detail");
		strExtras = request.getParameter("extras");

	}

	/**
	 * 生成付款明细表
	 * 
	 * @param total
	 * @param f55wsd02
	 * @param ihe58huf02
	 *            支付类型（1：货到付款；2：在线支付）
	 * @return
	 */
	private List<Fe14710a> genFe14710a(double total, F55wsd02 f55wsd02,
			String ihe58huf02) {
		List<Fe14710a> lstFe14710a = new ArrayList<Fe14710a>();
		Fe14710a fe14710a = new Fe14710a();
		Fe14710aId fe14710aid = new Fe14710aId();
		fe14710aid.setLsukid(f55wsd02.getId().getIhukid());
		// ihe58huf02 支付类型，1 下线 2 在线
		// 付款方式UDC：E1/PT 01 现金 ; 26 美团支付；23美团挂账
		if (ihe58huf02.equals("1")) {
			fe14710aid.setLse58pt("01");
		} else {
			fe14710aid.setLse58pt("26");
		}
		fe14710a.setId(fe14710aid);
		fe14710a.setLsflg("N");

		// 应收金额
		fe14710a.setLsaap(new BigDecimal(total * 100));
		fe14710a.setLsag(fe14710a.getLsaap());
		lstFe14710a.add(fe14710a);

		// 优惠放到
		if (lstOrderExtras != null && lstOrderExtras.size() > 0) {
			double sumReduceFee = 0;
			// 对所有优惠进行汇总，然后插入到付款方式中，美团挂账
			for (OrderExtras extra : lstOrderExtras) {

				// type
				/**
				 * 优惠活动类型（1-新用户立减；2-满减；3-抵价券；4-套餐赠送；5-满赠；
				 * 6-超时赔付；10-代金券；11-提前下单立减活动；16-满免配送费）
				 */
				if (extra.getType() != null
						&& extra.getType().trim().equals("17")) {
					continue;
				}
				// 应收金额
				String strReducefee = extra.getReduce_fee();
				if (strReducefee == null || strReducefee.isEmpty()) {
					strReducefee = "0";
				}
				double reduceFee = Double.parseDouble(strReducefee);
				sumReduceFee = sumReduceFee + reduceFee;

			}
			if (sumReduceFee > 0) {
				Fe14710a fe14710aDiscount = new Fe14710a();
				fe14710aDiscount.setLsaap(new BigDecimal(sumReduceFee * 100));
				fe14710aDiscount.setLsag(fe14710aDiscount.getLsaap());
				Fe14710aId fe14710aDiscountid = new Fe14710aId();
				fe14710aDiscountid.setLsukid(f55wsd02.getId().getIhukid());
				// ihe58huf02 支付类型，1 下线 2 在线
				// 付款方式UDC：E1/PT 01 现金 ; 23美团挂账
				fe14710aDiscountid.setLse58pt("23");
				fe14710aDiscount.setId(fe14710aDiscountid);
				fe14710aDiscount.setLsflg("N");
				lstFe14710a.add(fe14710aDiscount);
			}

		}

		return lstFe14710a;
	}

	private F55wsd03 genWaiSongFei(F55wsd02 f55wsd02, int rownum, double price) {
		F55wsd03 f55wsd03 = new F55wsd03();
		F55wsd03Id f55wsd03id = new F55wsd03Id();
		f55wsd03id.setIdukid(f55wsd02.getId().getIhukid());// 双方流水号
															// 自然数流水如：1,2，3。。。
		f55wsd03id.setIde58hedid("B2C");// "交互方向类型	 B2C:商城写；	 	JDE:JDE系统写；"

		f55wsd03id.setIdedln(new BigDecimal(1000));// "行号，此行号与F55WSD02.EDLN保持一致 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"

		f55wsd03id.setIdlnic(new BigDecimal(rownum * 1000));// "行号，同一个UKID从1开始，每行增加1 官网写入规则：行号为1，需要乘以1000，再写入；官网取数规则：行号除以1000，再获取；"
		f55wsd03.setId(f55wsd03id);
		// f55wsd03.setIde58hlnid(ide58hlnid);// 零售单行号

		f55wsd03.setIde58eboid(wm_order_id_view);// 网单编号wm_order_id_view 网单号
		f55wsd03.setIde58hboct(f55wsd02.getIhe58hboct());// "订单生成日期			格式为YYYY-MM-DD"

		f55wsd03.setIde58ssot("L1");// "订单种类(58E|OT)	JDE提供编码：		L1 销售单"

		f55wsd03.setIde58hoca("W");// "下单渠道(58H|OC)				W-网络下单；"

		// f55wsd03.setIdco(idco);//下单公司

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

		f55wsd03.setIde58pael(new BigDecimal(price * 100));// "price   成交价		JDE是整数的，包含2位小数，B2C转化到分，乘以100；		官网写入规则：行号为1，需要乘以100，再写入；				官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58aexp(new BigDecimal(price * 100));// "amount   成交金额	JDE是整数的，包含2位小数，B2C转化到分，乘以100；官网写入规则：行号为1，需要乘以100，再写入；官网取数规则：行号除以100，再获取；"

		f55wsd03.setIde58gpayf(f55wsd02.getIhe58gpayf());// "付款标识 未付款为1；已付款为3；"

		f55wsd03.setIde58hos("516");// "商品行状态			516"

		f55wsd03.setIdev02("N");// "读取标示N代表未读，Y表示已读	B2C只读N"

		f55wsd03.setIde58hsctm(f55wsd02.getIhe58hsbut());// "创建时间yyyy-MM-dd hh:mm:ss	INSERT记录的时间"

		f55wsd03.setIde58hsjut(f55wsd02.getIhe58hsjut());// "订单生成时间格式：hh:mm:ss"

		f55wsd03.setIde58hsbut(f55wsd02.getIhe58hsbut());// B2C更新时间，数据格式：yyyy-MM-dd
		// hh:mm:ss

		f55wsd03.setIde58hus21("外送费");// 商品打印名称

		f55wsd03.setIdan03(new BigDecimal(price * 100));// 会员价
		f55wsd03.setIdan04(new BigDecimal(price * 100));// 会员金额
		return f55wsd03;
	}

	public JSONObject doConfirm(String orderid) {
		JSONObject jsonObj = null;
		Map<String, String> params = new HashMap<String, String>();
		long timestamp = MeiTuanTimeUtil.unixtime();
		PropertiesUtil p = new PropertiesUtil("application.properties");

		String app_id = p.getPropertyByKey("meituan_appid");
		String appSecret = p.getPropertyByKey("meituan_secret");

		String confirmUrl = p.getPropertyByKey("meituan_confirmUrl");

		params.put("order_id", orderid);
		String sign = MeituanUtils.signRequest(confirmUrl, params, app_id,
				appSecret, timestamp);

		String requestUrl = confirmUrl + "?app_id=" + app_id + "&order_id="
				+ orderid + "&timestamp=" + timestamp + "&sig=" + sign;
		try {
			jsonObj = HttpRequestUtil.httpGet(requestUrl);
		} catch (Exception e) {
			logger.error("美团:美团确定订单失败!错误信息:" + e.getMessage());
			System.out.println("美团:美团确定订单失败!错误信息:" + e.getMessage());
			e.printStackTrace();
		}
		return jsonObj;
	}
}
