package com.el.entity.erpdb;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class F00022 {

	private String UKOBNM;
	private int UKUKID;
	
	@Id
	public String getUKOBNM() {
		return UKOBNM;
	}
	public void setUKOBNM(String uKOBNM) {
		UKOBNM = uKOBNM;
	}
	public int getUKUKID() {
		return UKUKID;
	}
	public void setUKUKID(int uKUKID) {
		UKUKID = uKUKID;
	}
	
}
