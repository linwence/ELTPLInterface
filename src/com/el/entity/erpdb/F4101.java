package com.el.entity.erpdb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "F4101")
public class F4101 {

	private int IMITM;
	private String IMLITM;
	private String IMDSC1;
	
	@Id
	public int getIMITM() {
		return IMITM;
	}

	public void setIMITM(int iMITM) {
		IMITM = iMITM;
	}

	public String getIMLITM() {
		return IMLITM;
	}

	public void setIMLITM(String iMLITM) {
		IMLITM = iMLITM;
	}

	public String getIMDSC1() {
		return IMDSC1;
	}

	public void setIMDSC1(String iMDSC1) {
		IMDSC1 = iMDSC1;
	}


}
