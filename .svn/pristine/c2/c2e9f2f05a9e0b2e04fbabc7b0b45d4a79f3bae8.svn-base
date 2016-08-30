package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * F55wsd03Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class F55wsd03Id
		extends
		org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean
		implements java.io.Serializable {

	// Fields

	private BigDecimal idukid;
	private String ide58hedid;
	private BigDecimal idedln;
	private BigDecimal idlnic;

	// Constructors

	/** default constructor */
	public F55wsd03Id() {
	}

	/** full constructor */
	public F55wsd03Id(BigDecimal idukid, String ide58hedid, BigDecimal idedln,
			BigDecimal idlnic) {
		this.idukid = idukid;
		this.ide58hedid = ide58hedid;
		this.idedln = idedln;
		this.idlnic = idlnic;
	}

	// Property accessors

	@Column(name = "IDUKID", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdukid() {
		return this.idukid;
	}

	public void setIdukid(BigDecimal idukid) {
		this.idukid = idukid;
	}

	@Column(name = "IDE58HEDID", nullable = false, length = 6)
	public String getIde58hedid() {
		return this.ide58hedid;
	}

	public void setIde58hedid(String ide58hedid) {
		this.ide58hedid = ide58hedid;
	}

	@Column(name = "IDEDLN", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdedln() {
		return this.idedln;
	}

	public void setIdedln(BigDecimal idedln) {
		this.idedln = idedln;
	}

	@Column(name = "IDLNIC", nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdlnic() {
		return this.idlnic;
	}

	public void setIdlnic(BigDecimal idlnic) {
		this.idlnic = idlnic;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof F55wsd03Id))
			return false;
		F55wsd03Id castOther = (F55wsd03Id) other;

		return ((this.getIdukid() == castOther.getIdukid()) || (this
				.getIdukid() != null && castOther.getIdukid() != null && this
				.getIdukid().equals(castOther.getIdukid())))
				&& ((this.getIde58hedid() == castOther.getIde58hedid()) || (this
						.getIde58hedid() != null
						&& castOther.getIde58hedid() != null && this
						.getIde58hedid().equals(castOther.getIde58hedid())))
				&& ((this.getIdedln() == castOther.getIdedln()) || (this
						.getIdedln() != null && castOther.getIdedln() != null && this
						.getIdedln().equals(castOther.getIdedln())))
				&& ((this.getIdlnic() == castOther.getIdlnic()) || (this
						.getIdlnic() != null && castOther.getIdlnic() != null && this
						.getIdlnic().equals(castOther.getIdlnic())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdukid() == null ? 0 : this.getIdukid().hashCode());
		result = 37
				* result
				+ (getIde58hedid() == null ? 0 : this.getIde58hedid()
						.hashCode());
		result = 37 * result
				+ (getIdedln() == null ? 0 : this.getIdedln().hashCode());
		result = 37 * result
				+ (getIdlnic() == null ? 0 : this.getIdlnic().hashCode());
		return result;
	}

}