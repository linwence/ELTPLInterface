package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="F41021")
public class F41021PK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="liitm")
	private Long liitm;

	@Column(name="limcu")
	private String limcu;

	@Column(name="lilocn")
	private String lilocn;

	@Column(name="lilotn")
	private String lilotn;//批次

	public F41021PK() {
	}

	public Long getLiitm() {
		return liitm;
	}

	public void setLiitm(Long liitm) {
		this.liitm = liitm;
	}

	public String getLimcu() {
		return limcu;
	}

	public void setLimcu(String limcu) {
		this.limcu = limcu;
	}

	public String getLilocn() {
		return lilocn;
	}

	public void setLilocn(String lilocn) {
		this.lilocn = lilocn;
	}

	public String getLilotn() {
		return lilotn;
	}

	public void setLilotn(String lilotn) {
		this.lilotn = lilotn;
	}

}