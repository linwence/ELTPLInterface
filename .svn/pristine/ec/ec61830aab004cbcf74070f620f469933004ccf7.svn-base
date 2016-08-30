package com.el.util;


import org.apache.log4j.Logger;

import net.sf.json.JSONObject;

/**
 * 百度地址类，可以根据经纬度算出省市区
 * 
 * @author Vincent
 * 
 */
public class BaiduMapUtil {
	static Logger logger = Logger.getLogger(BaiduMapUtil.class);

	public BaiduMapUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 根据给的纬度、经度获得国家、省、区的信息
	 * 
	 * @param Latitude
	 *            纬度
	 * @param Longitude
	 *            经度
	 * @param coordtype
	 *            坐标的类型，目前支持的坐标类型包括：bd09ll（百度经纬度坐标）、gcj02ll（国测局经纬度坐标）、wgs84ll（
	 *            GPS经纬度）
	 * @return
	 */
	public static JSONObject calcGeocoding(String Latitude, String Longitude,
			String coordtype) {
		JSONObject jsonAddressComp = null;
		PropertiesUtil p = new PropertiesUtil("application.properties");
		String url = p.getPropertyByKey("baidumap_Url");
		String ak = p.getPropertyByKey("baidumap_Ak");
		String requestUrl = url + "?ak=" + ak + "&coordtype=" + coordtype
				+ "&location=" + Latitude + "," + Longitude + "&output=json";

		try {
			JSONObject jsonObj = HttpRequestUtil.httpGet(requestUrl);
			JSONObject jsonResult = jsonObj.getJSONObject("result");
			jsonAddressComp = jsonResult.getJSONObject("addressComponent");
			String country = jsonAddressComp.getString("country");
			String province = jsonAddressComp.getString("province");
			String city = jsonAddressComp.getString("city");
			String district = jsonAddressComp.getString("district");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("百度外卖:根据经纬度获取省市区出错" + e.getMessage(), e);

		}
		return jsonAddressComp;

	}

	public static void main(String[] args) {
		JSONObject resultMap = BaiduMapUtil.calcGeocoding("39.983424",
				"116.322987","bd09ll");
		System.out.println(resultMap);

	}

	

}
