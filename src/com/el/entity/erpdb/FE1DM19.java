package com.el.entity.erpdb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.elitesland.elbases.bases.BaseEntity;
@Entity
@Table(name="FE1DM19")
public class FE1DM19 extends BaseEntity{
	@Id
	@Column(name="dlukid") 
	private Long dlukid;
	
	@Column(name="dldcto") 
	private String dldcto;
	
	@Column(name="dlkcoo") 
	private String dlkcoo;
	
	@Column(name="dle1psn") 
	private Long dle1psn;
	
	@Column(name="dlupmt") 
	private Long dlupmt;
	
	@Column(name="dllttr") 
	private String dllttr;
	
	@Column(name="dlupmj") 
	private Long dlupmj;
	
	@Column(name="dle1dmrcd") 
	private String dle1dmrcd;
	
	@Column(name="dlnxtr") 
	private String dlnxtr;
	
	@Column(name="dltday") 
	private Long dltday;
	
	@Column(name="dluser") 
	private String dluser;
	
	@Column(name="dlurrf") 
	private String dlurrf;
	
	@Column(name="dlpid") 
	private String dlpid;
	
	@Column(name="dle13pldoc") 
	private String dle13pldoc;
	
	@Column(name="dlrmk") 
	private String dlrmk;
	
	@Column(name="dljobn") 
	private String dljobn;
	
   @Transient
   private String date;//日期
   
   @Transient
   private String time;//时间
   
  
   @Transient
   private String tax;//揽收员电话
   
   @Transient
   private String alph;//揽收员姓名
   @Transient
   private String dlurrftax;//物流员电话
   
	public String getDlurrftax() {
	return dlurrftax;
}

public void setDlurrftax(String dlurrftax) {
	this.dlurrftax = dlurrftax;
}

	public String getAlph() {
	return alph;
}

public void setAlph(String alph) {
	this.alph = alph;
}

	public String getTax() {
	return tax;
}

public void setTax(String tax) {
	this.tax = tax;
}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Long getDlukid() {
		return dlukid;
	}

	public void setDlukid(Long dlukid) {
		this.dlukid = dlukid;
	}

	public String getDldcto() {
		return dldcto;
	}

	public void setDldcto(String dldcto) {
		this.dldcto = dldcto;
	}

	public String getDlkcoo() {
		return dlkcoo;
	}

	public void setDlkcoo(String dlkcoo) {
		this.dlkcoo = dlkcoo;
	}

	public Long getDle1psn() {
		return dle1psn;
	}

	public void setDle1psn(Long dle1psn) {
		this.dle1psn = dle1psn;
	}

	public Long getDlupmt() {
		return dlupmt;
	}

	public void setDlupmt(Long dlupmt) {
		this.dlupmt = dlupmt;
	}

	public String getDllttr() {
		return dllttr;
	}

	public void setDllttr(String dllttr) {
		this.dllttr = dllttr;
	}

	public Long getDlupmj() {
		return dlupmj;
	}

	public void setDlupmj(Long dlupmj) {
		this.dlupmj = dlupmj;
	}

	public String getDle1dmrcd() {
		return dle1dmrcd;
	}

	public void setDle1dmrcd(String dle1dmrcd) {
		this.dle1dmrcd = dle1dmrcd;
	}

	public String getDlnxtr() {
		return dlnxtr;
	}

	public void setDlnxtr(String dlnxtr) {
		this.dlnxtr = dlnxtr;
	}

	public Long getDltday() {
		return dltday;
	}

	public void setDltday(Long dltday) {
		this.dltday = dltday;
	}

	public String getDluser() {
		return dluser;
	}

	public void setDluser(String dluser) {
		this.dluser = dluser;
	}

	public String getDlurrf() {
		return dlurrf;
	}

	public void setDlurrf(String dlurrf) {
		this.dlurrf = dlurrf;
	}

	public String getDlpid() {
		return dlpid;
	}

	public void setDlpid(String dlpid) {
		this.dlpid = dlpid;
	}

	public String getDle13pldoc() {
		return dle13pldoc;
	}

	public void setDle13pldoc(String dle13pldoc) {
		this.dle13pldoc = dle13pldoc;
	}

	public String getDlrmk() {
		return dlrmk;
	}

	public void setDlrmk(String dlrmk) {
		this.dlrmk = dlrmk;
	}

	public String getDljobn() {
		return dljobn;
	}

	public void setDljobn(String dljobn) {
		this.dljobn = dljobn;
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
	

}
