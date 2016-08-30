package com.el.entity.apporder;

import java.util.TreeMap;

public class Inventory {

	private String product_id;
	private String product_name;
	private String qty;
	private String unit;

	public Inventory(String product_id, String product_name, String qty,
			String unit) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.qty = qty;
		this.unit = unit;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> m = new TreeMap<String, Object>();
		m.put("product_id", product_id);
		m.put("product_name", product_name);
		m.put("qty", qty);
		m.put("unit", unit);
		return m;
	}
}
