package com.el.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

public class JDType {
	public static Date toDate(int val) {
		int yearPart = val / 1000;
		int dayPart = val % 1000;
		
		Date d = new Date(yearPart, 0, 1);
		d = TH.addDays(d, dayPart - 1);
		return d;
	}
	
	public static int fromDate(Date d) {
		int year = d.getYear();
		int days = TH.getDaysOfYear(d);
		
		return year * 1000 + days;
	}
	
	public static int fromTime(Date d) {
		int val = d.getHours() * 10000 + d.getMinutes() * 100 + d.getSeconds();
		return val;
	}
	
	// jde时间格式转成java日期格式 (to) 时分秒可用年月日随便设置 
	// param:  6位整数  et: 105728  意义: 10点57分28秒
	// return: Mon Nov 12 10:57:28 CST 2012 意义: 日期格式，年月日无意义，只看时分秒
	public static Date toTime(int d) {
		int hour = d / 10000;
		int minute = (d - hour * 10000) / 100;
		int second = d - hour * 10000 - minute * 100;
		
		return new Date(112, 10, 12, hour, minute, second);
	}
	
	public static String toTimeString(int d) {
		int hour = d / 10000;
		int minute = (d - hour * 10000) / 100;
		String second =String.valueOf(d - hour * 10000 - minute * 100);
		if(Integer.parseInt(second)<10)
		{
		  second="0"+second;
		}
		return hour + ":" + minute + ":" + second;
	}
	
	// 把java字符串转换为jde的Company格式，5位字符串，不足5位前面补0
	// param: 入力java字符串
	// return: 1.jde格式字符串 2.""  表示入力参数不符合规则			
	public static String fromCompany(String cpy) {
		String jdeCpy = null;
		if (TH.isNull(cpy)) {
			return "";
		}
		if (cpy.length() > 5) {
			return "";
		}
		int strLen = cpy.length();
		StringBuffer addZero = new StringBuffer();
		for (int i = 0; i < 5 - strLen; i++) {
			addZero.append("0");
		}
		jdeCpy = addZero + cpy;
		return jdeCpy;
	}
	
	// 把jde的Company字符串头部0trim掉后转换成java字符串
	// param: jde字符串
	// return: 1.java字符串  2.""  表示入力参数不符合规则
	public static String toCompany(String jdeCpy) {
		if (TH.isNull(jdeCpy) || jdeCpy.length() != 5) {
			return "";
		}
		String javaCpy = jdeCpy.replaceAll("^(0+)", "");
		return javaCpy;
	}
	
	// 把java字符串转换为jde的MCU格式，12位字符串，不足12位前面补空格
	// param: 入力java字符串
	// return: 1.jde格式字符串 2.""  表示入力参数不符合规则
	public static String fromMCU(String javaMCU) {
		String jdeMCU = null;
		if (TH.isNull(javaMCU)) {
			return "";
		}
		if (javaMCU.length() > 12) {
			return "";
		}
		int strLen = javaMCU.length();
		StringBuffer addSpace = new StringBuffer();
		for (int i = 0; i < 12 - strLen; i++) {
			addSpace.append(" ");
		}
		jdeMCU = addSpace + javaMCU;
		return jdeMCU;
	}
	
	// 把jde的MCE字符串头部空额trim掉后转换成java字符串
	// param: jde字符串
	// return: 1.java字符串  2.""  表示入力参数不符合规则
	public static String toMCU(String jdeMCU) {
		if (TH.isNull(jdeMCU) || jdeMCU.length() != 12) {
			return "";
		}
		String javaMCU = jdeMCU.replaceAll("^(\\s+)", "");
		return javaMCU;
	}
	
	// 在UDC表中，类别码字段为10位，不足10位前面补空格补到10位
	// 在正常字段中，无补位
	// param: 1.入力java格式字符串
	// return: jde格式的UDC数据
	public static String fromUDC(String javaUDC) {
		if (TH.isNull(javaUDC) || javaUDC.length() > 10) {
			return "";
		}
		String jdeUDC = null;
		int strLen = javaUDC.length();
		StringBuffer addSpace = new StringBuffer();
		for (int i = 0; i < 10 - strLen; i++) {
			addSpace.append(" ");
		}
		jdeUDC = addSpace + javaUDC;
		return jdeUDC;
	}
	
	// 将jde的UDC格式字符串转换成java类型的格式
	// param: 1.入力jde的UDC格式字符串 
	// return: 1.java格式的UDC数据  2."" 表示入力参数不符合规则
	public static String toUDC(String jdeUDC) {
		if (TH.isNull(jdeUDC) || jdeUDC.length() != 10) {
			return "";
		}
		String javaUDC = jdeUDC.replaceAll("^(\\s+)", "");
		return javaUDC;
	}
	
	// 给入力字符串末尾补空格 
	// param: 1.入力字符串 2.该字符串的总长度
	// return: 补好末尾空格的字符串
	// 例: "abc"  则 addBackSpace("abc", 4) 的结果为 "abc "；
	public static String addBackSpace(String input, int len) {
		int inLen = input.length();
		if (len < inLen) {
			input = input.substring(0, len);
			return input;
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len - inLen; i++) {
			sb.append(" ");
		}
		return input + sb;
	}
	
	/**数量* multiply 10^n 之后存入DB*/
	public static double multiplyPow10n(double amount) {
		
//		return amount * Math.pow(10,Constant.AMOUNT_DECIMAL);
		return round(mul(amount,Math.pow(10,Constant.AMOUNT_DECIMAL)),Constant.AMOUNT_DECIMAL);
	}	
	
	/**
	* 提供精确的乘法运算。
	* @param v1 被乘数
	* @param v2 乘数
	* @return 两个参数的积
	*/
	private static double mul(double v1, double v2) {
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return b1.multiply(b2).doubleValue();
	}

	/**从DB中取出 数量  divide 10^n 之后显示*/
	public static double dividePow10n(double amount) {
		
//		return amount / Math.pow(10,Constant.AMOUNT_DECIMAL);
		return dividePow10n(amount,Constant.AMOUNT_DECIMAL);
	}
	
	/**从DB中取出 数量  divide 10^n 之后显示*/
	public static double dividePow10n(double tempVal,int decimalDigit) {
		double point = Math.pow(10, decimalDigit);
		double resultValue  = div(tempVal,point,decimalDigit);
		return resultValue;
	}
	
	/**从DB中取出 数量  divide 10^n 之后显示*/
	public static double dividePow10n(long tempVal,int decimalDigit) {
		double point = Math.pow(10, decimalDigit);
		double resultValue  = div(tempVal,point,decimalDigit);
		return resultValue;
	}
	
	//add by Gavin 2015/03/25 begin
	/**
	* 提供精确的加法运算。
	* @param v1 被加数
	* @param v2 加数
	* @return 两个参数的和
	*/

	public static double add(double v1, double v2) {
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return b1.add(b2).doubleValue();
	}

	/**
	* 提供精确的减法运算。
	* @param v1 被减数
	* @param v2 减数
	* @return 两个参数的差
	*/

	public static double sub(double v1, double v2) {
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return b1.subtract(b2).doubleValue();
	}


	/**
	* 提供精确的乘法运算。
	* 按照指定的scale四舍五入。
	* @param v1 被乘数
	* @param v2 乘数
	* @param scale 保留小数位数
	* @return 两个参数的积
	*/
	public static double mul(double v1, double v2,int scale) {
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return round(b1.multiply(b2).doubleValue(),scale);
	}
	

	/**
	* 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
	* 定精度，以后的数字四舍五入。
	* @param v1 被除数
	* @param v2 除数
	* @param scale 表示表示需要精确到小数点以后几位。
	* @return 两个参数的商
	*/
	public static double div(double v1, double v2, int scale) {
	   if (scale < 0) {
	    throw new IllegalArgumentException(
	      "The scale must be a positive integer or zero");
	   }
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	* 提供精确的小数位四舍五入处理。
	* @param v 需要四舍五入的数字
	* @param scale 小数点后保留几位
	* @return 四舍五入后的结果
	*/
	public static double round(double v, int scale) {
	   if (scale < 0) {
	    throw new IllegalArgumentException(
	      "The scale must be a positive integer or zero");
	   }
	   BigDecimal b = new BigDecimal(Double.toString(v));
	   BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	// 为传入的参数前面补指定的字符，如补0或者半角空格，补足n位前面补0到n位
	// param: 1.入力java格式字符串
	// return: 补足后的字符串
	public static String addStuffChar(String source,String stuff,int digit) {
		if (TH.isNull(source) || source.length() > digit) {
			return "";
		}
		String target = null;
		int strLen = source.length();
		StringBuffer addSpace = new StringBuffer();
		for (int i = 0; i < digit - strLen; i++) {
			addSpace.append(stuff);
		}
		target = addSpace + source;
		return target;
	}
	//add by Gavin 2015/03/25 end
	
	public static void main(String args[]) throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date dd = sdf.parse("1989-10-21");
//		System.out.println(dd);
		//int d = JDType.toDate(113254);
//		System.out.println(JDType.toDate(114321));
//		System.out.println(JDType.toDate(114321));
//		int theday = 112106;
//		Date d = JDType.toDate(theday);
//		System.out.println(TH.getDatePartFromTime(d));
		
		/********Test toTime*******/
		/*
		Date d = new Date();
		System.out.println(d);
		int dd = fromTime(d);
		System.out.println(dd);
		System.out.println(toTime(dd));
		*/
		
		/********Test Company*******/
		/*
		String str = "parker";
		String r = fromCompany(str);
		System.out.println(r);
		str = "wjz";
		r = fromCompany(str);
		System.out.println(r);
		r = toCompany(r);
		System.out.println(r);
		str = null;
		System.out.println(toCompany(str));
		*/
		
		/********Test MCU*******/
		/*
		String str = "parker1234567890";
		String r = fromMCU(str);
		System.out.println(r);
		str = "wjz";
		r = fromMCU(str);
		System.out.println(r);
		r = toMCU(r);
		System.out.println(r);
		str = null;
		System.out.println(toMCU(str));
		str = "123456789012";
		System.out.println(toMCU(str));
		*/
		
		/********Test UDC*******/
		/*
		String str = "parker1234567890";
		String r = fromUDC(str);
		System.out.println(r);
		str = "wjz";
		r = fromUDC(str,);
		System.out.println(r);
		r = toUDC(r);
		System.out.println(r);
		str = null;
		System.out.println(toUDC(str));
		str = "1234567890";
		System.out.println(toUDC(str));
		str = "  34567890";
		System.out.println(toUDC(str));
		*/
		
		System.out.println(addStuffChar("111","0",6));
	}
}
