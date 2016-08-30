package com.el.entity.apporder;

import java.util.TreeMap;

public class Shop {

	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public  TreeMap<String, Object> toMap() {
		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("id", id);
		treeMap.put("name", name);
		return treeMap;
	}

}
