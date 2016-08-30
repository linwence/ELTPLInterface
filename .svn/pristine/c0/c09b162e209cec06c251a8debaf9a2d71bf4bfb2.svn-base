package com.el.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

public class HttpRequestUtil {

	private static Logger logger = Logger.getLogger(HttpRequestUtil.class); // 日志记录

	/**
	 * httpPost
	 * 
	 * @param url
	 *            路径
	 * @param jsonParam
	 *            参数
	 * @return
	 */
	public static JSONObject httpPost(String url, JSONObject jsonParam) {
		return httpPost(url, jsonParam, false);
	}

	/**
	 * post请求
	 * 
	 * @param url
	 *            url地址
	 * @param jsonParam
	 *            参数
	 * @param noNeedResponse
	 *            不需要返回结果
	 * @return
	 */
	public static JSONObject httpPost(String url, JSONObject jsonParam,
			boolean noNeedResponse) {
		// post请求返回结果
		CloseableHttpClient httpClient = HttpClients.createDefault();

		JSONObject jsonResult = null;
		HttpPost method = new HttpPost(url);
		try {
			if (null != jsonParam) {
				// 解决中文乱码问题
				StringEntity entity = new StringEntity(jsonParam.toString(),
						"utf-8");
				entity.setContentEncoding("UTF-8");
				entity.setContentType("application/x-www-form-urlencoded");
				method.setEntity(entity);
			}
			CloseableHttpResponse httpResponse = httpClient.execute(method);
			url = URLDecoder.decode(url, "UTF-8");
			try {
				/** 请求发送成功，并得到响应 **/
				if (httpResponse.getStatusLine().getStatusCode() == 200) {
					String str = "";

					/** 读取服务器返回过来的json字符串数据 **/
					str = EntityUtils.toString(httpResponse.getEntity());
					if (noNeedResponse) {
						return null;
					}
					/** 把json字符串转换成json对象 **/
					jsonResult = JSONObject.fromObject(str);

				}
			} catch (Exception e) {
				logger.error("post请求提交失败:" + url, e);
			} finally {
				if (httpResponse != null) {
					httpResponse.close();
				}
			}
		} catch (IOException e) {
			logger.error("post请求提交失败:" + url, e);
		} finally {
			closeHttpClient(httpClient);
		}
		return jsonResult;
	}

	public static JSONObject httpBaiduPost(String url, String requestJson) {
		// post请求返回结果
		CloseableHttpClient httpClient = HttpClients.createDefault();

		JSONObject jsonResult = null;
		HttpPost method = new HttpPost(url);
		try {
			if (null != requestJson) {
				// 解决中文乱码问题
				StringEntity entity = new StringEntity(requestJson, "utf-8");
				entity.setContentEncoding("UTF-8");
				entity.setContentType("application/x-www-form-urlencoded");
				method.setEntity(entity);
			}
			CloseableHttpResponse httpResponse = httpClient.execute(method);
			url = URLDecoder.decode(url, "UTF-8");
			try {
				/** 请求发送成功，并得到响应 **/
				if (httpResponse.getStatusLine().getStatusCode() == 200) {
					String str = "";

					/** 读取服务器返回过来的json字符串数据 **/
					str = EntityUtils.toString(httpResponse.getEntity());
					/** 把json字符串转换成json对象 **/
					jsonResult = JSONObject.fromObject(str);

				}
			} catch (Exception e) {
				logger.error("post请求提交失败:" + url, e);
			} finally {
				if (httpResponse != null) {
					httpResponse.close();
				}
			}
		} catch (IOException e) {
			logger.error("post请求提交失败:" + url, e);
		} finally {
			closeHttpClient(httpClient);
		}
		return jsonResult;
	}

	/**
	 * 发送get请求
	 * 
	 * @param url
	 *            路径
	 * @return
	 */
	public static JSONObject httpGet(String url) throws Exception {
		// get请求返回结果
		JSONObject jsonResult = null;
		// try {
		CloseableHttpClient client = HttpClients.createDefault();
		// 发送get请求
		HttpGet request = new HttpGet(url);
		CloseableHttpResponse response = client.execute(request);

		/** 请求发送成功，并得到响应 **/
		try {

			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				/** 读取服务器返回过来的json字符串数据 **/
				String strResult = EntityUtils.toString(response.getEntity(),
						"UTF-8");
				/** 把json字符串转换成json对象 **/
				jsonResult = JSONObject.fromObject(strResult);
				url = URLDecoder.decode(url, "UTF-8");
			} else {
				throw new Exception("get请求提交失败:" + url);
			}
		} finally {
			response.close();
			closeHttpClient(client);
		}

		return jsonResult;
	}

	public static JSONObject httpGet(String url, HttpContext httpContext)
			throws Exception {
		// get请求返回结果
		JSONObject jsonResult = null;
		// try {
		CloseableHttpClient client = HttpClients.createDefault();
		// 发送get请求
		HttpGet request = new HttpGet(url);
		CloseableHttpResponse response = client.execute(request, httpContext);

		/** 请求发送成功，并得到响应 **/
		try {
			if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
				/** 读取服务器返回过来的json字符串数据 **/
				String strResult = EntityUtils.toString(response.getEntity(),
						"UTF-8");
				/** 把json字符串转换成json对象 **/
				jsonResult = JSONObject.fromObject(strResult);
				url = URLDecoder.decode(url, "UTF-8");
			} else {
				throw new Exception("get请求提交失败:" + url);
			}
		} finally {
			response.close();
			closeHttpClient(client);
		}

		return jsonResult;
	}

	public static String httpGet2(String url, HttpContext httpContext)
			throws Exception {
		// get请求返回结果
		String strResult = "";
		// try {
		CloseableHttpClient client = HttpClients.createDefault();
		// 发送get请求
		HttpGet request = new HttpGet(url);
		CloseableHttpResponse response = client.execute(request, httpContext);
		/** 请求发送成功，并得到响应 **/
		try {
			int status = response.getStatusLine().getStatusCode();
			/** 读取服务器返回过来的json字符串数据 **/
			strResult = EntityUtils.toString(response.getEntity(), "UTF-8");
		} finally {
			response.close();
			closeHttpClient(client);
		}
		return strResult;
	}

	static public JSONObject httpPUT(String restfulUrl,
			Map<String, String> params) throws Exception {
		CloseableHttpClient client = HttpClients.createDefault();
		JSONObject jsonResult = null;
		HttpPut requestPut = new HttpPut(restfulUrl);

		requestPut
				.setHeader("Accept",
						"application/json, application/xml, text/html, text/*, image/*, */*");
		final List<BasicNameValuePair> putData = new ArrayList<BasicNameValuePair>();
		for (Map.Entry<String, String> entry : params.entrySet()) {
			putData.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		if (params != null && !params.isEmpty()) {

			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(putData,
					"UTF-8");
			entity.setContentType("application/x-www-form-urlencoded");
			requestPut.setEntity(entity);

		}
		String result = "";
		CloseableHttpResponse httpResponse = client.execute(requestPut);
		try {

			if (httpResponse == null)
				return jsonResult;
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
				result = EntityUtils.toString(httpResponse.getEntity());
			jsonResult = JSONObject.fromObject(result);
		} catch (Exception e) {
			throw e;

		} finally {
			if (httpResponse != null) {
				httpResponse.close();
			}
			if (client != null)
				client.close();
		}
		return jsonResult;
	}

	/**
	 * POST方式发起http请求
	 */
	public static JSONObject httpPost(String url, Map<String, String> params) {
		CloseableHttpClient httpClient = getHttpClient();
		JSONObject jsonObj = null;
		try {
			HttpPost post = new HttpPost(url);
			// 创建参数列表
			List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
			for (Map.Entry<String, String> entry : params.entrySet()) {
				list.add(new BasicNameValuePair(entry.getKey(), entry
						.getValue()));
			}

			// url格式编码
			UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(list,
					"UTF-8");
			post.setEntity(uefEntity);
			System.out.println("POST 请求...." + post.getURI());
			// 执行请求
			CloseableHttpResponse httpResponse = httpClient.execute(post);
			try {
				HttpEntity entity = httpResponse.getEntity();
				if (null != entity) {
					System.out
							.println("-------------------------------------------------------");
					String str = EntityUtils.toString(entity);

					System.out.println(str);
					jsonObj = JSONObject.fromObject(str);
					System.out
							.println("-------------------------------------------------------");
				}
			} finally {
				httpResponse.close();
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			closeHttpClient(httpClient);

		}
		return jsonObj;

	}

	private static CloseableHttpClient getHttpClient() {
		return HttpClients.createDefault();
	}

	private static void closeHttpClient(CloseableHttpClient client) {
		if (client != null) {
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static JSONObject httpAppPost(String url, String requestJson) {
		// post请求返回结果
		CloseableHttpClient httpClient = HttpClients.createDefault();

		JSONObject jsonResult = null;
		HttpPost method = new HttpPost(url);
		try {
			if (null != requestJson) {
				// 解决中文乱码问题
				StringEntity entity = new StringEntity(requestJson, "utf-8");
				entity.setContentEncoding("UTF-8");
				entity.setContentType("application/json");
				method.setEntity(entity);
			}
			CloseableHttpResponse httpResponse = httpClient.execute(method);
			url = URLDecoder.decode(url, "UTF-8");
			try {
				/** 请求发送成功，并得到响应 **/
				if (httpResponse.getStatusLine().getStatusCode() == 200) {
					String str = "";

					/** 读取服务器返回过来的json字符串数据 **/
					str = EntityUtils.toString(httpResponse.getEntity());
					/** 把json字符串转换成json对象 **/
					jsonResult = JSONObject.fromObject(str);

				}
			} catch (Exception e) {
				logger.error("post请求提交失败:" + url, e);
			} finally {
				if (httpResponse != null) {
					httpResponse.close();
				}
			}
		} catch (IOException e) {
			logger.error("post请求提交失败:" + url, e);
		} finally {
			closeHttpClient(httpClient);
		}
		return jsonResult;
	}

}
