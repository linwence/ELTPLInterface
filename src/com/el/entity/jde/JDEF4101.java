package com.el.entity.jde;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * F4101 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "F4101", uniqueConstraints = {
		@UniqueConstraint(columnNames = "IMAITM"),
		@UniqueConstraint(columnNames = "IMLITM") })
public class JDEF4101 implements java.io.Serializable {

	// Fields

	private BigDecimal imitm;
	private String imlitm;
	private String imaitm;
	private String imdsc1;
	private String imdsc2;
	private String imsrtx;
	private String imaln;
	private String imsrp1;
	private String imsrp2;
	private String imsrp3;
	private String imsrp4;
	private String imsrp5;
	private String imsrp6;
	private String imsrp7;
	private String imsrp8;
	private String imsrp9;
	private String imsrp0;
	private String imprp1;
	private String imprp2;
	private String imprp3;
	private String imprp4;
	private String imprp5;
	private String imprp6;
	private String imprp7;
	private String imprp8;
	private String imprp9;
	private String imprp0;
	private String imcdcd;
	private String impdgr;
	private String imdsgp;
	private String imprgr;
	private String imrprc;
	private String imorpr;
	private BigDecimal imbuyr;
	private String imdraw;
	private String imrvno;
	private String imdsze;
	private BigDecimal imvcud;
	private BigDecimal imcars;
	private BigDecimal imcarp;
	private String imshcn;
	private String imshcm;
	private String imuom1;
	private String imuom2;
	private String imuom3;
	private String imuom4;
	private String imuom6;
	private String imuom8;
	private String imuom9;
	private String imuwum;
	private String imuvm1;
	private String imsutm;
	private String imumvw;
	private String imcycl;
	private String imglpt;
	private String implev;
	private String impplv;
	private String imclev;
	private String imprpo;
	private String imckav;
	private String imbpfg;
	private String imsrce;
	private String imot1y;
	private String imot2y;
	private BigDecimal imstdp;
	private BigDecimal imfrmp;
	private BigDecimal imthrp;
	private String imstdg;
	private String imfrgd;
	private String imthgd;
	private String imcoty;
	private String imstkt;
	private String imlnty;
	private String imcont;
	private String imback;
	private String imifla;
	private String imtfla;
	private String iminmg;
	private String imabcs;
	private String imabcm;
	private String imabci;
	private String imovr;
	private String imwarr;
	private String imcmcg;
	private String imsrnr;
	private String impmth;
	private String imfifo;
	private String imlots;
	private BigDecimal imsld;
	private BigDecimal imanpl;
	private String immpst;
	private BigDecimal impctm;
	private BigDecimal immmpc;
	private String imptsc;
	private String imsns;
	private BigDecimal imltlv;
	private BigDecimal imltmf;
	private BigDecimal imltcm;
	private String imopc;
	private BigDecimal imopv;
	private BigDecimal imacq;
	private BigDecimal immlq;
	private BigDecimal imltpu;
	private String immpsp;
	private String immrpp;
	private String imitc;
	private String imordw;
	private BigDecimal immtf1;
	private BigDecimal immtf2;
	private BigDecimal immtf3;
	private BigDecimal immtf4;
	private BigDecimal immtf5;
	private BigDecimal imexpd;
	private BigDecimal imdefd;
	private BigDecimal imsflt;
	private String immake;
	private String imcoby;
	private BigDecimal imllx;
	private String imcmgl;
	private BigDecimal imcomh;
	private String imurcd;
	private Integer imurdt;
	private BigDecimal imurat;
	private BigDecimal imurab;
	private String imurrf;
	private String imuser;
	private String impid;
	private String imjobn;
	private Integer imupmj;
	private BigDecimal imtday;
	private String imupcn;
	private String imscc0;
	private String imumup;
	private String imumdf;
	private String imums0;
	private String imums1;
	private String imums2;
	private String imums3;
	private String imums4;
	private String imums5;
	private String imums6;
	private String imums7;
	private String imums8;
	private String impoc;
	private BigDecimal imavrt;
	private String imeqty;
	private String imwtrq;
	private String imtmpl;
	private String imseg1;
	private String imseg2;
	private String imseg3;
	private String imseg4;
	private String imseg5;
	private String imseg6;
	private String imseg7;
	private String imseg8;
	private String imseg9;
	private String imseg0;
	private String immic;
	private String imaing;
	private BigDecimal imbbdd;
	private String imcmdm;
	private String imlecm;
	private BigDecimal imledd;
	private BigDecimal impefd;
	private BigDecimal imsbdd;
	private BigDecimal imu1dd;
	private BigDecimal imu2dd;
	private BigDecimal imu3dd;
	private BigDecimal imu4dd;
	private BigDecimal imu5dd;
	private BigDecimal imdltl;
	private String imdppo;
	private String imdual;
	private String imxdck;
	private String imlaf;
	private String imltfm;
	private String imrwla;
	private String imlnpa;
	private String imlotc;
	private String imapsc;
	private String imauom;
	private String imconb;
	private String imgcmp;
	private BigDecimal impri1;
	private BigDecimal impri2;
	private String imashl;
	private String imvminv;
	private String imcmeth;
	private String imexpi;
	private BigDecimal imopth;
	private BigDecimal imcuth;
	private String imumth;
	private String imlmfg;
	private String imline;
	private BigDecimal imdftpct;
	private String imkbit;
	private String imdfenditm;
	private String imkanexll;
	private String imscpsell;
	private BigDecimal immopth;
	private BigDecimal immcuth;
	private String imcumth;
	private String imatprn;
	private String imatpca;
	private String imatpac;
	private String imcoore;
	private String imvcpfc;
	private String impnyn;
	private String shopid;
	private BigDecimal qty;

	// Constructors

	/** default constructor */
	public JDEF4101() {
	}

	/** minimal constructor */
	public JDEF4101(BigDecimal imitm) {
		this.imitm = imitm;
	}

	/** full constructor */
	public JDEF4101(BigDecimal imitm, String imlitm, String imaitm, String imdsc1,
			String imdsc2, String imsrtx, String imaln, String imsrp1,
			String imsrp2, String imsrp3, String imsrp4, String imsrp5,
			String imsrp6, String imsrp7, String imsrp8, String imsrp9,
			String imsrp0, String imprp1, String imprp2, String imprp3,
			String imprp4, String imprp5, String imprp6, String imprp7,
			String imprp8, String imprp9, String imprp0, String imcdcd,
			String impdgr, String imdsgp, String imprgr, String imrprc,
			String imorpr, BigDecimal imbuyr, String imdraw, String imrvno,
			String imdsze, BigDecimal imvcud, BigDecimal imcars,
			BigDecimal imcarp, String imshcn, String imshcm, String imuom1,
			String imuom2, String imuom3, String imuom4, String imuom6,
			String imuom8, String imuom9, String imuwum, String imuvm1,
			String imsutm, String imumvw, String imcycl, String imglpt,
			String implev, String impplv, String imclev, String imprpo,
			String imckav, String imbpfg, String imsrce, String imot1y,
			String imot2y, BigDecimal imstdp, BigDecimal imfrmp,
			BigDecimal imthrp, String imstdg, String imfrgd, String imthgd,
			String imcoty, String imstkt, String imlnty, String imcont,
			String imback, String imifla, String imtfla, String iminmg,
			String imabcs, String imabcm, String imabci, String imovr,
			String imwarr, String imcmcg, String imsrnr, String impmth,
			String imfifo, String imlots, BigDecimal imsld, BigDecimal imanpl,
			String immpst, BigDecimal impctm, BigDecimal immmpc, String imptsc,
			String imsns, BigDecimal imltlv, BigDecimal imltmf,
			BigDecimal imltcm, String imopc, BigDecimal imopv,
			BigDecimal imacq, BigDecimal immlq, BigDecimal imltpu,
			String immpsp, String immrpp, String imitc, String imordw,
			BigDecimal immtf1, BigDecimal immtf2, BigDecimal immtf3,
			BigDecimal immtf4, BigDecimal immtf5, BigDecimal imexpd,
			BigDecimal imdefd, BigDecimal imsflt, String immake, String imcoby,
			BigDecimal imllx, String imcmgl, BigDecimal imcomh, String imurcd,
			Integer imurdt, BigDecimal imurat, BigDecimal imurab,
			String imurrf, String imuser, String impid, String imjobn,
			Integer imupmj, BigDecimal imtday, String imupcn, String imscc0,
			String imumup, String imumdf, String imums0, String imums1,
			String imums2, String imums3, String imums4, String imums5,
			String imums6, String imums7, String imums8, String impoc,
			BigDecimal imavrt, String imeqty, String imwtrq, String imtmpl,
			String imseg1, String imseg2, String imseg3, String imseg4,
			String imseg5, String imseg6, String imseg7, String imseg8,
			String imseg9, String imseg0, String immic, String imaing,
			BigDecimal imbbdd, String imcmdm, String imlecm, BigDecimal imledd,
			BigDecimal impefd, BigDecimal imsbdd, BigDecimal imu1dd,
			BigDecimal imu2dd, BigDecimal imu3dd, BigDecimal imu4dd,
			BigDecimal imu5dd, BigDecimal imdltl, String imdppo, String imdual,
			String imxdck, String imlaf, String imltfm, String imrwla,
			String imlnpa, String imlotc, String imapsc, String imauom,
			String imconb, String imgcmp, BigDecimal impri1, BigDecimal impri2,
			String imashl, String imvminv, String imcmeth, String imexpi,
			BigDecimal imopth, BigDecimal imcuth, String imumth, String imlmfg,
			String imline, BigDecimal imdftpct, String imkbit,
			String imdfenditm, String imkanexll, String imscpsell,
			BigDecimal immopth, BigDecimal immcuth, String imcumth,
			String imatprn, String imatpca, String imatpac, String imcoore,
			String imvcpfc, String impnyn) {
		this.imitm = imitm;
		this.imlitm = imlitm;
		this.imaitm = imaitm;
		this.imdsc1 = imdsc1;
		this.imdsc2 = imdsc2;
		this.imsrtx = imsrtx;
		this.imaln = imaln;
		this.imsrp1 = imsrp1;
		this.imsrp2 = imsrp2;
		this.imsrp3 = imsrp3;
		this.imsrp4 = imsrp4;
		this.imsrp5 = imsrp5;
		this.imsrp6 = imsrp6;
		this.imsrp7 = imsrp7;
		this.imsrp8 = imsrp8;
		this.imsrp9 = imsrp9;
		this.imsrp0 = imsrp0;
		this.imprp1 = imprp1;
		this.imprp2 = imprp2;
		this.imprp3 = imprp3;
		this.imprp4 = imprp4;
		this.imprp5 = imprp5;
		this.imprp6 = imprp6;
		this.imprp7 = imprp7;
		this.imprp8 = imprp8;
		this.imprp9 = imprp9;
		this.imprp0 = imprp0;
		this.imcdcd = imcdcd;
		this.impdgr = impdgr;
		this.imdsgp = imdsgp;
		this.imprgr = imprgr;
		this.imrprc = imrprc;
		this.imorpr = imorpr;
		this.imbuyr = imbuyr;
		this.imdraw = imdraw;
		this.imrvno = imrvno;
		this.imdsze = imdsze;
		this.imvcud = imvcud;
		this.imcars = imcars;
		this.imcarp = imcarp;
		this.imshcn = imshcn;
		this.imshcm = imshcm;
		this.imuom1 = imuom1;
		this.imuom2 = imuom2;
		this.imuom3 = imuom3;
		this.imuom4 = imuom4;
		this.imuom6 = imuom6;
		this.imuom8 = imuom8;
		this.imuom9 = imuom9;
		this.imuwum = imuwum;
		this.imuvm1 = imuvm1;
		this.imsutm = imsutm;
		this.imumvw = imumvw;
		this.imcycl = imcycl;
		this.imglpt = imglpt;
		this.implev = implev;
		this.impplv = impplv;
		this.imclev = imclev;
		this.imprpo = imprpo;
		this.imckav = imckav;
		this.imbpfg = imbpfg;
		this.imsrce = imsrce;
		this.imot1y = imot1y;
		this.imot2y = imot2y;
		this.imstdp = imstdp;
		this.imfrmp = imfrmp;
		this.imthrp = imthrp;
		this.imstdg = imstdg;
		this.imfrgd = imfrgd;
		this.imthgd = imthgd;
		this.imcoty = imcoty;
		this.imstkt = imstkt;
		this.imlnty = imlnty;
		this.imcont = imcont;
		this.imback = imback;
		this.imifla = imifla;
		this.imtfla = imtfla;
		this.iminmg = iminmg;
		this.imabcs = imabcs;
		this.imabcm = imabcm;
		this.imabci = imabci;
		this.imovr = imovr;
		this.imwarr = imwarr;
		this.imcmcg = imcmcg;
		this.imsrnr = imsrnr;
		this.impmth = impmth;
		this.imfifo = imfifo;
		this.imlots = imlots;
		this.imsld = imsld;
		this.imanpl = imanpl;
		this.immpst = immpst;
		this.impctm = impctm;
		this.immmpc = immmpc;
		this.imptsc = imptsc;
		this.imsns = imsns;
		this.imltlv = imltlv;
		this.imltmf = imltmf;
		this.imltcm = imltcm;
		this.imopc = imopc;
		this.imopv = imopv;
		this.imacq = imacq;
		this.immlq = immlq;
		this.imltpu = imltpu;
		this.immpsp = immpsp;
		this.immrpp = immrpp;
		this.imitc = imitc;
		this.imordw = imordw;
		this.immtf1 = immtf1;
		this.immtf2 = immtf2;
		this.immtf3 = immtf3;
		this.immtf4 = immtf4;
		this.immtf5 = immtf5;
		this.imexpd = imexpd;
		this.imdefd = imdefd;
		this.imsflt = imsflt;
		this.immake = immake;
		this.imcoby = imcoby;
		this.imllx = imllx;
		this.imcmgl = imcmgl;
		this.imcomh = imcomh;
		this.imurcd = imurcd;
		this.imurdt = imurdt;
		this.imurat = imurat;
		this.imurab = imurab;
		this.imurrf = imurrf;
		this.imuser = imuser;
		this.impid = impid;
		this.imjobn = imjobn;
		this.imupmj = imupmj;
		this.imtday = imtday;
		this.imupcn = imupcn;
		this.imscc0 = imscc0;
		this.imumup = imumup;
		this.imumdf = imumdf;
		this.imums0 = imums0;
		this.imums1 = imums1;
		this.imums2 = imums2;
		this.imums3 = imums3;
		this.imums4 = imums4;
		this.imums5 = imums5;
		this.imums6 = imums6;
		this.imums7 = imums7;
		this.imums8 = imums8;
		this.impoc = impoc;
		this.imavrt = imavrt;
		this.imeqty = imeqty;
		this.imwtrq = imwtrq;
		this.imtmpl = imtmpl;
		this.imseg1 = imseg1;
		this.imseg2 = imseg2;
		this.imseg3 = imseg3;
		this.imseg4 = imseg4;
		this.imseg5 = imseg5;
		this.imseg6 = imseg6;
		this.imseg7 = imseg7;
		this.imseg8 = imseg8;
		this.imseg9 = imseg9;
		this.imseg0 = imseg0;
		this.immic = immic;
		this.imaing = imaing;
		this.imbbdd = imbbdd;
		this.imcmdm = imcmdm;
		this.imlecm = imlecm;
		this.imledd = imledd;
		this.impefd = impefd;
		this.imsbdd = imsbdd;
		this.imu1dd = imu1dd;
		this.imu2dd = imu2dd;
		this.imu3dd = imu3dd;
		this.imu4dd = imu4dd;
		this.imu5dd = imu5dd;
		this.imdltl = imdltl;
		this.imdppo = imdppo;
		this.imdual = imdual;
		this.imxdck = imxdck;
		this.imlaf = imlaf;
		this.imltfm = imltfm;
		this.imrwla = imrwla;
		this.imlnpa = imlnpa;
		this.imlotc = imlotc;
		this.imapsc = imapsc;
		this.imauom = imauom;
		this.imconb = imconb;
		this.imgcmp = imgcmp;
		this.impri1 = impri1;
		this.impri2 = impri2;
		this.imashl = imashl;
		this.imvminv = imvminv;
		this.imcmeth = imcmeth;
		this.imexpi = imexpi;
		this.imopth = imopth;
		this.imcuth = imcuth;
		this.imumth = imumth;
		this.imlmfg = imlmfg;
		this.imline = imline;
		this.imdftpct = imdftpct;
		this.imkbit = imkbit;
		this.imdfenditm = imdfenditm;
		this.imkanexll = imkanexll;
		this.imscpsell = imscpsell;
		this.immopth = immopth;
		this.immcuth = immcuth;
		this.imcumth = imcumth;
		this.imatprn = imatprn;
		this.imatpca = imatpca;
		this.imatpac = imatpac;
		this.imcoore = imcoore;
		this.imvcpfc = imvcpfc;
		this.impnyn = impnyn;
	}

	// Property accessors
	@Id
	@Column(name = "IMITM", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getImitm() {
		return this.imitm;
	}

	public void setImitm(BigDecimal imitm) {
		this.imitm = imitm;
	}

	@Column(name = "IMLITM", unique = true)
	public String getImlitm() {
		return this.imlitm;
	}

	public void setImlitm(String imlitm) {
		this.imlitm = imlitm;
	}

	@Column(name = "IMAITM", unique = true)
	public String getImaitm() {
		return this.imaitm;
	}

	public void setImaitm(String imaitm) {
		this.imaitm = imaitm;
	}

	@Column(name = "IMDSC1")
	public String getImdsc1() {
		return this.imdsc1;
	}

	public void setImdsc1(String imdsc1) {
		this.imdsc1 = imdsc1;
	}

	@Column(name = "IMDSC2")
	public String getImdsc2() {
		return this.imdsc2;
	}

	public void setImdsc2(String imdsc2) {
		this.imdsc2 = imdsc2;
	}

	@Column(name = "IMSRTX")
	public String getImsrtx() {
		return this.imsrtx;
	}

	public void setImsrtx(String imsrtx) {
		this.imsrtx = imsrtx;
	}

	@Column(name = "IMALN")
	public String getImaln() {
		return this.imaln;
	}

	public void setImaln(String imaln) {
		this.imaln = imaln;
	}

	@Column(name = "IMSRP1")
	public String getImsrp1() {
		return this.imsrp1;
	}

	public void setImsrp1(String imsrp1) {
		this.imsrp1 = imsrp1;
	}

	@Column(name = "IMSRP2")
	public String getImsrp2() {
		return this.imsrp2;
	}

	public void setImsrp2(String imsrp2) {
		this.imsrp2 = imsrp2;
	}

	@Column(name = "IMSRP3")
	public String getImsrp3() {
		return this.imsrp3;
	}

	public void setImsrp3(String imsrp3) {
		this.imsrp3 = imsrp3;
	}

	@Column(name = "IMSRP4")
	public String getImsrp4() {
		return this.imsrp4;
	}

	public void setImsrp4(String imsrp4) {
		this.imsrp4 = imsrp4;
	}

	@Column(name = "IMSRP5")
	public String getImsrp5() {
		return this.imsrp5;
	}

	public void setImsrp5(String imsrp5) {
		this.imsrp5 = imsrp5;
	}

	@Column(name = "IMSRP6")
	public String getImsrp6() {
		return this.imsrp6;
	}

	public void setImsrp6(String imsrp6) {
		this.imsrp6 = imsrp6;
	}

	@Column(name = "IMSRP7")
	public String getImsrp7() {
		return this.imsrp7;
	}

	public void setImsrp7(String imsrp7) {
		this.imsrp7 = imsrp7;
	}

	@Column(name = "IMSRP8")
	public String getImsrp8() {
		return this.imsrp8;
	}

	public void setImsrp8(String imsrp8) {
		this.imsrp8 = imsrp8;
	}

	@Column(name = "IMSRP9")
	public String getImsrp9() {
		return this.imsrp9;
	}

	public void setImsrp9(String imsrp9) {
		this.imsrp9 = imsrp9;
	}

	@Column(name = "IMSRP0")
	public String getImsrp0() {
		return this.imsrp0;
	}

	public void setImsrp0(String imsrp0) {
		this.imsrp0 = imsrp0;
	}

	@Column(name = "IMPRP1")
	public String getImprp1() {
		return this.imprp1;
	}

	public void setImprp1(String imprp1) {
		this.imprp1 = imprp1;
	}

	@Column(name = "IMPRP2")
	public String getImprp2() {
		return this.imprp2;
	}

	public void setImprp2(String imprp2) {
		this.imprp2 = imprp2;
	}

	@Column(name = "IMPRP3")
	public String getImprp3() {
		return this.imprp3;
	}

	public void setImprp3(String imprp3) {
		this.imprp3 = imprp3;
	}

	@Column(name = "IMPRP4")
	public String getImprp4() {
		return this.imprp4;
	}

	public void setImprp4(String imprp4) {
		this.imprp4 = imprp4;
	}

	@Column(name = "IMPRP5")
	public String getImprp5() {
		return this.imprp5;
	}

	public void setImprp5(String imprp5) {
		this.imprp5 = imprp5;
	}

	@Column(name = "IMPRP6")
	public String getImprp6() {
		return this.imprp6;
	}

	public void setImprp6(String imprp6) {
		this.imprp6 = imprp6;
	}

	@Column(name = "IMPRP7")
	public String getImprp7() {
		return this.imprp7;
	}

	public void setImprp7(String imprp7) {
		this.imprp7 = imprp7;
	}

	@Column(name = "IMPRP8")
	public String getImprp8() {
		return this.imprp8;
	}

	public void setImprp8(String imprp8) {
		this.imprp8 = imprp8;
	}

	@Column(name = "IMPRP9")
	public String getImprp9() {
		return this.imprp9;
	}

	public void setImprp9(String imprp9) {
		this.imprp9 = imprp9;
	}

	@Column(name = "IMPRP0")
	public String getImprp0() {
		return this.imprp0;
	}

	public void setImprp0(String imprp0) {
		this.imprp0 = imprp0;
	}

	@Column(name = "IMCDCD")
	public String getImcdcd() {
		return this.imcdcd;
	}

	public void setImcdcd(String imcdcd) {
		this.imcdcd = imcdcd;
	}

	@Column(name = "IMPDGR")
	public String getImpdgr() {
		return this.impdgr;
	}

	public void setImpdgr(String impdgr) {
		this.impdgr = impdgr;
	}

	@Column(name = "IMDSGP")
	public String getImdsgp() {
		return this.imdsgp;
	}

	public void setImdsgp(String imdsgp) {
		this.imdsgp = imdsgp;
	}

	@Column(name = "IMPRGR")
	public String getImprgr() {
		return this.imprgr;
	}

	public void setImprgr(String imprgr) {
		this.imprgr = imprgr;
	}

	@Column(name = "IMRPRC")
	public String getImrprc() {
		return this.imrprc;
	}

	public void setImrprc(String imrprc) {
		this.imrprc = imrprc;
	}

	@Column(name = "IMORPR")
	public String getImorpr() {
		return this.imorpr;
	}

	public void setImorpr(String imorpr) {
		this.imorpr = imorpr;
	}

	@Column(name = "IMBUYR", precision = 22, scale = 0)
	public BigDecimal getImbuyr() {
		return this.imbuyr;
	}

	public void setImbuyr(BigDecimal imbuyr) {
		this.imbuyr = imbuyr;
	}

	@Column(name = "IMDRAW")
	public String getImdraw() {
		return this.imdraw;
	}

	public void setImdraw(String imdraw) {
		this.imdraw = imdraw;
	}

	@Column(name = "IMRVNO")
	public String getImrvno() {
		return this.imrvno;
	}

	public void setImrvno(String imrvno) {
		this.imrvno = imrvno;
	}

	@Column(name = "IMDSZE")
	public String getImdsze() {
		return this.imdsze;
	}

	public void setImdsze(String imdsze) {
		this.imdsze = imdsze;
	}

	@Column(name = "IMVCUD", precision = 22, scale = 0)
	public BigDecimal getImvcud() {
		return this.imvcud;
	}

	public void setImvcud(BigDecimal imvcud) {
		this.imvcud = imvcud;
	}

	@Column(name = "IMCARS", precision = 22, scale = 0)
	public BigDecimal getImcars() {
		return this.imcars;
	}

	public void setImcars(BigDecimal imcars) {
		this.imcars = imcars;
	}

	@Column(name = "IMCARP", precision = 22, scale = 0)
	public BigDecimal getImcarp() {
		return this.imcarp;
	}

	public void setImcarp(BigDecimal imcarp) {
		this.imcarp = imcarp;
	}

	@Column(name = "IMSHCN")
	public String getImshcn() {
		return this.imshcn;
	}

	public void setImshcn(String imshcn) {
		this.imshcn = imshcn;
	}

	@Column(name = "IMSHCM")
	public String getImshcm() {
		return this.imshcm;
	}

	public void setImshcm(String imshcm) {
		this.imshcm = imshcm;
	}

	@Column(name = "IMUOM1")
	public String getImuom1() {
		return this.imuom1;
	}

	public void setImuom1(String imuom1) {
		this.imuom1 = imuom1;
	}

	@Column(name = "IMUOM2")
	public String getImuom2() {
		return this.imuom2;
	}

	public void setImuom2(String imuom2) {
		this.imuom2 = imuom2;
	}

	@Column(name = "IMUOM3")
	public String getImuom3() {
		return this.imuom3;
	}

	public void setImuom3(String imuom3) {
		this.imuom3 = imuom3;
	}

	@Column(name = "IMUOM4")
	public String getImuom4() {
		return this.imuom4;
	}

	public void setImuom4(String imuom4) {
		this.imuom4 = imuom4;
	}

	@Column(name = "IMUOM6")
	public String getImuom6() {
		return this.imuom6;
	}

	public void setImuom6(String imuom6) {
		this.imuom6 = imuom6;
	}

	@Column(name = "IMUOM8")
	public String getImuom8() {
		return this.imuom8;
	}

	public void setImuom8(String imuom8) {
		this.imuom8 = imuom8;
	}

	@Column(name = "IMUOM9")
	public String getImuom9() {
		return this.imuom9;
	}

	public void setImuom9(String imuom9) {
		this.imuom9 = imuom9;
	}

	@Column(name = "IMUWUM")
	public String getImuwum() {
		return this.imuwum;
	}

	public void setImuwum(String imuwum) {
		this.imuwum = imuwum;
	}

	@Column(name = "IMUVM1")
	public String getImuvm1() {
		return this.imuvm1;
	}

	public void setImuvm1(String imuvm1) {
		this.imuvm1 = imuvm1;
	}

	@Column(name = "IMSUTM")
	public String getImsutm() {
		return this.imsutm;
	}

	public void setImsutm(String imsutm) {
		this.imsutm = imsutm;
	}

	@Column(name = "IMUMVW")
	public String getImumvw() {
		return this.imumvw;
	}

	public void setImumvw(String imumvw) {
		this.imumvw = imumvw;
	}

	@Column(name = "IMCYCL")
	public String getImcycl() {
		return this.imcycl;
	}

	public void setImcycl(String imcycl) {
		this.imcycl = imcycl;
	}

	@Column(name = "IMGLPT")
	public String getImglpt() {
		return this.imglpt;
	}

	public void setImglpt(String imglpt) {
		this.imglpt = imglpt;
	}

	@Column(name = "IMPLEV")
	public String getImplev() {
		return this.implev;
	}

	public void setImplev(String implev) {
		this.implev = implev;
	}

	@Column(name = "IMPPLV")
	public String getImpplv() {
		return this.impplv;
	}

	public void setImpplv(String impplv) {
		this.impplv = impplv;
	}

	@Column(name = "IMCLEV")
	public String getImclev() {
		return this.imclev;
	}

	public void setImclev(String imclev) {
		this.imclev = imclev;
	}

	@Column(name = "IMPRPO")
	public String getImprpo() {
		return this.imprpo;
	}

	public void setImprpo(String imprpo) {
		this.imprpo = imprpo;
	}

	@Column(name = "IMCKAV")
	public String getImckav() {
		return this.imckav;
	}

	public void setImckav(String imckav) {
		this.imckav = imckav;
	}

	@Column(name = "IMBPFG")
	public String getImbpfg() {
		return this.imbpfg;
	}

	public void setImbpfg(String imbpfg) {
		this.imbpfg = imbpfg;
	}

	@Column(name = "IMSRCE")
	public String getImsrce() {
		return this.imsrce;
	}

	public void setImsrce(String imsrce) {
		this.imsrce = imsrce;
	}

	@Column(name = "IMOT1Y")
	public String getImot1y() {
		return this.imot1y;
	}

	public void setImot1y(String imot1y) {
		this.imot1y = imot1y;
	}

	@Column(name = "IMOT2Y")
	public String getImot2y() {
		return this.imot2y;
	}

	public void setImot2y(String imot2y) {
		this.imot2y = imot2y;
	}

	@Column(name = "IMSTDP", precision = 22, scale = 0)
	public BigDecimal getImstdp() {
		return this.imstdp;
	}

	public void setImstdp(BigDecimal imstdp) {
		this.imstdp = imstdp;
	}

	@Column(name = "IMFRMP", precision = 22, scale = 0)
	public BigDecimal getImfrmp() {
		return this.imfrmp;
	}

	public void setImfrmp(BigDecimal imfrmp) {
		this.imfrmp = imfrmp;
	}

	@Column(name = "IMTHRP", precision = 22, scale = 0)
	public BigDecimal getImthrp() {
		return this.imthrp;
	}

	public void setImthrp(BigDecimal imthrp) {
		this.imthrp = imthrp;
	}

	@Column(name = "IMSTDG")
	public String getImstdg() {
		return this.imstdg;
	}

	public void setImstdg(String imstdg) {
		this.imstdg = imstdg;
	}

	@Column(name = "IMFRGD")
	public String getImfrgd() {
		return this.imfrgd;
	}

	public void setImfrgd(String imfrgd) {
		this.imfrgd = imfrgd;
	}

	@Column(name = "IMTHGD")
	public String getImthgd() {
		return this.imthgd;
	}

	public void setImthgd(String imthgd) {
		this.imthgd = imthgd;
	}

	@Column(name = "IMCOTY")
	public String getImcoty() {
		return this.imcoty;
	}

	public void setImcoty(String imcoty) {
		this.imcoty = imcoty;
	}

	@Column(name = "IMSTKT")
	public String getImstkt() {
		return this.imstkt;
	}

	public void setImstkt(String imstkt) {
		this.imstkt = imstkt;
	}

	@Column(name = "IMLNTY")
	public String getImlnty() {
		return this.imlnty;
	}

	public void setImlnty(String imlnty) {
		this.imlnty = imlnty;
	}

	@Column(name = "IMCONT")
	public String getImcont() {
		return this.imcont;
	}

	public void setImcont(String imcont) {
		this.imcont = imcont;
	}

	@Column(name = "IMBACK")
	public String getImback() {
		return this.imback;
	}

	public void setImback(String imback) {
		this.imback = imback;
	}

	@Column(name = "IMIFLA")
	public String getImifla() {
		return this.imifla;
	}

	public void setImifla(String imifla) {
		this.imifla = imifla;
	}

	@Column(name = "IMTFLA")
	public String getImtfla() {
		return this.imtfla;
	}

	public void setImtfla(String imtfla) {
		this.imtfla = imtfla;
	}

	@Column(name = "IMINMG")
	public String getIminmg() {
		return this.iminmg;
	}

	public void setIminmg(String iminmg) {
		this.iminmg = iminmg;
	}

	@Column(name = "IMABCS")
	public String getImabcs() {
		return this.imabcs;
	}

	public void setImabcs(String imabcs) {
		this.imabcs = imabcs;
	}

	@Column(name = "IMABCM")
	public String getImabcm() {
		return this.imabcm;
	}

	public void setImabcm(String imabcm) {
		this.imabcm = imabcm;
	}

	@Column(name = "IMABCI")
	public String getImabci() {
		return this.imabci;
	}

	public void setImabci(String imabci) {
		this.imabci = imabci;
	}

	@Column(name = "IMOVR")
	public String getImovr() {
		return this.imovr;
	}

	public void setImovr(String imovr) {
		this.imovr = imovr;
	}

	@Column(name = "IMWARR")
	public String getImwarr() {
		return this.imwarr;
	}

	public void setImwarr(String imwarr) {
		this.imwarr = imwarr;
	}

	@Column(name = "IMCMCG")
	public String getImcmcg() {
		return this.imcmcg;
	}

	public void setImcmcg(String imcmcg) {
		this.imcmcg = imcmcg;
	}

	@Column(name = "IMSRNR")
	public String getImsrnr() {
		return this.imsrnr;
	}

	public void setImsrnr(String imsrnr) {
		this.imsrnr = imsrnr;
	}

	@Column(name = "IMPMTH")
	public String getImpmth() {
		return this.impmth;
	}

	public void setImpmth(String impmth) {
		this.impmth = impmth;
	}

	@Column(name = "IMFIFO")
	public String getImfifo() {
		return this.imfifo;
	}

	public void setImfifo(String imfifo) {
		this.imfifo = imfifo;
	}

	@Column(name = "IMLOTS")
	public String getImlots() {
		return this.imlots;
	}

	public void setImlots(String imlots) {
		this.imlots = imlots;
	}

	@Column(name = "IMSLD", precision = 22, scale = 0)
	public BigDecimal getImsld() {
		return this.imsld;
	}

	public void setImsld(BigDecimal imsld) {
		this.imsld = imsld;
	}

	@Column(name = "IMANPL", precision = 22, scale = 0)
	public BigDecimal getImanpl() {
		return this.imanpl;
	}

	public void setImanpl(BigDecimal imanpl) {
		this.imanpl = imanpl;
	}

	@Column(name = "IMMPST")
	public String getImmpst() {
		return this.immpst;
	}

	public void setImmpst(String immpst) {
		this.immpst = immpst;
	}

	@Column(name = "IMPCTM", precision = 22, scale = 0)
	public BigDecimal getImpctm() {
		return this.impctm;
	}

	public void setImpctm(BigDecimal impctm) {
		this.impctm = impctm;
	}

	@Column(name = "IMMMPC", precision = 22, scale = 0)
	public BigDecimal getImmmpc() {
		return this.immmpc;
	}

	public void setImmmpc(BigDecimal immmpc) {
		this.immmpc = immmpc;
	}

	@Column(name = "IMPTSC")
	public String getImptsc() {
		return this.imptsc;
	}

	public void setImptsc(String imptsc) {
		this.imptsc = imptsc;
	}

	@Column(name = "IMSNS")
	public String getImsns() {
		return this.imsns;
	}

	public void setImsns(String imsns) {
		this.imsns = imsns;
	}

	@Column(name = "IMLTLV", precision = 22, scale = 0)
	public BigDecimal getImltlv() {
		return this.imltlv;
	}

	public void setImltlv(BigDecimal imltlv) {
		this.imltlv = imltlv;
	}

	@Column(name = "IMLTMF", precision = 22, scale = 0)
	public BigDecimal getImltmf() {
		return this.imltmf;
	}

	public void setImltmf(BigDecimal imltmf) {
		this.imltmf = imltmf;
	}

	@Column(name = "IMLTCM", precision = 22, scale = 0)
	public BigDecimal getImltcm() {
		return this.imltcm;
	}

	public void setImltcm(BigDecimal imltcm) {
		this.imltcm = imltcm;
	}

	@Column(name = "IMOPC")
	public String getImopc() {
		return this.imopc;
	}

	public void setImopc(String imopc) {
		this.imopc = imopc;
	}

	@Column(name = "IMOPV", precision = 22, scale = 0)
	public BigDecimal getImopv() {
		return this.imopv;
	}

	public void setImopv(BigDecimal imopv) {
		this.imopv = imopv;
	}

	@Column(name = "IMACQ", precision = 22, scale = 0)
	public BigDecimal getImacq() {
		return this.imacq;
	}

	public void setImacq(BigDecimal imacq) {
		this.imacq = imacq;
	}

	@Column(name = "IMMLQ", precision = 22, scale = 0)
	public BigDecimal getImmlq() {
		return this.immlq;
	}

	public void setImmlq(BigDecimal immlq) {
		this.immlq = immlq;
	}

	@Column(name = "IMLTPU", precision = 22, scale = 0)
	public BigDecimal getImltpu() {
		return this.imltpu;
	}

	public void setImltpu(BigDecimal imltpu) {
		this.imltpu = imltpu;
	}

	@Column(name = "IMMPSP")
	public String getImmpsp() {
		return this.immpsp;
	}

	public void setImmpsp(String immpsp) {
		this.immpsp = immpsp;
	}

	@Column(name = "IMMRPP")
	public String getImmrpp() {
		return this.immrpp;
	}

	public void setImmrpp(String immrpp) {
		this.immrpp = immrpp;
	}

	@Column(name = "IMITC")
	public String getImitc() {
		return this.imitc;
	}

	public void setImitc(String imitc) {
		this.imitc = imitc;
	}

	@Column(name = "IMORDW")
	public String getImordw() {
		return this.imordw;
	}

	public void setImordw(String imordw) {
		this.imordw = imordw;
	}

	@Column(name = "IMMTF1", precision = 22, scale = 0)
	public BigDecimal getImmtf1() {
		return this.immtf1;
	}

	public void setImmtf1(BigDecimal immtf1) {
		this.immtf1 = immtf1;
	}

	@Column(name = "IMMTF2", precision = 22, scale = 0)
	public BigDecimal getImmtf2() {
		return this.immtf2;
	}

	public void setImmtf2(BigDecimal immtf2) {
		this.immtf2 = immtf2;
	}

	@Column(name = "IMMTF3", precision = 22, scale = 0)
	public BigDecimal getImmtf3() {
		return this.immtf3;
	}

	public void setImmtf3(BigDecimal immtf3) {
		this.immtf3 = immtf3;
	}

	@Column(name = "IMMTF4", precision = 22, scale = 0)
	public BigDecimal getImmtf4() {
		return this.immtf4;
	}

	public void setImmtf4(BigDecimal immtf4) {
		this.immtf4 = immtf4;
	}

	@Column(name = "IMMTF5", precision = 22, scale = 0)
	public BigDecimal getImmtf5() {
		return this.immtf5;
	}

	public void setImmtf5(BigDecimal immtf5) {
		this.immtf5 = immtf5;
	}

	@Column(name = "IMEXPD", precision = 22, scale = 0)
	public BigDecimal getImexpd() {
		return this.imexpd;
	}

	public void setImexpd(BigDecimal imexpd) {
		this.imexpd = imexpd;
	}

	@Column(name = "IMDEFD", precision = 22, scale = 0)
	public BigDecimal getImdefd() {
		return this.imdefd;
	}

	public void setImdefd(BigDecimal imdefd) {
		this.imdefd = imdefd;
	}

	@Column(name = "IMSFLT", precision = 22, scale = 0)
	public BigDecimal getImsflt() {
		return this.imsflt;
	}

	public void setImsflt(BigDecimal imsflt) {
		this.imsflt = imsflt;
	}

	@Column(name = "IMMAKE")
	public String getImmake() {
		return this.immake;
	}

	public void setImmake(String immake) {
		this.immake = immake;
	}

	@Column(name = "IMCOBY")
	public String getImcoby() {
		return this.imcoby;
	}

	public void setImcoby(String imcoby) {
		this.imcoby = imcoby;
	}

	@Column(name = "IMLLX", precision = 22, scale = 0)
	public BigDecimal getImllx() {
		return this.imllx;
	}

	public void setImllx(BigDecimal imllx) {
		this.imllx = imllx;
	}

	@Column(name = "IMCMGL")
	public String getImcmgl() {
		return this.imcmgl;
	}

	public void setImcmgl(String imcmgl) {
		this.imcmgl = imcmgl;
	}

	@Column(name = "IMCOMH", precision = 22, scale = 0)
	public BigDecimal getImcomh() {
		return this.imcomh;
	}

	public void setImcomh(BigDecimal imcomh) {
		this.imcomh = imcomh;
	}

	@Column(name = "IMURCD")
	public String getImurcd() {
		return this.imurcd;
	}

	public void setImurcd(String imurcd) {
		this.imurcd = imurcd;
	}

	@Column(name = "IMURDT", precision = 6, scale = 0)
	public Integer getImurdt() {
		return this.imurdt;
	}

	public void setImurdt(Integer imurdt) {
		this.imurdt = imurdt;
	}

	@Column(name = "IMURAT", precision = 22, scale = 0)
	public BigDecimal getImurat() {
		return this.imurat;
	}

	public void setImurat(BigDecimal imurat) {
		this.imurat = imurat;
	}

	@Column(name = "IMURAB", precision = 22, scale = 0)
	public BigDecimal getImurab() {
		return this.imurab;
	}

	public void setImurab(BigDecimal imurab) {
		this.imurab = imurab;
	}

	@Column(name = "IMURRF")
	public String getImurrf() {
		return this.imurrf;
	}

	public void setImurrf(String imurrf) {
		this.imurrf = imurrf;
	}

	@Column(name = "IMUSER")
	public String getImuser() {
		return this.imuser;
	}

	public void setImuser(String imuser) {
		this.imuser = imuser;
	}

	@Column(name = "IMPID")
	public String getImpid() {
		return this.impid;
	}

	public void setImpid(String impid) {
		this.impid = impid;
	}

	@Column(name = "IMJOBN")
	public String getImjobn() {
		return this.imjobn;
	}

	public void setImjobn(String imjobn) {
		this.imjobn = imjobn;
	}

	@Column(name = "IMUPMJ", precision = 6, scale = 0)
	public Integer getImupmj() {
		return this.imupmj;
	}

	public void setImupmj(Integer imupmj) {
		this.imupmj = imupmj;
	}

	@Column(name = "IMTDAY", precision = 22, scale = 0)
	public BigDecimal getImtday() {
		return this.imtday;
	}

	public void setImtday(BigDecimal imtday) {
		this.imtday = imtday;
	}

	@Column(name = "IMUPCN")
	public String getImupcn() {
		return this.imupcn;
	}

	public void setImupcn(String imupcn) {
		this.imupcn = imupcn;
	}

	@Column(name = "IMSCC0")
	public String getImscc0() {
		return this.imscc0;
	}

	public void setImscc0(String imscc0) {
		this.imscc0 = imscc0;
	}

	@Column(name = "IMUMUP")
	public String getImumup() {
		return this.imumup;
	}

	public void setImumup(String imumup) {
		this.imumup = imumup;
	}

	@Column(name = "IMUMDF")
	public String getImumdf() {
		return this.imumdf;
	}

	public void setImumdf(String imumdf) {
		this.imumdf = imumdf;
	}

	@Column(name = "IMUMS0")
	public String getImums0() {
		return this.imums0;
	}

	public void setImums0(String imums0) {
		this.imums0 = imums0;
	}

	@Column(name = "IMUMS1")
	public String getImums1() {
		return this.imums1;
	}

	public void setImums1(String imums1) {
		this.imums1 = imums1;
	}

	@Column(name = "IMUMS2")
	public String getImums2() {
		return this.imums2;
	}

	public void setImums2(String imums2) {
		this.imums2 = imums2;
	}

	@Column(name = "IMUMS3")
	public String getImums3() {
		return this.imums3;
	}

	public void setImums3(String imums3) {
		this.imums3 = imums3;
	}

	@Column(name = "IMUMS4")
	public String getImums4() {
		return this.imums4;
	}

	public void setImums4(String imums4) {
		this.imums4 = imums4;
	}

	@Column(name = "IMUMS5")
	public String getImums5() {
		return this.imums5;
	}

	public void setImums5(String imums5) {
		this.imums5 = imums5;
	}

	@Column(name = "IMUMS6")
	public String getImums6() {
		return this.imums6;
	}

	public void setImums6(String imums6) {
		this.imums6 = imums6;
	}

	@Column(name = "IMUMS7")
	public String getImums7() {
		return this.imums7;
	}

	public void setImums7(String imums7) {
		this.imums7 = imums7;
	}

	@Column(name = "IMUMS8")
	public String getImums8() {
		return this.imums8;
	}

	public void setImums8(String imums8) {
		this.imums8 = imums8;
	}

	@Column(name = "IMPOC")
	public String getImpoc() {
		return this.impoc;
	}

	public void setImpoc(String impoc) {
		this.impoc = impoc;
	}

	@Column(name = "IMAVRT", precision = 22, scale = 0)
	public BigDecimal getImavrt() {
		return this.imavrt;
	}

	public void setImavrt(BigDecimal imavrt) {
		this.imavrt = imavrt;
	}

	@Column(name = "IMEQTY")
	public String getImeqty() {
		return this.imeqty;
	}

	public void setImeqty(String imeqty) {
		this.imeqty = imeqty;
	}

	@Column(name = "IMWTRQ")
	public String getImwtrq() {
		return this.imwtrq;
	}

	public void setImwtrq(String imwtrq) {
		this.imwtrq = imwtrq;
	}

	@Column(name = "IMTMPL")
	public String getImtmpl() {
		return this.imtmpl;
	}

	public void setImtmpl(String imtmpl) {
		this.imtmpl = imtmpl;
	}

	@Column(name = "IMSEG1")
	public String getImseg1() {
		return this.imseg1;
	}

	public void setImseg1(String imseg1) {
		this.imseg1 = imseg1;
	}

	@Column(name = "IMSEG2")
	public String getImseg2() {
		return this.imseg2;
	}

	public void setImseg2(String imseg2) {
		this.imseg2 = imseg2;
	}

	@Column(name = "IMSEG3")
	public String getImseg3() {
		return this.imseg3;
	}

	public void setImseg3(String imseg3) {
		this.imseg3 = imseg3;
	}

	@Column(name = "IMSEG4")
	public String getImseg4() {
		return this.imseg4;
	}

	public void setImseg4(String imseg4) {
		this.imseg4 = imseg4;
	}

	@Column(name = "IMSEG5")
	public String getImseg5() {
		return this.imseg5;
	}

	public void setImseg5(String imseg5) {
		this.imseg5 = imseg5;
	}

	@Column(name = "IMSEG6")
	public String getImseg6() {
		return this.imseg6;
	}

	public void setImseg6(String imseg6) {
		this.imseg6 = imseg6;
	}

	@Column(name = "IMSEG7")
	public String getImseg7() {
		return this.imseg7;
	}

	public void setImseg7(String imseg7) {
		this.imseg7 = imseg7;
	}

	@Column(name = "IMSEG8")
	public String getImseg8() {
		return this.imseg8;
	}

	public void setImseg8(String imseg8) {
		this.imseg8 = imseg8;
	}

	@Column(name = "IMSEG9")
	public String getImseg9() {
		return this.imseg9;
	}

	public void setImseg9(String imseg9) {
		this.imseg9 = imseg9;
	}

	@Column(name = "IMSEG0")
	public String getImseg0() {
		return this.imseg0;
	}

	public void setImseg0(String imseg0) {
		this.imseg0 = imseg0;
	}

	@Column(name = "IMMIC")
	public String getImmic() {
		return this.immic;
	}

	public void setImmic(String immic) {
		this.immic = immic;
	}

	@Column(name = "IMAING")
	public String getImaing() {
		return this.imaing;
	}

	public void setImaing(String imaing) {
		this.imaing = imaing;
	}

	@Column(name = "IMBBDD", precision = 22, scale = 0)
	public BigDecimal getImbbdd() {
		return this.imbbdd;
	}

	public void setImbbdd(BigDecimal imbbdd) {
		this.imbbdd = imbbdd;
	}

	@Column(name = "IMCMDM")
	public String getImcmdm() {
		return this.imcmdm;
	}

	public void setImcmdm(String imcmdm) {
		this.imcmdm = imcmdm;
	}

	@Column(name = "IMLECM")
	public String getImlecm() {
		return this.imlecm;
	}

	public void setImlecm(String imlecm) {
		this.imlecm = imlecm;
	}

	@Column(name = "IMLEDD", precision = 22, scale = 0)
	public BigDecimal getImledd() {
		return this.imledd;
	}

	public void setImledd(BigDecimal imledd) {
		this.imledd = imledd;
	}

	@Column(name = "IMPEFD", precision = 22, scale = 0)
	public BigDecimal getImpefd() {
		return this.impefd;
	}

	public void setImpefd(BigDecimal impefd) {
		this.impefd = impefd;
	}

	@Column(name = "IMSBDD", precision = 22, scale = 0)
	public BigDecimal getImsbdd() {
		return this.imsbdd;
	}

	public void setImsbdd(BigDecimal imsbdd) {
		this.imsbdd = imsbdd;
	}

	@Column(name = "IMU1DD", precision = 22, scale = 0)
	public BigDecimal getImu1dd() {
		return this.imu1dd;
	}

	public void setImu1dd(BigDecimal imu1dd) {
		this.imu1dd = imu1dd;
	}

	@Column(name = "IMU2DD", precision = 22, scale = 0)
	public BigDecimal getImu2dd() {
		return this.imu2dd;
	}

	public void setImu2dd(BigDecimal imu2dd) {
		this.imu2dd = imu2dd;
	}

	@Column(name = "IMU3DD", precision = 22, scale = 0)
	public BigDecimal getImu3dd() {
		return this.imu3dd;
	}

	public void setImu3dd(BigDecimal imu3dd) {
		this.imu3dd = imu3dd;
	}

	@Column(name = "IMU4DD", precision = 22, scale = 0)
	public BigDecimal getImu4dd() {
		return this.imu4dd;
	}

	public void setImu4dd(BigDecimal imu4dd) {
		this.imu4dd = imu4dd;
	}

	@Column(name = "IMU5DD", precision = 22, scale = 0)
	public BigDecimal getImu5dd() {
		return this.imu5dd;
	}

	public void setImu5dd(BigDecimal imu5dd) {
		this.imu5dd = imu5dd;
	}

	@Column(name = "IMDLTL", precision = 22, scale = 0)
	public BigDecimal getImdltl() {
		return this.imdltl;
	}

	public void setImdltl(BigDecimal imdltl) {
		this.imdltl = imdltl;
	}

	@Column(name = "IMDPPO")
	public String getImdppo() {
		return this.imdppo;
	}

	public void setImdppo(String imdppo) {
		this.imdppo = imdppo;
	}

	@Column(name = "IMDUAL")
	public String getImdual() {
		return this.imdual;
	}

	public void setImdual(String imdual) {
		this.imdual = imdual;
	}

	@Column(name = "IMXDCK")
	public String getImxdck() {
		return this.imxdck;
	}

	public void setImxdck(String imxdck) {
		this.imxdck = imxdck;
	}

	@Column(name = "IMLAF")
	public String getImlaf() {
		return this.imlaf;
	}

	public void setImlaf(String imlaf) {
		this.imlaf = imlaf;
	}

	@Column(name = "IMLTFM")
	public String getImltfm() {
		return this.imltfm;
	}

	public void setImltfm(String imltfm) {
		this.imltfm = imltfm;
	}

	@Column(name = "IMRWLA")
	public String getImrwla() {
		return this.imrwla;
	}

	public void setImrwla(String imrwla) {
		this.imrwla = imrwla;
	}

	@Column(name = "IMLNPA")
	public String getImlnpa() {
		return this.imlnpa;
	}

	public void setImlnpa(String imlnpa) {
		this.imlnpa = imlnpa;
	}

	@Column(name = "IMLOTC")
	public String getImlotc() {
		return this.imlotc;
	}

	public void setImlotc(String imlotc) {
		this.imlotc = imlotc;
	}

	@Column(name = "IMAPSC")
	public String getImapsc() {
		return this.imapsc;
	}

	public void setImapsc(String imapsc) {
		this.imapsc = imapsc;
	}

	@Column(name = "IMAUOM")
	public String getImauom() {
		return this.imauom;
	}

	public void setImauom(String imauom) {
		this.imauom = imauom;
	}

	@Column(name = "IMCONB")
	public String getImconb() {
		return this.imconb;
	}

	public void setImconb(String imconb) {
		this.imconb = imconb;
	}

	@Column(name = "IMGCMP")
	public String getImgcmp() {
		return this.imgcmp;
	}

	public void setImgcmp(String imgcmp) {
		this.imgcmp = imgcmp;
	}

	@Column(name = "IMPRI1", precision = 22, scale = 0)
	public BigDecimal getImpri1() {
		return this.impri1;
	}

	public void setImpri1(BigDecimal impri1) {
		this.impri1 = impri1;
	}

	@Column(name = "IMPRI2", precision = 22, scale = 0)
	public BigDecimal getImpri2() {
		return this.impri2;
	}

	public void setImpri2(BigDecimal impri2) {
		this.impri2 = impri2;
	}

	@Column(name = "IMASHL")
	public String getImashl() {
		return this.imashl;
	}

	public void setImashl(String imashl) {
		this.imashl = imashl;
	}

	@Column(name = "IMVMINV")
	public String getImvminv() {
		return this.imvminv;
	}

	public void setImvminv(String imvminv) {
		this.imvminv = imvminv;
	}

	@Column(name = "IMCMETH")
	public String getImcmeth() {
		return this.imcmeth;
	}

	public void setImcmeth(String imcmeth) {
		this.imcmeth = imcmeth;
	}

	@Column(name = "IMEXPI")
	public String getImexpi() {
		return this.imexpi;
	}

	public void setImexpi(String imexpi) {
		this.imexpi = imexpi;
	}

	@Column(name = "IMOPTH", precision = 22, scale = 0)
	public BigDecimal getImopth() {
		return this.imopth;
	}

	public void setImopth(BigDecimal imopth) {
		this.imopth = imopth;
	}

	@Column(name = "IMCUTH", precision = 22, scale = 0)
	public BigDecimal getImcuth() {
		return this.imcuth;
	}

	public void setImcuth(BigDecimal imcuth) {
		this.imcuth = imcuth;
	}

	@Column(name = "IMUMTH")
	public String getImumth() {
		return this.imumth;
	}

	public void setImumth(String imumth) {
		this.imumth = imumth;
	}

	@Column(name = "IMLMFG")
	public String getImlmfg() {
		return this.imlmfg;
	}

	public void setImlmfg(String imlmfg) {
		this.imlmfg = imlmfg;
	}

	@Column(name = "IMLINE")
	public String getImline() {
		return this.imline;
	}

	public void setImline(String imline) {
		this.imline = imline;
	}

	@Column(name = "IMDFTPCT", precision = 22, scale = 0)
	public BigDecimal getImdftpct() {
		return this.imdftpct;
	}

	public void setImdftpct(BigDecimal imdftpct) {
		this.imdftpct = imdftpct;
	}

	@Column(name = "IMKBIT")
	public String getImkbit() {
		return this.imkbit;
	}

	public void setImkbit(String imkbit) {
		this.imkbit = imkbit;
	}

	@Column(name = "IMDFENDITM")
	public String getImdfenditm() {
		return this.imdfenditm;
	}

	public void setImdfenditm(String imdfenditm) {
		this.imdfenditm = imdfenditm;
	}

	@Column(name = "IMKANEXLL")
	public String getImkanexll() {
		return this.imkanexll;
	}

	public void setImkanexll(String imkanexll) {
		this.imkanexll = imkanexll;
	}

	@Column(name = "IMSCPSELL")
	public String getImscpsell() {
		return this.imscpsell;
	}

	public void setImscpsell(String imscpsell) {
		this.imscpsell = imscpsell;
	}

	@Column(name = "IMMOPTH", precision = 22, scale = 0)
	public BigDecimal getImmopth() {
		return this.immopth;
	}

	public void setImmopth(BigDecimal immopth) {
		this.immopth = immopth;
	}

	@Column(name = "IMMCUTH", precision = 22, scale = 0)
	public BigDecimal getImmcuth() {
		return this.immcuth;
	}

	public void setImmcuth(BigDecimal immcuth) {
		this.immcuth = immcuth;
	}

	@Column(name = "IMCUMTH")
	public String getImcumth() {
		return this.imcumth;
	}

	public void setImcumth(String imcumth) {
		this.imcumth = imcumth;
	}

	@Column(name = "IMATPRN")
	public String getImatprn() {
		return this.imatprn;
	}

	public void setImatprn(String imatprn) {
		this.imatprn = imatprn;
	}

	@Column(name = "IMATPCA")
	public String getImatpca() {
		return this.imatpca;
	}

	public void setImatpca(String imatpca) {
		this.imatpca = imatpca;
	}

	@Column(name = "IMATPAC")
	public String getImatpac() {
		return this.imatpac;
	}

	public void setImatpac(String imatpac) {
		this.imatpac = imatpac;
	}

	@Column(name = "IMCOORE")
	public String getImcoore() {
		return this.imcoore;
	}

	public void setImcoore(String imcoore) {
		this.imcoore = imcoore;
	}

	@Column(name = "IMVCPFC")
	public String getImvcpfc() {
		return this.imvcpfc;
	}

	public void setImvcpfc(String imvcpfc) {
		this.imvcpfc = imvcpfc;
	}

	@Column(name = "IMPNYN")
	public String getImpnyn() {
		return this.impnyn;
	}

	public void setImpnyn(String impnyn) {
		this.impnyn = impnyn;
	}

	@Transient
	public String getShopid() {
		return shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}
	
	@Transient
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	

}