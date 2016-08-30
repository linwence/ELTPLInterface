package com.el.entity.erpdb;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the F0005 database table.
 * 
 */
@Embeddable
@Table(schema="CRPCTL",name="F0005")
public class F0005PK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="drsy")
	private String drsy;

	@Column(name="drrt")
	private String drrt;

	@Column(name="drky")
	private String drky;

	public F0005PK() {
	}
	public String getDrsy() {
		return this.drsy;
	}
	public void setDrsy(String drsy) {
		this.drsy = drsy;
	}
	public String getDrrt() {
		return this.drrt;
	}
	public void setDrrt(String drrt) {
		this.drrt = drrt;
	}
	public String getDrky() {
		return this.drky;
	}
	public void setDrky(String drky) {
		this.drky = drky;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof F0005PK)) {
			return false;
		}
		F0005PK castOther = (F0005PK)other;
		return 
			this.drsy.equals(castOther.drsy)
			&& this.drrt.equals(castOther.drrt)
			&& this.drky.equals(castOther.drky);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.drsy.hashCode();
		hash = hash * prime + this.drrt.hashCode();
		hash = hash * prime + this.drky.hashCode();
		
		return hash;
	}
}