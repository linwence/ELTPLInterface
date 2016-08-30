package com.el.util;

import java.util.Calendar;
import java.util.Date;


public class CalculateJulianCalendar {

	/**
	 * 根据传入的日期计算儒略历
	 * @param date
	 * @return
	 */
	public static int CalculateJulian(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// SELECT TO_CHAR(TO_DATE('&a', 'yyyy-mm-dd'), 'yyyy') * 1000 +
		// TO_CHAR(TO_DATE('&a', 'yyyy-mm-dd'), 'ddd') - 1900000 JULIAN
		// FROM DUAL
		int i = cal.get(Calendar.YEAR) * 1000 + cal.get(Calendar.DAY_OF_YEAR)
				- 1900000;

		return i;
	}

	public static void main(String[] args) {
		Date d = new Date();
		int i = CalculateJulianCalendar.CalculateJulian(d);
		System.out.println(i);
	}
}
