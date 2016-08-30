package com.el.entity.meituan;

public class OrderDetail {
	private String app_food_code;// 1,
	private String food_name;// "狗不理",
	private String sku_id;// "1",
	private long quantity;// 6,

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	private double price;// 100,

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String box_num;// 2,
	private String box_price;// 1,
	private String unit;// "份",
	private String food_discount;// 0.8
									// (菜品折扣，只是美团商家、APP方配送的门店才会设置，默认为1。折扣值不参与总价计算。开放平台1.0.3
									// 新增)},

	public String getApp_food_code() {
		return app_food_code;
	}

	public void setApp_food_code(String app_food_code) {
		this.app_food_code = app_food_code;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public String getSku_id() {
		return sku_id;
	}

	public void setSku_id(String sku_id) {
		this.sku_id = sku_id;
	}

	public String getBox_num() {
		return box_num;
	}

	public void setBox_num(String box_num) {
		this.box_num = box_num;
	}

	public String getBox_price() {
		return box_price;
	}

	public void setBox_price(String box_price) {
		this.box_price = box_price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getFood_discount() {
		return food_discount;
	}

	public void setFood_discount(String food_discount) {
		this.food_discount = food_discount;
	}

}
