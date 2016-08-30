package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Fe147107Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class Fe147107Id implements java.io.Serializable {

	// Fields

	private BigDecimal maukid;
	private String mae58hedid;
	private BigDecimal malnic;

	// Constructors

	/** default constructor */
	public Fe147107Id() {
	}

	/** full constructor */
	public Fe147107Id(BigDecimal maukid, String mae58hedid, BigDecimal malnic) {
		this.maukid = maukid;
		this.mae58hedid = mae58hedid;
		this.malnic = malnic;
	}

	// Property accessors

	@Column(name = "MAUKID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getMaukid() {
		return this.maukid;
	}

	public void setMaukid(BigDecimal maukid) {
		this.maukid = maukid;
	}

	@Column(name = "MAE58HEDID", nullable = false)
	public String getMae58hedid() {
		return this.mae58hedid;
	}

	public void setMae58hedid(String mae58hedid) {
		this.mae58hedid = mae58hedid;
	}

	@Column(name = "MALNIC", nullable = false, precision = 22, scale = 0)
	public BigDecimal getMalnic() {
		return this.malnic;
	}

	public void setMalnic(BigDecimal malnic) {
		this.malnic = malnic;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Fe147107Id))
			return false;
		Fe147107Id castOther = (Fe147107Id) other;

		return ((this.getMaukid() == castOther.getMaukid()) || (this
				.getMaukid() != null && castOther.getMaukid() != null && this
				.getMaukid().equals(castOther.getMaukid())))
				&& ((this.getMae58hedid() == castOther.getMae58hedid()) || (this
						.getMae58hedid() != null
						&& castOther.getMae58hedid() != null && this
						.getMae58hedid().equals(castOther.getMae58hedid())))
				&& ((this.getMalnic() == castOther.getMalnic()) || (this
						.getMalnic() != null && castOther.getMalnic() != null && this
						.getMalnic().equals(castOther.getMalnic())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMaukid() == null ? 0 : this.getMaukid().hashCode());
		result = 37
				* result
				+ (getMae58hedid() == null ? 0 : this.getMae58hedid()
						.hashCode());
		result = 37 * result
				+ (getMalnic() == null ? 0 : this.getMalnic().hashCode());
		return result;
	}

}