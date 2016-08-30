package com.el.entity.apporder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class OrderPay {

	public OrderPay() {
		// TODO Auto-generated constructor stub
	}

	private String order_id;
	List<Payment> payment;

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("order_id", order_id);
		List<Object> lstPayment = new ArrayList<Object>();
		for (Payment p : payment) {

			lstPayment.add(p.toMap());
		}
		treeMap.put("payment", lstPayment);
		return treeMap;
	}

}
