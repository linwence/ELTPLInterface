package com.el.entity.apporder;

import java.util.TreeMap;

public class Product {

	private String product_id;
	private String product_name;
	private int product_amount;// 是 份数
	private int product_price;// 是 商品价格，单位：分
	private int product_fee;// 是 商品总价，单位：分
	private String product_printname;//商品打印名称
	private int product_changerate;//商品转换比
	public Product() {

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

	public int getProduct_amount() {
		return product_amount;
	}

	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_fee() {
		return product_fee;
	}

	public void setProduct_fee(int product_fee) {
		this.product_fee = product_fee;
	}

	public String getProduct_printname() {
		return product_printname;
	}

	public void setProduct_printname(String product_printname) {
		this.product_printname = product_printname;
	}

	public int getProduct_changerate() {
		return product_changerate;
	}

	public void setProduct_changerate(int product_changerate) {
		this.product_changerate = product_changerate;
	}

	public TreeMap<String, Object> toMap() {

		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("product_id", product_id);
		treeMap.put("product_name", product_name);
		treeMap.put("product_amount", product_amount);
		treeMap.put("product_price", product_price);
		treeMap.put("product_fee", product_fee);
		return treeMap;
	}

}
