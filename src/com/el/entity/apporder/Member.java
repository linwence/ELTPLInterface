package com.el.entity.apporder;

import java.util.TreeMap;

public class Member {

	private String name;
	private int gender;
	private String phone;
	private String address;
	private String province;
	private String city;
	private String district;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public TreeMap<String, Object> toMap() {

		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("name", name);
		treeMap.put("gender", gender);
		treeMap.put("phone", phone);
		treeMap.put("address", address);
		treeMap.put("province", province);
		treeMap.put("city", city);
		treeMap.put("district", district);
		return treeMap;
	}
}
