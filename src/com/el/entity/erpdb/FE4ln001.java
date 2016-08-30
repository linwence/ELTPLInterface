package com.el.entity.erpdb;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.elitesland.elbases.bases.BaseEntity;

@Entity
@Table(name="FE4LN001")
public class FE4ln001 extends BaseEntity {

	@EmbeddedId
	private FE4ln001PK fe4ln001pk;
	
	@Column(name = "lnitm")
	private Long lnitm;//            number    
	
	@Column(name = "lnlitm")
	private String lnlitm;//           nchar(25) 
	
	@Column(name = "lnaitm")
	private String lnaitm;//           nchar(25) 

	@Column(name = "lnsoqs")
	private Long lnsoqs;//           number    
	
	@Column(name = "lnuom")
	private String lnuom;//            nchar(2) 
	
	@Column(name = "lnurrf")
	private String lnurrf;//           nchar(15) 
	
	@Column(name = "lnuser")
	private String lnuser ;//          nchar(10) 
	
	@Column(name = "lnpid")
	private String lnpid ;//           nchar(10) 
	
	@Column(name = "lnjobn")
	private String lnjobn;//           nchar(10) 
	
	@Column(name = "lnupmj")
	private Long lnupmj;//           number(6) 
	
	@Column(name = "lnupmt")
	private Long lnupmt ;//          number  
	
	@Column(name = "lnurcd")
	private String lnurcd;//           nchar(2)  
	
	@Column(name = "lnurdt")
	private Long lnurdt;//           number(6) 
	
	@Column(name = "lnurat")
	private Long lnurat;//           number    
	
	@Column(name = "lnurab")
	private Long lnurab;//           number    
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Integer arg0) {
		
	}
	public FE4ln001PK getFe4ln001pk() {
		return fe4ln001pk;
	}
	public void setFe4ln001pk(FE4ln001PK fe4ln001pk) {
		this.fe4ln001pk = fe4ln001pk;
	}
	public Long getLnitm() {
		return lnitm;
	}
	public void setLnitm(Long lnitm) {
		this.lnitm = lnitm;
	}
	public String getLnlitm() {
		return lnlitm;
	}
	public void setLnlitm(String lnlitm) {
		this.lnlitm = lnlitm;
	}
	public String getLnaitm() {
		return lnaitm;
	}
	public void setLnaitm(String lnaitm) {
		this.lnaitm = lnaitm;
	}
	public Long getLnsoqs() {
		return lnsoqs;
	}
	public void setLnsoqs(Long lnsoqs) {
		this.lnsoqs = lnsoqs;
	}
	public String getLnuom() {
		return lnuom;
	}
	public void setLnuom(String lnuom) {
		this.lnuom = lnuom;
	}
	public String getLnurrf() {
		return lnurrf;
	}
	public void setLnurrf(String lnurrf) {
		this.lnurrf = lnurrf;
	}
	public String getLnuser() {
		return lnuser;
	}
	public void setLnuser(String lnuser) {
		this.lnuser = lnuser;
	}
	public String getLnpid() {
		return lnpid;
	}
	public void setLnpid(String lnpid) {
		this.lnpid = lnpid;
	}
	public String getLnjobn() {
		return lnjobn;
	}
	public void setLnjobn(String lnjobn) {
		this.lnjobn = lnjobn;
	}
	public Long getLnupmj() {
		return lnupmj;
	}
	public void setLnupmj(Long lnupmj) {
		this.lnupmj = lnupmj;
	}
	public Long getLnupmt() {
		return lnupmt;
	}
	public void setLnupmt(Long lnupmt) {
		this.lnupmt = lnupmt;
	}
	public String getLnurcd() {
		return lnurcd;
	}
	public void setLnurcd(String lnurcd) {
		this.lnurcd = lnurcd;
	}
	public Long getLnurdt() {
		return lnurdt;
	}
	public void setLnurdt(Long lnurdt) {
		this.lnurdt = lnurdt;
	}
	public Long getLnurat() {
		return lnurat;
	}
	public void setLnurat(Long lnurat) {
		this.lnurat = lnurat;
	}
	public Long getLnurab() {
		return lnurab;
	}
	public void setLnurab(Long lnurab) {
		this.lnurab = lnurab;
	}
	@Override
	public String toString() {
		return "FE4ln001 [fe4ln001pk=" + fe4ln001pk + ", lnitm=" + lnitm
				+ ", lnlitm=" + lnlitm + ", lnaitm=" + lnaitm + ", lnsoqs="
				+ lnsoqs + ", lnuom=" + lnuom + ", lnurrf=" + lnurrf
				+ ", lnuser=" + lnuser + ", lnpid=" + lnpid + ", lnjobn="
				+ lnjobn + ", lnupmj=" + lnupmj + ", lnupmt=" + lnupmt
				+ ", lnurcd=" + lnurcd + ", lnurdt=" + lnurdt + ", lnurat="
				+ lnurat + ", lnurab=" + lnurab + "]";
	}
	
	
	
	
}
