package com.el.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * F0005L entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "F0005_L")
public class F0005L implements java.io.Serializable {

	// Fields

	private F0005LId id;

	// Constructors

	/** default constructor */
	public F0005L() {
	}

	/** full constructor */
	public F0005L(F0005LId id) {
		this.id = id;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "drsy", column = @Column(name = "DRSY", nullable = false)),
			@AttributeOverride(name = "drrt", column = @Column(name = "DRRT", nullable = false)),
			@AttributeOverride(name = "drky", column = @Column(name = "DRKY", nullable = false)),
			@AttributeOverride(name = "drdl01", column = @Column(name = "DRDL01")),
			@AttributeOverride(name = "drdl02", column = @Column(name = "DRDL02")),
			@AttributeOverride(name = "drsphd", column = @Column(name = "DRSPHD")),
			@AttributeOverride(name = "drudco", column = @Column(name = "DRUDCO")),
			@AttributeOverride(name = "drhrdc", column = @Column(name = "DRHRDC")),
			@AttributeOverride(name = "druser", column = @Column(name = "DRUSER")),
			@AttributeOverride(name = "drpid", column = @Column(name = "DRPID")),
			@AttributeOverride(name = "drupmj", column = @Column(name = "DRUPMJ", precision = 6, scale = 0)),
			@AttributeOverride(name = "drjobn", column = @Column(name = "DRJOBN")),
			@AttributeOverride(name = "drupmt", column = @Column(name = "DRUPMT", precision = 22, scale = 0)) })
	public F0005LId getId() {
		return this.id;
	}

	public void setId(F0005LId id) {
		this.id = id;
	}

}