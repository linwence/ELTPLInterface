package com.el.action.eleme;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import com.el.util.CalculateSignHelp;
import com.el.util.ElemeHelper;
import com.el.util.PropertiesUtil;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class ElemeTest {
	/**
	 * 查询对应餐厅的新订单url
	 */
	private String eleme_orderNew_Url;
	/**
	 * 根据饿了么订单ID查询订单详情 url
	 */
	private String eleme_orderInfo_Url;

	private String eleme_basicUrl;
	private String consumer_key;
	private String consumerSecret;

	public ElemeTest() {
		// TODO Auto-generated constructor stub
		PropertiesUtil p = new PropertiesUtil("application.properties");
		consumer_key = p.getPropertyByKey("eleme_consumer_key");
		consumerSecret = p.getPropertyByKey("eleme_consumer_secret");
		eleme_orderNew_Url = p.getPropertyByKey("eleme_orderNew_Url");
		eleme_orderInfo_Url = p.getPropertyByKey("eleme_orderInfo_Url");
		eleme_basicUrl = p.getPropertyByKey("eleme_basicUrl");
	}

	public static void main(String[] args) {
		ElemeTest e = new ElemeTest();
		try {
			e.test();
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	void test() throws NoSuchAlgorithmException, UnsupportedEncodingException {
		long	ltimestamp2 = CalculateSignHelp.calcTimestamp();
		Map<String, String> params2 = new HashMap<String, String>();
		params2.put("timestamp", Long.toString(ltimestamp2));
		params2.put("consumer_key", consumer_key);
		params2.put("status", "2");
		String confrimUrl = eleme_basicUrl + "/order/100172672584518042/status/";
		String strError = "";
		String sign = "";
		try {
			sign = ElemeHelper.genSig(confrimUrl, params2, consumerSecret);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (sign == null || sign.isEmpty()) {
			strError = "计算饿了么sig出错";
		}

		String requrl = confrimUrl + "?consumer_key=" + params2.get("consumer_key")
				+ "&sig=" + sign + "&timestamp=" + params2.get("timestamp");
		String code = "";
		
		String jsonObj = null;
		try {
			params2.clear();
			params2.put("status", "2");
			jsonObj=this.sendPUT(requrl, params2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonObj.toString());
	}
	
	static public String sendPUT(String restfulUrl, Map<String, String> params) throws IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPut requestPut = new HttpPut(restfulUrl);
		requestPut
				.setHeader("Accept",
						"application/json, application/xml, text/html, text/*, image/*, */*");
		final List<BasicNameValuePair> putData = new ArrayList<BasicNameValuePair>();
		for (Map.Entry<String, String> entry : params.entrySet()) {
			putData.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		if (params != null && !params.isEmpty()) {
			try {
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(putData,
						"UTF-8");
				requestPut.setEntity(entity);
			} catch (UnsupportedEncodingException ignore) {
				ignore.printStackTrace();
			}
		}
		String result = "";
		try {
			HttpResponse httpResponse = client.execute(requestPut);
			if (httpResponse == null)
				return result;
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
				result = EntityUtils.toString(httpResponse.getEntity());
		} catch (IOException ignore) {
			ignore.printStackTrace();
			
		} finally {
			if (client != null)
				client.close();
		}
		return result.toString();
	} 

}
