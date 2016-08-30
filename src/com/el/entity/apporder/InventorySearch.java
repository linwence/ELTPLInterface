package com.el.entity.apporder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class InventorySearch {

	public InventorySearch() {
		// TODO Auto-generated constructor stub
	}

	private Shop shop;
	private List<Product> products;

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public TreeMap<String, Object> toMap() {

		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("shop", shop.toMap());
		List<Object> lstProd = new ArrayList<Object>();
		for (Product p : products) {
			// p.toMap();
			TreeMap<String, Object> pTreeMap=p.toMap();
			pTreeMap.remove("product_amount");
			pTreeMap.remove("product_price");
			pTreeMap.remove("product_fee");
			lstProd.add(pTreeMap);
		}

		treeMap.put("products", lstProd);
		return treeMap;
	}

}
