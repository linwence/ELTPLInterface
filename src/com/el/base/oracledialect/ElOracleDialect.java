package com.el.base.oracledialect;

import org.hibernate.dialect.Oracle10gDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.IntegerType;

public class ElOracleDialect extends Oracle10gDialect {

	public ElOracleDialect() {
		// TODO Auto-generated constructor stub
		super();
		// 函数名必须是小写，试验大写出错
		// SQLFunctionTemplate函数第一个参数是函数的输出类型，varchar2对应new StringType()
		// number对应new IntegerType()
		// ?1代表第一个参数,?2代表第二个参数
		this.registerFunction("f_get_atp", new SQLFunctionTemplate(new IntegerType(), "f_get_atp(?1,?2)"));
	 
	}

}
