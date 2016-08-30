package com.el.action.distribution.reponseModel;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
/**
 * 查询配送单数据的接口所使用的返回data类
 */
public class ReponseOrderData {
	private ShopModel shop;
	private DistributionModel distribution;
	private UserModel user;
	private List<PaymentModel> payment;
	private DeliverymanModel deliveryman;
	private List<ProductModel> products;
	public ShopModel getShop() {
		return shop;
	}
	public void setShop(ShopModel shop) {
		this.shop = shop;
	}
	public DistributionModel getDistribution() {
		return distribution;
	}
	public void setDistribution(DistributionModel distribution) {
		this.distribution = distribution;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public List<PaymentModel> getPayment() {
		return payment;
	}
	public void setPayment(List<PaymentModel> payment) {
		this.payment = payment;
	}
	public DeliverymanModel getDeliveryman() {
		return deliveryman;
	}
	public void setDeliveryman(DeliverymanModel deliveryman) {
		this.deliveryman = deliveryman;
	}
	public List<ProductModel> getProducts() {
		return products;
	}
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	public ReponseOrderData(ShopModel shop, DistributionModel distribution,
			UserModel user, List<PaymentModel> payment,
			DeliverymanModel deliveryman, List<ProductModel> products) {
		super();
		this.shop = shop;
		this.distribution = distribution;
		this.user = user;
		this.payment = payment;
		this.deliveryman = deliveryman;
		this.products = products;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("shop", shop.toMap());
		map.put("distribution", distribution.toMap());
		map.put("user", user.toMap());
		map.put("deliveryman", deliveryman.toMap());
		//payment
		List<TreeMap<String, Object>> mapList_payment = new ArrayList<TreeMap<String, Object>>();
		for(PaymentModel data : payment){
			mapList_payment.add(data.toMap());
		}
		map.put("payment", mapList_payment);
		//products
		List<TreeMap<String, Object>> mapList_products = new ArrayList<TreeMap<String, Object>>();
		for(ProductModel data : products){
			mapList_products.add(data.toMap());
		}
		map.put("products", mapList_products);
		return map;
	}
	
}
