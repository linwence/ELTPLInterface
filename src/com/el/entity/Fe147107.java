package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Fe147107 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FE147107")
public class Fe147107 implements java.io.Serializable {

	// Fields

	private Fe147107Id id;
	private String mae58mcno;
	private BigDecimal malnid;
	private String maalph;
	private String mae58brd2;
	private String mae58urc5;
	private String mae58urc6;
	private String mae58urc7;
	private String mae58urc8;
	private String mae58madd;
	private String mae58eadd;
	private String mae58omc2;
	private String mae58omc3;
	private String mae58hadfg;
	private String maatype;
	private String madl01;
	private String mae58mpst;
	private BigDecimal maeaurmn1;
	private BigDecimal maeaurmn2;
	private Integer maeaurdt1;
	private Integer maeaurdt2;
	private String maaurst1;
	private String maaurst2;
	private String maaurst3;
	private String maaurst4;
	private String maaurst5;
	private String maaurst6;
	private String maaurch1;
	private String maaurch2;
	private BigDecimal maurab;
	private String maurrf;
	private String mae58hproc;
	private String mae58hcity;
	private String mae58hzone;
	private String mae58hpref;
	private String mae58hxxdz;
	private String mauser;
	private String mapid;
	private String majobn;
	private BigDecimal maupmt;
	private Integer maupmj;
	private String mae58hus01;
	private String mae58hus02;
	private String mae58hus03;
	private String mae58hus04;
	private String mae58hus05;
	private String mae58hus11;
	private String mae58hus12;
	private String mae58hus13;
	private String mae58hus14;
	private String mae58hus15;
	private String mae58hus21;
	private String mae58hus22;
	private String mae58hus23;
	private String mae58hus24;
	private String mae58hus25;
	private String mae58hus26;
	private String mae58hus27;
	private String mae58hus28;
	private String mae58hus29;
	private String mae58hus30;
	private BigDecimal mae58hun01;
	private BigDecimal mae58hun02;
	private BigDecimal mae58hun03;
	private BigDecimal mae58hun04;
	private BigDecimal mae58hun05;
	private BigDecimal maafa1;
	private BigDecimal maafa2;
	private BigDecimal maafa3;
	private BigDecimal maafa4;
	private BigDecimal maan01;
	private BigDecimal maan02;
	private BigDecimal maan03;
	private BigDecimal maan04;
	private BigDecimal maan05;
	private Integer mad01;
	private Integer mad02;
	private Integer mad03;
	private Integer mad04;
	private String maev02;
	private String maev03;
	private String maev04;
	private String mae58hsctm;
	private String mae58hsjut;
	private String mae58hsbut;
	private BigDecimal mamath06;
	private BigDecimal mamath07;
	private BigDecimal mamath08;
	private BigDecimal mamath09;

	// Constructors

	/** default constructor */
	public Fe147107() {
	}

	/** minimal constructor */
	public Fe147107(Fe147107Id id) {
		this.id = id;
	}

	/** full constructor */
	public Fe147107(Fe147107Id id, String mae58mcno, BigDecimal malnid,
			String maalph, String mae58brd2, String mae58urc5,
			String mae58urc6, String mae58urc7, String mae58urc8,
			String mae58madd, String mae58eadd, String mae58omc2,
			String mae58omc3, String mae58hadfg, String maatype, String madl01,
			String mae58mpst, BigDecimal maeaurmn1, BigDecimal maeaurmn2,
			Integer maeaurdt1, Integer maeaurdt2, String maaurst1,
			String maaurst2, String maaurst3, String maaurst4, String maaurst5,
			String maaurst6, String maaurch1, String maaurch2,
			BigDecimal maurab, String maurrf, String mae58hproc,
			String mae58hcity, String mae58hzone, String mae58hpref,
			String mae58hxxdz, String mauser, String mapid, String majobn,
			BigDecimal maupmt, Integer maupmj, String mae58hus01,
			String mae58hus02, String mae58hus03, String mae58hus04,
			String mae58hus05, String mae58hus11, String mae58hus12,
			String mae58hus13, String mae58hus14, String mae58hus15,
			String mae58hus21, String mae58hus22, String mae58hus23,
			String mae58hus24, String mae58hus25, String mae58hus26,
			String mae58hus27, String mae58hus28, String mae58hus29,
			String mae58hus30, BigDecimal mae58hun01, BigDecimal mae58hun02,
			BigDecimal mae58hun03, BigDecimal mae58hun04,
			BigDecimal mae58hun05, BigDecimal maafa1, BigDecimal maafa2,
			BigDecimal maafa3, BigDecimal maafa4, BigDecimal maan01,
			BigDecimal maan02, BigDecimal maan03, BigDecimal maan04,
			BigDecimal maan05, Integer mad01, Integer mad02, Integer mad03,
			Integer mad04, String maev02, String maev03, String maev04,
			String mae58hsctm, String mae58hsjut, String mae58hsbut,
			BigDecimal mamath06, BigDecimal mamath07, BigDecimal mamath08,
			BigDecimal mamath09) {
		this.id = id;
		this.mae58mcno = mae58mcno;
		this.malnid = malnid;
		this.maalph = maalph;
		this.mae58brd2 = mae58brd2;
		this.mae58urc5 = mae58urc5;
		this.mae58urc6 = mae58urc6;
		this.mae58urc7 = mae58urc7;
		this.mae58urc8 = mae58urc8;
		this.mae58madd = mae58madd;
		this.mae58eadd = mae58eadd;
		this.mae58omc2 = mae58omc2;
		this.mae58omc3 = mae58omc3;
		this.mae58hadfg = mae58hadfg;
		this.maatype = maatype;
		this.madl01 = madl01;
		this.mae58mpst = mae58mpst;
		this.maeaurmn1 = maeaurmn1;
		this.maeaurmn2 = maeaurmn2;
		this.maeaurdt1 = maeaurdt1;
		this.maeaurdt2 = maeaurdt2;
		this.maaurst1 = maaurst1;
		this.maaurst2 = maaurst2;
		this.maaurst3 = maaurst3;
		this.maaurst4 = maaurst4;
		this.maaurst5 = maaurst5;
		this.maaurst6 = maaurst6;
		this.maaurch1 = maaurch1;
		this.maaurch2 = maaurch2;
		this.maurab = maurab;
		this.maurrf = maurrf;
		this.mae58hproc = mae58hproc;
		this.mae58hcity = mae58hcity;
		this.mae58hzone = mae58hzone;
		this.mae58hpref = mae58hpref;
		this.mae58hxxdz = mae58hxxdz;
		this.mauser = mauser;
		this.mapid = mapid;
		this.majobn = majobn;
		this.maupmt = maupmt;
		this.maupmj = maupmj;
		this.mae58hus01 = mae58hus01;
		this.mae58hus02 = mae58hus02;
		this.mae58hus03 = mae58hus03;
		this.mae58hus04 = mae58hus04;
		this.mae58hus05 = mae58hus05;
		this.mae58hus11 = mae58hus11;
		this.mae58hus12 = mae58hus12;
		this.mae58hus13 = mae58hus13;
		this.mae58hus14 = mae58hus14;
		this.mae58hus15 = mae58hus15;
		this.mae58hus21 = mae58hus21;
		this.mae58hus22 = mae58hus22;
		this.mae58hus23 = mae58hus23;
		this.mae58hus24 = mae58hus24;
		this.mae58hus25 = mae58hus25;
		this.mae58hus26 = mae58hus26;
		this.mae58hus27 = mae58hus27;
		this.mae58hus28 = mae58hus28;
		this.mae58hus29 = mae58hus29;
		this.mae58hus30 = mae58hus30;
		this.mae58hun01 = mae58hun01;
		this.mae58hun02 = mae58hun02;
		this.mae58hun03 = mae58hun03;
		this.mae58hun04 = mae58hun04;
		this.mae58hun05 = mae58hun05;
		this.maafa1 = maafa1;
		this.maafa2 = maafa2;
		this.maafa3 = maafa3;
		this.maafa4 = maafa4;
		this.maan01 = maan01;
		this.maan02 = maan02;
		this.maan03 = maan03;
		this.maan04 = maan04;
		this.maan05 = maan05;
		this.mad01 = mad01;
		this.mad02 = mad02;
		this.mad03 = mad03;
		this.mad04 = mad04;
		this.maev02 = maev02;
		this.maev03 = maev03;
		this.maev04 = maev04;
		this.mae58hsctm = mae58hsctm;
		this.mae58hsjut = mae58hsjut;
		this.mae58hsbut = mae58hsbut;
		this.mamath06 = mamath06;
		this.mamath07 = mamath07;
		this.mamath08 = mamath08;
		this.mamath09 = mamath09;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "maukid", column = @Column(name = "MAUKID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "mae58hedid", column = @Column(name = "MAE58HEDID", nullable = false)),
			@AttributeOverride(name = "malnic", column = @Column(name = "MALNIC", nullable = false, precision = 22, scale = 0)) })
	public Fe147107Id getId() {
		return this.id;
	}

	public void setId(Fe147107Id id) {
		this.id = id;
	}

	@Column(name = "MAE58MCNO")
	public String getMae58mcno() {
		return this.mae58mcno;
	}

	public void setMae58mcno(String mae58mcno) {
		this.mae58mcno = mae58mcno;
	}

	@Column(name = "MALNID", precision = 22, scale = 0)
	public BigDecimal getMalnid() {
		return this.malnid;
	}

	public void setMalnid(BigDecimal malnid) {
		this.malnid = malnid;
	}

	@Column(name = "MAALPH")
	public String getMaalph() {
		return this.maalph;
	}

	public void setMaalph(String maalph) {
		this.maalph = maalph;
	}

	@Column(name = "MAE58BRD2")
	public String getMae58brd2() {
		return this.mae58brd2;
	}

	public void setMae58brd2(String mae58brd2) {
		this.mae58brd2 = mae58brd2;
	}

	@Column(name = "MAE58URC5")
	public String getMae58urc5() {
		return this.mae58urc5;
	}

	public void setMae58urc5(String mae58urc5) {
		this.mae58urc5 = mae58urc5;
	}

	@Column(name = "MAE58URC6")
	public String getMae58urc6() {
		return this.mae58urc6;
	}

	public void setMae58urc6(String mae58urc6) {
		this.mae58urc6 = mae58urc6;
	}

	@Column(name = "MAE58URC7")
	public String getMae58urc7() {
		return this.mae58urc7;
	}

	public void setMae58urc7(String mae58urc7) {
		this.mae58urc7 = mae58urc7;
	}

	@Column(name = "MAE58URC8")
	public String getMae58urc8() {
		return this.mae58urc8;
	}

	public void setMae58urc8(String mae58urc8) {
		this.mae58urc8 = mae58urc8;
	}

	@Column(name = "MAE58MADD")
	public String getMae58madd() {
		return this.mae58madd;
	}

	public void setMae58madd(String mae58madd) {
		this.mae58madd = mae58madd;
	}

	@Column(name = "MAE58EADD")
	public String getMae58eadd() {
		return this.mae58eadd;
	}

	public void setMae58eadd(String mae58eadd) {
		this.mae58eadd = mae58eadd;
	}

	@Column(name = "MAE58OMC2")
	public String getMae58omc2() {
		return this.mae58omc2;
	}

	public void setMae58omc2(String mae58omc2) {
		this.mae58omc2 = mae58omc2;
	}

	@Column(name = "MAE58OMC3")
	public String getMae58omc3() {
		return this.mae58omc3;
	}

	public void setMae58omc3(String mae58omc3) {
		this.mae58omc3 = mae58omc3;
	}

	@Column(name = "MAE58HADFG")
	public String getMae58hadfg() {
		return this.mae58hadfg;
	}

	public void setMae58hadfg(String mae58hadfg) {
		this.mae58hadfg = mae58hadfg;
	}

	@Column(name = "MAATYPE")
	public String getMaatype() {
		return this.maatype;
	}

	public void setMaatype(String maatype) {
		this.maatype = maatype;
	}

	@Column(name = "MADL01")
	public String getMadl01() {
		return this.madl01;
	}

	public void setMadl01(String madl01) {
		this.madl01 = madl01;
	}

	@Column(name = "MAE58MPST")
	public String getMae58mpst() {
		return this.mae58mpst;
	}

	public void setMae58mpst(String mae58mpst) {
		this.mae58mpst = mae58mpst;
	}

	@Column(name = "MAEAURMN1", precision = 22, scale = 0)
	public BigDecimal getMaeaurmn1() {
		return this.maeaurmn1;
	}

	public void setMaeaurmn1(BigDecimal maeaurmn1) {
		this.maeaurmn1 = maeaurmn1;
	}

	@Column(name = "MAEAURMN2", precision = 22, scale = 0)
	public BigDecimal getMaeaurmn2() {
		return this.maeaurmn2;
	}

	public void setMaeaurmn2(BigDecimal maeaurmn2) {
		this.maeaurmn2 = maeaurmn2;
	}

	@Column(name = "MAEAURDT1", precision = 6, scale = 0)
	public Integer getMaeaurdt1() {
		return this.maeaurdt1;
	}

	public void setMaeaurdt1(Integer maeaurdt1) {
		this.maeaurdt1 = maeaurdt1;
	}

	@Column(name = "MAEAURDT2", precision = 6, scale = 0)
	public Integer getMaeaurdt2() {
		return this.maeaurdt2;
	}

	public void setMaeaurdt2(Integer maeaurdt2) {
		this.maeaurdt2 = maeaurdt2;
	}

	@Column(name = "MAAURST1")
	public String getMaaurst1() {
		return this.maaurst1;
	}

	public void setMaaurst1(String maaurst1) {
		this.maaurst1 = maaurst1;
	}

	@Column(name = "MAAURST2")
	public String getMaaurst2() {
		return this.maaurst2;
	}

	public void setMaaurst2(String maaurst2) {
		this.maaurst2 = maaurst2;
	}

	@Column(name = "MAAURST3")
	public String getMaaurst3() {
		return this.maaurst3;
	}

	public void setMaaurst3(String maaurst3) {
		this.maaurst3 = maaurst3;
	}

	@Column(name = "MAAURST4")
	public String getMaaurst4() {
		return this.maaurst4;
	}

	public void setMaaurst4(String maaurst4) {
		this.maaurst4 = maaurst4;
	}

	@Column(name = "MAAURST5")
	public String getMaaurst5() {
		return this.maaurst5;
	}

	public void setMaaurst5(String maaurst5) {
		this.maaurst5 = maaurst5;
	}

	@Column(name = "MAAURST6")
	public String getMaaurst6() {
		return this.maaurst6;
	}

	public void setMaaurst6(String maaurst6) {
		this.maaurst6 = maaurst6;
	}

	@Column(name = "MAAURCH1")
	public String getMaaurch1() {
		return this.maaurch1;
	}

	public void setMaaurch1(String maaurch1) {
		this.maaurch1 = maaurch1;
	}

	@Column(name = "MAAURCH2")
	public String getMaaurch2() {
		return this.maaurch2;
	}

	public void setMaaurch2(String maaurch2) {
		this.maaurch2 = maaurch2;
	}

	@Column(name = "MAURAB", precision = 22, scale = 0)
	public BigDecimal getMaurab() {
		return this.maurab;
	}

	public void setMaurab(BigDecimal maurab) {
		this.maurab = maurab;
	}

	@Column(name = "MAURRF")
	public String getMaurrf() {
		return this.maurrf;
	}

	public void setMaurrf(String maurrf) {
		this.maurrf = maurrf;
	}

	@Column(name = "MAE58HPROC")
	public String getMae58hproc() {
		return this.mae58hproc;
	}

	public void setMae58hproc(String mae58hproc) {
		this.mae58hproc = mae58hproc;
	}

	@Column(name = "MAE58HCITY")
	public String getMae58hcity() {
		return this.mae58hcity;
	}

	public void setMae58hcity(String mae58hcity) {
		this.mae58hcity = mae58hcity;
	}

	@Column(name = "MAE58HZONE")
	public String getMae58hzone() {
		return this.mae58hzone;
	}

	public void setMae58hzone(String mae58hzone) {
		this.mae58hzone = mae58hzone;
	}

	@Column(name = "MAE58HPREF")
	public String getMae58hpref() {
		return this.mae58hpref;
	}

	public void setMae58hpref(String mae58hpref) {
		this.mae58hpref = mae58hpref;
	}

	@Column(name = "MAE58HXXDZ")
	public String getMae58hxxdz() {
		return this.mae58hxxdz;
	}

	public void setMae58hxxdz(String mae58hxxdz) {
		this.mae58hxxdz = mae58hxxdz;
	}

	@Column(name = "MAUSER")
	public String getMauser() {
		return this.mauser;
	}

	public void setMauser(String mauser) {
		this.mauser = mauser;
	}

	@Column(name = "MAPID")
	public String getMapid() {
		return this.mapid;
	}

	public void setMapid(String mapid) {
		this.mapid = mapid;
	}

	@Column(name = "MAJOBN")
	public String getMajobn() {
		return this.majobn;
	}

	public void setMajobn(String majobn) {
		this.majobn = majobn;
	}

	@Column(name = "MAUPMT", precision = 22, scale = 0)
	public BigDecimal getMaupmt() {
		return this.maupmt;
	}

	public void setMaupmt(BigDecimal maupmt) {
		this.maupmt = maupmt;
	}

	@Column(name = "MAUPMJ", precision = 6, scale = 0)
	public Integer getMaupmj() {
		return this.maupmj;
	}

	public void setMaupmj(Integer maupmj) {
		this.maupmj = maupmj;
	}

	@Column(name = "MAE58HUS01")
	public String getMae58hus01() {
		return this.mae58hus01;
	}

	public void setMae58hus01(String mae58hus01) {
		this.mae58hus01 = mae58hus01;
	}

	@Column(name = "MAE58HUS02")
	public String getMae58hus02() {
		return this.mae58hus02;
	}

	public void setMae58hus02(String mae58hus02) {
		this.mae58hus02 = mae58hus02;
	}

	@Column(name = "MAE58HUS03")
	public String getMae58hus03() {
		return this.mae58hus03;
	}

	public void setMae58hus03(String mae58hus03) {
		this.mae58hus03 = mae58hus03;
	}

	@Column(name = "MAE58HUS04")
	public String getMae58hus04() {
		return this.mae58hus04;
	}

	public void setMae58hus04(String mae58hus04) {
		this.mae58hus04 = mae58hus04;
	}

	@Column(name = "MAE58HUS05")
	public String getMae58hus05() {
		return this.mae58hus05;
	}

	public void setMae58hus05(String mae58hus05) {
		this.mae58hus05 = mae58hus05;
	}

	@Column(name = "MAE58HUS11")
	public String getMae58hus11() {
		return this.mae58hus11;
	}

	public void setMae58hus11(String mae58hus11) {
		this.mae58hus11 = mae58hus11;
	}

	@Column(name = "MAE58HUS12")
	public String getMae58hus12() {
		return this.mae58hus12;
	}

	public void setMae58hus12(String mae58hus12) {
		this.mae58hus12 = mae58hus12;
	}

	@Column(name = "MAE58HUS13")
	public String getMae58hus13() {
		return this.mae58hus13;
	}

	public void setMae58hus13(String mae58hus13) {
		this.mae58hus13 = mae58hus13;
	}

	@Column(name = "MAE58HUS14")
	public String getMae58hus14() {
		return this.mae58hus14;
	}

	public void setMae58hus14(String mae58hus14) {
		this.mae58hus14 = mae58hus14;
	}

	@Column(name = "MAE58HUS15")
	public String getMae58hus15() {
		return this.mae58hus15;
	}

	public void setMae58hus15(String mae58hus15) {
		this.mae58hus15 = mae58hus15;
	}

	@Column(name = "MAE58HUS21")
	public String getMae58hus21() {
		return this.mae58hus21;
	}

	public void setMae58hus21(String mae58hus21) {
		this.mae58hus21 = mae58hus21;
	}

	@Column(name = "MAE58HUS22")
	public String getMae58hus22() {
		return this.mae58hus22;
	}

	public void setMae58hus22(String mae58hus22) {
		this.mae58hus22 = mae58hus22;
	}

	@Column(name = "MAE58HUS23")
	public String getMae58hus23() {
		return this.mae58hus23;
	}

	public void setMae58hus23(String mae58hus23) {
		this.mae58hus23 = mae58hus23;
	}

	@Column(name = "MAE58HUS24")
	public String getMae58hus24() {
		return this.mae58hus24;
	}

	public void setMae58hus24(String mae58hus24) {
		this.mae58hus24 = mae58hus24;
	}

	@Column(name = "MAE58HUS25")
	public String getMae58hus25() {
		return this.mae58hus25;
	}

	public void setMae58hus25(String mae58hus25) {
		this.mae58hus25 = mae58hus25;
	}

	@Column(name = "MAE58HUS26")
	public String getMae58hus26() {
		return this.mae58hus26;
	}

	public void setMae58hus26(String mae58hus26) {
		this.mae58hus26 = mae58hus26;
	}

	@Column(name = "MAE58HUS27")
	public String getMae58hus27() {
		return this.mae58hus27;
	}

	public void setMae58hus27(String mae58hus27) {
		this.mae58hus27 = mae58hus27;
	}

	@Column(name = "MAE58HUS28")
	public String getMae58hus28() {
		return this.mae58hus28;
	}

	public void setMae58hus28(String mae58hus28) {
		this.mae58hus28 = mae58hus28;
	}

	@Column(name = "MAE58HUS29")
	public String getMae58hus29() {
		return this.mae58hus29;
	}

	public void setMae58hus29(String mae58hus29) {
		this.mae58hus29 = mae58hus29;
	}

	@Column(name = "MAE58HUS30")
	public String getMae58hus30() {
		return this.mae58hus30;
	}

	public void setMae58hus30(String mae58hus30) {
		this.mae58hus30 = mae58hus30;
	}

	@Column(name = "MAE58HUN01", precision = 22, scale = 0)
	public BigDecimal getMae58hun01() {
		return this.mae58hun01;
	}

	public void setMae58hun01(BigDecimal mae58hun01) {
		this.mae58hun01 = mae58hun01;
	}

	@Column(name = "MAE58HUN02", precision = 22, scale = 0)
	public BigDecimal getMae58hun02() {
		return this.mae58hun02;
	}

	public void setMae58hun02(BigDecimal mae58hun02) {
		this.mae58hun02 = mae58hun02;
	}

	@Column(name = "MAE58HUN03", precision = 22, scale = 0)
	public BigDecimal getMae58hun03() {
		return this.mae58hun03;
	}

	public void setMae58hun03(BigDecimal mae58hun03) {
		this.mae58hun03 = mae58hun03;
	}

	@Column(name = "MAE58HUN04", precision = 22, scale = 0)
	public BigDecimal getMae58hun04() {
		return this.mae58hun04;
	}

	public void setMae58hun04(BigDecimal mae58hun04) {
		this.mae58hun04 = mae58hun04;
	}

	@Column(name = "MAE58HUN05", precision = 22, scale = 0)
	public BigDecimal getMae58hun05() {
		return this.mae58hun05;
	}

	public void setMae58hun05(BigDecimal mae58hun05) {
		this.mae58hun05 = mae58hun05;
	}

	@Column(name = "MAAFA1", precision = 22, scale = 0)
	public BigDecimal getMaafa1() {
		return this.maafa1;
	}

	public void setMaafa1(BigDecimal maafa1) {
		this.maafa1 = maafa1;
	}

	@Column(name = "MAAFA2", precision = 22, scale = 0)
	public BigDecimal getMaafa2() {
		return this.maafa2;
	}

	public void setMaafa2(BigDecimal maafa2) {
		this.maafa2 = maafa2;
	}

	@Column(name = "MAAFA3", precision = 22, scale = 0)
	public BigDecimal getMaafa3() {
		return this.maafa3;
	}

	public void setMaafa3(BigDecimal maafa3) {
		this.maafa3 = maafa3;
	}

	@Column(name = "MAAFA4", precision = 22, scale = 0)
	public BigDecimal getMaafa4() {
		return this.maafa4;
	}

	public void setMaafa4(BigDecimal maafa4) {
		this.maafa4 = maafa4;
	}

	@Column(name = "MAAN01", precision = 22, scale = 0)
	public BigDecimal getMaan01() {
		return this.maan01;
	}

	public void setMaan01(BigDecimal maan01) {
		this.maan01 = maan01;
	}

	@Column(name = "MAAN02", precision = 22, scale = 0)
	public BigDecimal getMaan02() {
		return this.maan02;
	}

	public void setMaan02(BigDecimal maan02) {
		this.maan02 = maan02;
	}

	@Column(name = "MAAN03", precision = 22, scale = 0)
	public BigDecimal getMaan03() {
		return this.maan03;
	}

	public void setMaan03(BigDecimal maan03) {
		this.maan03 = maan03;
	}

	@Column(name = "MAAN04", precision = 22, scale = 0)
	public BigDecimal getMaan04() {
		return this.maan04;
	}

	public void setMaan04(BigDecimal maan04) {
		this.maan04 = maan04;
	}

	@Column(name = "MAAN05", precision = 22, scale = 0)
	public BigDecimal getMaan05() {
		return this.maan05;
	}

	public void setMaan05(BigDecimal maan05) {
		this.maan05 = maan05;
	}

	@Column(name = "MAD01", precision = 6, scale = 0)
	public Integer getMad01() {
		return this.mad01;
	}

	public void setMad01(Integer mad01) {
		this.mad01 = mad01;
	}

	@Column(name = "MAD02", precision = 6, scale = 0)
	public Integer getMad02() {
		return this.mad02;
	}

	public void setMad02(Integer mad02) {
		this.mad02 = mad02;
	}

	@Column(name = "MAD03", precision = 6, scale = 0)
	public Integer getMad03() {
		return this.mad03;
	}

	public void setMad03(Integer mad03) {
		this.mad03 = mad03;
	}

	@Column(name = "MAD04", precision = 6, scale = 0)
	public Integer getMad04() {
		return this.mad04;
	}

	public void setMad04(Integer mad04) {
		this.mad04 = mad04;
	}

	@Column(name = "MAEV02")
	public String getMaev02() {
		return this.maev02;
	}

	public void setMaev02(String maev02) {
		this.maev02 = maev02;
	}

	@Column(name = "MAEV03")
	public String getMaev03() {
		return this.maev03;
	}

	public void setMaev03(String maev03) {
		this.maev03 = maev03;
	}

	@Column(name = "MAEV04")
	public String getMaev04() {
		return this.maev04;
	}

	public void setMaev04(String maev04) {
		this.maev04 = maev04;
	}

	@Column(name = "MAE58HSCTM")
	public String getMae58hsctm() {
		return this.mae58hsctm;
	}

	public void setMae58hsctm(String mae58hsctm) {
		this.mae58hsctm = mae58hsctm;
	}

	@Column(name = "MAE58HSJUT")
	public String getMae58hsjut() {
		return this.mae58hsjut;
	}

	public void setMae58hsjut(String mae58hsjut) {
		this.mae58hsjut = mae58hsjut;
	}

	@Column(name = "MAE58HSBUT")
	public String getMae58hsbut() {
		return this.mae58hsbut;
	}

	public void setMae58hsbut(String mae58hsbut) {
		this.mae58hsbut = mae58hsbut;
	}

	@Column(name = "MAMATH06", precision = 22, scale = 0)
	public BigDecimal getMamath06() {
		return this.mamath06;
	}

	public void setMamath06(BigDecimal mamath06) {
		this.mamath06 = mamath06;
	}

	@Column(name = "MAMATH07", precision = 22, scale = 0)
	public BigDecimal getMamath07() {
		return this.mamath07;
	}

	public void setMamath07(BigDecimal mamath07) {
		this.mamath07 = mamath07;
	}

	@Column(name = "MAMATH08", precision = 22, scale = 0)
	public BigDecimal getMamath08() {
		return this.mamath08;
	}

	public void setMamath08(BigDecimal mamath08) {
		this.mamath08 = mamath08;
	}

	@Column(name = "MAMATH09", precision = 22, scale = 0)
	public BigDecimal getMamath09() {
		return this.mamath09;
	}

	public void setMamath09(BigDecimal mamath09) {
		this.mamath09 = mamath09;
	}

}