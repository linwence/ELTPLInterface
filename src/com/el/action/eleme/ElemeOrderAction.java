package com.el.action.eleme;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;

import com.el.connect.DBContextHolder;
import com.el.entity.eleme.OrderInfo;
import com.el.entity.eleme.OrderNew;
import com.el.util.CalculateSignHelp;
import com.el.util.ElemeHelper;
import com.el.util.HttpRequestUtil;
import com.el.util.PropertiesUtil;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
public class ElemeOrderAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(ElemeOrderAction.class); // 日志记录
	private String consumer_key;
	private String consumerSecret;
	/**
	 * 查询对应餐厅的新订单url
	 */
	private String eleme_orderNew_Url;
	/**
	 * 根据饿了么订单ID查询订单详情 url
	 */
	private String eleme_orderInfo_Url;

	private String eleme_basicUrl;
	private OrderNew orderNew;
	private OrderInfo orderInfo;

	private IElemeOrderDoSave elemeOrderDoSave;
	private Map<String, String> data;

	public String getConsumer_key() {
		return consumer_key;
	}

	public void setConsumer_key(String consumer_key) {
		this.consumer_key = consumer_key;
	}

	public String getConsumerSecret() {
		return consumerSecret;
	}

	public void setConsumerSecret(String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getEleme_orderNew_Url() {
		return eleme_orderNew_Url;
	}

	public void setEleme_orderNew_Url(String eleme_orderNew_Url) {
		this.eleme_orderNew_Url = eleme_orderNew_Url;
	}

	public String getEleme_orderInfo_Url() {
		return eleme_orderInfo_Url;
	}

	public void setEleme_orderInfo_Url(String eleme_orderInfo_Url) {
		this.eleme_orderInfo_Url = eleme_orderInfo_Url;
	}

	public String getEleme_basicUrl() {
		return eleme_basicUrl;
	}

	public void setEleme_basicUrl(String eleme_basicUrl) {
		this.eleme_basicUrl = eleme_basicUrl;
	}

	public OrderNew getOrderNew() {
		return orderNew;
	}

	public void setOrderNew(OrderNew orderNew) {
		this.orderNew = orderNew;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public IElemeOrderDoSave getElemeOrderDoSave() {
		return elemeOrderDoSave;
	}

	@Resource
	public void setElemeOrderDoSave(IElemeOrderDoSave elemeOrderDoSave) {
		this.elemeOrderDoSave = elemeOrderDoSave;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public ElemeOrderAction() {
		// TODO Auto-generated constructor stub
		PropertiesUtil p = new PropertiesUtil("application.properties");
		consumer_key = p.getPropertyByKey("eleme_consumer_key");
		consumerSecret = p.getPropertyByKey("eleme_consumer_secret");
		eleme_orderNew_Url = p.getPropertyByKey("eleme_orderNew_Url");
		eleme_orderInfo_Url = p.getPropertyByKey("eleme_orderInfo_Url");
		eleme_basicUrl = p.getPropertyByKey("eleme_basicUrl");

	}

	public String orderCreate() {
		//先切换一下数据库连接
		DBContextHolder.setDBType(DBContextHolder.DATA_SOURCE_INTERFACE);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		data = new HashMap<String, String>();
		data.put("message", "ok");
		System.out.println("饿了么推送................");
		String push_action = request.getParameter("push_action");
		String eleme_order_ids = request.getParameter("eleme_order_ids");
		if (push_action == null || !push_action.equals("1")) {
			data.put("message", "ok");
			// System.out
			// .println("饿了么:无法处理不是推单的推送,已经直接返回OK，(只能处理pushaction=1),现在的pushaction="
			// + push_action);
			// logger.info("饿了么:无法处理不是推单的推送,已经直接返回OK，(只能处理pushaction=1),现在的pushaction="
			// + push_action);
			return SUCCESS;

		}
		String[] orderids = eleme_order_ids.split(",");
		if (orderids == null || orderids.length == 0) {
			return SUCCESS;
		}

		String sign2 = "";
		Map<String, String> params2 = new HashMap<String, String>();
		try {
			for (String orderid : orderids) {
				params2.clear();
				String orderinfoUrl = eleme_orderInfo_Url + orderid + "/";
				long ltimestamp2 = CalculateSignHelp.calcTimestamp();
				params2.put("timestamp", Long.toString(ltimestamp2));
				params2.put("consumer_key", consumer_key);

				sign2 = ElemeHelper.genSig(orderinfoUrl, params2,
						consumerSecret);

				String url2 = orderinfoUrl + "?consumer_key=" + consumer_key
						+ "&sig=" + sign2 + "&timestamp=" + ltimestamp2;
				String code = "";
				String message = "";
				JSONObject jsonObj2 = null;

				System.out.println("饿了么:[查询订单详情API],url:" + url2);
				logger.info("饿了么:[查询订单详情API]，url:" + url2);
				jsonObj2 = HttpRequestUtil.httpGet(url2);
				code = jsonObj2.getString("code");
				message = jsonObj2.getString("message");
				System.out.println("饿了么:订单详情Json:" + jsonObj2.toString());
				logger.info("饿了么:订单详情Json:" + jsonObj2.toString());
				if (code != null && !code.equals("200")) {

					logger.error("饿了么，[查询订单详情API]失败,orderid=" + orderid
							+ ",返回Code=" + code + ";message=" + message);
					// continue;
					data.put("message", "error");
					return SUCCESS;
				}

				try {
					elemeOrderDoSave.orderCreate(jsonObj2.toString());

					// 保存成功之后要对订单进行确认，否则饿了么会在10分钟之后自动取消。所以要调用API确认订单
					// **********注释确认订单，需要再开启*******************************************//
					String confrimUrl = eleme_basicUrl + "/order/" + orderid
							+ "/status/";
					String confrimError = elemeOrderDoSave.doConfirmOrder(
							confrimUrl, consumer_key, consumerSecret);
					if (confrimError != null && !confrimError.isEmpty()) {
						logger.error("饿了么:订单确定失败，订单号:" + orderid + ";error:"
								+ confrimError);
						continue;
					}
					// ***************************************************//
				} catch (Exception e) {
					/*
					 * 注释，失败不返回失败，直接返回成功，不然订单会被直接取消，这样，可以让商家后台进行接单
					 */
					// data.put("message", "error");
					System.out.println("饿了么:[生成订单失败],错误信息:" + e.getMessage());
					logger.info("订单详情Json:" + jsonObj2.toString());
					logger.error("饿了么订单，orderid=" + orderid + "生成订单失败，错误信息:"
							+ e.getMessage(), e);
					// continue;
					return SUCCESS;
				}

			}
		} catch (Exception e) {
			System.out.println("饿了么:[订单推送失败],错误信息:" + e.getMessage());
			/*
			 * 注释，失败不返回失败，直接返回成功，不然订单会被直接取消，这样，可以让商家后台进行接单
			 */
			// data.put("message", "error");
			return SUCCESS;

		}

		return SUCCESS;
	}
}
