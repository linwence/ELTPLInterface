package com.el.entity.apporder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class OrderData {

	public OrderData() {
		// TODO Auto-generated constructor stub
	}

	private Order order;
	private Shop shop;
	private List<Product> products;
	private OrderInvoice invoice;
	private OrderUser user;
	private List<OrderDiscount> discount;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public OrderInvoice getInvoice() {
		return invoice;
	}

	public void setInvoice(OrderInvoice invoice) {
		this.invoice = invoice;
	}

	public OrderUser getUser() {
		return user;
	}

	public void setUser(OrderUser user) {
		this.user = user;
	}

	public List<OrderDiscount> getDiscount() {
		return discount;
	}

	public void setDiscount(List<OrderDiscount> discount) {
		this.discount = discount;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("order", order.toMap());
		map.put("shop", shop);
		List<Object> lstProd=new ArrayList<Object>();
		for (Product p : products) {
			TreeMap<String, Object> pmap=p.toMap();
			pmap.put("product_printname", p.getProduct_printname());
			pmap.put("product_changerate", p.getProduct_changerate());
			lstProd.add(pmap);
		}
		map.put("products", lstProd);
		map.put("user", user.toMap());
		map.put("invoice", invoice.toMap());
		if (discount != null) {
			List<Object> lstDisc=new ArrayList<Object>();
			for (OrderDiscount d : discount) {
				lstDisc.add(d.toMap());
			}
			map.put("discount", lstDisc);
		}
		return map;
	}

}
