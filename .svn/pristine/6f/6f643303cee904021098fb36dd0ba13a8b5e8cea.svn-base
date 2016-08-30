package com.el.action.distribution.reponseModel;

import java.util.TreeMap;

/**
 * 支付信息
 */
public class PaymentModel {
	private String typeid;//支付方式类型
	private String typename;//支付方式
	private String money;//支付金额
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public PaymentModel(String typeid, String typename, String money) {
		super();
		this.typeid = typeid;
		this.typename = typename;
		this.money = money;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("typeid", typeid);
		map.put("typename", typename);
		map.put("money", money);
		return map;
	}
}
