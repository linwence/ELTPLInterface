package com.el.util;

import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

import com.google.gson.Gson;

public class CalculateSignHelp {
	/**
	 * 计算百度的签名 sign
	 * 
	 * @param data
	 *            传入排序的map
	 * @return 计算后的签名字符串
	 */
	public static String CalculateSign(SortedMap<String, Object> data) {
		Gson gson = new Gson();
//		Gson gson = new GsonBuilder().disableHtmlEscaping().create();//设置Gson不针对html标签进行Unicode转义
		String strData = gson.toJson(data);
		// System.out.println(strData);
		// String unicodeStr = Md5.string2Unicode(strData);
		// String strSign = Md5.md5s(unicodeStr);
		strData = strData.replace("/", "\\/");
		String unicodeStr = Md5.chinaToUnicode(strData);
		String strSign = Md5.getMD5(unicodeStr);

		return strSign;

	}

	public static long calcTimestamp() {
		Date d = new Date();
		long now = d.getTime();
		long ltimestamp = now / 1000;
		return ltimestamp;
	}
}
