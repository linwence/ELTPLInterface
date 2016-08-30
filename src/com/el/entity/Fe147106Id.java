package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Fe147106Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class Fe147106Id implements java.io.Serializable {

	// Fields

	private BigDecimal mmukid;
	private String mme58hedid;

	// Constructors

	/** default constructor */
	public Fe147106Id() {
	}

	/** full constructor */
	public Fe147106Id(BigDecimal mmukid, String mme58hedid) {
		this.mmukid = mmukid;
		this.mme58hedid = mme58hedid;
	}

	// Property accessors

	@Column(name = "MMUKID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getMmukid() {
		return this.mmukid;
	}

	public void setMmukid(BigDecimal mmukid) {
		this.mmukid = mmukid;
	}

	@Column(name = "MME58HEDID", nullable = false)
	public String getMme58hedid() {
		return this.mme58hedid;
	}

	public void setMme58hedid(String mme58hedid) {
		this.mme58hedid = mme58hedid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Fe147106Id))
			return false;
		Fe147106Id castOther = (Fe147106Id) other;

		return ((this.getMmukid() == castOther.getMmukid()) || (this
				.getMmukid() != null && castOther.getMmukid() != null && this
				.getMmukid().equals(castOther.getMmukid())))
				&& ((this.getMme58hedid() == castOther.getMme58hedid()) || (this
						.getMme58hedid() != null
						&& castOther.getMme58hedid() != null && this
						.getMme58hedid().equals(castOther.getMme58hedid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMmukid() == null ? 0 : this.getMmukid().hashCode());
		result = 37
				* result
				+ (getMme58hedid() == null ? 0 : this.getMme58hedid()
						.hashCode());
		return result;
	}

}