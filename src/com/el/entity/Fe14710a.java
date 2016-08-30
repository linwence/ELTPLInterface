package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Fe14710a entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FE14710A")
public class Fe14710a implements java.io.Serializable {

	// Fields

	private Fe14710aId id;
	private BigDecimal lsdoco;
	private String lsdcto;
	private String lskcoo;
	private BigDecimal lsaap;
	private BigDecimal lsag;
	private String lsflg;
	private String lsrmk;
	private String lsuser;
	private String lspid;
	private String lsjobn;
	private BigDecimal lsupmt;
	private Integer lsupmj;
	private String lsurcd;
	private Integer lsurdt;
	private BigDecimal lsurab;
	private String lsurrf;

	// Constructors

	/** default constructor */
	public Fe14710a() {
	}

	/** minimal constructor */
	public Fe14710a(Fe14710aId id) {
		this.id = id;
	}

	/** full constructor */
	public Fe14710a(Fe14710aId id, BigDecimal lsdoco, String lsdcto,
			String lskcoo, BigDecimal lsaap, BigDecimal lsag, String lsflg,
			String lsrmk, String lsuser, String lspid, String lsjobn,
			BigDecimal lsupmt, Integer lsupmj, String lsurcd, Integer lsurdt,
			BigDecimal lsurab, String lsurrf) {
		this.id = id;
		this.lsdoco = lsdoco;
		this.lsdcto = lsdcto;
		this.lskcoo = lskcoo;
		this.lsaap = lsaap;
		this.lsag = lsag;
		this.lsflg = lsflg;
		this.lsrmk = lsrmk;
		this.lsuser = lsuser;
		this.lspid = lspid;
		this.lsjobn = lsjobn;
		this.lsupmt = lsupmt;
		this.lsupmj = lsupmj;
		this.lsurcd = lsurcd;
		this.lsurdt = lsurdt;
		this.lsurab = lsurab;
		this.lsurrf = lsurrf;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "lsukid", column = @Column(name = "LSUKID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "lse58pt", column = @Column(name = "LSE58PT", nullable = false)) })
	public Fe14710aId getId() {
		return this.id;
	}

	public void setId(Fe14710aId id) {
		this.id = id;
	}

	@Column(name = "LSDOCO", precision = 22, scale = 0)
	public BigDecimal getLsdoco() {
		return this.lsdoco;
	}

	public void setLsdoco(BigDecimal lsdoco) {
		this.lsdoco = lsdoco;
	}

	@Column(name = "LSDCTO")
	public String getLsdcto() {
		return this.lsdcto;
	}

	public void setLsdcto(String lsdcto) {
		this.lsdcto = lsdcto;
	}

	@Column(name = "LSKCOO")
	public String getLskcoo() {
		return this.lskcoo;
	}

	public void setLskcoo(String lskcoo) {
		this.lskcoo = lskcoo;
	}

	@Column(name = "LSAAP", precision = 22, scale = 0)
	public BigDecimal getLsaap() {
		return this.lsaap;
	}

	public void setLsaap(BigDecimal lsaap) {
		this.lsaap = lsaap;
	}

	@Column(name = "LSAG", precision = 22, scale = 0)
	public BigDecimal getLsag() {
		return this.lsag;
	}

	public void setLsag(BigDecimal lsag) {
		this.lsag = lsag;
	}

	@Column(name = "LSFLG")
	public String getLsflg() {
		return this.lsflg;
	}

	public void setLsflg(String lsflg) {
		this.lsflg = lsflg;
	}

	@Column(name = "LSRMK")
	public String getLsrmk() {
		return this.lsrmk;
	}

	public void setLsrmk(String lsrmk) {
		this.lsrmk = lsrmk;
	}

	@Column(name = "LSUSER")
	public String getLsuser() {
		return this.lsuser;
	}

	public void setLsuser(String lsuser) {
		this.lsuser = lsuser;
	}

	@Column(name = "LSPID")
	public String getLspid() {
		return this.lspid;
	}

	public void setLspid(String lspid) {
		this.lspid = lspid;
	}

	@Column(name = "LSJOBN")
	public String getLsjobn() {
		return this.lsjobn;
	}

	public void setLsjobn(String lsjobn) {
		this.lsjobn = lsjobn;
	}

	@Column(name = "LSUPMT", precision = 22, scale = 0)
	public BigDecimal getLsupmt() {
		return this.lsupmt;
	}

	public void setLsupmt(BigDecimal lsupmt) {
		this.lsupmt = lsupmt;
	}

	@Column(name = "LSUPMJ", precision = 6, scale = 0)
	public Integer getLsupmj() {
		return this.lsupmj;
	}

	public void setLsupmj(Integer lsupmj) {
		this.lsupmj = lsupmj;
	}

	@Column(name = "LSURCD")
	public String getLsurcd() {
		return this.lsurcd;
	}

	public void setLsurcd(String lsurcd) {
		this.lsurcd = lsurcd;
	}

	@Column(name = "LSURDT", precision = 6, scale = 0)
	public Integer getLsurdt() {
		return this.lsurdt;
	}

	public void setLsurdt(Integer lsurdt) {
		this.lsurdt = lsurdt;
	}

	@Column(name = "LSURAB", precision = 22, scale = 0)
	public BigDecimal getLsurab() {
		return this.lsurab;
	}

	public void setLsurab(BigDecimal lsurab) {
		this.lsurab = lsurab;
	}

	@Column(name = "LSURRF")
	public String getLsurrf() {
		return this.lsurrf;
	}

	public void setLsurrf(String lsurrf) {
		this.lsurrf = lsurrf;
	}

}