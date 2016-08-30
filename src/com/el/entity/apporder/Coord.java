package com.el.entity.apporder;

import java.util.TreeMap;

public class Coord {
	private String longitude;// 是 送餐地址百度经度
	private String latitude;// 是 送餐地址百度纬度

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public TreeMap<String, Object> toMap() {

		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("longitude", longitude);
		treeMap.put("latitude", latitude);

		return treeMap;
	}

}
