package com.el.util;

public class Constant
{
		//01	四舍五入到圆
		public static final  String RETAIL_ROUND_RULE_01 = "01";
		//02	四舍五入到角
		public static final  String RETAIL_ROUND_RULE_02 = "02";
		//03	四舍五入到分
		public static final  String RETAIL_ROUND_RULE_03 = "03";
		//04	向上取整到圆
		public static final  String RETAIL_ROUND_RULE_04 = "04";
		//05	向上取整到角
		public static final  String RETAIL_ROUND_RULE_05 = "05";
		//06	向上取整到分
		public static final  String RETAIL_ROUND_RULE_06 = "06";
		//07 向下取整到圆
		public static final  String RETAIL_ROUND_RULE_07 = "07";
		//08	向下取整到角
		public static final  String RETAIL_ROUND_RULE_08 = "08";
		//09	向下取整到分
		public static final  String RETAIL_ROUND_RULE_09 = "09";
		public static final  int BC_LENGTH = 9;
		public static final  int BOX_LENGTH = 8;
		public static final  int TRAY_LENGTH = 7;
		/**4位小数位数*/
		public static final int AMOUNT_DECIMAL = 4;
		/**数量4位小数位数*/
		public static final int QUANTITY_DECIMAL_DIGIT_4 = 3;
		/**数量3位小数位数*/
		public static final int QUANTITY_DECIMAL_DIGIT_3 = 3;		
		/**数量2位小数位数*/
		public static final int QUANTITY_DECIMAL_DIGIT_2 = 2;
		/**单价小数位数*/
		public static final int PRICE_DECIMAL_DIGIT = 4;
		/**5位小数位数*/
		public static final int PRICE_DECIMAL_DIGIT_5 = 5;
		/**金额小数位数*/
		public static final int AMOUNT_DECIMAL_DIGIT = 2;
		/**行号*/
		public static final int LNID_AMOUNT_DECIMAL_DIGIT = 3;
		/***E58HUF05 = 2 开单数量校验可供量*/
		public static final int AMOUNT_VERIFICATION_TRQT = 2;
		/***E58HUF05 = 1 开单数量校验现有量*/
		public static final int AMOUNT_VERIFICATION_PQOH = 1;
		/***E58HUF05 = 0 开单数量不校验*/
		public static final int AMOUNT_VERIFICATION_NONE = 0;
		/***默认的短信校验会员级别 = 2 */
		public static final int  SMS_MEMBER_LEVEL_DEFAULT = 2;
		/***默认的短信校验码位数 = 6 */
		public static final int  SMS_MEMBER_DIGIT_DEFAULT = 6;
		/***填充的字符  0 */
		public static final String  STUFF_CHAR_ZERO = "0";
		/***填充的字符  半角空格 */
		public static final String  STUFF_CHAR_SPECE = " ";		
		/***分割符, */
		public static final String  MASK_CHAR_COMMA = ",";
		/***分割符 */
		public static final String  MASK_CHAR_QUOTE = "'";	
		/***短信类型码 --会员消费 */
		public static final String	SMS_F58H0105_E58HMTNM_PAY = "1919_CS";
		/***短信类型码 --会员验证 */
		public static final String	SMS_F58H0105_E58HMTNM_VERIFY = "1919_XFYZ";
		/***字符常量Y */
		public static final String	CHAR_YES = "Y";
		/***字符常量N */
		public static final String	CHAR_NO = "N";	
		/***短信校验码 */
		public static final String	SESSION_V_MEMBER_SMS_CODE = "V_MEMBER_SMS_CODE";
		
		/***物流单状态标识别 0-取消*/
		public static final String	LOGISTIC_E58HUF04_UNDO = "0";	
		/***物流单状态标识别 1-待揽收*/
		public static final String	LOGISTIC_E58HUF04_DO = "1";	
		/***物流单状态标识别 2-揽收 */
		public static final String	LOGISTIC_E58HUF04_DONE = "2";		
		/***物流单母单标识别 1*/
		public static final String	LOGISTIC_E58HUF03_YES = "1";	
		/***物流单母单标识别 0-子单*/
		public static final String	LOGISTIC_E58HUF03_NO = "0";			
		
		//980	0411的e58hos
		public static final  String RETAIL_E58HOS_980 = "980";
		//运费的litm
		public static final  String RETAIL_FREIGHT_LITM = "9000011";
		
		/***物流公司UDC DRSY*/
		public static final String	LOGISTIC_UDC_AC15_DRSY = "01";	
		/***物流公司UDC DRRT*/
		public static final String	LOGISTIC_UDC_AC15_DRRT= "15";	
		/***物流公司UDC SPHD*/
		public static final String	LOGISTIC_UDC_AC15_SPHD= "EDI";
		
		/***增值服务-- 代收货款Code*/
		public static final String	LOGISTIC_SERVICE_COD= "COD";
		/***增值服务-- MSG Code*/
		public static final String	LOGISTIC_SERVICE_MSG= "MSG";
		/***增值服务-- 保价Code*/
		public static final String	LOGISTIC_SERVICE_INSURE= "INSURE";
		
		/***增值服务表名*/
		public static final String	LOGISTIC_TABLE_FE1DM25= "FE1DM25";
		
		
		/** * session变量名 start * **/
		/**保存JDE订单号**/
		public static final String SESSION_V_ORDER_DOCO = "V_ORDER_DOCO";
		/**开单时开单数量校验指定的比较值
		 * 1          --控制不超现有量
		 * 2          -- 控制不超可供量
		 * 0 or blank -- 不做控制
		 * **/
		public static final String SESSION_V_F58J0001_E58HUF05  = "V_F58J0001_E58HUF05";
		
		/** session变量名 end **/
		/**begin各模块PID**/
		public static final String PID_LOGISTICS = "JFE1DM22";
		public static final String PID_LOGISTICS_SERVICE = "JFE1DM25";
		/**end**/
}
