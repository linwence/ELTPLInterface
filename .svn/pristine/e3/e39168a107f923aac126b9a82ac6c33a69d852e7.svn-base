package com.el.action.distribution.reponseModel;

import java.util.TreeMap;

/**
 * 站点信息
 */
public class ShopModel {
	private String mcu;//站点 ID
	private String mcudesc;//站点名称
	public String getMcu() {
		return mcu;
	}
	public void setMcu(String mcu) {
		this.mcu = mcu;
	}
	public String getMcudesc() {
		return mcudesc;
	}
	public void setMcudesc(String mcudesc) {
		this.mcudesc = mcudesc;
	}
	public ShopModel(String mcu, String mcudesc) {
		super();
		this.mcu = mcu;
		this.mcudesc = mcudesc;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("mcu", mcu);
		map.put("mcudesc", mcudesc);
		return map;
	}
	
}
