package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * F55wsd02Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class F55wsd02Id implements java.io.Serializable {

	// Fields

	private BigDecimal ihukid;
	private String ihe58hedid;
	private BigDecimal ihedln;

	// Constructors

	/** default constructor */
	public F55wsd02Id() {
	}

	/** full constructor */
	public F55wsd02Id(BigDecimal ihukid, String ihe58hedid, BigDecimal ihedln) {
		this.ihukid = ihukid;
		this.ihe58hedid = ihe58hedid;
		this.ihedln = ihedln;
	}

	// Property accessors

	@Column(name = "IHUKID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIhukid() {
		return this.ihukid;
	}

	public void setIhukid(BigDecimal ihukid) {
		this.ihukid = ihukid;
	}

	@Column(name = "IHE58HEDID", nullable = false)
	public String getIhe58hedid() {
		return this.ihe58hedid;
	}

	public void setIhe58hedid(String ihe58hedid) {
		this.ihe58hedid = ihe58hedid;
	}

	@Column(name = "IHEDLN", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIhedln() {
		return this.ihedln;
	}

	public void setIhedln(BigDecimal ihedln) {
		this.ihedln = ihedln;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof F55wsd02Id))
			return false;
		F55wsd02Id castOther = (F55wsd02Id) other;

		return ((this.getIhukid() == castOther.getIhukid()) || (this
				.getIhukid() != null && castOther.getIhukid() != null && this
				.getIhukid().equals(castOther.getIhukid())))
				&& ((this.getIhe58hedid() == castOther.getIhe58hedid()) || (this
						.getIhe58hedid() != null
						&& castOther.getIhe58hedid() != null && this
						.getIhe58hedid().equals(castOther.getIhe58hedid())))
				&& ((this.getIhedln() == castOther.getIhedln()) || (this
						.getIhedln() != null && castOther.getIhedln() != null && this
						.getIhedln().equals(castOther.getIhedln())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIhukid() == null ? 0 : this.getIhukid().hashCode());
		result = 37
				* result
				+ (getIhe58hedid() == null ? 0 : this.getIhe58hedid()
						.hashCode());
		result = 37 * result
				+ (getIhedln() == null ? 0 : this.getIhedln().hashCode());
		return result;
	}

}