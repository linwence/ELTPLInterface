package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;


@Embeddable
@Table(name="FE4LN001")
public class FE4ln001PK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "lne1psn")
	private Long lne1psn;// not null number    
	
	@Column(name = "lnlnid")
	private Long lnlnid;//  not null number    
	
	@Column(name = "lnlotn")
	private String lnlotn;//  not null nchar(30) 
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lnlotn == null) ? 0 : lnlotn.hashCode());
		result = prime * result + (int) (lne1psn ^ (lne1psn >>> 32));
		result = prime * result + (int) (lnlnid ^ (lnlnid >>> 32));
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
		FE4ln001PK other = (FE4ln001PK) obj;
		if (lnlotn == null)
		{
			if (other.lnlotn != null)
				return false;
		}
		else
			if (!lnlotn.equals(other.lnlotn))
				return false;
		
		if (lne1psn != other.lne1psn)
			return false;
		if (lnlnid != other.lnlnid)
			return false;
		
		return true;
	}
	
	public FE4ln001PK(){
		
	}

	public Long getLne1psn() {
		return lne1psn;
	}

	public void setLne1psn(Long lne1psn) {
		this.lne1psn = lne1psn;
	}

	public Long getLnlnid() {
		return lnlnid;
	}

	public void setLnlnid(Long lnlnid) {
		this.lnlnid = lnlnid;
	}

	public String getLnlotn() {
		return lnlotn;
	}

	public void setLnlotn(String lnlotn) {
		this.lnlotn = lnlotn;
	}
	
	
	
}
