package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * F55wsd03 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "F55WSD03")
public class F55wsd03 implements java.io.Serializable {

	// Fields

	private F55wsd03Id id;
	private BigDecimal ide58hukid;
	private BigDecimal ide58hlnid;
	private BigDecimal ide58hboid;
	private String ide58eboid;
	private BigDecimal ide58hboln;
	private String ide58hboct;
	private String ide58ssot;
	private String ide58hoca;
	private String idco;
	private BigDecimal idan8;
	private String idmcu;
	private String idlocn;
	private String iddcto;
	private String ide58eroid;
	private String idkcoo;
	private BigDecimal iddoco;
	private BigDecimal idlnid;
	private String idodct;
	private String idokco;
	private BigDecimal idodoc;
	private String idoorn;
	private String idrcto;
	private String idrkco;
	private String idrorn;
	private BigDecimal idogno;
	private BigDecimal iditm;
	private String idlitm;
	private String idaitm;
	private BigDecimal ide58hbitm;
	private BigDecimal iduorg;
	private BigDecimal ide58pael;
	private BigDecimal ide58aexp;
	private String idev01;
	private String ide58huf01;
	private BigDecimal ide58hqb;
	private BigDecimal ide58hsiqt;
	private BigDecimal ide58hrtqt;
	private String ide58gpayf;
	private BigDecimal ide58hshs;
	private String ide58hos;
	private String idev02;
	private String ide58hsctm;
	private String ide58hsjut;
	private String ide58huf09;
	private String ide58hsbut;
	private String idemcu;
	private String ide58hus20;
	private String ide58hus21;
	private String ide58hus22;
	private String ide58hus23;
	private String ide58hus24;
	private String ide58hus25;
	private String ide58hus26;
	private BigDecimal ide58hun01;
	private BigDecimal ide58hun02;
	private BigDecimal ide58hun03;
	private BigDecimal ide58hun04;
	private BigDecimal ide58hun05;
	private String iduser;
	private String idpid;
	private String idjobn;
	private BigDecimal idupmt;
	private Integer idupmj;
	private String iddl01;
	private String iddl02;
	private String iddl03;
	private String iddl04;
	private String iddl05;
	private String iddl06;
	private String iddl07;
	private String iddl08;
	private String iddl09;
	private String iddl10;
	private String iddl11;
	private String iddl010;
	private String iddl011;
	private String idtxt0;
	private String idtxt1;
	private String idtxt2;
	private String idtxt3;
	private String idtxt4;
	private String idtxt5;
	private String idtxt6;
	private String idtxt7;
	private String idtxt8;
	private String idtxt9;
	private String idtxtlfu1;
	private String idtxtlfu2;
	private Long idtxtlfu3;
	private Long idtxtlfu4;
	private String idtxtlfu5;
	private String idtxtlfu6;
	private BigDecimal idafa1;
	private BigDecimal idafa2;
	private BigDecimal idafa3;
	private BigDecimal idafa4;
	private BigDecimal idafa5;
	private BigDecimal idafa6;
	private BigDecimal idafa7;
	private BigDecimal idafa8;
	private BigDecimal idafa9;
	private BigDecimal idan01;
	private BigDecimal idan02;
	private BigDecimal idan03;
	private BigDecimal idan04;
	private BigDecimal idan05;
	private BigDecimal idan06;
	private BigDecimal idan07;
	private BigDecimal idan08;
	private BigDecimal idan09;
	private BigDecimal idan10;
	private String idev03;
	private String idev04;
	private String idev05;
	private String idev06;
	private String idev07;
	private String idev08;
	private String idev09;
	private String idev10;
	private Integer idd01;
	private Integer idd02;
	private Integer idd03;
	private Integer idd04;
	private Integer idd05;
	private Integer idd06;
	private Integer idd07;
	private String idmcu1;
	private String idmcu2;
	private BigDecimal idan81;
	private BigDecimal idan82;
	private String idcrcd;
	private String iduom1;
	private String ide58huf06;
	private String idprp3;

	// Constructors

	/** default constructor */
	public F55wsd03() {
	}

	/** minimal constructor */
	public F55wsd03(F55wsd03Id id) {
		this.id = id;
	}

	/** full constructor */
	public F55wsd03(F55wsd03Id id, BigDecimal ide58hukid,
			BigDecimal ide58hlnid, BigDecimal ide58hboid, String ide58eboid,
			BigDecimal ide58hboln, String ide58hboct, String ide58ssot,
			String ide58hoca, String idco, BigDecimal idan8, String idmcu,
			String idlocn, String iddcto, String ide58eroid, String idkcoo,
			BigDecimal iddoco, BigDecimal idlnid, String idodct, String idokco,
			BigDecimal idodoc, String idoorn, String idrcto, String idrkco,
			String idrorn, BigDecimal idogno, BigDecimal iditm, String idlitm,
			String idaitm, BigDecimal ide58hbitm, BigDecimal iduorg,
			BigDecimal ide58pael, BigDecimal ide58aexp, String idev01,
			String ide58huf01, BigDecimal ide58hqb, BigDecimal ide58hsiqt,
			BigDecimal ide58hrtqt, String ide58gpayf, BigDecimal ide58hshs,
			String ide58hos, String idev02, String ide58hsctm,
			String ide58hsjut, String ide58huf09, String ide58hsbut,
			String idemcu, String ide58hus20, String ide58hus21,
			String ide58hus22, String ide58hus23, String ide58hus24,
			String ide58hus25, String ide58hus26, BigDecimal ide58hun01,
			BigDecimal ide58hun02, BigDecimal ide58hun03,
			BigDecimal ide58hun04, BigDecimal ide58hun05, String iduser,
			String idpid, String idjobn, BigDecimal idupmt, Integer idupmj,
			String iddl01, String iddl02, String iddl03, String iddl04,
			String iddl05, String iddl06, String iddl07, String iddl08,
			String iddl09, String iddl10, String iddl11, String iddl010,
			String iddl011, String idtxt0, String idtxt1, String idtxt2,
			String idtxt3, String idtxt4, String idtxt5, String idtxt6,
			String idtxt7, String idtxt8, String idtxt9, String idtxtlfu1,
			String idtxtlfu2, Long idtxtlfu3, Long idtxtlfu4, String idtxtlfu5,
			String idtxtlfu6, BigDecimal idafa1, BigDecimal idafa2,
			BigDecimal idafa3, BigDecimal idafa4, BigDecimal idafa5,
			BigDecimal idafa6, BigDecimal idafa7, BigDecimal idafa8,
			BigDecimal idafa9, BigDecimal idan01, BigDecimal idan02,
			BigDecimal idan03, BigDecimal idan04, BigDecimal idan05,
			BigDecimal idan06, BigDecimal idan07, BigDecimal idan08,
			BigDecimal idan09, BigDecimal idan10, String idev03, String idev04,
			String idev05, String idev06, String idev07, String idev08,
			String idev09, String idev10, Integer idd01, Integer idd02,
			Integer idd03, Integer idd04, Integer idd05, Integer idd06,
			Integer idd07, String idmcu1, String idmcu2, BigDecimal idan81,
			BigDecimal idan82, String idcrcd, String iduom1, String ide58huf06,
			String idprp3) {
		this.id = id;
		this.ide58hukid = ide58hukid;
		this.ide58hlnid = ide58hlnid;
		this.ide58hboid = ide58hboid;
		this.ide58eboid = ide58eboid;
		this.ide58hboln = ide58hboln;
		this.ide58hboct = ide58hboct;
		this.ide58ssot = ide58ssot;
		this.ide58hoca = ide58hoca;
		this.idco = idco;
		this.idan8 = idan8;
		this.idmcu = idmcu;
		this.idlocn = idlocn;
		this.iddcto = iddcto;
		this.ide58eroid = ide58eroid;
		this.idkcoo = idkcoo;
		this.iddoco = iddoco;
		this.idlnid = idlnid;
		this.idodct = idodct;
		this.idokco = idokco;
		this.idodoc = idodoc;
		this.idoorn = idoorn;
		this.idrcto = idrcto;
		this.idrkco = idrkco;
		this.idrorn = idrorn;
		this.idogno = idogno;
		this.iditm = iditm;
		this.idlitm = idlitm;
		this.idaitm = idaitm;
		this.ide58hbitm = ide58hbitm;
		this.iduorg = iduorg;
		this.ide58pael = ide58pael;
		this.ide58aexp = ide58aexp;
		this.idev01 = idev01;
		this.ide58huf01 = ide58huf01;
		this.ide58hqb = ide58hqb;
		this.ide58hsiqt = ide58hsiqt;
		this.ide58hrtqt = ide58hrtqt;
		this.ide58gpayf = ide58gpayf;
		this.ide58hshs = ide58hshs;
		this.ide58hos = ide58hos;
		this.idev02 = idev02;
		this.ide58hsctm = ide58hsctm;
		this.ide58hsjut = ide58hsjut;
		this.ide58huf09 = ide58huf09;
		this.ide58hsbut = ide58hsbut;
		this.idemcu = idemcu;
		this.ide58hus20 = ide58hus20;
		this.ide58hus21 = ide58hus21;
		this.ide58hus22 = ide58hus22;
		this.ide58hus23 = ide58hus23;
		this.ide58hus24 = ide58hus24;
		this.ide58hus25 = ide58hus25;
		this.ide58hus26 = ide58hus26;
		this.ide58hun01 = ide58hun01;
		this.ide58hun02 = ide58hun02;
		this.ide58hun03 = ide58hun03;
		this.ide58hun04 = ide58hun04;
		this.ide58hun05 = ide58hun05;
		this.iduser = iduser;
		this.idpid = idpid;
		this.idjobn = idjobn;
		this.idupmt = idupmt;
		this.idupmj = idupmj;
		this.iddl01 = iddl01;
		this.iddl02 = iddl02;
		this.iddl03 = iddl03;
		this.iddl04 = iddl04;
		this.iddl05 = iddl05;
		this.iddl06 = iddl06;
		this.iddl07 = iddl07;
		this.iddl08 = iddl08;
		this.iddl09 = iddl09;
		this.iddl10 = iddl10;
		this.iddl11 = iddl11;
		this.iddl010 = iddl010;
		this.iddl011 = iddl011;
		this.idtxt0 = idtxt0;
		this.idtxt1 = idtxt1;
		this.idtxt2 = idtxt2;
		this.idtxt3 = idtxt3;
		this.idtxt4 = idtxt4;
		this.idtxt5 = idtxt5;
		this.idtxt6 = idtxt6;
		this.idtxt7 = idtxt7;
		this.idtxt8 = idtxt8;
		this.idtxt9 = idtxt9;
		this.idtxtlfu1 = idtxtlfu1;
		this.idtxtlfu2 = idtxtlfu2;
		this.idtxtlfu3 = idtxtlfu3;
		this.idtxtlfu4 = idtxtlfu4;
		this.idtxtlfu5 = idtxtlfu5;
		this.idtxtlfu6 = idtxtlfu6;
		this.idafa1 = idafa1;
		this.idafa2 = idafa2;
		this.idafa3 = idafa3;
		this.idafa4 = idafa4;
		this.idafa5 = idafa5;
		this.idafa6 = idafa6;
		this.idafa7 = idafa7;
		this.idafa8 = idafa8;
		this.idafa9 = idafa9;
		this.idan01 = idan01;
		this.idan02 = idan02;
		this.idan03 = idan03;
		this.idan04 = idan04;
		this.idan05 = idan05;
		this.idan06 = idan06;
		this.idan07 = idan07;
		this.idan08 = idan08;
		this.idan09 = idan09;
		this.idan10 = idan10;
		this.idev03 = idev03;
		this.idev04 = idev04;
		this.idev05 = idev05;
		this.idev06 = idev06;
		this.idev07 = idev07;
		this.idev08 = idev08;
		this.idev09 = idev09;
		this.idev10 = idev10;
		this.idd01 = idd01;
		this.idd02 = idd02;
		this.idd03 = idd03;
		this.idd04 = idd04;
		this.idd05 = idd05;
		this.idd06 = idd06;
		this.idd07 = idd07;
		this.idmcu1 = idmcu1;
		this.idmcu2 = idmcu2;
		this.idan81 = idan81;
		this.idan82 = idan82;
		this.idcrcd = idcrcd;
		this.iduom1 = iduom1;
		this.ide58huf06 = ide58huf06;
		this.idprp3 = idprp3;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idukid", column = @Column(name = "IDUKID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "ide58hedid", column = @Column(name = "IDE58HEDID", nullable = false, length = 6)),
			@AttributeOverride(name = "idedln", column = @Column(name = "IDEDLN", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "idlnic", column = @Column(name = "IDLNIC", nullable = false, precision = 22, scale = 0)) })
	public F55wsd03Id getId() {
		return this.id;
	}

	public void setId(F55wsd03Id id) {
		this.id = id;
	}

	@Column(name = "IDE58HUKID", precision = 22, scale = 0)
	public BigDecimal getIde58hukid() {
		return this.ide58hukid;
	}

	public void setIde58hukid(BigDecimal ide58hukid) {
		this.ide58hukid = ide58hukid;
	}

	@Column(name = "IDE58HLNID", precision = 22, scale = 0)
	public BigDecimal getIde58hlnid() {
		return this.ide58hlnid;
	}

	public void setIde58hlnid(BigDecimal ide58hlnid) {
		this.ide58hlnid = ide58hlnid;
	}

	@Column(name = "IDE58HBOID", precision = 22, scale = 0)
	public BigDecimal getIde58hboid() {
		return this.ide58hboid;
	}

	public void setIde58hboid(BigDecimal ide58hboid) {
		this.ide58hboid = ide58hboid;
	}

	@Column(name = "IDE58EBOID", length = 80)
	public String getIde58eboid() {
		return this.ide58eboid;
	}

	public void setIde58eboid(String ide58eboid) {
		this.ide58eboid = ide58eboid;
	}

	@Column(name = "IDE58HBOLN", precision = 22, scale = 0)
	public BigDecimal getIde58hboln() {
		return this.ide58hboln;
	}

	public void setIde58hboln(BigDecimal ide58hboln) {
		this.ide58hboln = ide58hboln;
	}

	@Column(name = "IDE58HBOCT", length = 38)
	public String getIde58hboct() {
		return this.ide58hboct;
	}

	public void setIde58hboct(String ide58hboct) {
		this.ide58hboct = ide58hboct;
	}

	@Column(name = "IDE58SSOT", length = 4)
	public String getIde58ssot() {
		return this.ide58ssot;
	}

	public void setIde58ssot(String ide58ssot) {
		this.ide58ssot = ide58ssot;
	}

	@Column(name = "IDE58HOCA", length = 2)
	public String getIde58hoca() {
		return this.ide58hoca;
	}

	public void setIde58hoca(String ide58hoca) {
		this.ide58hoca = ide58hoca;
	}

	@Column(name = "IDCO", length = 10)
	public String getIdco() {
		return this.idco;
	}

	public void setIdco(String idco) {
		this.idco = idco;
	}

	@Column(name = "IDAN8", precision = 22, scale = 0)
	public BigDecimal getIdan8() {
		return this.idan8;
	}

	public void setIdan8(BigDecimal idan8) {
		this.idan8 = idan8;
	}

	@Column(name = "IDMCU", length = 24)
	public String getIdmcu() {
		return this.idmcu;
	}

	public void setIdmcu(String idmcu) {
		this.idmcu = idmcu;
	}

	@Column(name = "IDLOCN", length = 40)
	public String getIdlocn() {
		return this.idlocn;
	}

	public void setIdlocn(String idlocn) {
		this.idlocn = idlocn;
	}

	@Column(name = "IDDCTO", length = 4)
	public String getIddcto() {
		return this.iddcto;
	}

	public void setIddcto(String iddcto) {
		this.iddcto = iddcto;
	}

	@Column(name = "IDE58EROID", length = 80)
	public String getIde58eroid() {
		return this.ide58eroid;
	}

	public void setIde58eroid(String ide58eroid) {
		this.ide58eroid = ide58eroid;
	}

	@Column(name = "IDKCOO", length = 10)
	public String getIdkcoo() {
		return this.idkcoo;
	}

	public void setIdkcoo(String idkcoo) {
		this.idkcoo = idkcoo;
	}

	@Column(name = "IDDOCO", precision = 22, scale = 0)
	public BigDecimal getIddoco() {
		return this.iddoco;
	}

	public void setIddoco(BigDecimal iddoco) {
		this.iddoco = iddoco;
	}

	@Column(name = "IDLNID", precision = 22, scale = 0)
	public BigDecimal getIdlnid() {
		return this.idlnid;
	}

	public void setIdlnid(BigDecimal idlnid) {
		this.idlnid = idlnid;
	}

	@Column(name = "IDODCT", length = 4)
	public String getIdodct() {
		return this.idodct;
	}

	public void setIdodct(String idodct) {
		this.idodct = idodct;
	}

	@Column(name = "IDOKCO", length = 10)
	public String getIdokco() {
		return this.idokco;
	}

	public void setIdokco(String idokco) {
		this.idokco = idokco;
	}

	@Column(name = "IDODOC", precision = 22, scale = 0)
	public BigDecimal getIdodoc() {
		return this.idodoc;
	}

	public void setIdodoc(BigDecimal idodoc) {
		this.idodoc = idodoc;
	}

	@Column(name = "IDOORN", length = 16)
	public String getIdoorn() {
		return this.idoorn;
	}

	public void setIdoorn(String idoorn) {
		this.idoorn = idoorn;
	}

	@Column(name = "IDRCTO", length = 4)
	public String getIdrcto() {
		return this.idrcto;
	}

	public void setIdrcto(String idrcto) {
		this.idrcto = idrcto;
	}

	@Column(name = "IDRKCO", length = 10)
	public String getIdrkco() {
		return this.idrkco;
	}

	public void setIdrkco(String idrkco) {
		this.idrkco = idrkco;
	}

	@Column(name = "IDRORN", length = 16)
	public String getIdrorn() {
		return this.idrorn;
	}

	public void setIdrorn(String idrorn) {
		this.idrorn = idrorn;
	}

	@Column(name = "IDOGNO", precision = 22, scale = 0)
	public BigDecimal getIdogno() {
		return this.idogno;
	}

	public void setIdogno(BigDecimal idogno) {
		this.idogno = idogno;
	}

	@Column(name = "IDITM", precision = 22, scale = 0)
	public BigDecimal getIditm() {
		return this.iditm;
	}

	public void setIditm(BigDecimal iditm) {
		this.iditm = iditm;
	}

	@Column(name = "IDLITM", length = 50)
	public String getIdlitm() {
		return this.idlitm;
	}

	public void setIdlitm(String idlitm) {
		this.idlitm = idlitm;
	}

	@Column(name = "IDAITM", length = 50)
	public String getIdaitm() {
		return this.idaitm;
	}

	public void setIdaitm(String idaitm) {
		this.idaitm = idaitm;
	}

	@Column(name = "IDE58HBITM", precision = 22, scale = 0)
	public BigDecimal getIde58hbitm() {
		return this.ide58hbitm;
	}

	public void setIde58hbitm(BigDecimal ide58hbitm) {
		this.ide58hbitm = ide58hbitm;
	}

	@Column(name = "IDUORG", precision = 22, scale = 0)
	public BigDecimal getIduorg() {
		return this.iduorg;
	}

	public void setIduorg(BigDecimal iduorg) {
		this.iduorg = iduorg;
	}

	@Column(name = "IDE58PAEL", precision = 22, scale = 0)
	public BigDecimal getIde58pael() {
		return this.ide58pael;
	}

	public void setIde58pael(BigDecimal ide58pael) {
		this.ide58pael = ide58pael;
	}

	@Column(name = "IDE58AEXP", precision = 22, scale = 0)
	public BigDecimal getIde58aexp() {
		return this.ide58aexp;
	}

	public void setIde58aexp(BigDecimal ide58aexp) {
		this.ide58aexp = ide58aexp;
	}

	@Column(name = "IDEV01", length = 2)
	public String getIdev01() {
		return this.idev01;
	}

	public void setIdev01(String idev01) {
		this.idev01 = idev01;
	}

	@Column(name = "IDE58HUF01", length = 2)
	public String getIde58huf01() {
		return this.ide58huf01;
	}

	public void setIde58huf01(String ide58huf01) {
		this.ide58huf01 = ide58huf01;
	}

	@Column(name = "IDE58HQB", precision = 22, scale = 0)
	public BigDecimal getIde58hqb() {
		return this.ide58hqb;
	}

	public void setIde58hqb(BigDecimal ide58hqb) {
		this.ide58hqb = ide58hqb;
	}

	@Column(name = "IDE58HSIQT", precision = 22, scale = 0)
	public BigDecimal getIde58hsiqt() {
		return this.ide58hsiqt;
	}

	public void setIde58hsiqt(BigDecimal ide58hsiqt) {
		this.ide58hsiqt = ide58hsiqt;
	}

	@Column(name = "IDE58HRTQT", precision = 22, scale = 0)
	public BigDecimal getIde58hrtqt() {
		return this.ide58hrtqt;
	}

	public void setIde58hrtqt(BigDecimal ide58hrtqt) {
		this.ide58hrtqt = ide58hrtqt;
	}

	@Column(name = "IDE58GPAYF", length = 2)
	public String getIde58gpayf() {
		return this.ide58gpayf;
	}

	public void setIde58gpayf(String ide58gpayf) {
		this.ide58gpayf = ide58gpayf;
	}

	@Column(name = "IDE58HSHS", precision = 22, scale = 0)
	public BigDecimal getIde58hshs() {
		return this.ide58hshs;
	}

	public void setIde58hshs(BigDecimal ide58hshs) {
		this.ide58hshs = ide58hshs;
	}

	@Column(name = "IDE58HOS", length = 6)
	public String getIde58hos() {
		return this.ide58hos;
	}

	public void setIde58hos(String ide58hos) {
		this.ide58hos = ide58hos;
	}

	@Column(name = "IDEV02", length = 2)
	public String getIdev02() {
		return this.idev02;
	}

	public void setIdev02(String idev02) {
		this.idev02 = idev02;
	}

	@Column(name = "IDE58HSCTM", length = 38)
	public String getIde58hsctm() {
		return this.ide58hsctm;
	}

	public void setIde58hsctm(String ide58hsctm) {
		this.ide58hsctm = ide58hsctm;
	}

	@Column(name = "IDE58HSJUT", length = 38)
	public String getIde58hsjut() {
		return this.ide58hsjut;
	}

	public void setIde58hsjut(String ide58hsjut) {
		this.ide58hsjut = ide58hsjut;
	}

	@Column(name = "IDE58HUF09", length = 4)
	public String getIde58huf09() {
		return this.ide58huf09;
	}

	public void setIde58huf09(String ide58huf09) {
		this.ide58huf09 = ide58huf09;
	}

	@Column(name = "IDE58HSBUT", length = 38)
	public String getIde58hsbut() {
		return this.ide58hsbut;
	}

	public void setIde58hsbut(String ide58hsbut) {
		this.ide58hsbut = ide58hsbut;
	}

	@Column(name = "IDEMCU", length = 24)
	public String getIdemcu() {
		return this.idemcu;
	}

	public void setIdemcu(String idemcu) {
		this.idemcu = idemcu;
	}

	@Column(name = "IDE58HUS20", length = 40)
	public String getIde58hus20() {
		return this.ide58hus20;
	}

	public void setIde58hus20(String ide58hus20) {
		this.ide58hus20 = ide58hus20;
	}

	@Column(name = "IDE58HUS21", length = 80)
	public String getIde58hus21() {
		return this.ide58hus21;
	}

	public void setIde58hus21(String ide58hus21) {
		this.ide58hus21 = ide58hus21;
	}

	@Column(name = "IDE58HUS22", length = 80)
	public String getIde58hus22() {
		return this.ide58hus22;
	}

	public void setIde58hus22(String ide58hus22) {
		this.ide58hus22 = ide58hus22;
	}

	@Column(name = "IDE58HUS23", length = 80)
	public String getIde58hus23() {
		return this.ide58hus23;
	}

	public void setIde58hus23(String ide58hus23) {
		this.ide58hus23 = ide58hus23;
	}

	@Column(name = "IDE58HUS24", length = 80)
	public String getIde58hus24() {
		return this.ide58hus24;
	}

	public void setIde58hus24(String ide58hus24) {
		this.ide58hus24 = ide58hus24;
	}

	@Column(name = "IDE58HUS25", length = 80)
	public String getIde58hus25() {
		return this.ide58hus25;
	}

	public void setIde58hus25(String ide58hus25) {
		this.ide58hus25 = ide58hus25;
	}

	@Column(name = "IDE58HUS26", length = 200)
	public String getIde58hus26() {
		return this.ide58hus26;
	}

	public void setIde58hus26(String ide58hus26) {
		this.ide58hus26 = ide58hus26;
	}

	@Column(name = "IDE58HUN01", precision = 22, scale = 0)
	public BigDecimal getIde58hun01() {
		return this.ide58hun01;
	}

	public void setIde58hun01(BigDecimal ide58hun01) {
		this.ide58hun01 = ide58hun01;
	}

	@Column(name = "IDE58HUN02", precision = 22, scale = 0)
	public BigDecimal getIde58hun02() {
		return this.ide58hun02;
	}

	public void setIde58hun02(BigDecimal ide58hun02) {
		this.ide58hun02 = ide58hun02;
	}

	@Column(name = "IDE58HUN03", precision = 22, scale = 0)
	public BigDecimal getIde58hun03() {
		return this.ide58hun03;
	}

	public void setIde58hun03(BigDecimal ide58hun03) {
		this.ide58hun03 = ide58hun03;
	}

	@Column(name = "IDE58HUN04", precision = 22, scale = 0)
	public BigDecimal getIde58hun04() {
		return this.ide58hun04;
	}

	public void setIde58hun04(BigDecimal ide58hun04) {
		this.ide58hun04 = ide58hun04;
	}

	@Column(name = "IDE58HUN05", precision = 22, scale = 0)
	public BigDecimal getIde58hun05() {
		return this.ide58hun05;
	}

	public void setIde58hun05(BigDecimal ide58hun05) {
		this.ide58hun05 = ide58hun05;
	}

	@Column(name = "IDUSER", length = 20)
	public String getIduser() {
		return this.iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	@Column(name = "IDPID", length = 20)
	public String getIdpid() {
		return this.idpid;
	}

	public void setIdpid(String idpid) {
		this.idpid = idpid;
	}

	@Column(name = "IDJOBN", length = 20)
	public String getIdjobn() {
		return this.idjobn;
	}

	public void setIdjobn(String idjobn) {
		this.idjobn = idjobn;
	}

	@Column(name = "IDUPMT", precision = 22, scale = 0)
	public BigDecimal getIdupmt() {
		return this.idupmt;
	}

	public void setIdupmt(BigDecimal idupmt) {
		this.idupmt = idupmt;
	}

	@Column(name = "IDUPMJ", precision = 6, scale = 0)
	public Integer getIdupmj() {
		return this.idupmj;
	}

	public void setIdupmj(Integer idupmj) {
		this.idupmj = idupmj;
	}

	@Column(name = "IDDL01", length = 60)
	public String getIddl01() {
		return this.iddl01;
	}

	public void setIddl01(String iddl01) {
		this.iddl01 = iddl01;
	}

	@Column(name = "IDDL02", length = 60)
	public String getIddl02() {
		return this.iddl02;
	}

	public void setIddl02(String iddl02) {
		this.iddl02 = iddl02;
	}

	@Column(name = "IDDL03", length = 60)
	public String getIddl03() {
		return this.iddl03;
	}

	public void setIddl03(String iddl03) {
		this.iddl03 = iddl03;
	}

	@Column(name = "IDDL04", length = 60)
	public String getIddl04() {
		return this.iddl04;
	}

	public void setIddl04(String iddl04) {
		this.iddl04 = iddl04;
	}

	@Column(name = "IDDL05", length = 60)
	public String getIddl05() {
		return this.iddl05;
	}

	public void setIddl05(String iddl05) {
		this.iddl05 = iddl05;
	}

	@Column(name = "IDDL06", length = 60)
	public String getIddl06() {
		return this.iddl06;
	}

	public void setIddl06(String iddl06) {
		this.iddl06 = iddl06;
	}

	@Column(name = "IDDL07", length = 60)
	public String getIddl07() {
		return this.iddl07;
	}

	public void setIddl07(String iddl07) {
		this.iddl07 = iddl07;
	}

	@Column(name = "IDDL08", length = 60)
	public String getIddl08() {
		return this.iddl08;
	}

	public void setIddl08(String iddl08) {
		this.iddl08 = iddl08;
	}

	@Column(name = "IDDL09", length = 60)
	public String getIddl09() {
		return this.iddl09;
	}

	public void setIddl09(String iddl09) {
		this.iddl09 = iddl09;
	}

	@Column(name = "IDDL10", length = 60)
	public String getIddl10() {
		return this.iddl10;
	}

	public void setIddl10(String iddl10) {
		this.iddl10 = iddl10;
	}

	@Column(name = "IDDL11", length = 60)
	public String getIddl11() {
		return this.iddl11;
	}

	public void setIddl11(String iddl11) {
		this.iddl11 = iddl11;
	}

	@Column(name = "IDDL010", length = 100)
	public String getIddl010() {
		return this.iddl010;
	}

	public void setIddl010(String iddl010) {
		this.iddl010 = iddl010;
	}

	@Column(name = "IDDL011", length = 200)
	public String getIddl011() {
		return this.iddl011;
	}

	public void setIddl011(String iddl011) {
		this.iddl011 = iddl011;
	}

	@Column(name = "IDTXT0", length = 160)
	public String getIdtxt0() {
		return this.idtxt0;
	}

	public void setIdtxt0(String idtxt0) {
		this.idtxt0 = idtxt0;
	}

	@Column(name = "IDTXT1", length = 100)
	public String getIdtxt1() {
		return this.idtxt1;
	}

	public void setIdtxt1(String idtxt1) {
		this.idtxt1 = idtxt1;
	}

	@Column(name = "IDTXT2", length = 100)
	public String getIdtxt2() {
		return this.idtxt2;
	}

	public void setIdtxt2(String idtxt2) {
		this.idtxt2 = idtxt2;
	}

	@Column(name = "IDTXT3", length = 100)
	public String getIdtxt3() {
		return this.idtxt3;
	}

	public void setIdtxt3(String idtxt3) {
		this.idtxt3 = idtxt3;
	}

	@Column(name = "IDTXT4", length = 100)
	public String getIdtxt4() {
		return this.idtxt4;
	}

	public void setIdtxt4(String idtxt4) {
		this.idtxt4 = idtxt4;
	}

	@Column(name = "IDTXT5", length = 100)
	public String getIdtxt5() {
		return this.idtxt5;
	}

	public void setIdtxt5(String idtxt5) {
		this.idtxt5 = idtxt5;
	}

	@Column(name = "IDTXT6", length = 100)
	public String getIdtxt6() {
		return this.idtxt6;
	}

	public void setIdtxt6(String idtxt6) {
		this.idtxt6 = idtxt6;
	}

	@Column(name = "IDTXT7", length = 100)
	public String getIdtxt7() {
		return this.idtxt7;
	}

	public void setIdtxt7(String idtxt7) {
		this.idtxt7 = idtxt7;
	}

	@Column(name = "IDTXT8", length = 100)
	public String getIdtxt8() {
		return this.idtxt8;
	}

	public void setIdtxt8(String idtxt8) {
		this.idtxt8 = idtxt8;
	}

	@Column(name = "IDTXT9", length = 1280)
	public String getIdtxt9() {
		return this.idtxt9;
	}

	public void setIdtxt9(String idtxt9) {
		this.idtxt9 = idtxt9;
	}

	@Column(name = "IDTXTLFU1", length = 2)
	public String getIdtxtlfu1() {
		return this.idtxtlfu1;
	}

	public void setIdtxtlfu1(String idtxtlfu1) {
		this.idtxtlfu1 = idtxtlfu1;
	}

	@Column(name = "IDTXTLFU2", length = 2)
	public String getIdtxtlfu2() {
		return this.idtxtlfu2;
	}

	public void setIdtxtlfu2(String idtxtlfu2) {
		this.idtxtlfu2 = idtxtlfu2;
	}

	@Column(name = "IDTXTLFU3", precision = 15, scale = 0)
	public Long getIdtxtlfu3() {
		return this.idtxtlfu3;
	}

	public void setIdtxtlfu3(Long idtxtlfu3) {
		this.idtxtlfu3 = idtxtlfu3;
	}

	@Column(name = "IDTXTLFU4", precision = 15, scale = 0)
	public Long getIdtxtlfu4() {
		return this.idtxtlfu4;
	}

	public void setIdtxtlfu4(Long idtxtlfu4) {
		this.idtxtlfu4 = idtxtlfu4;
	}

	@Column(name = "IDTXTLFU5", length = 512)
	public String getIdtxtlfu5() {
		return this.idtxtlfu5;
	}

	public void setIdtxtlfu5(String idtxtlfu5) {
		this.idtxtlfu5 = idtxtlfu5;
	}

	@Column(name = "IDTXTLFU6", length = 512)
	public String getIdtxtlfu6() {
		return this.idtxtlfu6;
	}

	public void setIdtxtlfu6(String idtxtlfu6) {
		this.idtxtlfu6 = idtxtlfu6;
	}

	@Column(name = "IDAFA1", precision = 22, scale = 0)
	public BigDecimal getIdafa1() {
		return this.idafa1;
	}

	public void setIdafa1(BigDecimal idafa1) {
		this.idafa1 = idafa1;
	}

	@Column(name = "IDAFA2", precision = 22, scale = 0)
	public BigDecimal getIdafa2() {
		return this.idafa2;
	}

	public void setIdafa2(BigDecimal idafa2) {
		this.idafa2 = idafa2;
	}

	@Column(name = "IDAFA3", precision = 22, scale = 0)
	public BigDecimal getIdafa3() {
		return this.idafa3;
	}

	public void setIdafa3(BigDecimal idafa3) {
		this.idafa3 = idafa3;
	}

	@Column(name = "IDAFA4", precision = 22, scale = 0)
	public BigDecimal getIdafa4() {
		return this.idafa4;
	}

	public void setIdafa4(BigDecimal idafa4) {
		this.idafa4 = idafa4;
	}

	@Column(name = "IDAFA5", precision = 22, scale = 0)
	public BigDecimal getIdafa5() {
		return this.idafa5;
	}

	public void setIdafa5(BigDecimal idafa5) {
		this.idafa5 = idafa5;
	}

	@Column(name = "IDAFA6", precision = 22, scale = 0)
	public BigDecimal getIdafa6() {
		return this.idafa6;
	}

	public void setIdafa6(BigDecimal idafa6) {
		this.idafa6 = idafa6;
	}

	@Column(name = "IDAFA7", precision = 22, scale = 0)
	public BigDecimal getIdafa7() {
		return this.idafa7;
	}

	public void setIdafa7(BigDecimal idafa7) {
		this.idafa7 = idafa7;
	}

	@Column(name = "IDAFA8", precision = 22, scale = 0)
	public BigDecimal getIdafa8() {
		return this.idafa8;
	}

	public void setIdafa8(BigDecimal idafa8) {
		this.idafa8 = idafa8;
	}

	@Column(name = "IDAFA9", precision = 22, scale = 0)
	public BigDecimal getIdafa9() {
		return this.idafa9;
	}

	public void setIdafa9(BigDecimal idafa9) {
		this.idafa9 = idafa9;
	}

	@Column(name = "IDAN01", precision = 22, scale = 0)
	public BigDecimal getIdan01() {
		return this.idan01;
	}

	public void setIdan01(BigDecimal idan01) {
		this.idan01 = idan01;
	}

	@Column(name = "IDAN02", precision = 22, scale = 0)
	public BigDecimal getIdan02() {
		return this.idan02;
	}

	public void setIdan02(BigDecimal idan02) {
		this.idan02 = idan02;
	}

	@Column(name = "IDAN03", precision = 22, scale = 0)
	public BigDecimal getIdan03() {
		return this.idan03;
	}

	public void setIdan03(BigDecimal idan03) {
		this.idan03 = idan03;
	}

	@Column(name = "IDAN04", precision = 22, scale = 0)
	public BigDecimal getIdan04() {
		return this.idan04;
	}

	public void setIdan04(BigDecimal idan04) {
		this.idan04 = idan04;
	}

	@Column(name = "IDAN05", precision = 22, scale = 0)
	public BigDecimal getIdan05() {
		return this.idan05;
	}

	public void setIdan05(BigDecimal idan05) {
		this.idan05 = idan05;
	}

	@Column(name = "IDAN06", precision = 22, scale = 0)
	public BigDecimal getIdan06() {
		return this.idan06;
	}

	public void setIdan06(BigDecimal idan06) {
		this.idan06 = idan06;
	}

	@Column(name = "IDAN07", precision = 22, scale = 0)
	public BigDecimal getIdan07() {
		return this.idan07;
	}

	public void setIdan07(BigDecimal idan07) {
		this.idan07 = idan07;
	}

	@Column(name = "IDAN08", precision = 22, scale = 0)
	public BigDecimal getIdan08() {
		return this.idan08;
	}

	public void setIdan08(BigDecimal idan08) {
		this.idan08 = idan08;
	}

	@Column(name = "IDAN09", precision = 22, scale = 0)
	public BigDecimal getIdan09() {
		return this.idan09;
	}

	public void setIdan09(BigDecimal idan09) {
		this.idan09 = idan09;
	}

	@Column(name = "IDAN10", precision = 22, scale = 0)
	public BigDecimal getIdan10() {
		return this.idan10;
	}

	public void setIdan10(BigDecimal idan10) {
		this.idan10 = idan10;
	}

	@Column(name = "IDEV03", length = 2)
	public String getIdev03() {
		return this.idev03;
	}

	public void setIdev03(String idev03) {
		this.idev03 = idev03;
	}

	@Column(name = "IDEV04", length = 2)
	public String getIdev04() {
		return this.idev04;
	}

	public void setIdev04(String idev04) {
		this.idev04 = idev04;
	}

	@Column(name = "IDEV05", length = 2)
	public String getIdev05() {
		return this.idev05;
	}

	public void setIdev05(String idev05) {
		this.idev05 = idev05;
	}

	@Column(name = "IDEV06", length = 2)
	public String getIdev06() {
		return this.idev06;
	}

	public void setIdev06(String idev06) {
		this.idev06 = idev06;
	}

	@Column(name = "IDEV07", length = 2)
	public String getIdev07() {
		return this.idev07;
	}

	public void setIdev07(String idev07) {
		this.idev07 = idev07;
	}

	@Column(name = "IDEV08", length = 2)
	public String getIdev08() {
		return this.idev08;
	}

	public void setIdev08(String idev08) {
		this.idev08 = idev08;
	}

	@Column(name = "IDEV09", length = 2)
	public String getIdev09() {
		return this.idev09;
	}

	public void setIdev09(String idev09) {
		this.idev09 = idev09;
	}

	@Column(name = "IDEV10", length = 2)
	public String getIdev10() {
		return this.idev10;
	}

	public void setIdev10(String idev10) {
		this.idev10 = idev10;
	}

	@Column(name = "IDD01", precision = 6, scale = 0)
	public Integer getIdd01() {
		return this.idd01;
	}

	public void setIdd01(Integer idd01) {
		this.idd01 = idd01;
	}

	@Column(name = "IDD02", precision = 6, scale = 0)
	public Integer getIdd02() {
		return this.idd02;
	}

	public void setIdd02(Integer idd02) {
		this.idd02 = idd02;
	}

	@Column(name = "IDD03", precision = 6, scale = 0)
	public Integer getIdd03() {
		return this.idd03;
	}

	public void setIdd03(Integer idd03) {
		this.idd03 = idd03;
	}

	@Column(name = "IDD04", precision = 6, scale = 0)
	public Integer getIdd04() {
		return this.idd04;
	}

	public void setIdd04(Integer idd04) {
		this.idd04 = idd04;
	}

	@Column(name = "IDD05", precision = 6, scale = 0)
	public Integer getIdd05() {
		return this.idd05;
	}

	public void setIdd05(Integer idd05) {
		this.idd05 = idd05;
	}

	@Column(name = "IDD06", precision = 6, scale = 0)
	public Integer getIdd06() {
		return this.idd06;
	}

	public void setIdd06(Integer idd06) {
		this.idd06 = idd06;
	}

	@Column(name = "IDD07", precision = 6, scale = 0)
	public Integer getIdd07() {
		return this.idd07;
	}

	public void setIdd07(Integer idd07) {
		this.idd07 = idd07;
	}

	@Column(name = "IDMCU1", length = 24)
	public String getIdmcu1() {
		return this.idmcu1;
	}

	public void setIdmcu1(String idmcu1) {
		this.idmcu1 = idmcu1;
	}

	@Column(name = "IDMCU2", length = 24)
	public String getIdmcu2() {
		return this.idmcu2;
	}

	public void setIdmcu2(String idmcu2) {
		this.idmcu2 = idmcu2;
	}

	@Column(name = "IDAN81", precision = 22, scale = 0)
	public BigDecimal getIdan81() {
		return this.idan81;
	}

	public void setIdan81(BigDecimal idan81) {
		this.idan81 = idan81;
	}

	@Column(name = "IDAN82", precision = 22, scale = 0)
	public BigDecimal getIdan82() {
		return this.idan82;
	}

	public void setIdan82(BigDecimal idan82) {
		this.idan82 = idan82;
	}

	@Column(name = "IDCRCD", length = 6)
	public String getIdcrcd() {
		return this.idcrcd;
	}

	public void setIdcrcd(String idcrcd) {
		this.idcrcd = idcrcd;
	}

	@Column(name = "IDUOM1", length = 4)
	public String getIduom1() {
		return this.iduom1;
	}

	public void setIduom1(String iduom1) {
		this.iduom1 = iduom1;
	}

	@Column(name = "IDE58HUF06", length = 4)
	public String getIde58huf06() {
		return this.ide58huf06;
	}

	public void setIde58huf06(String ide58huf06) {
		this.ide58huf06 = ide58huf06;
	}

	@Column(name = "IDPRP3", length = 6)
	public String getIdprp3() {
		return this.idprp3;
	}

	public void setIdprp3(String idprp3) {
		this.idprp3 = idprp3;
	}

}