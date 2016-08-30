package com.el.entity.erpdb;


import javax.persistence.*;
import com.elitesland.elbases.bases.BaseEntity;


/**
 * The persistent class for the F0005 database table.
 * 
 */
@Entity
@Table(schema="CRPCTL",name="F0005")
public class F0005 extends BaseEntity  {

	@EmbeddedId
	private F0005PK f0005pk;

	@Column(name="drdl01")
	private String drdl01;

	@Column(name="drdl02")
	private String drdl02;

	@Column(name="drhrdc")
	private String drhrdc;

	@Column(name="drjobn")
	private String drjobn;

	@Column(name="drpid")
	private String drpid;

	@Column(name="drsphd")
	private String drsphd;

	@Column(name="drudco")
	private String drudco;

	@Column(name="drupmj")
	private Long drupmj;

	@Column(name="drupmt")
	private Long drupmt;

	@Column(name="druser")
	private String druser;

	public F0005() {
	}

	public F0005PK getF0005pk()
	{
		return f0005pk;
	}

	public void setF0005pk(F0005PK f0005pk)
	{
		this.f0005pk = f0005pk;
	}

	public String getDrdl01() {
		return this.drdl01;
	}

	public void setDrdl01(String drdl01) {
		this.drdl01 = drdl01;
	}

	public String getDrdl02() {
		return this.drdl02;
	}

	public void setDrdl02(String drdl02) {
		this.drdl02 = drdl02;
	}

	public String getDrhrdc() {
		return this.drhrdc;
	}

	public void setDrhrdc(String drhrdc) {
		this.drhrdc = drhrdc;
	}

	public String getDrjobn() {
		return this.drjobn;
	}

	public void setDrjobn(String drjobn) {
		this.drjobn = drjobn;
	}

	public String getDrpid() {
		return this.drpid;
	}

	public void setDrpid(String drpid) {
		this.drpid = drpid;
	}

	public String getDrsphd() {
		return this.drsphd;
	}

	public void setDrsphd(String drsphd) {
		this.drsphd = drsphd;
	}

	public String getDrudco() {
		return this.drudco;
	}

	public void setDrudco(String drudco) {
		this.drudco = drudco;
	}

	public Long getDrupmj() {
		return this.drupmj;
	}

	public void setDrupmj(Long drupmj) {
		this.drupmj = drupmj;
	}

	public Long getDrupmt() {
		return this.drupmt;
	}

	public void setDrupmt(Long drupmt) {
		this.drupmt = drupmt;
	}

	public String getDruser() {
		return this.druser;
	}

	public void setDruser(String druser) {
		this.druser = druser;
	}

	@Override
	public Integer getId()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id)
	{
		// TODO Auto-generated method stub
		
	}

}