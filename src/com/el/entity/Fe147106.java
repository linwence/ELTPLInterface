package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Fe147106 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "FE147106")
public class Fe147106 implements java.io.Serializable {

	// Fields

	private Fe147106Id id;
	private String mme58mcno;
	private String mme1pass;
	private String mme58mccf;
	private String mme58mpcf;
	private String mme58pmcn;
	private BigDecimal mme58mbno;
	private BigDecimal mme58an8;
	private String mmalph;
	private BigDecimal mman8;
	private BigDecimal mman8scnd;
	private String mmsex;
	private String mme58midc;
	private String mme58mcid;
	private String mme58mbct;
	private Integer mmdob;
	private String mme58mbel;
	private String mme58madd;
	private String mme58mpst;
	private String mme58mbmb;
	private Integer mmbegindj;
	private String mmph1;
	private BigDecimal mme58mbfn;
	private String mme58mbwc;
	private String mme58mbbd;
	private String mmph2;
	private String mmmlnm;
	private String mme58mbqq;
	private String mme58mbwp;
	private BigDecimal mme58mbms;
	private BigDecimal mme58mfms;
	private String mme58mcrc;
	private String mme58mblc;
	private String mme58mblg;
	private String mme58mbcl;
	private String mme58mbbt;
	private Integer mmefff;
	private Integer mme58mbmd;
	private Integer mmefdj;
	private BigDecimal mme58mbup;
	private BigDecimal mme1mbuv;
	private String mme58user;
	private String mme58mbit;
	private String mme58mbas;
	private String mme58urc1;
	private String mme58urc2;
	private String mme58urc3;
	private String mme58urc4;
	private String mme58urc5;
	private String mme58urc6;
	private String mme58urc7;
	private String mme58urc8;
	private String mme58mblv;
	private BigDecimal mme58rcid;
	private BigDecimal mme58rci2;
	private String mme58enam;
	private String mme58eadd;
	private String mme58imcn;
	private BigDecimal mmdoby;
	private BigDecimal mmdobm;
	private BigDecimal mmdobd;
	private BigDecimal mmaexp;
	private Long mme58cstm;
	private BigDecimal mmdspc;
	private Integer mme58fcdt;
	private BigDecimal mme58fcam;
	private String mmrorn;
	private String mmrcto;
	private String mme58ubdf;
	private String mme58ubgf;
	private String mme58wggf;
	private Integer mmdspj;
	private String mme58omc2;
	private String mme58omc3;
	private String mme58omc4;
	private String mme58omc5;
	private String mme58omcn;
	private BigDecimal mmaa;
	private BigDecimal mmeaurmn1;
	private BigDecimal mmeaurmn2;
	private Integer mmeaurdt1;
	private Integer mmeaurdt2;
	private String mmirpn;
	private String mmcty1;
	private String mme58dstt;
	private String mmtxln;
	private String mme58brd2;
	private String mme58jyfg;
	private String mme58wtfg;
	private String mme58ltfg;
	private String mme58gsfg;
	private String mme58esfg;
	private String mme58rfg1;
	private String mme58rfg2;
	private String mme58rfg3;
	private String mme58rfg4;
	private String mme58mjtp;
	private Integer mme58spdt;
	private String mmurcd;
	private Integer mmurdt;
	private BigDecimal mmurat;
	private BigDecimal mmurab;
	private String mmurrf;
	private String mme58hproc;
	private String mme58hcity;
	private String mme58hzone;
	private String mme58hpref;
	private String mme58hintl;
	private String mme58hyn;
	private String mme58hxxly;
	private String mme58hfmlc;
	private String mme58hshdh;
	private String mme58hyjsr;
	private String mme58pt;
	private String mme58hxxdz;
	private String mme58hzcdz;
	private String mme58hmail;
	private Integer mme58hmufd;
	private String mmuser;
	private String mmpid;
	private String mmjobn;
	private BigDecimal mmupmt;
	private Integer mmupmj;
	private String mme58hpbcn;
	private BigDecimal mme58hisam;
	private String mme58hindp;
	private String mme58huf01;
	private String mme58huf02;
	private String mme58huf03;
	private String mme58huf04;
	private String mme58huf05;
	private String mme58huf06;
	private String mme58huf07;
	private String mme58huf08;
	private String mme58huf09;
	private String mme58huf10;
	private String mme58hus01;
	private String mme58hus02;
	private String mme58hus03;
	private String mme58hus04;
	private String mme58hus05;
	private String mme58hus06;
	private String mme58hus07;
	private String mme58hus08;
	private String mme58hus09;
	private String mme58hus10;
	private String mme58hus11;
	private String mme58hus12;
	private String mme58hus13;
	private String mme58hus14;
	private String mme58hus15;
	private String mme58hus16;
	private String mme58hus17;
	private String mme58hus18;
	private String mme58hus19;
	private String mme58hus20;
	private String mme58hus21;
	private String mme58hus22;
	private String mme58hus23;
	private String mme58hus24;
	private String mme58hus25;
	private String mme58hus26;
	private String mme58hus27;
	private String mme58hus28;
	private String mme58hus29;
	private String mme58hus30;
	private BigDecimal mme58hun01;
	private BigDecimal mme58hun02;
	private BigDecimal mme58hun03;
	private BigDecimal mme58hun04;
	private BigDecimal mme58hun05;
	private Integer mme58hud01;
	private Integer mme58hud02;
	private Integer mme58hud03;
	private Integer mme58hud04;
	private Integer mme58hud05;
	private BigDecimal mman81;
	private BigDecimal mman82;
	private String mmmcu;
	private String mmemcu;
	private String mme55user;
	private BigDecimal mmacl;
	private String mmtrar;
	private BigDecimal mmamtu;
	private String mme58nmcc;
	private String mmco;
	private String mme58hsctm;
	private String mme58hsjut;
	private String mme58hsbut;
	private String mmev01;
	private String mmev02;
	private String mmev03;
	private String mmev04;

	// Constructors

	/** default constructor */
	public Fe147106() {
	}

	/** minimal constructor */
	public Fe147106(Fe147106Id id) {
		this.id = id;
	}

	/** full constructor */
	public Fe147106(Fe147106Id id, String mme58mcno, String mme1pass,
			String mme58mccf, String mme58mpcf, String mme58pmcn,
			BigDecimal mme58mbno, BigDecimal mme58an8, String mmalph,
			BigDecimal mman8, BigDecimal mman8scnd, String mmsex,
			String mme58midc, String mme58mcid, String mme58mbct,
			Integer mmdob, String mme58mbel, String mme58madd,
			String mme58mpst, String mme58mbmb, Integer mmbegindj,
			String mmph1, BigDecimal mme58mbfn, String mme58mbwc,
			String mme58mbbd, String mmph2, String mmmlnm, String mme58mbqq,
			String mme58mbwp, BigDecimal mme58mbms, BigDecimal mme58mfms,
			String mme58mcrc, String mme58mblc, String mme58mblg,
			String mme58mbcl, String mme58mbbt, Integer mmefff,
			Integer mme58mbmd, Integer mmefdj, BigDecimal mme58mbup,
			BigDecimal mme1mbuv, String mme58user, String mme58mbit,
			String mme58mbas, String mme58urc1, String mme58urc2,
			String mme58urc3, String mme58urc4, String mme58urc5,
			String mme58urc6, String mme58urc7, String mme58urc8,
			String mme58mblv, BigDecimal mme58rcid, BigDecimal mme58rci2,
			String mme58enam, String mme58eadd, String mme58imcn,
			BigDecimal mmdoby, BigDecimal mmdobm, BigDecimal mmdobd,
			BigDecimal mmaexp, Long mme58cstm, BigDecimal mmdspc,
			Integer mme58fcdt, BigDecimal mme58fcam, String mmrorn,
			String mmrcto, String mme58ubdf, String mme58ubgf,
			String mme58wggf, Integer mmdspj, String mme58omc2,
			String mme58omc3, String mme58omc4, String mme58omc5,
			String mme58omcn, BigDecimal mmaa, BigDecimal mmeaurmn1,
			BigDecimal mmeaurmn2, Integer mmeaurdt1, Integer mmeaurdt2,
			String mmirpn, String mmcty1, String mme58dstt, String mmtxln,
			String mme58brd2, String mme58jyfg, String mme58wtfg,
			String mme58ltfg, String mme58gsfg, String mme58esfg,
			String mme58rfg1, String mme58rfg2, String mme58rfg3,
			String mme58rfg4, String mme58mjtp, Integer mme58spdt,
			String mmurcd, Integer mmurdt, BigDecimal mmurat,
			BigDecimal mmurab, String mmurrf, String mme58hproc,
			String mme58hcity, String mme58hzone, String mme58hpref,
			String mme58hintl, String mme58hyn, String mme58hxxly,
			String mme58hfmlc, String mme58hshdh, String mme58hyjsr,
			String mme58pt, String mme58hxxdz, String mme58hzcdz,
			String mme58hmail, Integer mme58hmufd, String mmuser, String mmpid,
			String mmjobn, BigDecimal mmupmt, Integer mmupmj,
			String mme58hpbcn, BigDecimal mme58hisam, String mme58hindp,
			String mme58huf01, String mme58huf02, String mme58huf03,
			String mme58huf04, String mme58huf05, String mme58huf06,
			String mme58huf07, String mme58huf08, String mme58huf09,
			String mme58huf10, String mme58hus01, String mme58hus02,
			String mme58hus03, String mme58hus04, String mme58hus05,
			String mme58hus06, String mme58hus07, String mme58hus08,
			String mme58hus09, String mme58hus10, String mme58hus11,
			String mme58hus12, String mme58hus13, String mme58hus14,
			String mme58hus15, String mme58hus16, String mme58hus17,
			String mme58hus18, String mme58hus19, String mme58hus20,
			String mme58hus21, String mme58hus22, String mme58hus23,
			String mme58hus24, String mme58hus25, String mme58hus26,
			String mme58hus27, String mme58hus28, String mme58hus29,
			String mme58hus30, BigDecimal mme58hun01, BigDecimal mme58hun02,
			BigDecimal mme58hun03, BigDecimal mme58hun04,
			BigDecimal mme58hun05, Integer mme58hud01, Integer mme58hud02,
			Integer mme58hud03, Integer mme58hud04, Integer mme58hud05,
			BigDecimal mman81, BigDecimal mman82, String mmmcu, String mmemcu,
			String mme55user, BigDecimal mmacl, String mmtrar,
			BigDecimal mmamtu, String mme58nmcc, String mmco,
			String mme58hsctm, String mme58hsjut, String mme58hsbut,
			String mmev01, String mmev02, String mmev03, String mmev04) {
		this.id = id;
		this.mme58mcno = mme58mcno;
		this.mme1pass = mme1pass;
		this.mme58mccf = mme58mccf;
		this.mme58mpcf = mme58mpcf;
		this.mme58pmcn = mme58pmcn;
		this.mme58mbno = mme58mbno;
		this.mme58an8 = mme58an8;
		this.mmalph = mmalph;
		this.mman8 = mman8;
		this.mman8scnd = mman8scnd;
		this.mmsex = mmsex;
		this.mme58midc = mme58midc;
		this.mme58mcid = mme58mcid;
		this.mme58mbct = mme58mbct;
		this.mmdob = mmdob;
		this.mme58mbel = mme58mbel;
		this.mme58madd = mme58madd;
		this.mme58mpst = mme58mpst;
		this.mme58mbmb = mme58mbmb;
		this.mmbegindj = mmbegindj;
		this.mmph1 = mmph1;
		this.mme58mbfn = mme58mbfn;
		this.mme58mbwc = mme58mbwc;
		this.mme58mbbd = mme58mbbd;
		this.mmph2 = mmph2;
		this.mmmlnm = mmmlnm;
		this.mme58mbqq = mme58mbqq;
		this.mme58mbwp = mme58mbwp;
		this.mme58mbms = mme58mbms;
		this.mme58mfms = mme58mfms;
		this.mme58mcrc = mme58mcrc;
		this.mme58mblc = mme58mblc;
		this.mme58mblg = mme58mblg;
		this.mme58mbcl = mme58mbcl;
		this.mme58mbbt = mme58mbbt;
		this.mmefff = mmefff;
		this.mme58mbmd = mme58mbmd;
		this.mmefdj = mmefdj;
		this.mme58mbup = mme58mbup;
		this.mme1mbuv = mme1mbuv;
		this.mme58user = mme58user;
		this.mme58mbit = mme58mbit;
		this.mme58mbas = mme58mbas;
		this.mme58urc1 = mme58urc1;
		this.mme58urc2 = mme58urc2;
		this.mme58urc3 = mme58urc3;
		this.mme58urc4 = mme58urc4;
		this.mme58urc5 = mme58urc5;
		this.mme58urc6 = mme58urc6;
		this.mme58urc7 = mme58urc7;
		this.mme58urc8 = mme58urc8;
		this.mme58mblv = mme58mblv;
		this.mme58rcid = mme58rcid;
		this.mme58rci2 = mme58rci2;
		this.mme58enam = mme58enam;
		this.mme58eadd = mme58eadd;
		this.mme58imcn = mme58imcn;
		this.mmdoby = mmdoby;
		this.mmdobm = mmdobm;
		this.mmdobd = mmdobd;
		this.mmaexp = mmaexp;
		this.mme58cstm = mme58cstm;
		this.mmdspc = mmdspc;
		this.mme58fcdt = mme58fcdt;
		this.mme58fcam = mme58fcam;
		this.mmrorn = mmrorn;
		this.mmrcto = mmrcto;
		this.mme58ubdf = mme58ubdf;
		this.mme58ubgf = mme58ubgf;
		this.mme58wggf = mme58wggf;
		this.mmdspj = mmdspj;
		this.mme58omc2 = mme58omc2;
		this.mme58omc3 = mme58omc3;
		this.mme58omc4 = mme58omc4;
		this.mme58omc5 = mme58omc5;
		this.mme58omcn = mme58omcn;
		this.mmaa = mmaa;
		this.mmeaurmn1 = mmeaurmn1;
		this.mmeaurmn2 = mmeaurmn2;
		this.mmeaurdt1 = mmeaurdt1;
		this.mmeaurdt2 = mmeaurdt2;
		this.mmirpn = mmirpn;
		this.mmcty1 = mmcty1;
		this.mme58dstt = mme58dstt;
		this.mmtxln = mmtxln;
		this.mme58brd2 = mme58brd2;
		this.mme58jyfg = mme58jyfg;
		this.mme58wtfg = mme58wtfg;
		this.mme58ltfg = mme58ltfg;
		this.mme58gsfg = mme58gsfg;
		this.mme58esfg = mme58esfg;
		this.mme58rfg1 = mme58rfg1;
		this.mme58rfg2 = mme58rfg2;
		this.mme58rfg3 = mme58rfg3;
		this.mme58rfg4 = mme58rfg4;
		this.mme58mjtp = mme58mjtp;
		this.mme58spdt = mme58spdt;
		this.mmurcd = mmurcd;
		this.mmurdt = mmurdt;
		this.mmurat = mmurat;
		this.mmurab = mmurab;
		this.mmurrf = mmurrf;
		this.mme58hproc = mme58hproc;
		this.mme58hcity = mme58hcity;
		this.mme58hzone = mme58hzone;
		this.mme58hpref = mme58hpref;
		this.mme58hintl = mme58hintl;
		this.mme58hyn = mme58hyn;
		this.mme58hxxly = mme58hxxly;
		this.mme58hfmlc = mme58hfmlc;
		this.mme58hshdh = mme58hshdh;
		this.mme58hyjsr = mme58hyjsr;
		this.mme58pt = mme58pt;
		this.mme58hxxdz = mme58hxxdz;
		this.mme58hzcdz = mme58hzcdz;
		this.mme58hmail = mme58hmail;
		this.mme58hmufd = mme58hmufd;
		this.mmuser = mmuser;
		this.mmpid = mmpid;
		this.mmjobn = mmjobn;
		this.mmupmt = mmupmt;
		this.mmupmj = mmupmj;
		this.mme58hpbcn = mme58hpbcn;
		this.mme58hisam = mme58hisam;
		this.mme58hindp = mme58hindp;
		this.mme58huf01 = mme58huf01;
		this.mme58huf02 = mme58huf02;
		this.mme58huf03 = mme58huf03;
		this.mme58huf04 = mme58huf04;
		this.mme58huf05 = mme58huf05;
		this.mme58huf06 = mme58huf06;
		this.mme58huf07 = mme58huf07;
		this.mme58huf08 = mme58huf08;
		this.mme58huf09 = mme58huf09;
		this.mme58huf10 = mme58huf10;
		this.mme58hus01 = mme58hus01;
		this.mme58hus02 = mme58hus02;
		this.mme58hus03 = mme58hus03;
		this.mme58hus04 = mme58hus04;
		this.mme58hus05 = mme58hus05;
		this.mme58hus06 = mme58hus06;
		this.mme58hus07 = mme58hus07;
		this.mme58hus08 = mme58hus08;
		this.mme58hus09 = mme58hus09;
		this.mme58hus10 = mme58hus10;
		this.mme58hus11 = mme58hus11;
		this.mme58hus12 = mme58hus12;
		this.mme58hus13 = mme58hus13;
		this.mme58hus14 = mme58hus14;
		this.mme58hus15 = mme58hus15;
		this.mme58hus16 = mme58hus16;
		this.mme58hus17 = mme58hus17;
		this.mme58hus18 = mme58hus18;
		this.mme58hus19 = mme58hus19;
		this.mme58hus20 = mme58hus20;
		this.mme58hus21 = mme58hus21;
		this.mme58hus22 = mme58hus22;
		this.mme58hus23 = mme58hus23;
		this.mme58hus24 = mme58hus24;
		this.mme58hus25 = mme58hus25;
		this.mme58hus26 = mme58hus26;
		this.mme58hus27 = mme58hus27;
		this.mme58hus28 = mme58hus28;
		this.mme58hus29 = mme58hus29;
		this.mme58hus30 = mme58hus30;
		this.mme58hun01 = mme58hun01;
		this.mme58hun02 = mme58hun02;
		this.mme58hun03 = mme58hun03;
		this.mme58hun04 = mme58hun04;
		this.mme58hun05 = mme58hun05;
		this.mme58hud01 = mme58hud01;
		this.mme58hud02 = mme58hud02;
		this.mme58hud03 = mme58hud03;
		this.mme58hud04 = mme58hud04;
		this.mme58hud05 = mme58hud05;
		this.mman81 = mman81;
		this.mman82 = mman82;
		this.mmmcu = mmmcu;
		this.mmemcu = mmemcu;
		this.mme55user = mme55user;
		this.mmacl = mmacl;
		this.mmtrar = mmtrar;
		this.mmamtu = mmamtu;
		this.mme58nmcc = mme58nmcc;
		this.mmco = mmco;
		this.mme58hsctm = mme58hsctm;
		this.mme58hsjut = mme58hsjut;
		this.mme58hsbut = mme58hsbut;
		this.mmev01 = mmev01;
		this.mmev02 = mmev02;
		this.mmev03 = mmev03;
		this.mmev04 = mmev04;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mmukid", column = @Column(name = "MMUKID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "mme58hedid", column = @Column(name = "MME58HEDID", nullable = false)) })
	public Fe147106Id getId() {
		return this.id;
	}

	public void setId(Fe147106Id id) {
		this.id = id;
	}

	@Column(name = "MME58MCNO")
	public String getMme58mcno() {
		return this.mme58mcno;
	}

	public void setMme58mcno(String mme58mcno) {
		this.mme58mcno = mme58mcno;
	}

	@Column(name = "MME1PASS")
	public String getMme1pass() {
		return this.mme1pass;
	}

	public void setMme1pass(String mme1pass) {
		this.mme1pass = mme1pass;
	}

	@Column(name = "MME58MCCF")
	public String getMme58mccf() {
		return this.mme58mccf;
	}

	public void setMme58mccf(String mme58mccf) {
		this.mme58mccf = mme58mccf;
	}

	@Column(name = "MME58MPCF")
	public String getMme58mpcf() {
		return this.mme58mpcf;
	}

	public void setMme58mpcf(String mme58mpcf) {
		this.mme58mpcf = mme58mpcf;
	}

	@Column(name = "MME58PMCN")
	public String getMme58pmcn() {
		return this.mme58pmcn;
	}

	public void setMme58pmcn(String mme58pmcn) {
		this.mme58pmcn = mme58pmcn;
	}

	@Column(name = "MME58MBNO", precision = 22, scale = 0)
	public BigDecimal getMme58mbno() {
		return this.mme58mbno;
	}

	public void setMme58mbno(BigDecimal mme58mbno) {
		this.mme58mbno = mme58mbno;
	}

	@Column(name = "MME58AN8", precision = 22, scale = 0)
	public BigDecimal getMme58an8() {
		return this.mme58an8;
	}

	public void setMme58an8(BigDecimal mme58an8) {
		this.mme58an8 = mme58an8;
	}

	@Column(name = "MMALPH")
	public String getMmalph() {
		return this.mmalph;
	}

	public void setMmalph(String mmalph) {
		this.mmalph = mmalph;
	}

	@Column(name = "MMAN8", precision = 22, scale = 0)
	public BigDecimal getMman8() {
		return this.mman8;
	}

	public void setMman8(BigDecimal mman8) {
		this.mman8 = mman8;
	}

	@Column(name = "MMAN8SCND", precision = 22, scale = 0)
	public BigDecimal getMman8scnd() {
		return this.mman8scnd;
	}

	public void setMman8scnd(BigDecimal mman8scnd) {
		this.mman8scnd = mman8scnd;
	}

	@Column(name = "MMSEX")
	public String getMmsex() {
		return this.mmsex;
	}

	public void setMmsex(String mmsex) {
		this.mmsex = mmsex;
	}

	@Column(name = "MME58MIDC")
	public String getMme58midc() {
		return this.mme58midc;
	}

	public void setMme58midc(String mme58midc) {
		this.mme58midc = mme58midc;
	}

	@Column(name = "MME58MCID")
	public String getMme58mcid() {
		return this.mme58mcid;
	}

	public void setMme58mcid(String mme58mcid) {
		this.mme58mcid = mme58mcid;
	}

	@Column(name = "MME58MBCT")
	public String getMme58mbct() {
		return this.mme58mbct;
	}

	public void setMme58mbct(String mme58mbct) {
		this.mme58mbct = mme58mbct;
	}

	@Column(name = "MMDOB", precision = 6, scale = 0)
	public Integer getMmdob() {
		return this.mmdob;
	}

	public void setMmdob(Integer mmdob) {
		this.mmdob = mmdob;
	}

	@Column(name = "MME58MBEL")
	public String getMme58mbel() {
		return this.mme58mbel;
	}

	public void setMme58mbel(String mme58mbel) {
		this.mme58mbel = mme58mbel;
	}

	@Column(name = "MME58MADD")
	public String getMme58madd() {
		return this.mme58madd;
	}

	public void setMme58madd(String mme58madd) {
		this.mme58madd = mme58madd;
	}

	@Column(name = "MME58MPST")
	public String getMme58mpst() {
		return this.mme58mpst;
	}

	public void setMme58mpst(String mme58mpst) {
		this.mme58mpst = mme58mpst;
	}

	@Column(name = "MME58MBMB")
	public String getMme58mbmb() {
		return this.mme58mbmb;
	}

	public void setMme58mbmb(String mme58mbmb) {
		this.mme58mbmb = mme58mbmb;
	}

	@Column(name = "MMBEGINDJ", precision = 6, scale = 0)
	public Integer getMmbegindj() {
		return this.mmbegindj;
	}

	public void setMmbegindj(Integer mmbegindj) {
		this.mmbegindj = mmbegindj;
	}

	@Column(name = "MMPH1")
	public String getMmph1() {
		return this.mmph1;
	}

	public void setMmph1(String mmph1) {
		this.mmph1 = mmph1;
	}

	@Column(name = "MME58MBFN", precision = 22, scale = 0)
	public BigDecimal getMme58mbfn() {
		return this.mme58mbfn;
	}

	public void setMme58mbfn(BigDecimal mme58mbfn) {
		this.mme58mbfn = mme58mbfn;
	}

	@Column(name = "MME58MBWC")
	public String getMme58mbwc() {
		return this.mme58mbwc;
	}

	public void setMme58mbwc(String mme58mbwc) {
		this.mme58mbwc = mme58mbwc;
	}

	@Column(name = "MME58MBBD")
	public String getMme58mbbd() {
		return this.mme58mbbd;
	}

	public void setMme58mbbd(String mme58mbbd) {
		this.mme58mbbd = mme58mbbd;
	}

	@Column(name = "MMPH2")
	public String getMmph2() {
		return this.mmph2;
	}

	public void setMmph2(String mmph2) {
		this.mmph2 = mmph2;
	}

	@Column(name = "MMMLNM")
	public String getMmmlnm() {
		return this.mmmlnm;
	}

	public void setMmmlnm(String mmmlnm) {
		this.mmmlnm = mmmlnm;
	}

	@Column(name = "MME58MBQQ")
	public String getMme58mbqq() {
		return this.mme58mbqq;
	}

	public void setMme58mbqq(String mme58mbqq) {
		this.mme58mbqq = mme58mbqq;
	}

	@Column(name = "MME58MBWP")
	public String getMme58mbwp() {
		return this.mme58mbwp;
	}

	public void setMme58mbwp(String mme58mbwp) {
		this.mme58mbwp = mme58mbwp;
	}

	@Column(name = "MME58MBMS", precision = 22, scale = 0)
	public BigDecimal getMme58mbms() {
		return this.mme58mbms;
	}

	public void setMme58mbms(BigDecimal mme58mbms) {
		this.mme58mbms = mme58mbms;
	}

	@Column(name = "MME58MFMS", precision = 22, scale = 0)
	public BigDecimal getMme58mfms() {
		return this.mme58mfms;
	}

	public void setMme58mfms(BigDecimal mme58mfms) {
		this.mme58mfms = mme58mfms;
	}

	@Column(name = "MME58MCRC")
	public String getMme58mcrc() {
		return this.mme58mcrc;
	}

	public void setMme58mcrc(String mme58mcrc) {
		this.mme58mcrc = mme58mcrc;
	}

	@Column(name = "MME58MBLC")
	public String getMme58mblc() {
		return this.mme58mblc;
	}

	public void setMme58mblc(String mme58mblc) {
		this.mme58mblc = mme58mblc;
	}

	@Column(name = "MME58MBLG")
	public String getMme58mblg() {
		return this.mme58mblg;
	}

	public void setMme58mblg(String mme58mblg) {
		this.mme58mblg = mme58mblg;
	}

	@Column(name = "MME58MBCL")
	public String getMme58mbcl() {
		return this.mme58mbcl;
	}

	public void setMme58mbcl(String mme58mbcl) {
		this.mme58mbcl = mme58mbcl;
	}

	@Column(name = "MME58MBBT")
	public String getMme58mbbt() {
		return this.mme58mbbt;
	}

	public void setMme58mbbt(String mme58mbbt) {
		this.mme58mbbt = mme58mbbt;
	}

	@Column(name = "MMEFFF", precision = 6, scale = 0)
	public Integer getMmefff() {
		return this.mmefff;
	}

	public void setMmefff(Integer mmefff) {
		this.mmefff = mmefff;
	}

	@Column(name = "MME58MBMD", precision = 6, scale = 0)
	public Integer getMme58mbmd() {
		return this.mme58mbmd;
	}

	public void setMme58mbmd(Integer mme58mbmd) {
		this.mme58mbmd = mme58mbmd;
	}

	@Column(name = "MMEFDJ", precision = 6, scale = 0)
	public Integer getMmefdj() {
		return this.mmefdj;
	}

	public void setMmefdj(Integer mmefdj) {
		this.mmefdj = mmefdj;
	}

	@Column(name = "MME58MBUP", precision = 22, scale = 0)
	public BigDecimal getMme58mbup() {
		return this.mme58mbup;
	}

	public void setMme58mbup(BigDecimal mme58mbup) {
		this.mme58mbup = mme58mbup;
	}

	@Column(name = "MME1MBUV", precision = 22, scale = 0)
	public BigDecimal getMme1mbuv() {
		return this.mme1mbuv;
	}

	public void setMme1mbuv(BigDecimal mme1mbuv) {
		this.mme1mbuv = mme1mbuv;
	}

	@Column(name = "MME58USER")
	public String getMme58user() {
		return this.mme58user;
	}

	public void setMme58user(String mme58user) {
		this.mme58user = mme58user;
	}

	@Column(name = "MME58MBIT")
	public String getMme58mbit() {
		return this.mme58mbit;
	}

	public void setMme58mbit(String mme58mbit) {
		this.mme58mbit = mme58mbit;
	}

	@Column(name = "MME58MBAS")
	public String getMme58mbas() {
		return this.mme58mbas;
	}

	public void setMme58mbas(String mme58mbas) {
		this.mme58mbas = mme58mbas;
	}

	@Column(name = "MME58URC1")
	public String getMme58urc1() {
		return this.mme58urc1;
	}

	public void setMme58urc1(String mme58urc1) {
		this.mme58urc1 = mme58urc1;
	}

	@Column(name = "MME58URC2")
	public String getMme58urc2() {
		return this.mme58urc2;
	}

	public void setMme58urc2(String mme58urc2) {
		this.mme58urc2 = mme58urc2;
	}

	@Column(name = "MME58URC3")
	public String getMme58urc3() {
		return this.mme58urc3;
	}

	public void setMme58urc3(String mme58urc3) {
		this.mme58urc3 = mme58urc3;
	}

	@Column(name = "MME58URC4")
	public String getMme58urc4() {
		return this.mme58urc4;
	}

	public void setMme58urc4(String mme58urc4) {
		this.mme58urc4 = mme58urc4;
	}

	@Column(name = "MME58URC5")
	public String getMme58urc5() {
		return this.mme58urc5;
	}

	public void setMme58urc5(String mme58urc5) {
		this.mme58urc5 = mme58urc5;
	}

	@Column(name = "MME58URC6")
	public String getMme58urc6() {
		return this.mme58urc6;
	}

	public void setMme58urc6(String mme58urc6) {
		this.mme58urc6 = mme58urc6;
	}

	@Column(name = "MME58URC7")
	public String getMme58urc7() {
		return this.mme58urc7;
	}

	public void setMme58urc7(String mme58urc7) {
		this.mme58urc7 = mme58urc7;
	}

	@Column(name = "MME58URC8")
	public String getMme58urc8() {
		return this.mme58urc8;
	}

	public void setMme58urc8(String mme58urc8) {
		this.mme58urc8 = mme58urc8;
	}

	@Column(name = "MME58MBLV")
	public String getMme58mblv() {
		return this.mme58mblv;
	}

	public void setMme58mblv(String mme58mblv) {
		this.mme58mblv = mme58mblv;
	}

	@Column(name = "MME58RCID", precision = 22, scale = 0)
	public BigDecimal getMme58rcid() {
		return this.mme58rcid;
	}

	public void setMme58rcid(BigDecimal mme58rcid) {
		this.mme58rcid = mme58rcid;
	}

	@Column(name = "MME58RCI2", precision = 22, scale = 0)
	public BigDecimal getMme58rci2() {
		return this.mme58rci2;
	}

	public void setMme58rci2(BigDecimal mme58rci2) {
		this.mme58rci2 = mme58rci2;
	}

	@Column(name = "MME58ENAM")
	public String getMme58enam() {
		return this.mme58enam;
	}

	public void setMme58enam(String mme58enam) {
		this.mme58enam = mme58enam;
	}

	@Column(name = "MME58EADD")
	public String getMme58eadd() {
		return this.mme58eadd;
	}

	public void setMme58eadd(String mme58eadd) {
		this.mme58eadd = mme58eadd;
	}

	@Column(name = "MME58IMCN")
	public String getMme58imcn() {
		return this.mme58imcn;
	}

	public void setMme58imcn(String mme58imcn) {
		this.mme58imcn = mme58imcn;
	}

	@Column(name = "MMDOBY", precision = 22, scale = 0)
	public BigDecimal getMmdoby() {
		return this.mmdoby;
	}

	public void setMmdoby(BigDecimal mmdoby) {
		this.mmdoby = mmdoby;
	}

	@Column(name = "MMDOBM", precision = 22, scale = 0)
	public BigDecimal getMmdobm() {
		return this.mmdobm;
	}

	public void setMmdobm(BigDecimal mmdobm) {
		this.mmdobm = mmdobm;
	}

	@Column(name = "MMDOBD", precision = 22, scale = 0)
	public BigDecimal getMmdobd() {
		return this.mmdobd;
	}

	public void setMmdobd(BigDecimal mmdobd) {
		this.mmdobd = mmdobd;
	}

	@Column(name = "MMAEXP", precision = 22, scale = 0)
	public BigDecimal getMmaexp() {
		return this.mmaexp;
	}

	public void setMmaexp(BigDecimal mmaexp) {
		this.mmaexp = mmaexp;
	}

	@Column(name = "MME58CSTM", precision = 15, scale = 0)
	public Long getMme58cstm() {
		return this.mme58cstm;
	}

	public void setMme58cstm(Long mme58cstm) {
		this.mme58cstm = mme58cstm;
	}

	@Column(name = "MMDSPC", precision = 22, scale = 0)
	public BigDecimal getMmdspc() {
		return this.mmdspc;
	}

	public void setMmdspc(BigDecimal mmdspc) {
		this.mmdspc = mmdspc;
	}

	@Column(name = "MME58FCDT", precision = 6, scale = 0)
	public Integer getMme58fcdt() {
		return this.mme58fcdt;
	}

	public void setMme58fcdt(Integer mme58fcdt) {
		this.mme58fcdt = mme58fcdt;
	}

	@Column(name = "MME58FCAM", precision = 22, scale = 0)
	public BigDecimal getMme58fcam() {
		return this.mme58fcam;
	}

	public void setMme58fcam(BigDecimal mme58fcam) {
		this.mme58fcam = mme58fcam;
	}

	@Column(name = "MMRORN")
	public String getMmrorn() {
		return this.mmrorn;
	}

	public void setMmrorn(String mmrorn) {
		this.mmrorn = mmrorn;
	}

	@Column(name = "MMRCTO")
	public String getMmrcto() {
		return this.mmrcto;
	}

	public void setMmrcto(String mmrcto) {
		this.mmrcto = mmrcto;
	}

	@Column(name = "MME58UBDF")
	public String getMme58ubdf() {
		return this.mme58ubdf;
	}

	public void setMme58ubdf(String mme58ubdf) {
		this.mme58ubdf = mme58ubdf;
	}

	@Column(name = "MME58UBGF")
	public String getMme58ubgf() {
		return this.mme58ubgf;
	}

	public void setMme58ubgf(String mme58ubgf) {
		this.mme58ubgf = mme58ubgf;
	}

	@Column(name = "MME58WGGF")
	public String getMme58wggf() {
		return this.mme58wggf;
	}

	public void setMme58wggf(String mme58wggf) {
		this.mme58wggf = mme58wggf;
	}

	@Column(name = "MMDSPJ", precision = 6, scale = 0)
	public Integer getMmdspj() {
		return this.mmdspj;
	}

	public void setMmdspj(Integer mmdspj) {
		this.mmdspj = mmdspj;
	}

	@Column(name = "MME58OMC2")
	public String getMme58omc2() {
		return this.mme58omc2;
	}

	public void setMme58omc2(String mme58omc2) {
		this.mme58omc2 = mme58omc2;
	}

	@Column(name = "MME58OMC3")
	public String getMme58omc3() {
		return this.mme58omc3;
	}

	public void setMme58omc3(String mme58omc3) {
		this.mme58omc3 = mme58omc3;
	}

	@Column(name = "MME58OMC4")
	public String getMme58omc4() {
		return this.mme58omc4;
	}

	public void setMme58omc4(String mme58omc4) {
		this.mme58omc4 = mme58omc4;
	}

	@Column(name = "MME58OMC5")
	public String getMme58omc5() {
		return this.mme58omc5;
	}

	public void setMme58omc5(String mme58omc5) {
		this.mme58omc5 = mme58omc5;
	}

	@Column(name = "MME58OMCN")
	public String getMme58omcn() {
		return this.mme58omcn;
	}

	public void setMme58omcn(String mme58omcn) {
		this.mme58omcn = mme58omcn;
	}

	@Column(name = "MMAA", precision = 22, scale = 0)
	public BigDecimal getMmaa() {
		return this.mmaa;
	}

	public void setMmaa(BigDecimal mmaa) {
		this.mmaa = mmaa;
	}

	@Column(name = "MMEAURMN1", precision = 22, scale = 0)
	public BigDecimal getMmeaurmn1() {
		return this.mmeaurmn1;
	}

	public void setMmeaurmn1(BigDecimal mmeaurmn1) {
		this.mmeaurmn1 = mmeaurmn1;
	}

	@Column(name = "MMEAURMN2", precision = 22, scale = 0)
	public BigDecimal getMmeaurmn2() {
		return this.mmeaurmn2;
	}

	public void setMmeaurmn2(BigDecimal mmeaurmn2) {
		this.mmeaurmn2 = mmeaurmn2;
	}

	@Column(name = "MMEAURDT1", precision = 6, scale = 0)
	public Integer getMmeaurdt1() {
		return this.mmeaurdt1;
	}

	public void setMmeaurdt1(Integer mmeaurdt1) {
		this.mmeaurdt1 = mmeaurdt1;
	}

	@Column(name = "MMEAURDT2", precision = 6, scale = 0)
	public Integer getMmeaurdt2() {
		return this.mmeaurdt2;
	}

	public void setMmeaurdt2(Integer mmeaurdt2) {
		this.mmeaurdt2 = mmeaurdt2;
	}

	@Column(name = "MMIRPN")
	public String getMmirpn() {
		return this.mmirpn;
	}

	public void setMmirpn(String mmirpn) {
		this.mmirpn = mmirpn;
	}

	@Column(name = "MMCTY1")
	public String getMmcty1() {
		return this.mmcty1;
	}

	public void setMmcty1(String mmcty1) {
		this.mmcty1 = mmcty1;
	}

	@Column(name = "MME58DSTT")
	public String getMme58dstt() {
		return this.mme58dstt;
	}

	public void setMme58dstt(String mme58dstt) {
		this.mme58dstt = mme58dstt;
	}

	@Column(name = "MMTXLN")
	public String getMmtxln() {
		return this.mmtxln;
	}

	public void setMmtxln(String mmtxln) {
		this.mmtxln = mmtxln;
	}

	@Column(name = "MME58BRD2")
	public String getMme58brd2() {
		return this.mme58brd2;
	}

	public void setMme58brd2(String mme58brd2) {
		this.mme58brd2 = mme58brd2;
	}

	@Column(name = "MME58JYFG")
	public String getMme58jyfg() {
		return this.mme58jyfg;
	}

	public void setMme58jyfg(String mme58jyfg) {
		this.mme58jyfg = mme58jyfg;
	}

	@Column(name = "MME58WTFG")
	public String getMme58wtfg() {
		return this.mme58wtfg;
	}

	public void setMme58wtfg(String mme58wtfg) {
		this.mme58wtfg = mme58wtfg;
	}

	@Column(name = "MME58LTFG")
	public String getMme58ltfg() {
		return this.mme58ltfg;
	}

	public void setMme58ltfg(String mme58ltfg) {
		this.mme58ltfg = mme58ltfg;
	}

	@Column(name = "MME58GSFG")
	public String getMme58gsfg() {
		return this.mme58gsfg;
	}

	public void setMme58gsfg(String mme58gsfg) {
		this.mme58gsfg = mme58gsfg;
	}

	@Column(name = "MME58ESFG")
	public String getMme58esfg() {
		return this.mme58esfg;
	}

	public void setMme58esfg(String mme58esfg) {
		this.mme58esfg = mme58esfg;
	}

	@Column(name = "MME58RFG1")
	public String getMme58rfg1() {
		return this.mme58rfg1;
	}

	public void setMme58rfg1(String mme58rfg1) {
		this.mme58rfg1 = mme58rfg1;
	}

	@Column(name = "MME58RFG2")
	public String getMme58rfg2() {
		return this.mme58rfg2;
	}

	public void setMme58rfg2(String mme58rfg2) {
		this.mme58rfg2 = mme58rfg2;
	}

	@Column(name = "MME58RFG3")
	public String getMme58rfg3() {
		return this.mme58rfg3;
	}

	public void setMme58rfg3(String mme58rfg3) {
		this.mme58rfg3 = mme58rfg3;
	}

	@Column(name = "MME58RFG4")
	public String getMme58rfg4() {
		return this.mme58rfg4;
	}

	public void setMme58rfg4(String mme58rfg4) {
		this.mme58rfg4 = mme58rfg4;
	}

	@Column(name = "MME58MJTP")
	public String getMme58mjtp() {
		return this.mme58mjtp;
	}

	public void setMme58mjtp(String mme58mjtp) {
		this.mme58mjtp = mme58mjtp;
	}

	@Column(name = "MME58SPDT", precision = 6, scale = 0)
	public Integer getMme58spdt() {
		return this.mme58spdt;
	}

	public void setMme58spdt(Integer mme58spdt) {
		this.mme58spdt = mme58spdt;
	}

	@Column(name = "MMURCD")
	public String getMmurcd() {
		return this.mmurcd;
	}

	public void setMmurcd(String mmurcd) {
		this.mmurcd = mmurcd;
	}

	@Column(name = "MMURDT", precision = 6, scale = 0)
	public Integer getMmurdt() {
		return this.mmurdt;
	}

	public void setMmurdt(Integer mmurdt) {
		this.mmurdt = mmurdt;
	}

	@Column(name = "MMURAT", precision = 22, scale = 0)
	public BigDecimal getMmurat() {
		return this.mmurat;
	}

	public void setMmurat(BigDecimal mmurat) {
		this.mmurat = mmurat;
	}

	@Column(name = "MMURAB", precision = 22, scale = 0)
	public BigDecimal getMmurab() {
		return this.mmurab;
	}

	public void setMmurab(BigDecimal mmurab) {
		this.mmurab = mmurab;
	}

	@Column(name = "MMURRF")
	public String getMmurrf() {
		return this.mmurrf;
	}

	public void setMmurrf(String mmurrf) {
		this.mmurrf = mmurrf;
	}

	@Column(name = "MME58HPROC")
	public String getMme58hproc() {
		return this.mme58hproc;
	}

	public void setMme58hproc(String mme58hproc) {
		this.mme58hproc = mme58hproc;
	}

	@Column(name = "MME58HCITY")
	public String getMme58hcity() {
		return this.mme58hcity;
	}

	public void setMme58hcity(String mme58hcity) {
		this.mme58hcity = mme58hcity;
	}

	@Column(name = "MME58HZONE")
	public String getMme58hzone() {
		return this.mme58hzone;
	}

	public void setMme58hzone(String mme58hzone) {
		this.mme58hzone = mme58hzone;
	}

	@Column(name = "MME58HPREF")
	public String getMme58hpref() {
		return this.mme58hpref;
	}

	public void setMme58hpref(String mme58hpref) {
		this.mme58hpref = mme58hpref;
	}

	@Column(name = "MME58HINTL")
	public String getMme58hintl() {
		return this.mme58hintl;
	}

	public void setMme58hintl(String mme58hintl) {
		this.mme58hintl = mme58hintl;
	}

	@Column(name = "MME58HYN")
	public String getMme58hyn() {
		return this.mme58hyn;
	}

	public void setMme58hyn(String mme58hyn) {
		this.mme58hyn = mme58hyn;
	}

	@Column(name = "MME58HXXLY")
	public String getMme58hxxly() {
		return this.mme58hxxly;
	}

	public void setMme58hxxly(String mme58hxxly) {
		this.mme58hxxly = mme58hxxly;
	}

	@Column(name = "MME58HFMLC")
	public String getMme58hfmlc() {
		return this.mme58hfmlc;
	}

	public void setMme58hfmlc(String mme58hfmlc) {
		this.mme58hfmlc = mme58hfmlc;
	}

	@Column(name = "MME58HSHDH")
	public String getMme58hshdh() {
		return this.mme58hshdh;
	}

	public void setMme58hshdh(String mme58hshdh) {
		this.mme58hshdh = mme58hshdh;
	}

	@Column(name = "MME58HYJSR")
	public String getMme58hyjsr() {
		return this.mme58hyjsr;
	}

	public void setMme58hyjsr(String mme58hyjsr) {
		this.mme58hyjsr = mme58hyjsr;
	}

	@Column(name = "MME58PT")
	public String getMme58pt() {
		return this.mme58pt;
	}

	public void setMme58pt(String mme58pt) {
		this.mme58pt = mme58pt;
	}

	@Column(name = "MME58HXXDZ")
	public String getMme58hxxdz() {
		return this.mme58hxxdz;
	}

	public void setMme58hxxdz(String mme58hxxdz) {
		this.mme58hxxdz = mme58hxxdz;
	}

	@Column(name = "MME58HZCDZ")
	public String getMme58hzcdz() {
		return this.mme58hzcdz;
	}

	public void setMme58hzcdz(String mme58hzcdz) {
		this.mme58hzcdz = mme58hzcdz;
	}

	@Column(name = "MME58HMAIL")
	public String getMme58hmail() {
		return this.mme58hmail;
	}

	public void setMme58hmail(String mme58hmail) {
		this.mme58hmail = mme58hmail;
	}

	@Column(name = "MME58HMUFD", precision = 6, scale = 0)
	public Integer getMme58hmufd() {
		return this.mme58hmufd;
	}

	public void setMme58hmufd(Integer mme58hmufd) {
		this.mme58hmufd = mme58hmufd;
	}

	@Column(name = "MMUSER")
	public String getMmuser() {
		return this.mmuser;
	}

	public void setMmuser(String mmuser) {
		this.mmuser = mmuser;
	}

	@Column(name = "MMPID")
	public String getMmpid() {
		return this.mmpid;
	}

	public void setMmpid(String mmpid) {
		this.mmpid = mmpid;
	}

	@Column(name = "MMJOBN")
	public String getMmjobn() {
		return this.mmjobn;
	}

	public void setMmjobn(String mmjobn) {
		this.mmjobn = mmjobn;
	}

	@Column(name = "MMUPMT", precision = 22, scale = 0)
	public BigDecimal getMmupmt() {
		return this.mmupmt;
	}

	public void setMmupmt(BigDecimal mmupmt) {
		this.mmupmt = mmupmt;
	}

	@Column(name = "MMUPMJ", precision = 6, scale = 0)
	public Integer getMmupmj() {
		return this.mmupmj;
	}

	public void setMmupmj(Integer mmupmj) {
		this.mmupmj = mmupmj;
	}

	@Column(name = "MME58HPBCN")
	public String getMme58hpbcn() {
		return this.mme58hpbcn;
	}

	public void setMme58hpbcn(String mme58hpbcn) {
		this.mme58hpbcn = mme58hpbcn;
	}

	@Column(name = "MME58HISAM", precision = 22, scale = 0)
	public BigDecimal getMme58hisam() {
		return this.mme58hisam;
	}

	public void setMme58hisam(BigDecimal mme58hisam) {
		this.mme58hisam = mme58hisam;
	}

	@Column(name = "MME58HINDP")
	public String getMme58hindp() {
		return this.mme58hindp;
	}

	public void setMme58hindp(String mme58hindp) {
		this.mme58hindp = mme58hindp;
	}

	@Column(name = "MME58HUF01")
	public String getMme58huf01() {
		return this.mme58huf01;
	}

	public void setMme58huf01(String mme58huf01) {
		this.mme58huf01 = mme58huf01;
	}

	@Column(name = "MME58HUF02")
	public String getMme58huf02() {
		return this.mme58huf02;
	}

	public void setMme58huf02(String mme58huf02) {
		this.mme58huf02 = mme58huf02;
	}

	@Column(name = "MME58HUF03")
	public String getMme58huf03() {
		return this.mme58huf03;
	}

	public void setMme58huf03(String mme58huf03) {
		this.mme58huf03 = mme58huf03;
	}

	@Column(name = "MME58HUF04")
	public String getMme58huf04() {
		return this.mme58huf04;
	}

	public void setMme58huf04(String mme58huf04) {
		this.mme58huf04 = mme58huf04;
	}

	@Column(name = "MME58HUF05")
	public String getMme58huf05() {
		return this.mme58huf05;
	}

	public void setMme58huf05(String mme58huf05) {
		this.mme58huf05 = mme58huf05;
	}

	@Column(name = "MME58HUF06")
	public String getMme58huf06() {
		return this.mme58huf06;
	}

	public void setMme58huf06(String mme58huf06) {
		this.mme58huf06 = mme58huf06;
	}

	@Column(name = "MME58HUF07")
	public String getMme58huf07() {
		return this.mme58huf07;
	}

	public void setMme58huf07(String mme58huf07) {
		this.mme58huf07 = mme58huf07;
	}

	@Column(name = "MME58HUF08")
	public String getMme58huf08() {
		return this.mme58huf08;
	}

	public void setMme58huf08(String mme58huf08) {
		this.mme58huf08 = mme58huf08;
	}

	@Column(name = "MME58HUF09")
	public String getMme58huf09() {
		return this.mme58huf09;
	}

	public void setMme58huf09(String mme58huf09) {
		this.mme58huf09 = mme58huf09;
	}

	@Column(name = "MME58HUF10")
	public String getMme58huf10() {
		return this.mme58huf10;
	}

	public void setMme58huf10(String mme58huf10) {
		this.mme58huf10 = mme58huf10;
	}

	@Column(name = "MME58HUS01")
	public String getMme58hus01() {
		return this.mme58hus01;
	}

	public void setMme58hus01(String mme58hus01) {
		this.mme58hus01 = mme58hus01;
	}

	@Column(name = "MME58HUS02")
	public String getMme58hus02() {
		return this.mme58hus02;
	}

	public void setMme58hus02(String mme58hus02) {
		this.mme58hus02 = mme58hus02;
	}

	@Column(name = "MME58HUS03")
	public String getMme58hus03() {
		return this.mme58hus03;
	}

	public void setMme58hus03(String mme58hus03) {
		this.mme58hus03 = mme58hus03;
	}

	@Column(name = "MME58HUS04")
	public String getMme58hus04() {
		return this.mme58hus04;
	}

	public void setMme58hus04(String mme58hus04) {
		this.mme58hus04 = mme58hus04;
	}

	@Column(name = "MME58HUS05")
	public String getMme58hus05() {
		return this.mme58hus05;
	}

	public void setMme58hus05(String mme58hus05) {
		this.mme58hus05 = mme58hus05;
	}

	@Column(name = "MME58HUS06")
	public String getMme58hus06() {
		return this.mme58hus06;
	}

	public void setMme58hus06(String mme58hus06) {
		this.mme58hus06 = mme58hus06;
	}

	@Column(name = "MME58HUS07")
	public String getMme58hus07() {
		return this.mme58hus07;
	}

	public void setMme58hus07(String mme58hus07) {
		this.mme58hus07 = mme58hus07;
	}

	@Column(name = "MME58HUS08")
	public String getMme58hus08() {
		return this.mme58hus08;
	}

	public void setMme58hus08(String mme58hus08) {
		this.mme58hus08 = mme58hus08;
	}

	@Column(name = "MME58HUS09")
	public String getMme58hus09() {
		return this.mme58hus09;
	}

	public void setMme58hus09(String mme58hus09) {
		this.mme58hus09 = mme58hus09;
	}

	@Column(name = "MME58HUS10")
	public String getMme58hus10() {
		return this.mme58hus10;
	}

	public void setMme58hus10(String mme58hus10) {
		this.mme58hus10 = mme58hus10;
	}

	@Column(name = "MME58HUS11")
	public String getMme58hus11() {
		return this.mme58hus11;
	}

	public void setMme58hus11(String mme58hus11) {
		this.mme58hus11 = mme58hus11;
	}

	@Column(name = "MME58HUS12")
	public String getMme58hus12() {
		return this.mme58hus12;
	}

	public void setMme58hus12(String mme58hus12) {
		this.mme58hus12 = mme58hus12;
	}

	@Column(name = "MME58HUS13")
	public String getMme58hus13() {
		return this.mme58hus13;
	}

	public void setMme58hus13(String mme58hus13) {
		this.mme58hus13 = mme58hus13;
	}

	@Column(name = "MME58HUS14")
	public String getMme58hus14() {
		return this.mme58hus14;
	}

	public void setMme58hus14(String mme58hus14) {
		this.mme58hus14 = mme58hus14;
	}

	@Column(name = "MME58HUS15")
	public String getMme58hus15() {
		return this.mme58hus15;
	}

	public void setMme58hus15(String mme58hus15) {
		this.mme58hus15 = mme58hus15;
	}

	@Column(name = "MME58HUS16")
	public String getMme58hus16() {
		return this.mme58hus16;
	}

	public void setMme58hus16(String mme58hus16) {
		this.mme58hus16 = mme58hus16;
	}

	@Column(name = "MME58HUS17")
	public String getMme58hus17() {
		return this.mme58hus17;
	}

	public void setMme58hus17(String mme58hus17) {
		this.mme58hus17 = mme58hus17;
	}

	@Column(name = "MME58HUS18")
	public String getMme58hus18() {
		return this.mme58hus18;
	}

	public void setMme58hus18(String mme58hus18) {
		this.mme58hus18 = mme58hus18;
	}

	@Column(name = "MME58HUS19")
	public String getMme58hus19() {
		return this.mme58hus19;
	}

	public void setMme58hus19(String mme58hus19) {
		this.mme58hus19 = mme58hus19;
	}

	@Column(name = "MME58HUS20")
	public String getMme58hus20() {
		return this.mme58hus20;
	}

	public void setMme58hus20(String mme58hus20) {
		this.mme58hus20 = mme58hus20;
	}

	@Column(name = "MME58HUS21")
	public String getMme58hus21() {
		return this.mme58hus21;
	}

	public void setMme58hus21(String mme58hus21) {
		this.mme58hus21 = mme58hus21;
	}

	@Column(name = "MME58HUS22")
	public String getMme58hus22() {
		return this.mme58hus22;
	}

	public void setMme58hus22(String mme58hus22) {
		this.mme58hus22 = mme58hus22;
	}

	@Column(name = "MME58HUS23")
	public String getMme58hus23() {
		return this.mme58hus23;
	}

	public void setMme58hus23(String mme58hus23) {
		this.mme58hus23 = mme58hus23;
	}

	@Column(name = "MME58HUS24")
	public String getMme58hus24() {
		return this.mme58hus24;
	}

	public void setMme58hus24(String mme58hus24) {
		this.mme58hus24 = mme58hus24;
	}

	@Column(name = "MME58HUS25")
	public String getMme58hus25() {
		return this.mme58hus25;
	}

	public void setMme58hus25(String mme58hus25) {
		this.mme58hus25 = mme58hus25;
	}

	@Column(name = "MME58HUS26")
	public String getMme58hus26() {
		return this.mme58hus26;
	}

	public void setMme58hus26(String mme58hus26) {
		this.mme58hus26 = mme58hus26;
	}

	@Column(name = "MME58HUS27")
	public String getMme58hus27() {
		return this.mme58hus27;
	}

	public void setMme58hus27(String mme58hus27) {
		this.mme58hus27 = mme58hus27;
	}

	@Column(name = "MME58HUS28")
	public String getMme58hus28() {
		return this.mme58hus28;
	}

	public void setMme58hus28(String mme58hus28) {
		this.mme58hus28 = mme58hus28;
	}

	@Column(name = "MME58HUS29")
	public String getMme58hus29() {
		return this.mme58hus29;
	}

	public void setMme58hus29(String mme58hus29) {
		this.mme58hus29 = mme58hus29;
	}

	@Column(name = "MME58HUS30")
	public String getMme58hus30() {
		return this.mme58hus30;
	}

	public void setMme58hus30(String mme58hus30) {
		this.mme58hus30 = mme58hus30;
	}

	@Column(name = "MME58HUN01", precision = 22, scale = 0)
	public BigDecimal getMme58hun01() {
		return this.mme58hun01;
	}

	public void setMme58hun01(BigDecimal mme58hun01) {
		this.mme58hun01 = mme58hun01;
	}

	@Column(name = "MME58HUN02", precision = 22, scale = 0)
	public BigDecimal getMme58hun02() {
		return this.mme58hun02;
	}

	public void setMme58hun02(BigDecimal mme58hun02) {
		this.mme58hun02 = mme58hun02;
	}

	@Column(name = "MME58HUN03", precision = 22, scale = 0)
	public BigDecimal getMme58hun03() {
		return this.mme58hun03;
	}

	public void setMme58hun03(BigDecimal mme58hun03) {
		this.mme58hun03 = mme58hun03;
	}

	@Column(name = "MME58HUN04", precision = 22, scale = 0)
	public BigDecimal getMme58hun04() {
		return this.mme58hun04;
	}

	public void setMme58hun04(BigDecimal mme58hun04) {
		this.mme58hun04 = mme58hun04;
	}

	@Column(name = "MME58HUN05", precision = 22, scale = 0)
	public BigDecimal getMme58hun05() {
		return this.mme58hun05;
	}

	public void setMme58hun05(BigDecimal mme58hun05) {
		this.mme58hun05 = mme58hun05;
	}

	@Column(name = "MME58HUD01", precision = 6, scale = 0)
	public Integer getMme58hud01() {
		return this.mme58hud01;
	}

	public void setMme58hud01(Integer mme58hud01) {
		this.mme58hud01 = mme58hud01;
	}

	@Column(name = "MME58HUD02", precision = 6, scale = 0)
	public Integer getMme58hud02() {
		return this.mme58hud02;
	}

	public void setMme58hud02(Integer mme58hud02) {
		this.mme58hud02 = mme58hud02;
	}

	@Column(name = "MME58HUD03", precision = 6, scale = 0)
	public Integer getMme58hud03() {
		return this.mme58hud03;
	}

	public void setMme58hud03(Integer mme58hud03) {
		this.mme58hud03 = mme58hud03;
	}

	@Column(name = "MME58HUD04", precision = 6, scale = 0)
	public Integer getMme58hud04() {
		return this.mme58hud04;
	}

	public void setMme58hud04(Integer mme58hud04) {
		this.mme58hud04 = mme58hud04;
	}

	@Column(name = "MME58HUD05", precision = 6, scale = 0)
	public Integer getMme58hud05() {
		return this.mme58hud05;
	}

	public void setMme58hud05(Integer mme58hud05) {
		this.mme58hud05 = mme58hud05;
	}

	@Column(name = "MMAN81", precision = 22, scale = 0)
	public BigDecimal getMman81() {
		return this.mman81;
	}

	public void setMman81(BigDecimal mman81) {
		this.mman81 = mman81;
	}

	@Column(name = "MMAN82", precision = 22, scale = 0)
	public BigDecimal getMman82() {
		return this.mman82;
	}

	public void setMman82(BigDecimal mman82) {
		this.mman82 = mman82;
	}

	@Column(name = "MMMCU")
	public String getMmmcu() {
		return this.mmmcu;
	}

	public void setMmmcu(String mmmcu) {
		this.mmmcu = mmmcu;
	}

	@Column(name = "MMEMCU")
	public String getMmemcu() {
		return this.mmemcu;
	}

	public void setMmemcu(String mmemcu) {
		this.mmemcu = mmemcu;
	}

	@Column(name = "MME55USER")
	public String getMme55user() {
		return this.mme55user;
	}

	public void setMme55user(String mme55user) {
		this.mme55user = mme55user;
	}

	@Column(name = "MMACL", precision = 22, scale = 0)
	public BigDecimal getMmacl() {
		return this.mmacl;
	}

	public void setMmacl(BigDecimal mmacl) {
		this.mmacl = mmacl;
	}

	@Column(name = "MMTRAR")
	public String getMmtrar() {
		return this.mmtrar;
	}

	public void setMmtrar(String mmtrar) {
		this.mmtrar = mmtrar;
	}

	@Column(name = "MMAMTU", precision = 22, scale = 0)
	public BigDecimal getMmamtu() {
		return this.mmamtu;
	}

	public void setMmamtu(BigDecimal mmamtu) {
		this.mmamtu = mmamtu;
	}

	@Column(name = "MME58NMCC")
	public String getMme58nmcc() {
		return this.mme58nmcc;
	}

	public void setMme58nmcc(String mme58nmcc) {
		this.mme58nmcc = mme58nmcc;
	}

	@Column(name = "MMCO")
	public String getMmco() {
		return this.mmco;
	}

	public void setMmco(String mmco) {
		this.mmco = mmco;
	}

	@Column(name = "MME58HSCTM")
	public String getMme58hsctm() {
		return this.mme58hsctm;
	}

	public void setMme58hsctm(String mme58hsctm) {
		this.mme58hsctm = mme58hsctm;
	}

	@Column(name = "MME58HSJUT")
	public String getMme58hsjut() {
		return this.mme58hsjut;
	}

	public void setMme58hsjut(String mme58hsjut) {
		this.mme58hsjut = mme58hsjut;
	}

	@Column(name = "MME58HSBUT")
	public String getMme58hsbut() {
		return this.mme58hsbut;
	}

	public void setMme58hsbut(String mme58hsbut) {
		this.mme58hsbut = mme58hsbut;
	}

	@Column(name = "MMEV01")
	public String getMmev01() {
		return this.mmev01;
	}

	public void setMmev01(String mmev01) {
		this.mmev01 = mmev01;
	}

	@Column(name = "MMEV02")
	public String getMmev02() {
		return this.mmev02;
	}

	public void setMmev02(String mmev02) {
		this.mmev02 = mmev02;
	}

	@Column(name = "MMEV03")
	public String getMmev03() {
		return this.mmev03;
	}

	public void setMmev03(String mmev03) {
		this.mmev03 = mmev03;
	}

	@Column(name = "MMEV04")
	public String getMmev04() {
		return this.mmev04;
	}

	public void setMmev04(String mmev04) {
		this.mmev04 = mmev04;
	}

}