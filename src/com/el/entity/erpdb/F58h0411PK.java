package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 零售单明细主键表
 * @className: F58h0411PK 
 * @desc: TODO(零售单明细对应表F58H0411主键) 
 * @author：alon
 * @mender：alon
 * @modifiedTime：Aug 7, 2014 7:01:36 AM
 * @version 1.0.0
 */
@Embeddable
@Table(name="F58h0411")
public class F58h0411PK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "chukid")
    private Long chukid;

	@Column(name="che58hlnid")
	private Long che58hlnid; 

	public F58h0411PK() {
	}
	

        /**
	 * 
	 * @methodName getChe58hlnid
	 * @methodDesc (零售单行号)
	 * @conditionsUse：(应用条件)
	 * @return
	 * long 
	 * @exception
	 * @since  1.0.0
	 */
	public Long getChe58hlnid() {
		return this.che58hlnid;
	}
	
	/**
	 * 
	 * @methodName getChe58hlnid
	 * @methodDesc (零售单行号)
	 * @conditionsUse：(应用条件)
	 * @return
	 * long 
	 * @exception
	 * @since  1.0.0
	 */
	public void setChe58hlnid(Long che58hlnid) {
		this.che58hlnid = che58hlnid;
	}


	public Long getChukid() {
		return chukid;
	}


	public void setChukid(Long chukid) {
		this.chukid = chukid;
	}



}