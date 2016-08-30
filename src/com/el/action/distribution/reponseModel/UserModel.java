package com.el.action.distribution.reponseModel;

import java.util.TreeMap;

/**
 * 收货人信息
 */
public class UserModel {
	private String alph;//收货人姓名
	private String ph1;//收货人电话
	private int gender;//性别 1男;2女
	private String doe58madd;//送货地址
	public String getAlph() {
		return alph;
	}
	public void setAlph(String alph) {
		this.alph = alph;
	}
	public String getPh1() {
		return ph1;
	}
	public void setPh1(String ph1) {
		this.ph1 = ph1;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getDoe58madd() {
		return doe58madd;
	}
	public void setDoe58madd(String doe58madd) {
		this.doe58madd = doe58madd;
	}
	public UserModel(String alph, String ph1, int gender, String doe58madd) {
		super();
		this.alph = alph;
		this.ph1 = ph1;
		this.gender = gender;
		this.doe58madd = doe58madd;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("alph", alph);
		map.put("ph1", ph1);
		map.put("gender", gender);
		map.put("doe58madd", doe58madd);
		return map;
	}
}
