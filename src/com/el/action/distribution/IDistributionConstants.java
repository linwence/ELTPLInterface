package com.el.action.distribution;

public interface IDistributionConstants {
	/*
	 * 单据的状态nxtr
	 */
	public static String NXTR_READY = "1";//活动待打印
	public static String NXTR_PRINT = "2";//打印
	public static String NXTR_PROCESS = "3";//加工
	public static String NXTR_RETURN = "4";//退回
	public static String NXTR_REMOVESTOCK = "5";//出库(待揽收)
	public static String NXTR_ASSIGN = "6";//分配配送员(已揽收)
	public static String NXTR_SIGNIN = "7";//签收
	public static String NXTR_REJECT = "8";//部分拒收
	public static String NXTR_REJECTALL = "9";//全单拒收
	
	/*
	 * 通过APP接口写入数据时，记录的用户名
	 */
	public static String APP_USER = "ELHELEN";
}
