package com.el.entity.baidu;

import java.util.List;

/*
 * 百度外卖订单下单,对应body的实体
 */
public class OrderInfo {
	public OrderInfo(){
		System.out.println("orderinfo构造函数");
	}
	

	public OrderInfo(Shop shop, Order order, User user, List<Product> products,
			List<Discount> discount) {
		super();
		this.shop = shop;
		this.order = order;
		this.user = user;
		this.products = products;
		this.discount = discount;
	}


	private Shop shop;
	private Order order;
	private User user;
	private List<Product> products;
	private List<Discount>  discount;

	public List<Discount> getDiscount() {
		return discount;
	}


	public void setDiscount(List<Discount> discount) {
		this.discount = discount;
	}


	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	

}
