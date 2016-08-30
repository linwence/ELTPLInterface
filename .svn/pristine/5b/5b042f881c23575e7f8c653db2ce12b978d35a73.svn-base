package com.el.util;

import java.util.Date;

/**
 * @author zhanglingman
 * @version 2015年6月3日
 *
 * @description 时间工具类
 */

public class MeiTuanTimeUtil {

	private MeiTuanTimeUtil() {

	}

	/**
	 * 获取当前时间的时间戳
	 * 
	 * @return
	 */
	public static int unixtime() {
		return ms2second(System.currentTimeMillis());
	}

	/**
	 * 获取传入日期的时间戳
	 * 
	 * @param date
	 * @return
	 */
	public static Date unixtime(Date date) {
		return new Date(System.currentTimeMillis());
	}

	public static int ms2second(long ms) {
		return (int) (ms / 1000);
	}
}
