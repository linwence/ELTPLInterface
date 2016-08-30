package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Fe14101aId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class Fe14101aId implements java.io.Serializable {

	// Fields

	private String ptspid;
	private String ptdl01;
	private String ptdl02;
	private String pttypd;
	private BigDecimal ptlnid;

	// Constructors

	/** default constructor */
	public Fe14101aId() {
	}

	/** full constructor */
	public Fe14101aId(String ptspid, String ptdl01, String ptdl02,
			String pttypd, BigDecimal ptlnid) {
		this.ptspid = ptspid;
		this.ptdl01 = ptdl01;
		this.ptdl02 = ptdl02;
		this.pttypd = pttypd;
		this.ptlnid = ptlnid;
	}

	// Property accessors

	@Column(name = "PTSPID", nullable = false)
	public String getPtspid() {
		return this.ptspid;
	}

	public void setPtspid(String ptspid) {
		this.ptspid = ptspid;
	}

	@Column(name = "PTDL01", nullable = false)
	public String getPtdl01() {
		return this.ptdl01;
	}

	public void setPtdl01(String ptdl01) {
		this.ptdl01 = ptdl01;
	}

	@Column(name = "PTDL02", nullable = false)
	public String getPtdl02() {
		return this.ptdl02;
	}

	public void setPtdl02(String ptdl02) {
		this.ptdl02 = ptdl02;
	}

	@Column(name = "PTTYPD", nullable = false)
	public String getPttypd() {
		return this.pttypd;
	}

	public void setPttypd(String pttypd) {
		this.pttypd = pttypd;
	}

	@Column(name = "PTLNID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getPtlnid() {
		return this.ptlnid;
	}

	public void setPtlnid(BigDecimal ptlnid) {
		this.ptlnid = ptlnid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Fe14101aId))
			return false;
		Fe14101aId castOther = (Fe14101aId) other;

		return ((this.getPtspid() == castOther.getPtspid()) || (this
				.getPtspid() != null && castOther.getPtspid() != null && this
				.getPtspid().equals(castOther.getPtspid())))
				&& ((this.getPtdl01() == castOther.getPtdl01()) || (this
						.getPtdl01() != null && castOther.getPtdl01() != null && this
						.getPtdl01().equals(castOther.getPtdl01())))
				&& ((this.getPtdl02() == castOther.getPtdl02()) || (this
						.getPtdl02() != null && castOther.getPtdl02() != null && this
						.getPtdl02().equals(castOther.getPtdl02())))
				&& ((this.getPttypd() == castOther.getPttypd()) || (this
						.getPttypd() != null && castOther.getPttypd() != null && this
						.getPttypd().equals(castOther.getPttypd())))
				&& ((this.getPtlnid() == castOther.getPtlnid()) || (this
						.getPtlnid() != null && castOther.getPtlnid() != null && this
						.getPtlnid().equals(castOther.getPtlnid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtspid() == null ? 0 : this.getPtspid().hashCode());
		result = 37 * result
				+ (getPtdl01() == null ? 0 : this.getPtdl01().hashCode());
		result = 37 * result
				+ (getPtdl02() == null ? 0 : this.getPtdl02().hashCode());
		result = 37 * result
				+ (getPttypd() == null ? 0 : this.getPttypd().hashCode());
		result = 37 * result
				+ (getPtlnid() == null ? 0 : this.getPtlnid().hashCode());
		return result;
	}

}