package com.el.entity.baidu;

public class User {
	private String name;// 	 	是 	顾客姓名
	private String phone;// 	 	是 	顾客电话
	private int gender;// 	 	否 	顾客性别 1,男 2 女
	private String address; 	// 	是 	送餐地址
	//user.coord. longitude 	string 	是 	送餐地址百度经度
	//user.coord. latitude 	string 	是 	送餐地址百度纬度
	private Coord coord;
	//user.coord_amap. longitude 	string 	否 	送餐地址高德经度
	//user.coord_amap.latitude 	string 	否 	送餐地址高德纬度
	private CoordAmap coord_amap;//高德经纬度
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public CoordAmap getCoord_amap() {
		return coord_amap;
	}
	public void setCoord_amap(CoordAmap coord_amap) {
		this.coord_amap = coord_amap;
	}
	

}
