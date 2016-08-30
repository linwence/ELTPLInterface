package com.el.entity.jde;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * Fe10101 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="FE10101")

public class Fe10101  implements java.io.Serializable {


    // Fields    

     private Fe10101Id id;
     private String sde58mpst;
     private String sde1dlt;
     private BigDecimal sdan8;
     private String sde58huf01;
     private String sde58huf02;
     private String sde58rp01;
     private String sde58rp02;
     private String sde58hus02;
     private String sde58hus12;
     private String sde58hus21;
     private String sde58hus26;
     private String sdurcd;
     private Integer sdurdt;
     private BigDecimal sdurat;
     private BigDecimal sdurab;
     private String sdurrf;
     private String sduser;
     private String sdpid;
     private String sdjobn;
     private BigDecimal sdupmt;
     private Integer sdupmj;


    // Constructors

    /** default constructor */
    public Fe10101() {
    }

	/** minimal constructor */
    public Fe10101(Fe10101Id id) {
        this.id = id;
    }
    
    /** full constructor */
    public Fe10101(Fe10101Id id, String sde58mpst, String sde1dlt, BigDecimal sdan8, String sde58huf01, String sde58huf02, String sde58rp01, String sde58rp02, String sde58hus02, String sde58hus12, String sde58hus21, String sde58hus26, String sdurcd, Integer sdurdt, BigDecimal sdurat, BigDecimal sdurab, String sdurrf, String sduser, String sdpid, String sdjobn, BigDecimal sdupmt, Integer sdupmj) {
        this.id = id;
        this.sde58mpst = sde58mpst;
        this.sde1dlt = sde1dlt;
        this.sdan8 = sdan8;
        this.sde58huf01 = sde58huf01;
        this.sde58huf02 = sde58huf02;
        this.sde58rp01 = sde58rp01;
        this.sde58rp02 = sde58rp02;
        this.sde58hus02 = sde58hus02;
        this.sde58hus12 = sde58hus12;
        this.sde58hus21 = sde58hus21;
        this.sde58hus26 = sde58hus26;
        this.sdurcd = sdurcd;
        this.sdurdt = sdurdt;
        this.sdurat = sdurat;
        this.sdurab = sdurab;
        this.sdurrf = sdurrf;
        this.sduser = sduser;
        this.sdpid = sdpid;
        this.sdjobn = sdjobn;
        this.sdupmt = sdupmt;
        this.sdupmj = sdupmj;
    }

   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="sdmcu", column=@Column(name="SDMCU", nullable=false) ), 
        @AttributeOverride(name="sde58an8", column=@Column(name="SDE58AN8", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="sdco", column=@Column(name="SDCO", nullable=false) ), 
        @AttributeOverride(name="sde58hproc", column=@Column(name="SDE58HPROC", nullable=false) ), 
        @AttributeOverride(name="sde58hcity", column=@Column(name="SDE58HCITY", nullable=false) ), 
        @AttributeOverride(name="sde58hpref", column=@Column(name="SDE58HPREF", nullable=false) ), 
        @AttributeOverride(name="sdcomitlvl", column=@Column(name="SDCOMITLVL", nullable=false, precision=22, scale=0) ) } )

    public Fe10101Id getId() {
        return this.id;
    }
    
    public void setId(Fe10101Id id) {
        this.id = id;
    }
    
    @Column(name="SDE58MPST")

    public String getSde58mpst() {
        return this.sde58mpst;
    }
    
    public void setSde58mpst(String sde58mpst) {
        this.sde58mpst = sde58mpst;
    }
    
    @Column(name="SDE1DLT")

    public String getSde1dlt() {
        return this.sde1dlt;
    }
    
    public void setSde1dlt(String sde1dlt) {
        this.sde1dlt = sde1dlt;
    }
    
    @Column(name="SDAN8", precision=22, scale=0)

    public BigDecimal getSdan8() {
        return this.sdan8;
    }
    
    public void setSdan8(BigDecimal sdan8) {
        this.sdan8 = sdan8;
    }
    
    @Column(name="SDE58HUF01")

    public String getSde58huf01() {
        return this.sde58huf01;
    }
    
    public void setSde58huf01(String sde58huf01) {
        this.sde58huf01 = sde58huf01;
    }
    
    @Column(name="SDE58HUF02")

    public String getSde58huf02() {
        return this.sde58huf02;
    }
    
    public void setSde58huf02(String sde58huf02) {
        this.sde58huf02 = sde58huf02;
    }
    
    @Column(name="SDE58RP01")

    public String getSde58rp01() {
        return this.sde58rp01;
    }
    
    public void setSde58rp01(String sde58rp01) {
        this.sde58rp01 = sde58rp01;
    }
    
    @Column(name="SDE58RP02")

    public String getSde58rp02() {
        return this.sde58rp02;
    }
    
    public void setSde58rp02(String sde58rp02) {
        this.sde58rp02 = sde58rp02;
    }
    
    @Column(name="SDE58HUS02")

    public String getSde58hus02() {
        return this.sde58hus02;
    }
    
    public void setSde58hus02(String sde58hus02) {
        this.sde58hus02 = sde58hus02;
    }
    
    @Column(name="SDE58HUS12")

    public String getSde58hus12() {
        return this.sde58hus12;
    }
    
    public void setSde58hus12(String sde58hus12) {
        this.sde58hus12 = sde58hus12;
    }
    
    @Column(name="SDE58HUS21")

    public String getSde58hus21() {
        return this.sde58hus21;
    }
    
    public void setSde58hus21(String sde58hus21) {
        this.sde58hus21 = sde58hus21;
    }
    
    @Column(name="SDE58HUS26")

    public String getSde58hus26() {
        return this.sde58hus26;
    }
    
    public void setSde58hus26(String sde58hus26) {
        this.sde58hus26 = sde58hus26;
    }
    
    @Column(name="SDURCD")

    public String getSdurcd() {
        return this.sdurcd;
    }
    
    public void setSdurcd(String sdurcd) {
        this.sdurcd = sdurcd;
    }
    
    @Column(name="SDURDT", precision=6, scale=0)

    public Integer getSdurdt() {
        return this.sdurdt;
    }
    
    public void setSdurdt(Integer sdurdt) {
        this.sdurdt = sdurdt;
    }
    
    @Column(name="SDURAT", precision=22, scale=0)

    public BigDecimal getSdurat() {
        return this.sdurat;
    }
    
    public void setSdurat(BigDecimal sdurat) {
        this.sdurat = sdurat;
    }
    
    @Column(name="SDURAB", precision=22, scale=0)

    public BigDecimal getSdurab() {
        return this.sdurab;
    }
    
    public void setSdurab(BigDecimal sdurab) {
        this.sdurab = sdurab;
    }
    
    @Column(name="SDURRF")

    public String getSdurrf() {
        return this.sdurrf;
    }
    
    public void setSdurrf(String sdurrf) {
        this.sdurrf = sdurrf;
    }
    
    @Column(name="SDUSER")

    public String getSduser() {
        return this.sduser;
    }
    
    public void setSduser(String sduser) {
        this.sduser = sduser;
    }
    
    @Column(name="SDPID")

    public String getSdpid() {
        return this.sdpid;
    }
    
    public void setSdpid(String sdpid) {
        this.sdpid = sdpid;
    }
    
    @Column(name="SDJOBN")

    public String getSdjobn() {
        return this.sdjobn;
    }
    
    public void setSdjobn(String sdjobn) {
        this.sdjobn = sdjobn;
    }
    
    @Column(name="SDUPMT", precision=22, scale=0)

    public BigDecimal getSdupmt() {
        return this.sdupmt;
    }
    
    public void setSdupmt(BigDecimal sdupmt) {
        this.sdupmt = sdupmt;
    }
    
    @Column(name="SDUPMJ", precision=6, scale=0)

    public Integer getSdupmj() {
        return this.sdupmj;
    }
    
    public void setSdupmj(Integer sdupmj) {
        this.sdupmj = sdupmj;
    }
   








}