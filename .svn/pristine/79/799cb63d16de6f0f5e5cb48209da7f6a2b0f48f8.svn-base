package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name="FE1DM12")
public class FE1dm12PK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 配送单号,配置成取UKID,（初始化时设置起始值12位）
	 */
    @Column(name = "dle1psn")
	private Long dle1psn;//      not null number    
	
	/**
	 * 配送单类型,暂时用PS？
	 */
	@Column(name = "dldcto")
	private String dldcto;//       not null nchar(2)  
	
	@Column(name = "dllnid")
	private Long dllnid ;//     not null number  
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dldcto == null) ? 0 : dldcto.hashCode());
		//result = prime * result + (int) (doe1psn ^ (doe1psn >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FE1dm12PK other = (FE1dm12PK) obj;
		if (dldcto == null)
		{
			if (other.dldcto != null)
				return false;
		}
		else
			if (!dldcto.equals(other.dldcto))
				return false;
//		if (doe1psn != other.doe1psn)
//			return false;
		
		return true;
	}
	
	public FE1dm12PK(){
		
	}

	public String getDldcto() {
		return dldcto;
	}

	public void setDldcto(String dldcto) {
		this.dldcto = dldcto;
	}
	public Long getDle1psn() {
		return dle1psn;
	}
	
	public void setDle1psn(Long dle1psn) {
		this.dle1psn = dle1psn;
	}

	public Long getDllnid() {
		return dllnid;
	}

	public void setDllnid(Long dllnid) {
		this.dllnid = dllnid;
	}

	@Override
	public String toString() {
		return "FE1dm12PK [dle1psn=" + dle1psn + ", dldcto=" + dldcto
				+ ", dllnid=" + dllnid + "]";
	}
	
	
	
}
