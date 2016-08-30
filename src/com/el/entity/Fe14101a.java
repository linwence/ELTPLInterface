package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Fe14101a entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FE14101A")
public class Fe14101a implements java.io.Serializable {

	// Fields

	private Fe14101aId id;
	private String pttype;
	private BigDecimal ptprid;
	private BigDecimal ptuorg;
	private String ptlitm;
	private String ptdsc1;
	private BigDecimal ptuprc;
	private BigDecimal ptqnty;
	private String ptrmk;
	private String ptuser;
	private String ptpid;
	private String ptjobn;
	private BigDecimal ptupmt;
	private Integer ptupmj;
	private String pturcd;
	private Integer pturdt;
	private BigDecimal pturab;
	private String pturrf;

	// Constructors

	/** default constructor */
	public Fe14101a() {
	}

	/** minimal constructor */
	public Fe14101a(Fe14101aId id) {
		this.id = id;
	}

	/** full constructor */
	public Fe14101a(Fe14101aId id, String pttype, BigDecimal ptprid,
			BigDecimal ptuorg, String ptlitm, String ptdsc1, BigDecimal ptuprc,
			BigDecimal ptqnty, String ptrmk, String ptuser, String ptpid,
			String ptjobn, BigDecimal ptupmt, Integer ptupmj, String pturcd,
			Integer pturdt, BigDecimal pturab, String pturrf) {
		this.id = id;
		this.pttype = pttype;
		this.ptprid = ptprid;
		this.ptuorg = ptuorg;
		this.ptlitm = ptlitm;
		this.ptdsc1 = ptdsc1;
		this.ptuprc = ptuprc;
		this.ptqnty = ptqnty;
		this.ptrmk = ptrmk;
		this.ptuser = ptuser;
		this.ptpid = ptpid;
		this.ptjobn = ptjobn;
		this.ptupmt = ptupmt;
		this.ptupmj = ptupmj;
		this.pturcd = pturcd;
		this.pturdt = pturdt;
		this.pturab = pturab;
		this.pturrf = pturrf;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "ptspid", column = @Column(name = "PTSPID", nullable = false)),
			@AttributeOverride(name = "ptdl01", column = @Column(name = "PTDL01", nullable = false)),
			@AttributeOverride(name = "ptdl02", column = @Column(name = "PTDL02", nullable = false)),
			@AttributeOverride(name = "pttypd", column = @Column(name = "PTTYPD", nullable = false)),
			@AttributeOverride(name = "ptlnid", column = @Column(name = "PTLNID", nullable = false, precision = 22, scale = 0)) })
	public Fe14101aId getId() {
		return this.id;
	}

	public void setId(Fe14101aId id) {
		this.id = id;
	}

	@Column(name = "PTTYPE")
	public String getPttype() {
		return this.pttype;
	}

	public void setPttype(String pttype) {
		this.pttype = pttype;
	}

	@Column(name = "PTPRID", precision = 22, scale = 0)
	public BigDecimal getPtprid() {
		return this.ptprid;
	}

	public void setPtprid(BigDecimal ptprid) {
		this.ptprid = ptprid;
	}

	@Column(name = "PTUORG", precision = 22, scale = 0)
	public BigDecimal getPtuorg() {
		return this.ptuorg;
	}

	public void setPtuorg(BigDecimal ptuorg) {
		this.ptuorg = ptuorg;
	}

	@Column(name = "PTLITM")
	public String getPtlitm() {
		return this.ptlitm;
	}

	public void setPtlitm(String ptlitm) {
		this.ptlitm = ptlitm;
	}

	@Column(name = "PTDSC1")
	public String getPtdsc1() {
		return this.ptdsc1;
	}

	public void setPtdsc1(String ptdsc1) {
		this.ptdsc1 = ptdsc1;
	}

	@Column(name = "PTUPRC", precision = 22, scale = 0)
	public BigDecimal getPtuprc() {
		return this.ptuprc;
	}

	public void setPtuprc(BigDecimal ptuprc) {
		this.ptuprc = ptuprc;
	}

	@Column(name = "PTQNTY", precision = 22, scale = 0)
	public BigDecimal getPtqnty() {
		return this.ptqnty;
	}

	public void setPtqnty(BigDecimal ptqnty) {
		this.ptqnty = ptqnty;
	}

	@Column(name = "PTRMK")
	public String getPtrmk() {
		return this.ptrmk;
	}

	public void setPtrmk(String ptrmk) {
		this.ptrmk = ptrmk;
	}

	@Column(name = "PTUSER")
	public String getPtuser() {
		return this.ptuser;
	}

	public void setPtuser(String ptuser) {
		this.ptuser = ptuser;
	}

	@Column(name = "PTPID")
	public String getPtpid() {
		return this.ptpid;
	}

	public void setPtpid(String ptpid) {
		this.ptpid = ptpid;
	}

	@Column(name = "PTJOBN")
	public String getPtjobn() {
		return this.ptjobn;
	}

	public void setPtjobn(String ptjobn) {
		this.ptjobn = ptjobn;
	}

	@Column(name = "PTUPMT", precision = 22, scale = 0)
	public BigDecimal getPtupmt() {
		return this.ptupmt;
	}

	public void setPtupmt(BigDecimal ptupmt) {
		this.ptupmt = ptupmt;
	}

	@Column(name = "PTUPMJ", precision = 6, scale = 0)
	public Integer getPtupmj() {
		return this.ptupmj;
	}

	public void setPtupmj(Integer ptupmj) {
		this.ptupmj = ptupmj;
	}

	@Column(name = "PTURCD")
	public String getPturcd() {
		return this.pturcd;
	}

	public void setPturcd(String pturcd) {
		this.pturcd = pturcd;
	}

	@Column(name = "PTURDT", precision = 6, scale = 0)
	public Integer getPturdt() {
		return this.pturdt;
	}

	public void setPturdt(Integer pturdt) {
		this.pturdt = pturdt;
	}

	@Column(name = "PTURAB", precision = 22, scale = 0)
	public BigDecimal getPturab() {
		return this.pturab;
	}

	public void setPturab(BigDecimal pturab) {
		this.pturab = pturab;
	}

	@Column(name = "PTURRF")
	public String getPturrf() {
		return this.pturrf;
	}

	public void setPturrf(String pturrf) {
		this.pturrf = pturrf;
	}

}