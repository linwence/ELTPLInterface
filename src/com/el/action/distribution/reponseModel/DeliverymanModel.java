package com.el.action.distribution.reponseModel;

import java.util.TreeMap;

/**
 * 配送员信息
 */
public class DeliverymanModel {
	private String urrf;//配送员 ID
	private String urrfalph;//配送员姓名
	private String urrfphone;//配送员电话
	public String getUrrf() {
		return urrf;
	}
	public void setUrrf(String urrf) {
		this.urrf = urrf;
	}
	public String getUrrfalph() {
		return urrfalph;
	}
	public void setUrrfalph(String urrfalph) {
		this.urrfalph = urrfalph;
	}
	public String getUrrfphone() {
		return urrfphone;
	}
	public void setUrrfphone(String urrfphone) {
		this.urrfphone = urrfphone;
	}
	public DeliverymanModel(String urrf, String urrfalph, String urrfphone) {
		super();
		this.urrf = urrf;
		this.urrfalph = urrfalph;
		this.urrfphone = urrfphone;
	}
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("urrf", urrf);
		map.put("urrfalph", urrfalph);
		map.put("urrfphone", urrfphone);
		return map;
	}
}
