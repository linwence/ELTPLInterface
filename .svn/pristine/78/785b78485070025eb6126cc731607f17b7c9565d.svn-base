package com.el.action.eleme;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

import javax.annotation.Resource;



import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.el.entity.eleme.OrderInfo;
import com.el.entity.eleme.OrderNew;
import com.el.util.CalculateSignHelp;
import com.el.util.ElemeHelper;
import com.el.util.PropertiesUtil;

@Component("elemeOrderTimeTask")
@Scope("prototype")
public class ElemeOrderTimeTask extends TimerTask {
	private static Logger logger = Logger.getLogger(ElemeOrderTimeTask.class); // 日志记录
	private String consumer_key;
	private String consumerSecret;
	private OrderNew orderNew;
	private OrderInfo orderInfo;
	private IElemeOrderDoSave elemeOrderDoSave;

	public IElemeOrderDoSave getElemeOrderDoSave() {
		return elemeOrderDoSave;
	}

	@Resource
	public void setElemeOrderDoSave(IElemeOrderDoSave elemeOrderDoSave) {
		this.elemeOrderDoSave = elemeOrderDoSave;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public OrderNew getOrderNew() {
		return orderNew;
	}

	public void setOrderNew(OrderNew orderNew) {
		this.orderNew = orderNew;
	}

	/**
	 * 查询对应餐厅的新订单url
	 */
	private String eleme_orderNew_Url;
	/**
	 * 根据饿了么订单ID查询订单详情 url
	 */
	private String eleme_orderInfo_Url;

	private String eleme_basicUrl;

	public ElemeOrderTimeTask() {
		super();
		// TODO Auto-generated constructor stub
		PropertiesUtil p = new PropertiesUtil("application.properties");
		consumer_key = p.getPropertyByKey("eleme_consumer_key");
		consumerSecret = p.getPropertyByKey("eleme_consumer_secret");
		eleme_orderNew_Url = p.getPropertyByKey("eleme_orderNew_Url");
		eleme_orderInfo_Url = p.getPropertyByKey("eleme_orderInfo_Url");
		eleme_basicUrl = p.getPropertyByKey("eleme_basicUrl");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Map<String, String> params = new HashMap<String, String>();
		long ltimestamp = CalculateSignHelp.calcTimestamp();
		params.put("timestamp", Long.toString(ltimestamp));
		params.put("consumer_key", consumer_key);
		// 如果不传递restaurant_id这个参数，则返回所有这个consumer有权限管理的餐厅的新订单ID， 否则返回对应的餐厅的新订单ID
		String sign = "";
		try {
			sign = ElemeHelper.genSig(eleme_orderNew_Url, params,
					consumerSecret);
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
			logger.error("计算饿了么sig出错");
			return;
		}

		// String url = eleme_orderNew_Url + "?consumer_key=" + consumer_key
		// + "&sig=" + sign + "&timestamp=" + ltimestamp;
		// String orderidString = "";
		try {
			// logger.info("调用饿了么‘查询新订单API’,url:" + url);
			// JSONObject jsonObj = HttpRequestUtil.httpGet(url);
			// Gson gson = new Gson();
			// // orderNew = gson
			// // .fromJson(
			// //
			// "{\"message\":\"ok\",\"request_id\":\"6dc3a08958dd4a74aeae038081b4caa3\",\"data\":{\"order_ids\":[\"100154890279162185\"]},\"code\":200}",
			// // OrderNew.class);
			// orderidString = jsonObj.toString();
			//
			// orderNew = gson.fromJson(orderidString, OrderNew.class);
			// if (orderNew != null && orderNew.getData() != null
			// && orderNew.getData().getOrder_ids() != null) {
			// List<String> orderids = orderNew.getData().getOrder_ids();
			// if (orderids.size() == 0) {
			// logger.info("调用饿了么‘查询新订单API’,url:" + url + ";没有新订单!");
			// return;
			// }

			String sign2 = "";
			Map<String, String> params2 = new HashMap<String, String>();
			List<String> orderids = new ArrayList<String>();
			orderids.add("100204262431569763");
			for (String orderid : orderids) {
				
				try {
					//String strJsonObj = "{\"message\":\"ok\",\"request_id\":\"4f89c492531247e6b061f23333da7dba\",\"data\":{\"status_code\":0,\"deliver_fee\":20,\"delivery_poi_address\":\"玺萌丽苑3号楼20层C户(北京市丰台区北甲地路6号院)\",\"detail\":{\"abandoned_extra\":[],\"extra\":[{\"id\":190767,\"price\":-49.1,\"stats_quantity\":1,\"description\":\"椒盐皮皮虾9.9元\",\"name\":\"椒盐皮皮虾9.9元\",\"category_id\":11,\"quantity\":1,\"type\":4},{\"id\":190774,\"price\":-63.1,\"stats_quantity\":1,\"description\":\"清蒸皮皮虾15.9元\",\"name\":\"清蒸皮皮虾15.9元\",\"category_id\":11,\"quantity\":1,\"type\":4},{\"id\":-10,\"price\":20,\"description\":\"\",\"name\":\"配送费\",\"category_id\":2,\"quantity\":1},{\"id\":1062039463,\"price\":-15,\"description\":\"\",\"name\":\"使用红包\",\"category_id\":13,\"quantity\":1}],\"group\":[[{\"id\":24048528,\"price\":29,\"name\":\"麻辣鱿鱼须\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[\"默认\"]},{\"id\":47522634,\"price\":29,\"name\":\"麻辣田螺\",\"garnish\":[],\"category_id\":1,\"quantity\":2,\"specs\":[]},{\"id\":47083226,\"price\":59,\"name\":\"椒盐皮皮虾/(30g-35g)\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[]},{\"id\":27688494,\"price\":22,\"name\":\"微辣鸭脖\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[\"默认\"]},{\"id\":47083229,\"price\":79,\"name\":\"清蒸皮皮虾/大于40g\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[]}]]},\"invoice\":\"\",\"consignee\":\"程鹏\",\"original_price\":267,\"restaurant_id\":53854242,\"phone_list\":[\"15901069815\"],\"order_id\":\"100204262431569763\",\"total_price\":139.8,\"user_name\":\"3b3c711f7\",\"address\":\"玺萌丽苑3号楼20层C户\",\"description\":\"\",\"created_at\":\"2015-11-30 15:01:42\",\"user_id\":25488938,\"deliver_time\":null,\"delivery_geo\":\"39.850716,116.364784\",\"is_online_paid\":1,\"restaurant_name\":\"麻辣诱惑小龙虾外卖\",\"is_book\":0},\"code\":200}";
String strJsonObj="{\"message\":\"ok\",\"request_id\":\"273063f6cbb9424797e1922ac956e6d5\",\"data\":{\"status_code\":0,\"deliver_fee\":0,\"delivery_poi_address\":\"南礼士路46号院1单元1503(北京市西城区南礼士路46号院)\",\"detail\":{\"abandoned_extra\":[],\"extra\":[{\"id\":292472,\"price\":-19,\"stats_quantity\":1,\"description\":\"福利大放送，麻辣诱惑新菜劲爆上市\",\"name\":\"福利大放送，麻辣诱惑新菜劲爆上市\",\"category_id\":11,\"quantity\":1,\"type\":4},{\"id\":1610361407,\"price\":-10,\"description\":\"\",\"name\":\"使用红包\",\"category_id\":13,\"quantity\":1,\"type\":0}],\"group\":[[{\"id\":24048504,\"price\":18,\"name\":\"荷叶焗饭\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[]},{\"id\":48449554,\"price\":99,\"name\":\"麻辣小龙虾迷你（小份）\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[\"默认\"]},{\"id\":54046059,\"price\":48,\"name\":\"老干妈牛蛙3只/份\",\"garnish\":[],\"category_id\":1,\"quantity\":1,\"specs\":[]}]]},\"invoice\":\"\",\"consignee\":\"余阳\",\"original_price\":165,\"restaurant_id\":53854242,\"active_at\":\"2016-01-21 18:05:18\",\"phone_list\":[\"18810908898\"],\"order_id\":\"100351245786435427\",\"total_price\":136,\"user_name\":\"46137b0e2\",\"restaurant_number\":36,\"address\":\"南礼士路46号院1单元1503\",\"description\":\"\",\"created_at\":\"2016-01-21 18:05:08\",\"user_id\":5606659,\"delivery_geo\":\"39.91634,116.353836\",\"deliver_time\":null,\"is_online_paid\":1,\"restaurant_name\":\"麻辣诱惑小龙虾外卖\",\"is_book\":0},\"code\":200}";
					elemeOrderDoSave.orderCreate(strJsonObj);
				} catch (Exception e) {
					// logger.info("订单详情Json:" + jsonObj2.toString());
					logger.error("饿了么订单，orderid=" + orderid + "生成订单失败，错误信息:"
							+ e.getMessage(), e);
					continue;
				}
				// 保存成功之后要对订单进行确认，否则饿了么会在10分钟之后自动取消。所以要调用API确认订单
				params2.clear();
				// ltimestamp2 = CalculateSignHelp.calcTimestamp();
				// params2.put("timestamp", Long.toString(ltimestamp2));
				// params2.put("consumer_key", consumer_key);
				// String confrimUrl = eleme_basicUrl + "/order/" + orderid
				// + "/2/";
				// String confrimError = elemeOrderDoSave.doConfirmOrder(
				// confrimUrl, params2, consumerSecret);
			}

			// }

		} catch (Exception e) {

			logger.error("饿了么订单执行失败,错误信息:" + e.getMessage(), e);
			e.printStackTrace();

		}

	}
}
