package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
/*
 * 付款方式主键表
 */
@Embeddable
@Table(name="FE4PT001")
public class FE4PT001PK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ptdoco")
	private Long ptdoco;

	@Column(name = "ptdcto")
	private String ptdcto;
	
	@Column(name = "ptkcoo")
	private String ptkcoo;

	/*
	 * 付款方式
	 */
	@Column(name = "pte58pt")
	private String pte58pt;

	public String getPte58pt() {
		return pte58pt;
	}

	public void setPte58pt(String pte58pt) {
		this.pte58pt = pte58pt;
	}

	public FE4PT001PK() {
	}

	public Long getPtdoco() {
		return ptdoco;
	}

	public void setPtdoco(Long ptdoco) {
		this.ptdoco = ptdoco;
	}

	public String getPtdcto() {
		return ptdcto;
	}

	public void setPtdcto(String ptdcto) {
		this.ptdcto = ptdcto;
	}

	public String getPtkcoo() {
		return ptkcoo;
	}

	public void setPtkcoo(String ptkcoo) {
		this.ptkcoo = ptkcoo;
	}

}
