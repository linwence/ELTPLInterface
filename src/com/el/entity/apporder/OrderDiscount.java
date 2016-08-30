package com.el.entity.apporder;

import java.util.TreeMap;

public class OrderDiscount {

	public OrderDiscount() {
		// TODO Auto-generated constructor stub
	}

	private String type;
	private int fee;
	private String desc;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public TreeMap<String, Object> toMap() {

		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("type", type);
		treeMap.put("fee", fee);
		treeMap.put("desc", desc);

		return treeMap;
	}
}
