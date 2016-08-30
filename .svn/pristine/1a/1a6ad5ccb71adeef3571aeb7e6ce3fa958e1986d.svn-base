package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.elitesland.elbases.bases.BaseEntity;

/**
 * 付款方式明细表
 * 
 * @className: FE4PT001 前缀PT
 */
@Entity
@Table(name = "FE4PT001")
public class FE4PT001 extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FE4PT001PK fe4pt001pk;

	/*
	 * 付款方式
	 */
	//@Column(name = "pte58pt")
	@Transient
	private String pte58pt;

	public String getPte58pt() {
		return pte58pt;
	}

	public void setPte58pt(String pte58pt) {
		this.pte58pt = pte58pt;
	}

	/*
	 * 应收金额
	 */
	@Column(name = "ptaap")
	private Double ptaap = 0.0;

	/*
	 * 实收金额
	 */
	@Column(name = "ptag")
	private Double ptag = 0.0;

	/*
	 * 备注
	 */
	@Column(name = "ptrmk")
	private String ptrmk;
	
	/**
	 * 操作者	UserUpdate	USER
程序号	ProgramUpdate	PID
工作站	WorkstationUpdate	JOBN
更新时间	TimeUpdate	UPMT
更新日期	DateUpdate	UPMJ

	 * @return
	 */
	@Column(name="ptuser")
	private String ptuser;
	
	/**
	 * 程序号
	 */
	@Column(name="ptpid")
	private String ptpid;
	
	/**
	 * 工作站
	 */
	@Column(name="ptjobn")
	private String ptjobn;
	
	/**
	 * 更新时间
	 */
	@Column(name="ptupmt")
	private Long ptupmt;
	
	/**
	 * 更新日期
	 */
	@Column(name="ptupmj")
	private Long ptupmj;
	

	public String getPtuser() {
		return ptuser;
	}

	public void setPtuser(String ptuser) {
		this.ptuser = ptuser;
	}

	public String getPtpid() {
		return ptpid;
	}

	public void setPtpid(String ptpid) {
		this.ptpid = ptpid;
	}

	public String getPtjobn() {
		return ptjobn;
	}

	public void setPtjobn(String ptjobn) {
		this.ptjobn = ptjobn;
	}

	public Long getPtupmt() {
		return ptupmt;
	}

	public void setPtupmt(Long ptupmt) {
		this.ptupmt = ptupmt;
	}

	public Long getPtupmj() {
		return ptupmj;
	}

	public void setPtupmj(Long ptupmj) {
		this.ptupmj = ptupmj;
	}

	public FE4PT001PK getFe4pt001pk() {
		return fe4pt001pk;
	}

	public void setFe4pt001pk(FE4PT001PK fe4pt001pk) {
		this.fe4pt001pk = fe4pt001pk;
	}

	public Double getPtaap() {
		return ptaap;
	}

	public void setPtaap(Double ptaap) {
		this.ptaap = ptaap;
	}

	public Double getPtag() {
		return ptag;
	}

	public void setPtag(Double ptag) {
		this.ptag = ptag;
	}

	public String getPtrmk() {
		return ptrmk;
	}

	public void setPtrmk(String ptrmk) {
		this.ptrmk = ptrmk;
	}

	@Override
	public String toString() {
		return "FE4PT001 [fe4pt001pk=" + fe4pt001pk==null?"":fe4pt001pk.toString() + ", ptaap="
				+ ptaap + ", ptag=" + ptag + "]";
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer arg0) {
		// TODO Auto-generated method stub

	}

	@Transient
	private String e8ptShow;
	@Transient
	private String pte58ptShow2;
	@Transient
	private String ptdoco;
	@Transient
	private String ptdcto;
	@Transient
	private String ptkcoo;
	@Transient
	private String isUpdate;
	
	public String getIsUpdate() {
		return isUpdate;
	}
	public void setIsUpdate(String isUpdate) {
		this.isUpdate = isUpdate;
	}
	
	public String getE8ptShow() {
		return e8ptShow;
	}
	public void setE8ptShow(String e8ptShow) {
		this.e8ptShow = e8ptShow;
	}
	public String getPtdoco() {
		return ptdoco;
	}
	public void setPtdoco(String ptdoco) {
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
	public String getPte58ptShow2() {
		return pte58ptShow2;
	}
	public void setPte58ptShow2(String pte58ptShow2) {
		this.pte58ptShow2 = pte58ptShow2;
	}
	
}
