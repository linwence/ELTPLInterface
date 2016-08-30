package com.el.action.distribution.reponseModel;

import java.util.TreeMap;

/**
 * 配送商品信息
 */
public class ProductModel {
	private String lnid;//行号
	private String itm;//商品编码
	private String dsc1;//商品名称
	private String uorg;//商品数量
	private String uom;//计量单位
	private String price;//单价
	private String totalmoney;//单行总价
	public String getLnid() {
		return lnid;
	}
	public void setLnid(String lnid) {
		this.lnid = lnid;
	}
	public String getItm() {
		return itm;
	}
	public void setItm(String itm) {
		this.itm = itm;
	}
	public String getDsc1() {
		return dsc1;
	}
	public void setDsc1(String dsc1) {
		this.dsc1 = dsc1;
	}
	public String getUorg() {
		return uorg;
	}
	public void setUorg(String uorg) {
		this.uorg = uorg;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(String totalmoney) {
		this.totalmoney = totalmoney;
	}
	public ProductModel(String lnid, String itm, String dsc1, String uorg,
			String uom, String price, String totalmoney) {
		super();
		this.lnid = lnid;
		this.itm = itm;
		this.dsc1 = dsc1;
		this.uorg = uorg;
		this.uom = uom;
		this.price = price;
		this.totalmoney = totalmoney;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("lnid", lnid);
		map.put("itm", itm);
		map.put("dsc1",dsc1);
		map.put("uorg",uorg);
		map.put("uom",uom);
		map.put("price",price);
		map.put("totalmoney",totalmoney);
		return map;
	}
}
