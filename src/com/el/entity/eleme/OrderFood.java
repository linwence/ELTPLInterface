package com.el.entity.eleme;

import java.math.BigDecimal;
import java.util.List;

public class OrderFood {

	public OrderFood() {
		// TODO Auto-generated constructor stub
	}

	private int category_id; // 1,
	private String name;// ": "狗不理",

	private BigDecimal price;// 100,
	/**
	 * garnish就是浇头，可以添加到食物里，比如点一个荷包蛋，加到炒饭这个food的garnish里
	 */
	private List<OrderGarnish> garnish;//
	private int id;// 1,
	private BigDecimal quantity;// ": 1,
	private int tp_food_id;// "1312313"
	/**
	 * :["辣","大份"]
	 */
	private List<String> specs;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public List<OrderGarnish> getGarnish() {
		return garnish;
	}
	public void setGarnish(List<OrderGarnish> garnish) {
		this.garnish = garnish;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public int getTp_food_id() {
		return tp_food_id;
	}
	public void setTp_food_id(int tp_food_id) {
		this.tp_food_id = tp_food_id;
	}
	public List<String> getSpecs() {
		return specs;
	}
	public void setSpecs(List<String> specs) {
		this.specs = specs;
	}

}
