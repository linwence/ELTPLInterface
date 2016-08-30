package com.el.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;



public class TH {
	
	public static void fillDefault(Object obj) throws Exception {  
		if (obj == null) return;
		
		Field[] f = obj.getClass().getDeclaredFields();
		
		String s;
		Long l;
		Integer i;
		for (int j = 0; j < f.length; ++j) {
			f[j].setAccessible(true);
			
			
			if (f[j].getType().getName().equals(String.class.getName())) {
				s = (String) f[j].get(obj);
				if (s == null || s.length() == 0)
					f[j].set(obj, " ");
			} 
			else if (f[j].getType().getName().equals(Long.class.getName())) {
				l = (Long) f[j].get(obj);
				if (l == null)
					f[j].setLong(obj, 0L);
			}
			else if (f[j].getType().getName().equals(Integer.class.getName())) {
				i = (Integer) f[j].get(obj);
				if (i == null)
					f[j].setLong(obj, 0);
			}
			
			f[j].setAccessible(false);
		}
		
	}
	
	public static String getRoundValue(double d, int bits) {
		long l = Math.round(d * (10 ^ bits));
		BigDecimal big = new BigDecimal(l);
		BigDecimal val = big.divide(new BigDecimal(10 ^ bits));
		return val.toString();
	}
	public static String getStr(String s){
		if(s == null){
			return "";
		}else{
			return s.trim();
		}
		
	}
	// 去除右边空格函数
	public static String rtrim(String input) {
		if (input == null) {
			return input;
		}
		int len = input.length();
		if (len == 0) {
			return input;
		}
		for (int i = len - 1; i > -1; i--) {
			String tmp = input.substring(i, i + 1);
			if (!(" ".equals(tmp))) {
				break;
			}
			len = i;
		}
		return input.substring(0, len);
	}
	
	// "yyyy-MM-dd"String转Date类型
	public static Date StringToDate(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date result = null;
		try {
			result =  format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
	
	public static String getString(String s)
	{
		if ( s== null)
			return "";
		else
			return s;
	}
	
	public static String getString2(String s) {
		if (s == null || "".equals(s))
			return " ";
		else
			return s;
	}
	
	public static int getInteger(Integer i)
	{
		if (i == null)
			return 0;
		else
			return i;
	}
	
	public static long getLong(Long l) {
		if (l == null)
			return 0L;
		else
			return l;
	}
	
	public static long getLong(BigDecimal b) {
		if (b == null)
			return 0L;
		long l = 0;
		try {
			l = b.longValue();
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0L;
		}
		return l;
	}
	
	public static double getDouble(Double d)
	{
		if (d == null)
			return 0.0d;
		else
			return d;
	}
	
	public static double getDouble(BigDecimal b) {
		if (b == null)
			return 0.0d;
		double d = 0.0d;
		try {
			d = b.doubleValue();
		} catch (Exception ex) {
			ex.printStackTrace();
			return 0.0d;
		}
		return d;
	}
	
	public static float getFloat(Float f)
	{
		if (f == null)
			return 0.0f;
		else
			return f;
	}
	
	public static double getDoublePart(double value, int bits)
	{
		long pon = 10 ^ bits;
		long val = ((long) value) * pon;
		
		double d = val / pon;
		return d;
	}
	
	public static String limitString(String s, int limit)
	{
		int len = s.length();
		if (len > limit)
		{
			return s.substring(0, limit - 1);
		}
		else
		{
			return s;
		}
	}
	
	public static String getBigStatus(String s)
	{
		String ret = null;
		if (s.equals("收到发货人预报") || s.equals("国外货代提货") ||
				s.equals("离港") || s.equals("到港"))
		{
			ret = "进境";
		}
				
		else if (s.equals("正本运单交接") || s.equals("开始进境申报") ||
				s.equals("报关行提货") || s.equals("货进仓库"))
		{
			ret = "保税";
		}		
				
		else if (s.equals("提货单号录入系统") || s.equals("海关大通关放行") ||
				s.equals("付税完成"))
		{
			ret = "征税";
		}	
		
		else if (s.equals("清关完成"))
		{
			ret = "完税";
		}
	
		return ret;
	}
	
	public static long getDayInterval(Date date1, Date date2)
	{
		GregorianCalendar cal1 = new GregorianCalendar();
		GregorianCalendar cal2 = new GregorianCalendar();
		cal1.setTime(date1);
		cal2.setTime(date2);
		
		long gap = (cal2.getTimeInMillis() - cal1.getTimeInMillis())/(1000*3600*24);
		
		if (gap < 0)
		{
			gap = -gap;
		}
		
		return gap;
	}
	
	public static double getDayIntervalWithPoint2(Date date1, Date date2)
	{
		GregorianCalendar cal1 = new GregorianCalendar();
		GregorianCalendar cal2 = new GregorianCalendar();
		cal1.setTime(date1);
		cal2.setTime(date2);
		
		double gap = (cal2.getTimeInMillis() - cal1.getTimeInMillis())/(1000*3600*24);
		
		if (gap < 0)
		{
			gap = -gap;
		}
		
		double ret = ((long) (gap * 100)) / 100;
		
		return ret;
	}
	
	public static String getStatusKey1()
	{
		return "Received in warehouse";
	}
	
	public static String getStatusKey2()
	{
		return "Customs Delivery Note ready";
	}
	
	public static String getStatusKey3()
	{
		return "Customs clearance finished";
	}
	
	public static List<String> getFileNamesInFolder(String path)
	{
		List<String> paths = new ArrayList<String>();
		
		File dir = new File(path);
		String[] names = dir.list();
		
		for (String s : names)
		{
			paths.add(s);
		}
		
		return paths;
	}
	
	public static String getDatePartFromTime(Date d)
	{
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int day = d.getDate();
		
		return String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(day);
	}
	
	public static String getStringForNow()
	{
		Date now = new Date();
		
		int year = now.getYear() + 1900;
		int month = now.getMonth() + 1;
		int day = now.getDate();
		
		int hour = now.getHours();
		int minute = now.getMinutes();
		int second = now.getSeconds();
		
		return Integer.toString(year) + Integer.toString(month) + Integer.toString(day) +
			Integer.toString(hour) + Integer.toString(minute) + Integer.toString(second);
	}
	
   public static void copyFile(String sourceFile, String targetFile) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;
        try {

            inBuff = new BufferedInputStream(new FileInputStream(new File(sourceFile)));

            outBuff = new BufferedOutputStream(new FileOutputStream(new File(targetFile)));

            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }

            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }
    }
   
   public static int getWeekDay(Date dt)
   {
	   // weeday = 0: sunday, weeday = 6, saturday
	   Calendar cal = Calendar.getInstance();
	   cal.setTime(dt);
	   int w = cal.get(cal.DAY_OF_WEEK) - 1;
	   return w;
   }
   
   public static int getDaysOfYear(Date dt)
   {
	   // weeday = 0: sunday, weeday = 6, saturday
	   Calendar cal = Calendar.getInstance();
	   cal.setTime(dt);
	   int w = cal.get(cal.DAY_OF_YEAR);
	   return w;
   }
   
   public static Date getNextDay(Date dt)
   {
	   Calendar calendar = Calendar.getInstance();
	   calendar.setTime(dt);
//	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   calendar.add(Calendar.DATE, 1);
	   Date date = calendar.getTime();
	   
	   return date;
   }
   
   public static Date parseLongDate(String s)
   {
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date d;
	   try {
		   d = format.parse(s);
	   } catch (Exception ex) {
		   d = new Date();
	   }
	   
	   return d;
   }
   
   public static Date addDays(Date dt, int days)
   {
	   Calendar calendar = Calendar.getInstance();
	   calendar.setTime(dt);
//	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   calendar.add(Calendar.DATE, days);
	   Date date = calendar.getTime();
	   
	   return date;
   }
   
   public static String formatJdeDate(Date dt)
   {
	   SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	   return sdf.format(dt);
   }
   
   public static String formatShortDate(Date dt)
   {
	   SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy");
	   return sdf.format(dt);
   }
   
   public static String formatMidDate(Date dt)
   {
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:MM:ss");
	   return sdf.format(dt);
   }
   
   public static Date getNextMonth(Date dt)
   {
	   Calendar calendar = Calendar.getInstance();
	   calendar.setTime(dt);
//	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   calendar.add(Calendar.MONTH, 1);
	   Date date = calendar.getTime();
	   
	   return date;
   }
   
   public static boolean doesYMDPartEqual(Date d1, Date d2)
   {
	   if (d1.getYear() == d2.getYear() &&
			   d1.getMonth() == d2.getMonth() &&
			   d1.getDate() == d2.getDate())
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   
   public static int getWeekendCount(Date start, Date end)
   {
	   Date cur = start;
	   int weekday;
	   int count = 0;
	   
	   Date d;
	   if (start.getTime() > end.getTime())
	   {
		   d = start;
		   start = end;
		   end = d;
	   }
	   
	   while(! TH.doesYMDPartEqual(cur, end))
	   {
		   weekday = TH.getWeekDay(cur);
		   
		   if (weekday == 6 || weekday == 0)
		   {
			   ++count;
		   }
		   
		   cur = TH.getNextDay(cur);
	   }
	   
	   weekday = TH.getWeekDay(end);
	   
	   if (weekday == 6 || weekday == 0)
	   {
		   count++;
	   }
	   
	   return count;
   }
   
   public static BigDecimal getBigValue(double val) {
	   BigDecimal bigBase = new BigDecimal(val * 100);
	   bigBase.setScale(0, BigDecimal.ROUND_HALF_UP);
	   bigBase = bigBase.divide(new BigDecimal(100));
	   return bigBase;
   }
   
   public static String getBigString(double val) {
	   BigDecimal bigBase = new BigDecimal(val * 100);
	   bigBase.setScale(0, BigDecimal.ROUND_HALF_UP);
	   bigBase = bigBase.divide(new BigDecimal(100));
	   DecimalFormat df = new DecimalFormat("#.00");
	   String big1 = df.format(bigBase);
	   return big1;
   }
   
   public static String getMonthStringById(int month)
   {
	   switch(month)
	   {
	   case 1: return "JAN";
	   case 2: return "FEB"; 
	   case 3: return "MAR"; 
	   case 4: return "APR";
	   case 5: return "MAY";
	   case 6: return "JUN";
	   case 7: return "JUL";
	   case 8: return "AUG";
	   case 9: return "SEP";
	   case 10: return "OCT";
	   case 11: return "NOV";
	   case 12: return "DEC";
	   default: return "JAN"; 
	   }
   }
   
   public static double get2Little(double value)
   {
	   DecimalFormat df = new DecimalFormat("0.00");
	   String db = df.format(value);
	   return Double.valueOf(db);
   }
   
   public static double get3Little(double value)
   {
	   DecimalFormat df = new DecimalFormat("0.000");
	   String db = df.format(value);
	   return Double.valueOf(db);
   }
   
   public static String get3LittleString(double value)
   {
	   DecimalFormat df = new DecimalFormat("###,##0.000");
	   return df.format(value);
   }
   
   /**
    * 格式Double 
    * formate 0.00
    * @return String value
    */
   public static String get2LittleString(double value)
   {
	   DecimalFormat df = new DecimalFormat("###,##0.00");
	   return df.format(value);
   }
   
   public static double get4Little(double value)
   {
	   DecimalFormat df = new DecimalFormat("0.0000");
	   String db = df.format(value);
	   return Double.valueOf(db);
   }
   
	public static boolean isNull(String str) {
		String string = str;
		if (str == null)
			string = "";
		if (string.equals("")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String getRandomVaue(int digitNum) {
		String ret = "";
		for (int i =0; i < digitNum; ++i) {
			Random r = new Random();
			ret += String.valueOf(r.nextInt(10));
		}
		return ret;
	}
    
	public static void main(String[] args)
	{
//		String a = " abc ";
//		String b = "abc";
//		String c = "a b";
//		System.out.println(rtrim(a));
//		System.out.println(rtrim(b));
//		System.out.println(rtrim(c));
//		System.out.println(rtrim(""));
//		System.out.println(rtrim(" "));
//		System.out.println(rtrim(null));
//		TH.getFileNamesInFolder("c:\\");
		
//		Date now = new Date();
//		String nowDate = TH.getDatePartFromTime(now);
//		System.out.println(nowDate);
//		
//		Date d = new Date("2012/9/1");
//		int day = TH.getWeekDay(d);
//		System.out.println(day);
//		
//		Date d2 = new Date("2012/9/5");
//		long diff = TH.getDayInterval(d, d2);
//		System.out.println(diff);
		
//		String ran = TH.getRandomVaue(4);
//		System.out.println(ran);
		
//		F58h0401 f = new F58h0401();
//		f.setChdoco(5L);
//		f.setChdcto("DB");
//		try {
//			TH.fillDefault(f);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		System.out.println(f.getChukid());
		
//		int val = (int)Math.ceil(JDType.div(110.35 * 100, 111*100,4));
//		System.out.println(Math.ceil(JDType.div(110.35, 110,3)));
//		System.out.println((JDType.div(110.35, 110,3)));
//		System.out.println((JDType.div(110.35, 110,2)));
//		System.out.println((JDType.div(110.35 * 100, 110.34*100,4)));
//		System.out.println(val);
//		String ss = "a,b,c";
//		String m[] = ss.split(",");
//		System.out.println(m[2]);
//		System.out.println(m.length);
//		System.out.println(Double.valueOf(Math.round(10.23556 * 1  * 100)));
//		double aexpTemp = Double.valueOf(Math.round(10.1 * 1 * 100));
//		System.out.println(Double.valueOf(Math.round(10.1 * 1  * 100)));
//		System.out.println(aexpTemp);
//		double aexpTemp1 = Double.valueOf(Math.round(10.1 * 1 * 100));
//		System.out.println(aexpTemp1);
//		String first[] = {"a","b"};
//		String second[] = {"a1","b1"};
//		String three[] = {"c","cc"};
//		String[] both = concatAll(first, second,three);
//		for  (String s:both){
//			System.out.println(s);
//		}
		long uorg = 24;
		double price  = 4.9;
		double aexpTemp =  Double.valueOf(Math.round(price *uorg*100));
		System.out.println(aexpTemp);
	}
	
	public static long multiply(double f1, int f2) {
		double d1_100 = f1 * 100;
		long val = Math.round(d1_100);
		
		if (f2 == 100)
			return val;
		else if (f2 == 10000)
			return val * 100L;
		else 
			return -1;
	}
	/**
	 * mcu是12位长度 . 不够就在前面加空格
	 * @param mcu
	 * @return
	 */
	public static String addSpceMcu( String mcu ){
		String m = mcu.trim() ;
		for( int i = m.length() ; i < 12 ; i++ ){
			m = " " + m ;
		}
		return m ;
	}
	
	//eidtor by magical 2014-10-31
	/**
	 * 两个DOUBLE类型的数据相加
	 * @param v1
	 * @param v2
	 * @return double
	 */
	public static double add(double v1,double v2){   
		BigDecimal b1 = new BigDecimal(Double.toString(v1));   
		BigDecimal b2 = new BigDecimal(Double.toString(v2));   
		return b1.add(b2).doubleValue();   
	} 
	//end by magical

	/**
	 * lisefo : 圆整金额精度. 
	 * @param inputNumber 	需要圆整的金额数据
	 * @param yzType		定义价格的圆整金额位数，1=元，2=角，3=分
	 * 返回String类型. 得到String类型后将其转化为Double类型
	 */
	public static String roundBit( Double inputNumber , Integer yzType ){
		Integer byNumber = null;
		if( yzType == null ){
			yzType = 2;
		}
		switch(yzType)
		{
		case 1:
			byNumber=1;
			break;
		case 2:
			byNumber=10;
			break;
		case 3:
			byNumber=100;
			break;
		default:
			return "0";
		}
		return Math.round(inputNumber*byNumber)/byNumber+"";
	}
	/**
	* 提供精确的乘法运算。
	* @param v1 被乘数
	* @param v2 乘数
	* @return 两个参数的积
	*/
	public static double mul(double v1, double v2) {
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return b1.multiply(b2).doubleValue();
	}
	public static double getRoundForDouble(double d, int bits) {
		BigDecimal bg = new BigDecimal(d);
		return bg.setScale(bits, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * gavin : 圆整金额精度. 
	 * @param inputNumber 	需要圆整的金额数据
	 * @param roundType		定义价格的圆整金额位数，1=元，2=角，3=分
	 * 01 四舍五入到元
	 * 02 四舍五入到角
	 * 03 四舍五入到分
	 * 04 向上取整到元
	 * 05 向上取整到角
	 * 06 向上取整到分
	 * 07 向下取整到元
	 * 08 向下取整到角
	 * 09 向下取整到分
	 * 返回String类型. 得到String类型后将其转化为Double类型
	 * 2015/05/19
	 */
	// 根据圆整规则，返回取整后的数。
	public static double doRoundEx(double e58tsua,String roundType) {
		double zheng = 0.00d;
		switch (roundType){
			case Constant.RETAIL_ROUND_RULE_01:
					zheng = TH.getRoundForDouble(e58tsua,0);
				break;
			case Constant.RETAIL_ROUND_RULE_02:
				zheng = TH.getRoundForDouble(e58tsua,1);
				break;
			case Constant.RETAIL_ROUND_RULE_03:
				zheng = TH.getRoundForDouble(e58tsua,2);
				break;
			case Constant.RETAIL_ROUND_RULE_04:
				if (e58tsua > 0) {
					// 圆整到元
					zheng = Math.ceil(e58tsua);
				} else {
					zheng = Math.floor(e58tsua);
				}
				break;
			case Constant.RETAIL_ROUND_RULE_05:
				if (e58tsua > 0) {
					// 圆整到角 
					zheng = new BigDecimal(String.valueOf(Math.ceil(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(10))).doubleValue()))).divide(new BigDecimal(String.valueOf(10))).doubleValue();
					
				} else {
					//zheng = Math.ceil(e58tsua * 10) / 10;
					zheng = new BigDecimal(String.valueOf(Math.floor(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(10))).doubleValue()))).divide(new BigDecimal(String.valueOf(10))).doubleValue();
				}
				break;
			case Constant.RETAIL_ROUND_RULE_06:
				if (e58tsua > 0) {
					// 圆整到分
					zheng = new BigDecimal(String.valueOf(Math.ceil(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(100))).doubleValue()))).divide(new BigDecimal(String.valueOf(100))).doubleValue();
				} else {
					//zheng = Math.ceil(e58tsua * 10) / 10;
					zheng = new BigDecimal(String.valueOf(Math.floor(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(100))).doubleValue()))).divide(new BigDecimal(String.valueOf(100))).doubleValue();
				}
				break;
			case Constant.RETAIL_ROUND_RULE_07:
				if (e58tsua > 0) {
					// 圆整到元
					zheng = Math.floor(e58tsua);
				} else {
					zheng = Math.ceil(e58tsua);
				}
				break;
			case Constant.RETAIL_ROUND_RULE_08:
				if (e58tsua > 0) {
					// 圆整到角 
					zheng = new BigDecimal(String.valueOf(Math.floor(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(10))).doubleValue()))).divide(new BigDecimal(String.valueOf(10))).doubleValue();
				} else {
					//zheng = Math.ceil(e58tsua * 10) / 10;
					zheng = new BigDecimal(String.valueOf(Math.ceil(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(10))).doubleValue()))).divide(new BigDecimal(String.valueOf(10))).doubleValue();
				}
				break;
			case Constant.RETAIL_ROUND_RULE_09:
				if (e58tsua > 0) {
					// 圆整到分
					zheng = new BigDecimal(String.valueOf(Math.floor(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(100))).doubleValue()))).divide(new BigDecimal(String.valueOf(100))).doubleValue();
				} else {
					//zheng = Math.ceil(e58tsua * 10) / 10;
					zheng = new BigDecimal(String.valueOf(Math.ceil(new BigDecimal(String.valueOf(e58tsua)).
							multiply(new BigDecimal(String.valueOf(100))).doubleValue()))).divide(new BigDecimal(String.valueOf(100))).doubleValue();
				}
				break;
			default:
		}
		System.out.print(roundType);
		System.out.println("zheng:" + zheng);
		// 更新表头信息,应收总金额,整单折让金额，订单总状态
		
		return zheng;
	}
	
	/***
	 * 两个数组合并的通用函数
	 * **/
	public static <T> T[] concat(T[] first, T[] second) {
		  T[] result = Arrays.copyOf(first, first.length + second.length);
		  System.arraycopy(second, 0, result, first.length, second.length);
		  return result;
	} 
	
	/***
	 * 多个数组合并的通用函数
	 * */
	public static <T> T[] concatAll(T[] first, T[]... rest) {
		  int totalLength = first.length;
		  for (T[] array : rest) {
		    totalLength += array.length;
		  }
		  T[] result = Arrays.copyOf(first, totalLength);
		  int offset = first.length;
		  for (T[] array : rest) {
		    System.arraycopy(array, 0, result, offset, array.length);
		    offset += array.length;
		  }
		  return result;
		}
}
