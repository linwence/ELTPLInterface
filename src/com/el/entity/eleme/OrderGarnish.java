package com.el.entity.eleme;

import java.math.BigDecimal;
import java.util.List;

/**
 * 浇头类
 * 
 * @author Vincent
 * 
 */
public class OrderGarnish {

	public OrderGarnish() {
		// TODO Auto-generated constructor stub
	}

	private int category_id;
	private String name;// "荷包蛋",
	private BigDecimal price;// 2,
	private int id;// ": 1541313,
	private BigDecimal quantity;// ": 1,
	private int tp_food_id;// "1312313"
	private List<String> specs;

	public List<String> getSpecs() {
		return specs;
	}

	public void setSpecs(List<String> specs) {
		this.specs = specs;
	}

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

}
