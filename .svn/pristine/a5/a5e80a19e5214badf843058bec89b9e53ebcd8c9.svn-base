package com.el.entity.erpdb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="FE1DM11")
public class FE1dm11PK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 配送单类型,暂时用PS？
	 */
	@Column(name = "dodcto")
	private String dodcto;
	/**
	 * 配送单号,配置成取UKID,（初始化时设置起始值12位）
	 */
	@Column(name = "doe1psn")
	private Long doe1psn;
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dodcto == null) ? 0 : dodcto.hashCode());
		result = prime * result + (int) (doe1psn ^ (doe1psn >>> 32));
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
		FE1dm11PK other = (FE1dm11PK) obj;
		if (dodcto == null)
		{
			if (other.dodcto != null)
				return false;
		}
		else
			if (!dodcto.equals(other.dodcto))
				return false;
		if (doe1psn != other.doe1psn)
			return false;
		
		return true;
	}
	
	public FE1dm11PK(){
		
	}

	public String getDodcto() {
		return dodcto;
	}

	public void setDodcto(String dodcto) {
		this.dodcto = dodcto;
	}

	public Long getDoe1psn() {
		return doe1psn;
	}

	public void setDoe1psn(Long doe1psn) {
		this.doe1psn = doe1psn;
	}
	
	
	
}
