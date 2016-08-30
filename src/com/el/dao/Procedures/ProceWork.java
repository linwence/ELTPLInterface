package com.el.dao.Procedures;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.jdbc.Work;

public abstract class ProceWork implements Work {

	private String proSql; // 存储过程语句
	private ResultSet rs = null; // 返回结果集
	private Object result = null; // 返回结果对象
	private Map pro = new HashMap(); // 存储过程涉及参数

	@Override
	public abstract void execute(Connection conn) throws SQLException;

	public ProceWork(String proSql, Object... params) {
		this.proSql = proSql;
		int i = 1;
		for (Object obj : params) {
			pro.put(i, obj);
			i++;
		}
	}

	public void setParams(Integer key, Object value) {
		pro.put(key, value);
	}

	public String getProSql() {
		return proSql;
	}

	public void setProSql(String proSql) {
		this.proSql = proSql;
	}

	public Object getParams(Integer key) {
		return pro.get(key);
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
	
	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
