package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.*;

import com.elitesland.elbases.bases.BaseEntity;

/**
 * 零售单明细表
 * 
 * @className: F58h0411 前缀CH
 * @desc: TODO(零售单明细对应表F58H0411主键)
 * @author：alon
 * @mender：alon
 * @modifiedTime：Aug 7, 2014 7:01:36 AM
 * @version 1.0.0
 */
@Entity
@Table(name = "F58h0411")
public class F58h0411 extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private F58h0411PK f58h0411pk;

	/**
	 * 定单号
	 */
	@Column(name = "chdoco")
	private Long chdoco = 0L;

	// @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinColumns({
	// @JoinColumn(name="chdoco"),
	// @JoinColumn(name="Litm")
	// })
	// private Set<F58h0415> f58h0415s;
	@Column(name = "chhmco")
	private String chhmco = " " ;

	@Column(name = "chcomm")
	private String chcomm = " ";

	@Column(name = "chlnty")
	private String chlnty = " ";

	@Column(name = "chdcto")
	private String chdcto = " ";

	@Column(name = "chkcoo")
	private String chkcoo = " ";

	@Column(name = "chlnid")
	private Long chlnid = 0L;

	@Column(name = "chco")
	private String chco = " ";

	@Column(name = "chmcu")
	private String chmcu = " ";

	@Column(name = "che58han8m")
	private Long che58han8m = 0L;

	@Column(name = "che58han8c")
	private Long che58han8c = 0L;

	@Column(name = "che58mcno")
	private String che58mcno = " ";

	@Column(name = "che58df03")
	private String che58df03 = " ";

	@Column(name = "chtrdj")
	private Long chtrdj = 0L;

	@Column(name = "che58hrsd")
	private Long che58hrsd = 0L;

	@Column(name = "che58hrst")
	private Long che58hrst = 0L;

	@Column(name = "che58hsid")
	private String che58hsid = " ";

	@Column(name = "che58hsan8")
	private Long che58hsan8 = 0L;

	@Column(name = "chlocn")
	private String chlocn = " ";

	@Column(name = "chlotn")
	private String chlotn = " ";

	@Column(name = "chitm")
	private Long chitm = 0L;

	@Column(name = "chlitm")
	private String chlitm = " ";

	@Column(name = "chalph")
	private String chalph = " ";

	@Column(name = "chaitm")
	private String chaitm = " ";

	@Column(name = "che58hbarc")
	private String che58hbarc = " ";

	@Column(name = "che58jsid")
	private String che58jsid = " ";

	@Column(name = "chuorg")
	private Long chuorg = 0L;

	@Column(name = "chuom")
	private String chuom = " ";

	@Column(name = "che58prdc")
	private Long che58prdc = 0L;

	@Column(name = "chnmcu")
	private String chnmcu = " ";

	/**
	 * 促销号
	 */
	@Column(name = "che58lspan")
	private String che58lspan = " ";

	@Column(name = "che58lsprt")
	private String che58lsprt = " ";

	@Column(name = "che58pdlup")
	private Double che58pdlup = 0D;

	@Column(name = "che58pael")
	private Double che58pael = 0.0;

	@Column(name = "che58uprc")
	private Double che58uprc = 0d;

	@Column(name = "che58aexp")
	private Double che58aexp = 0.0;

	@Column(name = "che58ccda")
	private Long che58ccda = 0L;

	@Column(name = "che58accpu")
	private Long che58accpu = 0L;

	@Column(name = "che58accda")
	private Long che58accda = 0L;

	@Column(name = "che58bcno")
	private Long che58bcno = 0L;

	@Column(name = "che58bcln")
	private Long che58bcln = 0L;

	@Column(name = "chfgy")
	private String chfgy = " ";

	@Column(name = "che58span")
	private String che58span = " ";

	@Column(name = "che58sprt")
	private String che58sprt = " ";

	@Column(name = "che58tino")
	private String che58tino = " ";

	@Column(name = "che58prov")
	private String che58prov = " ";

	@Column(name = "che58olda")
	private Long che58olda = 0L;

	@Column(name = "che58prtp")
	private String che58prtp = " ";

	@Column(name = "che58spyn")
	private String che58spyn = " ";

	@Column(name = "che58lprc")
	private Double che58lprc = 0d;// 零售价

	@Column(name = "chtxr1")
	private Long chtxr1 = 0L;

	@Column(name = "chexr1")
	private String chexr1 = " ";

	@Column(name = "chtx")
	private String chtx = " ";

	@Column(name = "chtxa1")
	private String chtxa1 = " ";

	@Column(name = "chprrc")
	private Double chprrc = 0D;

	@Column(name = "chaexp")
	private Double chaexp = 0D;

	@Column(name = "che58hkf")
	private String che58hkf = " ";

	@Column(name = "chkit")
	private Long chkit = 0L;

	@Column(name = "che58hkpln")
	private Long che58hkpln = 0L;

	@Column(name = "chkitl")
	private String chkitl = " ";

	@Column(name = "chkita")
	private String chkita = " ";

	@Column(name = "che58hsspf")
	private String che58hsspf = " ";

	@Column(name = "che58hshm")
	private String che58hshm = " ";

	@Column(name = "che58hshs")
	private Long che58hshs = 0L;

	@Column(name = "che58hhlid")
	private Long che58hhlid = 0L;

	@Column(name = "che58htlid")
	private Long che58htlid = 0L;

	@Column(name = "che58df01")
	private String che58df01 = " ";

	@Column(name = "che58hcof")
	private String che58hcof = " ";

	@Column(name = "che58df02")
	private String che58df02 = " ";

	@Column(name = "che58hqb")
	private Long che58hqb = 0L;

	@Column(name = "che58san8")
	private Long che58san8 = 0L;

	@Column(name = "chan81")
	private Long chan81 = 0L;

	@Column(name = "chan82")
	private Long chan82 = 0L;

	@Column(name = "chan83")
	private Long chan83 = 0L;

	@Column(name = "che58ssot")
	private String che58ssot = " ";

	@Column(name = "che58hoca")
	private String che58hoca = " ";

	@Column(name = "chogno")
	private Long chogno = 0L;

	@Column(name = "chodoc")
	private Long chodoc = 0L;

	@Column(name = "chodct")
	private String chodct = " ";

	@Column(name = "chokco")
	private String chokco = " ";

	@Column(name = "choorn")
	private String choorn = " ";

	@Column(name = "chrcto")
	private String chrcto = " ";

	@Column(name = "chrorn")
	private String chrorn = " ";

	@Column(name = "chrkco")
	private String chrkco = " ";

	@Column(name = "chdgj")
	private Long chdgj = 0L;

	@Column(name = "che58hcjof")
	private String che58hcjof = " ";

	@Column(name = "che58hamf")
	private String che58hamf = " ";

	@Column(name = "che58hos")
	private String che58hos = " ";

	@Column(name = "che58gpayf")
	private String che58gpayf = " ";

	@Column(name = "chglc")
	private String chglc = " ";

	@Column(name = "che58huf01")
	private String che58huf01 = " ";

	@Column(name = "che58huf02")
	private String che58huf02 = " ";

	@Column(name = "che58huf03")
	private String che58huf03 = " ";

	@Column(name = "che58huf04")
	private String che58huf04 = " ";

	@Column(name = "che58huf05")
	private String che58huf05 = " ";

	@Column(name = "che58huf06")
	private String che58huf06 = " ";

	@Column(name = "che58huf07")
	private String che58huf07 = " ";

	@Column(name = "che58huf08")
	private String che58huf08 = " ";

	@Column(name = "che58huf09")
	private String che58huf09 = " ";

	@Column(name = "che58huf10")
	private String che58huf10 = " ";

	@Column(name = "che58hus01")
	private String che58hus01 = " ";

	@Column(name = "che58hus02")
	private String che58hus02 = " ";

	@Column(name = "che58hus03")
	private String che58hus03 = " ";

	@Column(name = "che58hus04")
	private String che58hus04 = " ";

	@Column(name = "che58hus05")
	private String che58hus05 = " ";

	@Column(name = "che58hus06")
	private String che58hus06 = " ";

	@Column(name = "che58hus07")
	private String che58hus07 = " ";

	@Column(name = "che58hus08")
	private String che58hus08 = " ";

	@Column(name = "che58hus09")
	private String che58hus09 = " ";

	@Column(name = "che58hus10")
	private String che58hus10 = " ";

	@Column(name = "che58hus11")
	private String che58hus11 = " ";

	@Column(name = "che58hus12")
	private String che58hus12 = " ";

	@Column(name = "che58hus13")
	private String che58hus13 = " ";

	@Column(name = "che58hus14")
	private String che58hus14 = " ";

	@Column(name = "che58hus15")
	private String che58hus15 = " ";

	@Column(name = "che58hus16")
	private String che58hus16 = " ";

	@Column(name = "che58hus17")
	private String che58hus17 = " ";

	@Column(name = "che58hus18")
	private String che58hus18 = " ";

	@Column(name = "che58hus19")
	private String che58hus19 = " ";

	@Column(name = "che58hus20")
	private String che58hus20 = " ";

	@Column(name = "che58hus21")
	private String che58hus21 = " ";

	@Column(name = "che58hus22")
	private String che58hus22 = " ";

	@Column(name = "che58hus23")
	private String che58hus23 = " ";

	@Column(name = "che58hus24")
	private String che58hus24 = " ";

	@Column(name = "che58hus25")
	private String che58hus25 = " ";

	@Column(name = "che58hus26")
	private String che58hus26 = " ";

	@Column(name = "che58hun01")
	private Double che58hun01 = 0D;

	@Column(name = "che58hun02")
	private Long che58hun02 = 0L;

	@Column(name = "che58hun03")
	private Long che58hun03 = 0L;

	@Column(name = "che58hun04")
	private Long che58hun04 = 0L;

	// editor by magical 2014-10-20
	@Column(name = "che58hun05")
	private Long che58hun05 = 0L;

	@Column(name = "che58hud02")
	private Long che58hud02 = 0L;
	@Column(name = "che58hud01")
	private Long che58hud01 = 0L;
	@Column(name = "che58hud03")
	private Long che58hud03 = 0L;
	@Column(name = "che58hud04")
	private Long che58hud04 = 0L;
	@Column(name = "che58hud05")
	private Long che58hud05 = 0L;
	@Column(name = "churcd")
	private String churcd = " ";
	@Column(name = "churdt")
	private Long churdt = 0L;
	@Column(name = "churat")
	private Long churat = 0L;

	@Column(name = "chrcd")
	private String chrcd = " ";

	@Column(name = "chsocn")
	private Long chsocn = 0L;
	@Column(name = "chsrp1")
	private String chsrp1 = " ";
	@Column(name = "chsrp2")
	private String chsrp2 = " ";
	@Column(name = "chsrp3")
	private String chsrp3 = " ";
	@Column(name = "chsrp4")
	private String chsrp4 = " ";
	@Column(name = "chsrp5")
	private String chsrp5 = " ";
	@Column(name = "chuncs")
	private Long chuncs = 0L;
	@Column(name = "chzinv")
	private String chzinv = " ";
	@Column(name = "chso01")
	private String chso01 = " ";
	@Column(name = "chso02")
	private String chso02 = " ";
	@Column(name = "chso03")
	private String chso03 = " ";
	@Column(name = "chso04")
	private String chso04 = " ";
	@Column(name = "chso05")
	private String chso05 = " ";
	@Column(name = "chso06")
	private String chso06 = " ";
	@Column(name = "chso07")
	private String chso07 = " ";
	@Column(name = "chso08")
	private String chso08 = " ";
	@Column(name = "chso09")
	private String chso09 = " ";
	@Column(name = "chso10")
	private String chso10 = " ";
	@Column(name = "chso11")
	private String chso11 = " ";
	@Column(name = "chsobk")
	private Long chsobk = 0L;
	@Column(name = "churab")
	private Long churab = 0L;
	// end editor by magical 2014-10-20

	@Column(name = "chupmj")
	private Long chupmj = 0L;

	@Column(name = "chupmt")
	private Long chupmt = 0L;

	@Column(name = "chjobn")
	private String chjobn = " ";

	@Column(name = "chuser")
	private String chuser = " ";

	@Column(name = "chpid")
	private String chpid = " ";

	@Column(name = "che1psn")
	private Long che1psn = 0L;

	@Column(name = "chemcu")
	private String chemcu = " ";

	@Column(name = "churrf")
	private String churrf = " ";// 备注信息

	@Column(name = "chslmcu")
	private String chslmcu = " ";

	@Column(name = "chprp1")
	private String chprp1 = " ";

	@Column(name = "chprp2")
	private String chprp2 = " ";

	@Column(name = "chprp3")
	private String chprp3 = " ";// editor by magical
	// @Column(name = "che1shpn")
	// private String che1shpn = " ";
	@Column(name = "chprp4")
	private String chprp4 = " ";

	@Column(name = "chprp5")
	private String chprp5 = " ";

	@Column(name = "che58hqg")
	private Long che58hqg = 0L;// 已发货数量

	// Begin -- added by Sunny 2014-10-11 for 增加库存单位及税率相关字段
	@Column(name = "chsqor")
	private Long chsqor = 0L;// 库存单位数量

	@Column(name = "chuom2")
	private String chuom2 = " ";// 库位计量单位

	@Column(name = "chconv")
	private Double chconv;// 库存计量单位转换系数

	// End -- added by Sunny 2014-10-11

	public Long getChe58hqg() {
		return che58hqg;
	}

	public void setChe58hqg(Long che58hqg) {
		this.che58hqg = che58hqg;
	}

	/**
	 * 一般中文名
	 */
	@Transient
	private String chdsc1 = " ";

	@Transient
	private String chu5dd = " ";
	/**
	 * 会员价
	 */
	@Transient
	private Double chmprice = 0.0;
	/**
	 * 原会员价，用于标准分和超大份的促销价格
	 */
	@Transient
	private Double choldmprice = 0.0;
	public Double getCholdmprice() {
		return choldmprice;
	}

	public void setCholdmprice(Double choldmprice) {
		this.choldmprice = choldmprice;
	}

	/**
	 * 可供量
	 */
	@Transient
	private Double chtrqt = 0d;

	@Transient
	private Long chukid = 0L;
	/**
	 * 0表示该商品无批量价
	 */
	@Transient
	private Long chplprice = 0L;

	/**
	 * 一级会员价
	 */
	@Transient
	private Long chfmprice = 0L;

	/**
	 * 一级会员价 - DOUBLE类型
	 */
	@Transient
	private Double omprice = 0d;

	/**
	 * 商品条码
	 */
	@Transient
	private String goodsCitm;
	/**
	 * 商品产地
	 */
	@Transient
	private String goodsOrigin;
	/**
	 * 计量单位描述
	 */
	@Transient
	private String chuomDesc;
	/**
	 * 计量单位描述
	 */
	@Transient
	private String chuom2Desc;
	/**
	 * 商品规格
	 */
	@Transient
	private String goodsSpec;
	
	/**
	 * 商品估清标志 Vincent 2015-07-09
	 */
	@Transient
	private String ibstkt;
	


	public String getIbstkt() {
		return ibstkt;
	}

	public void setIbstkt(String ibstkt) {
		this.ibstkt = ibstkt;
	}

	/**
	 * 一级会员价
	 */
	public Long getChfmprice() {
		return chfmprice;
	}

	/**
	 * 一级会员价
	 */
	public void setChfmprice(Long chfmprice) {
		this.chfmprice = chfmprice;
	}

	/**
	 * 0表示该商品无批量价
	 */
	public Long getChplprice() {
		return chplprice;
	}

	/**
	 * 0表示该商品无批量价
	 */
	public void setChplprice(Long chplprice) {
		this.chplprice = chplprice;
	}

	public Long getChukid() {
		return chukid;
	}

	public void setChukid(Long chukid) {
		this.chukid = chukid;
	}

	/**
	 * 订单号
	 * 
	 * @methodName getChdoco
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChdoco() {
		return chdoco;
	}

	/**
	 * 订单号
	 * 
	 * @methodName getChdoco
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChdoco(Long chdoco) {
		this.chdoco = chdoco;
	}

	/**
	 * 
	 * @methodName getChdsc1
	 * @methodDesc (商品名称一般中文用)
	 * @conditionsUse：(画面显示用)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChdsc1() {
		return chdsc1;
	}

	/**
	 * 
	 * @methodName getChdsc1
	 * @methodDesc (商品名称一般中文用)
	 * @conditionsUse：(画面显示用)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChdsc1(String chdsc1) {
		this.chdsc1 = chdsc1;
	}

	/**
	 * 
	 * @methodName getChu5dd
	 * @methodDesc (是否必须身份码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChu5dd() {
		return chu5dd;
	}

	/**
	 * 
	 * @methodName getChu5dd
	 * @methodDesc (是否必须身份码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChu5dd(String chu5dd) {
		this.chu5dd = chu5dd;
	}

	/**
	 * 
	 * @methodName getChmprice
	 * @methodDesc (会员价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChmprice() {
		return chmprice;
	}

	/**
	 * 
	 * @methodName getChmprice
	 * @methodDesc (会员价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChmprice(Double chmprice) {
		this.chmprice = chmprice;
	}

	/**
	 * 
	 * @methodName getChtrqt
	 * @methodDesc (可供量)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChtrqt() {
		return chtrqt;
	}

	/**
	 * 
	 * @methodName getChtrqt
	 * @methodDesc (可供量)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChtrqt(Double chtrqt) {
		this.chtrqt = chtrqt;
	}

	/**
	 * 
	 * @methodName getF58h0411pk
	 * @methodDesc (零售单明细对应表F58H0411主键)
	 * @conditionsUse：(应用条件)
	 * @return F58h0411PK
	 * @exception
	 * @since 1.0.0
	 */
	public F58h0411PK getF58h0411pk() {
		return f58h0411pk;
	}

	/**
	 * 
	 * @methodName getF58h0411pk
	 * @methodDesc (零售单明细对应表F58H0411主键)
	 * @conditionsUse：(应用条件)
	 * @return F58h0411PK
	 * @exception
	 * @since 1.0.0
	 */
	public void setF58h0411pk(F58h0411PK f58h0411pk) {
		this.f58h0411pk = f58h0411pk;
	}

	/**
	 * 定单类型
	 * 
	 * @methodName getChdcto
	 * @methodDesc (dcto 订单类型（页面单据类型，选择的）)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChdcto() {
		return chdcto;
	}

	/**
	 * 定单类型
	 * 
	 * @methodName getChdcto
	 * @methodDesc (dcto 订单类型（页面单据类型，选择的）)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChdcto(String chdcto) {
		this.chdcto = chdcto;
	}

	/**
	 * 定单公司
	 * 
	 * @methodName getChkcoo
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChkcoo() {
		return chkcoo;
	}

	/**
	 * 定单公司
	 * 
	 * @methodName getChkcoo
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChkcoo(String chkcoo) {
		this.chkcoo = chkcoo;
	}

	/**
	 * 
	 * @methodName getChlnid
	 * @methodDesc (行号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChlnid() {
		return chlnid;
	}

	/**
	 * 
	 * @methodName getChlnid
	 * @methodDesc (行号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChlnid(Long chlnid) {
		this.chlnid = chlnid;
	}

	/**
	 * 公司
	 * 
	 * @methodName getChco
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChco() {
		return chco;
	}

	/**
	 * 公司
	 * 
	 * @methodName getChco
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChco(String chco) {
		this.chco = chco;
	}

	/**
	 * 经营单位(出货门店)
	 * 
	 * @methodName getChmcu
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChmcu() {
		return chmcu;
	}

	/**
	 * 经营单位(出货门店)
	 * 
	 * @methodName getChmcu
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChmcu(String chmcu) {
		this.chmcu = chmcu;
	}

	/**
	 * 经营单位地址号
	 * 
	 * @methodName getChe58han8m
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58han8m() {
		return che58han8m;
	}

	/**
	 * 经营单位地址号
	 * 
	 * @methodName getChe58han8m
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58han8m(Long che58han8m) {
		this.che58han8m = che58han8m;
	}

	/**
	 * 客户号
	 * 
	 * @methodName getChe58han8c
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58han8c() {
		return che58han8c;
	}

	/**
	 * 客户号
	 * 
	 * @methodName getChe58han8c
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58han8c(Long che58han8c) {
		this.che58han8c = che58han8c;
	}

	/**
	 * 会员号
	 * 
	 * @methodName getChe58mcno
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58mcno() {
		return che58mcno;
	}

	/**
	 * 会员号
	 * 
	 * @methodName getChe58mcno
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58mcno(String che58mcno) {
		this.che58mcno = che58mcno;
	}

	/**
	 * 是否参与会员积分计算
	 * 
	 * @methodName getChe58df03
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58df03() {
		return che58df03;
	}

	/**
	 * 是否参与会员积分计算
	 * 
	 * @methodName getChe58df03
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58df03(String che58df03) {
		this.che58df03 = che58df03;
	}

	/**
	 * 订单日期
	 * 
	 * @methodName getChtrdj
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChtrdj() {
		return chtrdj;
	}

	/**
	 * 订单日期
	 * 
	 * @methodName getChtrdj
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChtrdj(Long chtrdj) {
		this.chtrdj = chtrdj;
	}

	/**
	 * 要求送货日期
	 * 
	 * @methodName getChe58hrsd
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hrsd() {
		return che58hrsd;
	}

	/**
	 * 要求送货日期
	 * 
	 * @methodName getChe58hrsd
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hrsd(Long che58hrsd) {
		this.che58hrsd = che58hrsd;
	}

	/**
	 * 要求送货时间
	 * 
	 * @methodName getChe58hrst
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hrst() {
		return che58hrst;
	}

	/**
	 * 要求送货时间
	 * 
	 * @methodName getChe58hrst
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hrst(Long che58hrst) {
		this.che58hrst = che58hrst;
	}

	/**
	 * 
	 * @methodName getChe58hsid
	 * @methodDesc (仓库代码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hsid() {
		return che58hsid;
	}

	/**
	 * 
	 * @methodName getChe58hsid
	 * @methodDesc (仓库代码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hsid(String che58hsid) {
		this.che58hsid = che58hsid;
	}

	/**
	 * 
	 * @methodName getChe58hsan8
	 * @methodDesc (仓库地址号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hsan8() {
		return che58hsan8;
	}

	/**
	 * 
	 * @methodName getChe58hsan8
	 * @methodDesc (仓库地址号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hsan8(Long che58hsan8) {
		this.che58hsan8 = che58hsan8;
	}

	/**
	 * 
	 * @methodName getChlocn
	 * @methodDesc (仓库库位代码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChlocn() {
		return chlocn;
	}

	/**
	 * 
	 * @methodName getChlocn
	 * @methodDesc (仓库库位代码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChlocn(String chlocn) {
		this.chlocn = chlocn;
	}

	/**
	 * 
	 * @methodName getChlotn
	 * @methodDesc (货物批次/序列号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChlotn() {
		return chlotn;
	}

	/**
	 * 
	 * @methodName getChlotn
	 * @methodDesc (货物批次/序列号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChlotn(String chlotn) {
		this.chlotn = chlotn;
	}

	/**
	 * 
	 * @methodName getChitm
	 * @methodDesc (短项目号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChitm() {
		return chitm;
	}

	/**
	 * 
	 * @methodName getChitm
	 * @methodDesc (短项目号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChitm(Long chitm) {
		this.chitm = chitm;
	}

	/**
	 * 长项目号
	 * 
	 * @methodName getChlitm
	 * @methodDesc (产品编号（LITM）)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChlitm() {
		return chlitm;
	}

	/**
	 * 长项目号
	 * 
	 * @methodName getChlitm
	 * @methodDesc (产品编号（LITM）)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChlitm(String chlitm) {
		this.chlitm = chlitm;
	}

	/**
	 * 会员姓名
	 * 
	 * @methodName getChalph
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChalph() {
		return chalph;
	}

	/**
	 * 会员姓名
	 * 
	 * @methodName getChalph
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChalph(String chalph) {
		this.chalph = chalph;
	}

	/**
	 * 短项目号
	 * 
	 * @methodName getChaitm
	 * @methodDesc (产品目录号（AITM）)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChaitm() {
		return chaitm;
	}

	/**
	 * 短项目号
	 * 
	 * @methodName getChaitm
	 * @methodDesc (产品目录号（AITM）)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChaitm(String chaitm) {
		this.chaitm = chaitm;
	}

	/**
	 * 条形码
	 * 
	 * @methodName getChe58hbarc
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hbarc() {
		return che58hbarc;
	}

	/**
	 * 条形码
	 * 
	 * @methodName getChe58hbarc
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hbarc(String che58hbarc) {
		this.che58hbarc = che58hbarc;
	}

	/**
	 * 
	 * @methodName getChe58jsid
	 * @methodDesc (身份码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58jsid() {
		return che58jsid;
	}

	/**
	 * 
	 * @methodName getChe58jsid
	 * @methodDesc (身份码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58jsid(String che58jsid) {
		this.che58jsid = che58jsid;
	}

	/**
	 * 
	 * @methodName getChuorg
	 * @methodDesc (数量)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChuorg() {
		return chuorg;
	}

	/**
	 * 
	 * @methodName getChuorg
	 * @methodDesc (数量)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChuorg(Long chuorg) {
		this.chuorg = chuorg;
	}

	/**
	 * 
	 * @methodName getChuom
	 * @methodDesc (计量单位)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChuom() {
		return chuom;
	}

	/**
	 * 
	 * @methodName getChuom
	 * @methodDesc (计量单位)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChuom(String chuom) {
		this.chuom = chuom;
	}

	/**
	 * 
	 * @methodName getChe58prdc
	 * @methodDesc (折扣率)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58prdc() {
		return che58prdc;
	}

	/**
	 * 
	 * @methodName getChe58prdc
	 * @methodDesc (折扣率)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58prdc(Long che58prdc) {
		this.che58prdc = che58prdc;
	}

	/**
	 * 
	 * @methodName getChe58lspan
	 * @methodDesc (行促销主题)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58lspan() {
		return che58lspan;
	}

	/**
	 * 
	 * @methodName getChe58lspan
	 * @methodDesc (行促销主题)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58lspan(String che58lspan) {
		this.che58lspan = che58lspan;
	}

	/**
	 * 
	 * @methodName getChe58lsprt
	 * @methodDesc (促销类型)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58lsprt() {
		return che58lsprt;
	}

	/**
	 * 
	 * @methodName getChe58lsprt
	 * @methodDesc (促销类型)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58lsprt(String che58lsprt) {
		this.che58lsprt = che58lsprt;
	}

	/**
	 * 
	 * @methodName getChe58pdlup
	 * @methodDesc (行折扣后净价（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChe58pdlup() {
		return che58pdlup;
	}

	/**
	 * 
	 * @methodName getChe58pdlup
	 * @methodDesc (行折扣后净价（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58pdlup(double che58pdlup) {
		this.che58pdlup = che58pdlup;
	}

	/**
	 * 
	 * @methodName getChe58pael
	 * @methodDesc (行折扣后净金额（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChe58pael() {
		return che58pael;
	}

	/**
	 * 
	 * @methodName getChe58pael
	 * @methodDesc (行折扣后净金额（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58pael(Double che58pael) {
		this.che58pael = che58pael;
	}

	/**
	 * 实际成交价
	 * 
	 * @methodName getChe58uprc
	 * @methodDesc (整单促销折扣后净价（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChe58uprc() {
		return che58uprc;
	}

	/**
	 * 实际成交价
	 * 
	 * @methodName getChe58uprc
	 * @methodDesc (整单促销折扣后净价（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58uprc(Double che58uprc) {
		this.che58uprc = che58uprc;
	}

	/**
	 * 
	 * @methodName getChe58aexp
	 * @methodDesc (整单促销折扣后净金额（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChe58aexp() {
		return che58aexp;
	}

	/**
	 * 
	 * @methodName getChe58aexp
	 * @methodDesc (整单促销折扣后净金额（含税）)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58aexp(Double che58aexp) {
		this.che58aexp = che58aexp;
	}

	/**
	 * 
	 * @methodName getChe58ccda
	 * @methodDesc (券折扣金额 )
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58ccda() {
		return che58ccda;
	}

	/**
	 * 
	 * @methodName getChe58ccda
	 * @methodDesc (券折扣金额 )
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58ccda(Long che58ccda) {
		this.che58ccda = che58ccda;
	}

	/**
	 * 
	 * @methodName getChe58accpu
	 * @methodDesc (券折扣后单价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58accpu() {
		return che58accpu;
	}

	/**
	 * 
	 * @methodName getChe58accpu
	 * @methodDesc (券折扣后单价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58accpu(Long che58accpu) {
		this.che58accpu = che58accpu;
	}

	/**
	 * 
	 * @methodName getChe58accda
	 * @methodDesc (券折扣后金额)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58accda() {
		return che58accda;
	}

	/**
	 * 
	 * @methodName getChe58accda
	 * @methodDesc (券折扣后金额)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58accda(Long che58accda) {
		this.che58accda = che58accda;
	}

	/**
	 * 
	 * @methodName getChe58bcno
	 * @methodDesc (组合方案号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58bcno() {
		return che58bcno;
	}

	/**
	 * 
	 * @methodName getChe58bcno
	 * @methodDesc (组合方案号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58bcno(Long che58bcno) {
		this.che58bcno = che58bcno;
	}

	/**
	 * 组合序列号
	 * 
	 * @methodName getChe58bcln
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58bcln() {
		return che58bcln;
	}

	/**
	 * 组合序列号
	 * 
	 * @methodName getChe58bcln
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58bcln(Long che58bcln) {
		this.che58bcln = che58bcln;
	}

	/**
	 * 
	 * @methodName getChfgy
	 * @methodDesc (是否赠品)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChfgy() {
		return chfgy;
	}

	/**
	 * 
	 * @methodName getChfgy
	 * @methodDesc (是否赠品)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChfgy(String chfgy) {
		this.chfgy = chfgy;
	}

	/**
	 * 整单促销主题
	 * 
	 * @methodName getChe58span
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58span() {
		return che58span;
	}

	/**
	 * 整单促销主题
	 * 
	 * @methodName getChe58span
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58span(String che58span) {
		this.che58span = che58span;
	}

	/**
	 * 整单促销类型
	 * 
	 * @methodName getChe58sprt
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58sprt() {
		return che58sprt;
	}

	/**
	 * 整单促销类型
	 * 
	 * @methodName getChe58sprt
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58sprt(String che58sprt) {
		this.che58sprt = che58sprt;
	}

	/**
	 * 赠券序列号
	 * 
	 * @methodName getChe58tino
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58tino() {
		return che58tino;
	}

	/**
	 * 赠券序列号
	 * 
	 * @methodName getChe58tino
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58tino(String che58tino) {
		this.che58tino = che58tino;
	}

	/**
	 * 
	 * @methodName getChe58prov
	 * @methodDesc (折扣覆盖标志)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58prov() {
		return che58prov;
	}

	/**
	 * 
	 * @methodName getChe58prov
	 * @methodDesc (折扣覆盖标志)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58prov(String che58prov) {
		this.che58prov = che58prov;
	}

	/**
	 * 订单行折让金额:=(che58lprc(零售价)-che58uprc(实际成交价))*chuorg(购买数量)
	 * 
	 * @methodName getChe58olda
	 * @methodDesc (订单行折让金额)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58olda() {
		return che58olda;
	}

	/**
	 * 订单行折让金额:=(che58lprc(零售价)-che58uprc(实际成交价))*chuorg(购买数量)
	 * 
	 * @methodName getChe58olda
	 * @methodDesc (订单行折让金额)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58olda(Long che58olda) {
		this.che58olda = che58olda;
	}

	/**
	 * 
	 * @methodName getChe58prtp
	 * @methodDesc (满送赠品的类型 )
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58prtp() {
		return che58prtp;
	}

	/**
	 * 
	 * @methodName getChe58prtp
	 * @methodDesc (满送赠品的类型 )
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58prtp(String che58prtp) {
		this.che58prtp = che58prtp;
	}

	/**
	 * 
	 * @methodName getChe58spyn
	 * @methodDesc (折扣共享标志)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58spyn() {
		return che58spyn;
	}

	/**
	 * 
	 * @methodName getChe58spyn
	 * @methodDesc (折扣共享标志)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58spyn(String che58spyn) {
		this.che58spyn = che58spyn;
	}

	/**
	 * 销售基价,零售价
	 * 
	 * @methodName getChe58lprc
	 * @methodDesc (销售基价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChe58lprc() {
		return che58lprc;
	}

	/**
	 * 销售基价,零售价
	 * 
	 * @methodName getChe58lprc
	 * @methodDesc (销售基价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58lprc(Double che58lprc) {
		this.che58lprc = che58lprc;
	}

	/**
	 * 
	 * @methodName getChtxr1
	 * @methodDesc (税率)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChtxr1() {
		return chtxr1;
	}

	/**
	 * 
	 * @methodName getChtxr1
	 * @methodDesc (税率)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChtxr1(Long chtxr1) {
		this.chtxr1 = chtxr1;
	}

	/**
	 * 
	 * @methodName getChexr1
	 * @methodDesc (税说明码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChexr1() {
		return chexr1;
	}

	/**
	 * 
	 * @methodName getChexr1
	 * @methodDesc (税说明码)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChexr1(String chexr1) {
		this.chexr1 = chexr1;
	}

	/**
	 * 
	 * @methodName setChtx
	 * @methodDesc (是否含税)
	 * @conditionsUse：(应用条件)
	 * @param chtx
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public String getChtx() {
		return chtx;
	}

	/**
	 * 
	 * @methodName setChtx
	 * @methodDesc (是否含税)
	 * @conditionsUse：(应用条件)
	 * @param chtx
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public void setChtx(String chtx) {
		this.chtx = chtx;
	}

	/**
	 * 
	 * @methodName getChtxa1
	 * @methodDesc (税率/税区码 )
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChtxa1() {
		return chtxa1;
	}

	/**
	 * 
	 * @methodName getChtxa1
	 * @methodDesc (税率/税区码 )
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChtxa1(String chtxa1) {
		this.chtxa1 = chtxa1;
	}

	/**
	 * 
	 * @methodName getChprrc
	 * @methodDesc (不含税单价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChprrc() {
		return chprrc;
	}

	/**
	 * 
	 * @methodName getChprrc
	 * @methodDesc (不含税单价)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChprrc(Double chprrc) {
		this.chprrc = chprrc;
	}

	/**
	 * 
	 * @methodName getChaexp
	 * @methodDesc (不含税金额)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChaexp() {
		return chaexp;
	}

	/**
	 * 
	 * @methodName getChaexp
	 * @methodDesc (不含税金额)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChaexp(Double chaexp) {
		this.chaexp = chaexp;
	}

	/**
	 * 
	 * @methodName getChe58hkf
	 * @methodDesc (套件)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hkf() {
		return che58hkf;
	}

	/**
	 * 
	 * @methodName getChe58hkf
	 * @methodDesc (套件)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hkf(String che58hkf) {
		this.che58hkf = che58hkf;
	}

	/**
	 * 
	 * @methodName getChkit
	 * @methodDesc (KIT的短项目号 )
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChkit() {
		return chkit;
	}

	/**
	 * 
	 * @methodName getChkit
	 * @methodDesc (KIT的短项目号 )
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChkit(Long chkit) {
		this.chkit = chkit;
	}

	/**
	 * 
	 * @methodName getChe58hkpln
	 * @methodDesc (父项订单行号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hkpln() {
		return che58hkpln;
	}

	/**
	 * 
	 * @methodName getChe58hkpln
	 * @methodDesc (父项订单行号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hkpln(Long che58hkpln) {
		this.che58hkpln = che58hkpln;
	}

	/**
	 * 
	 * @methodName getChkitl
	 * @methodDesc (KIT的第2项目号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChkitl() {
		return chkitl;
	}

	/**
	 * 
	 * @methodName getChkitl
	 * @methodDesc (KIT的第2项目号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChkitl(String chkitl) {
		this.chkitl = chkitl;
	}

	/**
	 * 
	 * @methodName getChkita
	 * @methodDesc (KIT的第3项目号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChkita() {
		return chkita;
	}

	/**
	 * 
	 * @methodName getChkita
	 * @methodDesc (KIT的第3项目号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChkita(String chkita) {
		this.chkita = chkita;
	}

	/**
	 * 配送门店付款状态
	 * 
	 * @methodName getChe58hsspf
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hsspf() {
		return che58hsspf;
	}

	/**
	 * 配送门店付款状态
	 * 
	 * @methodName getChe58hsspf
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hsspf(String che58hsspf) {
		this.che58hsspf = che58hsspf;
	}

	/**
	 * 送货方式
	 * 
	 * @methodName getChe58hshm
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hshm() {
		return che58hshm;
	}

	/**
	 * 送货方式
	 * 
	 * @methodName getChe58hshm
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hshm(String che58hshm) {
		this.che58hshm = che58hshm;
	}

	/**
	 * 
	 * @methodName getChe58hshs
	 * @methodDesc (配送门店)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hshs() {
		return che58hshs;
	}

	/**
	 * 
	 * @methodName getChe58hshs
	 * @methodDesc (配送门店)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hshs(Long che58hshs) {
		this.che58hshs = che58hshs;
	}

	/**
	 * 物流公司代码
	 * 
	 * @methodName getChe58hhlid
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hhlid() {
		return che58hhlid;
	}

	/**
	 * 物流公司代码
	 * 
	 * @methodName getChe58hhlid
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hhlid(Long che58hhlid) {
		this.che58hhlid = che58hhlid;
	}

	/**
	 * 订单承运的第三方物流公司编号
	 * 
	 * @methodName getChe58htlid
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58htlid() {
		return che58htlid;
	}

	/**
	 * 订单承运的第三方物流公司编号
	 * 
	 * @methodName getChe58htlid
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58htlid(Long che58htlid) {
		this.che58htlid = che58htlid;
	}

	/**
	 * 预订单
	 * 
	 * @methodName getChe58df01
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58df01() {
		return che58df01;
	}

	/**
	 * 预订单
	 * 
	 * @methodName getChe58df01
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58df01(String che58df01) {
		this.che58df01 = che58df01;
	}

	/**
	 * 普通订单
	 * 
	 * @methodName getChe58hcof
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hcof() {
		return che58hcof;
	}

	/**
	 * 普通订单
	 * 
	 * @methodName getChe58hcof
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hcof(String che58hcof) {
		this.che58hcof = che58hcof;
	}

	/**
	 * 是否已退货
	 * 
	 * @methodName getChe58df02
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58df02() {
		return che58df02;
	}

	/**
	 * 是否已退货
	 * 
	 * @methodName getChe58df02
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58df02(String che58df02) {
		this.che58df02 = che58df02;
	}

	/**
	 * 已退回数量
	 * 
	 * @methodName getChe58hqb
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hqb() {
		return che58hqb;
	}

	/**
	 * 已退回数量
	 * 
	 * @methodName getChe58hqb
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hqb(Long che58hqb) {
		this.che58hqb = che58hqb;
	}

	/**
	 * 下单员
	 * 
	 * @methodName getChe58san8
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58san8() {
		return che58san8;
	}

	/**
	 * 下单员
	 * 
	 * @methodName getChe58san8
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58san8(Long che58san8) {
		this.che58san8 = che58san8;
	}

	/**
	 * 业务员
	 * 
	 * @methodName getChan81
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChan81() {
		return chan81;
	}

	/**
	 * 业务员
	 * 
	 * @methodName getChan81
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChan81(Long chan81) {
		this.chan81 = chan81;
	}

	/**
	 * 介绍人
	 * 
	 * @methodName getChan82
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChan82() {
		return chan82;
	}

	/**
	 * 介绍人
	 * 
	 * @methodName getChan82
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChan82(Long chan82) {
		this.chan82 = chan82;
	}

	/**
	 * 备用业务员03
	 * 
	 * @methodName getChan83
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChan83() {
		return chan83;
	}

	/**
	 * 备用业务员03
	 * 
	 * @methodName getChan83
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChan83(Long chan83) {
		this.chan83 = chan83;
	}

	/**
	 * 
	 * @methodName getChe58ssot
	 * @methodDesc (销售单种类)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58ssot() {
		return che58ssot;
	}

	/**
	 * 
	 * @methodName getChe58ssot
	 * @methodDesc (销售单种类)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58ssot(String che58ssot) {
		this.che58ssot = che58ssot;
	}

	/**
	 * 
	 * @methodName getChe58hoca
	 * @methodDesc (下单的渠道)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hoca() {
		return che58hoca;
	}

	/**
	 * 
	 * @methodName getChe58hoca
	 * @methodDesc (下单的渠道)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hoca(String che58hoca) {
		this.che58hoca = che58hoca;
	}

	/**
	 * 相关订单行号
	 * 
	 * @methodName getChogno
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChogno() {
		return chogno;
	}

	/**
	 * 相关订单行号
	 * 
	 * @methodName getChogno
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChogno(Long chogno) {
		this.chogno = chogno;
	}

	/**
	 * 
	 * @methodName getChodoc
	 * @methodDesc (原始订单编号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChodoc() {
		return chodoc;
	}

	/**
	 * 
	 * @methodName getChodoc
	 * @methodDesc (原始订单编号)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChodoc(Long chodoc) {
		this.chodoc = chodoc;
	}

	/**
	 * 
	 * @methodName getChodct
	 * @methodDesc (原始订单类型)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChodct() {
		return chodct;
	}

	/**
	 * 
	 * @methodName getChodct
	 * @methodDesc (原始订单类型)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChodct(String chodct) {
		this.chodct = chodct;
	}

	/**
	 * 
	 * @methodName getChokco
	 * @methodDesc (原始订单公司)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChokco() {
		return chokco;
	}

	/**
	 * 
	 * @methodName getChokco
	 * @methodDesc (原始订单公司)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChokco(String chokco) {
		this.chokco = chokco;
	}

	/**
	 * 
	 * @methodName getChoorn
	 * @methodDesc (原始订单行号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChoorn() {
		return choorn;
	}

	/**
	 * 
	 * @methodName getChoorn
	 * @methodDesc (原始订单行号)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChoorn(String choorn) {
		this.choorn = choorn;
	}

	/**
	 * 相关订单类型
	 * 
	 * @methodName getChrcto
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChrcto() {
		return chrcto;
	}

	/**
	 * 相关订单类型
	 * 
	 * @methodName getChrcto
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChrcto(String chrcto) {
		this.chrcto = chrcto;
	}

	/**
	 * 相关订单编号
	 * 
	 * @methodName getChrorn
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChrorn() {
		return chrorn;
	}

	/**
	 * 相关订单编号
	 * 
	 * @methodName getChrorn
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChrorn(String chrorn) {
		this.chrorn = chrorn;
	}

	/**
	 * 相关订单公司
	 * 
	 * @methodName getChrkco
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChrkco() {
		return chrkco;
	}

	/**
	 * 相关订单公司
	 * 
	 * @methodName getChrkco
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChrkco(String chrkco) {
		this.chrkco = chrkco;
	}

	/**
	 * 总帐日期
	 * 
	 * @methodName getChdgj
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChdgj() {
		return chdgj;
	}

	/**
	 * 总帐日期
	 * 
	 * @methodName getChdgj
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChdgj(Long chdgj) {
		this.chdgj = chdgj;
	}

	/**
	 * 生成JDE销售单标识
	 * 
	 * @methodName getChe58hcjof
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hcjof() {
		return che58hcjof;
	}

	/**
	 * 生成JDE销售单标识
	 * 
	 * @methodName getChe58hcjof
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hcjof(String che58hcjof) {
		this.che58hcjof = che58hcjof;
	}

	/**
	 * 可供量扣减标识
	 * 
	 * @methodName getChe58hamf
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hamf() {
		return che58hamf;
	}

	/**
	 * 可供量扣减标识
	 * 
	 * @methodName getChe58hamf
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hamf(String che58hamf) {
		this.che58hamf = che58hamf;
	}

	/**
	 * 行状态
	 * 
	 * @methodName getChe58hos
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hos() {
		return che58hos;
	}

	/**
	 * 行状态
	 * 
	 * @methodName getChe58hos
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hos(String che58hos) {
		this.che58hos = che58hos;
	}

	public String getChe58gpayf() {
		return che58gpayf;
	}

	public void setChe58gpayf(String che58gpayf) {
		this.che58gpayf = che58gpayf;
	}

	/**
	 * 总帐分类码
	 * 
	 * @methodName getChglc
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChglc() {
		return chglc;
	}

	/**
	 * 总帐分类码
	 * 
	 * @methodName getChglc
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChglc(String chglc) {
		this.chglc = chglc;
	}

	/**
	 * 
	 * @methodName getChe58huf01
	 * @methodDesc (预留标识符1)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf01() {
		return che58huf01;
	}

	/**
	 * 
	 * @methodName getChe58huf01
	 * @methodDesc (预留标识符1)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf01(String che58huf01) {
		this.che58huf01 = che58huf01;
	}

	/**
	 * 
	 * @methodName getChe58huf02
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf02() {
		return che58huf02;
	}

	/**
	 * 
	 * @methodName setChe58huf02
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @param che58huf02
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf02(String che58huf02) {
		this.che58huf02 = che58huf02;
	}

	/**
	 * 
	 * @methodName getChe58huf03
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf03() {
		return che58huf03;
	}

	/**
	 * 
	 * @methodName setChe58huf03
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @param che58huf03
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf03(String che58huf03) {
		this.che58huf03 = che58huf03;
	}

	/**
	 * 
	 * @methodName getChe58huf04
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf04() {
		return che58huf04;
	}

	/**
	 * 
	 * @methodName setChe58huf04
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @param che58huf04
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf04(String che58huf04) {
		this.che58huf04 = che58huf04;
	}

	/**
	 * 
	 * @methodName getChe58huf05
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf05() {
		return che58huf05;
	}

	/**
	 * 
	 * @methodName setChe58huf05
	 * @methodDesc (预留标识符)
	 * @conditionsUse：(应用条件)
	 * @param che58huf05
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf05(String che58huf05) {
		this.che58huf05 = che58huf05;
	}

	/**
	 * 行类型
	 * 
	 * @methodName getChe58huf06
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf06() {
		return che58huf06;
	}

	/**
	 * 行类型
	 * 
	 * @methodName getChe58huf06
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf06(String che58huf06) {
		this.che58huf06 = che58huf06;
	}

	/**
	 * 积分台账类型
	 * 
	 * @methodName getChe58huf07
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf07() {
		return che58huf07;
	}

	/**
	 * 积分台账类型
	 * 
	 * @methodName getChe58huf07
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf07(String che58huf07) {
		this.che58huf07 = che58huf07;
	}

	public String getChe58huf08() {
		return che58huf08;
	}

	public void setChe58huf08(String che58huf08) {
		this.che58huf08 = che58huf08;
	}

	/**
	 * 取消行标志
	 * 
	 * @methodName getChe58huf09
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58huf09() {
		return che58huf09;
	}

	/**
	 * 取消行标志
	 * 
	 * @methodName getChe58huf09
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58huf09(String che58huf09) {
		this.che58huf09 = che58huf09;
	}

	public String getChe58huf10() {
		return che58huf10;
	}

	public void setChe58huf10(String che58huf10) {
		this.che58huf10 = che58huf10;
	}

	public String getChe58hus01() {
		return che58hus01;
	}

	public void setChe58hus01(String che58hus01) {
		this.che58hus01 = che58hus01;
	}

	public String getChe58hus02() {
		return che58hus02;
	}

	public void setChe58hus02(String che58hus02) {
		this.che58hus02 = che58hus02;
	}

	public String getChe58hus03() {
		return che58hus03;
	}

	public void setChe58hus03(String che58hus03) {
		this.che58hus03 = che58hus03;
	}

	public String getChe58hus04() {
		return che58hus04;
	}

	public void setChe58hus04(String che58hus04) {
		this.che58hus04 = che58hus04;
	}

	public String getChe58hus05() {
		return che58hus05;
	}

	public void setChe58hus05(String che58hus05) {
		this.che58hus05 = che58hus05;
	}

	public String getChe58hus06() {
		return che58hus06;
	}

	public void setChe58hus06(String che58hus06) {
		this.che58hus06 = che58hus06;
	}

	public String getChe58hus07() {
		return che58hus07;
	}

	public void setChe58hus07(String che58hus07) {
		this.che58hus07 = che58hus07;
	}

	public String getChe58hus08() {
		return che58hus08;
	}

	public void setChe58hus08(String che58hus08) {
		this.che58hus08 = che58hus08;
	}

	public String getChe58hus09() {
		return che58hus09;
	}

	public void setChe58hus09(String che58hus09) {
		this.che58hus09 = che58hus09;
	}

	public String getChe58hus10() {
		return che58hus10;
	}

	public void setChe58hus10(String che58hus10) {
		this.che58hus10 = che58hus10;
	}

	public String getChe58hus11() {
		return che58hus11;
	}

	public void setChe58hus11(String che58hus11) {
		this.che58hus11 = che58hus11;
	}

	public String getChe58hus12() {
		return che58hus12;
	}

	public void setChe58hus12(String che58hus12) {
		this.che58hus12 = che58hus12;
	}

	public String getChe58hus13() {
		return che58hus13;
	}

	public void setChe58hus13(String che58hus13) {
		this.che58hus13 = che58hus13;
	}

	public String getChe58hus14() {
		return che58hus14;
	}

	public void setChe58hus14(String che58hus14) {
		this.che58hus14 = che58hus14;
	}

	public String getChe58hus15() {
		return che58hus15;
	}

	public void setChe58hus15(String che58hus15) {
		this.che58hus15 = che58hus15;
	}

	public String getChe58hus16() {
		return che58hus16;
	}

	public void setChe58hus16(String che58hus16) {
		this.che58hus16 = che58hus16;
	}

	public String getChe58hus17() {
		return che58hus17;
	}

	public void setChe58hus17(String che58hus17) {
		this.che58hus17 = che58hus17;
	}

	public String getChe58hus18() {
		return che58hus18;
	}

	public void setChe58hus18(String che58hus18) {
		this.che58hus18 = che58hus18;
	}

	public String getChe58hus19() {
		return che58hus19;
	}

	public void setChe58hus19(String che58hus19) {
		this.che58hus19 = che58hus19;
	}

	public String getChe58hus20() {
		return che58hus20;
	}

	public void setChe58hus20(String che58hus20) {
		this.che58hus20 = che58hus20;
	}

	public String getChe58hus21() {
		return che58hus21;
	}

	public void setChe58hus21(String che58hus21) {
		this.che58hus21 = che58hus21;
	}

	public String getChe58hus22() {
		return che58hus22;
	}

	public void setChe58hus22(String che58hus22) {
		this.che58hus22 = che58hus22;
	}

	public String getChe58hus23() {
		return che58hus23;
	}

	public void setChe58hus23(String che58hus23) {
		this.che58hus23 = che58hus23;
	}

	public String getChe58hus24() {
		return che58hus24;
	}

	public void setChe58hus24(String che58hus24) {
		this.che58hus24 = che58hus24;
	}

	public String getChe58hus25() {
		return che58hus25;
	}

	public void setChe58hus25(String che58hus25) {
		this.che58hus25 = che58hus25;
	}

	public String getChe58hus26() {
		return che58hus26;
	}

	public void setChe58hus26(String che58hus26) {
		this.che58hus26 = che58hus26;
	}

	/**
	 * 区域经理价（最低价）
	 * 
	 * @methodName getChe58hun01
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Double getChe58hun01() {
		return che58hun01;
	}

	/**
	 * 区域经理价（最低价）
	 * 
	 * @methodName getChe58hun01
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hun01(Double che58hun01) {
		this.che58hun01 = che58hun01;
	}

	/**
	 * 扫身份码数量
	 * 
	 * @methodName getChe58hun02
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hun02() {
		return che58hun02;
	}

	/**
	 * 扫身份码数量
	 * 
	 * @methodName getChe58hun02
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hun02(Long che58hun02) {
		this.che58hun02 = che58hun02;
	}

	/**
	 * 单位积分数
	 * 
	 * @methodName getChe58hun03
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hun03() {
		return che58hun03;
	}

	/**
	 * 单位积分数
	 * 
	 * @methodName getChe58hun03
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hun03(Long che58hun03) {
		this.che58hun03 = che58hun03;
	}

	/**
	 * 总积分数
	 * 
	 * @methodName getChe58hun04
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58hun04() {
		return che58hun04;
	}

	/**
	 * 总积分数
	 * 
	 * @methodName getChe58hun04
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hun04(Long che58hun04) {
		this.che58hun04 = che58hun04;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Transient
	private Long availQuantity = 0L;// 可供量
	@Transient
	private Long che58hlnid = 0L;// 明细行号

	@Transient
	private Long listprice4 = 0L;// 会员价显示
	@Transient
	private Long listprice5 = 0L;// 促销价显示
	@Transient
	private String litmType = " ";// 区分是酒类还是包材 1为酒类 2为包材

	public String getLitmType() {
		return litmType;
	}

	public void setLitmType(String litmType) {
		this.litmType = litmType;
	}

	public Long getListprice4() {
		return listprice4;
	}

	public void setListprice4(Long listprice4) {
		this.listprice4 = listprice4;
	}

	public Long getListprice5() {
		return listprice5;
	}

	public void setListprice5(Long listprice5) {
		this.listprice5 = listprice5;
	}

	public Long getChe58hlnid() {
		return che58hlnid;
	}

	public void setChe58hlnid(Long che58hlnid) {
		this.che58hlnid = che58hlnid;
	}

	public Long getAvailQuantity() {
		return availQuantity;
	}

	public void setAvailQuantity(Long availQuantity) {
		this.availQuantity = availQuantity;
	}

	public Long getChupmj() {
		return chupmj;
	}

	public void setChupmj(Long chupmj) {
		this.chupmj = chupmj;
	}

	public Long getChupmt() {
		return chupmt;
	}

	public void setChupmt(Long chupmt) {
		this.chupmt = chupmt;
	}

	public String getChjobn() {
		return chjobn;
	}

	public void setChjobn(String chjobn) {
		this.chjobn = chjobn;
	}

	public String getChuser() {
		return chuser;
	}

	public void setChuser(String chuser) {
		this.chuser = chuser;
	}

	public String getChpid() {
		return chpid;
	}

	public void setChpid(String chpid) {
		this.chpid = chpid;
	}

	public String getChnmcu() {
		return chnmcu;
	}

	public void setChnmcu(String chnmcu) {
		this.chnmcu = chnmcu;
	}

	public Long getChe1psn() {
		return che1psn;
	}

	public void setChe1psn(Long che1psn) {
		this.che1psn = che1psn;
	}

	// public String getChe1shpn() {
	// return che1shpn;
	// }
	// public void setChe1shpn(String che1shpn) {
	// this.che1shpn = che1shpn;
	// }
	public String getChemcu() {
		return chemcu;
	}

	public void setChemcu(String chemcu) {
		this.chemcu = chemcu;
	}

	public String getChslmcu() {
		return chslmcu;
	}

	public void setChslmcu(String chslmcu) {
		this.chslmcu = chslmcu;
	}

	public String getChprp3() {
		return chprp3;
	}

	public void setChprp3(String chprp3) {
		this.chprp3 = chprp3;
	}

	public Long getChsqor() {
		return chsqor;
	}

	public void setChsqor(Long chsqor) {
		this.chsqor = chsqor;
	}

	public String getChuom2() {
		return chuom2;
	}

	public void setChuom2(String chuom2) {
		this.chuom2 = chuom2;
	}

	public Double getChconv() {
		return chconv;
	}

	public void setChconv(Double chconv) {
		this.chconv = chconv;
	}

	public String getChurrf() {
		return churrf;
	}

	public void setChurrf(String churrf) {
		this.churrf = churrf;
	}

	// editor by magical 2014-10-15
	@Column(name = "chsoqs")
	private Long chsoqs = 0L;
	@Transient
	private Long chWaitUorg = 0L;// 待发货数量 取F58H0411.SOQS-E58HQG
	@Transient
	private Long shipmentUorg = 0L; // 本次发货数量 = 页面扫码数量，页面上控制
	@Transient
	private Long surplusUorg = 0L; // 剩余数量=待发货数量-本次发货数量 （每次扫码时需要注意变化）
	@Transient
	private Long scanCodeUorg = 0L;// 扫码数量

	@Transient
	private String barcodeListGrid = " ";// 二维码集合

	@Transient
	private String tiaoMaListGrid = " ";// 条码集合

	public Long getChsoqs() {
		return chsoqs;
	}

	public void setChsoqs(Long chsoqs) {
		this.chsoqs = chsoqs;
	}

	public Long getChWaitUorg() {
		return chWaitUorg;
	}

	public void setChWaitUorg(Long chWaitUorg) {
		this.chWaitUorg = chWaitUorg;
	}

	public Long getShipmentUorg() {
		return shipmentUorg;
	}

	public void setShipmentUorg(Long shipmentUorg) {
		this.shipmentUorg = shipmentUorg;
	}

	public Long getSurplusUorg() {
		return surplusUorg;
	}

	public void setSurplusUorg(Long surplusUorg) {
		this.surplusUorg = surplusUorg;
	}

	public Long getScanCodeUorg() {
		return scanCodeUorg;
	}

	public void setScanCodeUorg(Long scanCodeUorg) {
		this.scanCodeUorg = scanCodeUorg;
	}

	public String getBarcodeListGrid() {
		return barcodeListGrid;
	}

	public void setBarcodeListGrid(String barcodeListGrid) {
		this.barcodeListGrid = barcodeListGrid;
	}

	public String getTiaoMaListGrid() {
		return tiaoMaListGrid;
	}

	public void setTiaoMaListGrid(String tiaoMaListGrid) {
		this.tiaoMaListGrid = tiaoMaListGrid;
	}

	public Long getChe58hun05() {
		return che58hun05;
	}

	public void setChe58hun05(Long che58hun05) {
		this.che58hun05 = che58hun05;
	}

	public Long getChe58hud02() {
		return che58hud02;
	}

	public void setChe58hud02(Long che58hud02) {
		this.che58hud02 = che58hud02;
	}

	public Long getChe58hud01() {
		return che58hud01;
	}

	public void setChe58hud01(Long che58hud01) {
		this.che58hud01 = che58hud01;
	}

	public Long getChe58hud03() {
		return che58hud03;
	}

	public void setChe58hud03(Long che58hud03) {
		this.che58hud03 = che58hud03;
	}

	public Long getChe58hud04() {
		return che58hud04;
	}

	public void setChe58hud04(Long che58hud04) {
		this.che58hud04 = che58hud04;
	}

	public Long getChe58hud05() {
		return che58hud05;
	}

	public void setChe58hud05(Long che58hud05) {
		this.che58hud05 = che58hud05;
	}

	public String getChurcd() {
		return churcd;
	}

	public void setChurcd(String churcd) {
		this.churcd = churcd;
	}

	public Long getChurdt() {
		return churdt;
	}

	public void setChurdt(Long churdt) {
		this.churdt = churdt;
	}

	public Long getChurat() {
		return churat;
	}

	public void setChurat(Long churat) {
		this.churat = churat;
	}

	public String getChrcd() {
		return chrcd;
	}

	public void setChrcd(String chrcd) {
		this.chrcd = chrcd;
	}

	public Long getChsocn() {
		return chsocn;
	}

	public void setChsocn(Long chsocn) {
		this.chsocn = chsocn;
	}

	public String getChsrp1() {
		return chsrp1;
	}

	public void setChsrp1(String chsrp1) {
		this.chsrp1 = chsrp1;
	}

	public String getChsrp2() {
		return chsrp2;
	}

	public void setChsrp2(String chsrp2) {
		this.chsrp2 = chsrp2;
	}

	public String getChsrp3() {
		return chsrp3;
	}

	public void setChsrp3(String chsrp3) {
		this.chsrp3 = chsrp3;
	}

	public String getChsrp4() {
		return chsrp4;
	}

	public void setChsrp4(String chsrp4) {
		this.chsrp4 = chsrp4;
	}

	public String getChsrp5() {
		return chsrp5;
	}

	public void setChsrp5(String chsrp5) {
		this.chsrp5 = chsrp5;
	}

	public Long getChuncs() {
		return chuncs;
	}

	public void setChuncs(Long chuncs) {
		this.chuncs = chuncs;
	}

	public String getChzinv() {
		return chzinv;
	}

	public void setChzinv(String chzinv) {
		this.chzinv = chzinv;
	}

	public String getChso01() {
		return chso01;
	}

	public void setChso01(String chso01) {
		this.chso01 = chso01;
	}

	public String getChso02() {
		return chso02;
	}

	public void setChso02(String chso02) {
		this.chso02 = chso02;
	}

	public String getChso03() {
		return chso03;
	}

	public void setChso03(String chso03) {
		this.chso03 = chso03;
	}

	public String getChso04() {
		return chso04;
	}

	public void setChso04(String chso04) {
		this.chso04 = chso04;
	}

	public String getChso05() {
		return chso05;
	}

	public void setChso05(String chso05) {
		this.chso05 = chso05;
	}

	public String getChso06() {
		return chso06;
	}

	public void setChso06(String chso06) {
		this.chso06 = chso06;
	}

	public String getChso07() {
		return chso07;
	}

	public void setChso07(String chso07) {
		this.chso07 = chso07;
	}

	public String getChso08() {
		return chso08;
	}

	public void setChso08(String chso08) {
		this.chso08 = chso08;
	}

	public String getChso09() {
		return chso09;
	}

	public void setChso09(String chso09) {
		this.chso09 = chso09;
	}

	public String getChso10() {
		return chso10;
	}

	public void setChso10(String chso10) {
		this.chso10 = chso10;
	}

	public String getChso11() {
		return chso11;
	}

	public void setChso11(String chso11) {
		this.chso11 = chso11;
	}

	public Long getChsobk() {
		return chsobk;
	}

	public void setChsobk(Long chsobk) {
		this.chsobk = chsobk;
	}

	public Long getChurab() {
		return churab;
	}

	public void setChurab(Long churab) {
		this.churab = churab;
	}

	public String getChprp1() {
		return chprp1;
	}

	public void setChprp1(String chprp1) {
		this.chprp1 = chprp1;
	}

	public Double getOmprice() {
		return omprice;
	}

	public void setOmprice(Double omprice) {
		this.omprice = omprice;
	}

	@Transient
	private Double che58lprc2;

	public Double getChe58lprc2() {
		return che58lprc2;
	}

	public void setChe58lprc2(Double che58lprc2) {
		this.che58lprc2 = che58lprc2;
	}

	public String getChcomm() {
		return chcomm;
	}

	public void setChcomm(String chcomm) {
		this.chcomm = chcomm;
	}

	public String getChlnty() {
		return chlnty;
	}

	public void setChlnty(String chlnty) {
		this.chlnty = chlnty;
	}

	public String getChprp2() {
		return chprp2;
	}

	public void setChprp2(String chprp2) {
		this.chprp2 = chprp2;
	}

	public String getChprp4() {
		return chprp4;
	}

	public void setChprp4(String chprp4) {
		this.chprp4 = chprp4;
	}

	public String getChprp5() {
		return chprp5;
	}

	public void setChprp5(String chprp5) {
		this.chprp5 = chprp5;
	}

	public String getGoodsOrigin() {
		return goodsOrigin;
	}

	public void setGoodsOrigin(String goodsOrigin) {
		this.goodsOrigin = goodsOrigin;
	}

	public String getGoodsSpec() {
		return goodsSpec;
	}

	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}

	public String getGoodsCitm() {
		return goodsCitm;
	}

	public void setGoodsCitm(String goodsCitm) {
		this.goodsCitm = goodsCitm;
	}

	@Transient
	private Long retuorg;
	@Transient
	private Long retwinecnt;// 销售退货时的已退数量
	@Transient
	private Long chooukid;
	@Transient
	private Long Chooe58hlnid;
	//gavin add 
	//现有数量
	@Transient
	private Double chpqoh;

	public Double getChpqoh() {
		return chpqoh;
	}

	public void setChpqoh(Double chpqoh) {
		this.chpqoh = chpqoh;
	}

	public Long getRetuorg() {
		return retuorg;
	}

	public void setRetuorg(Long retuorg) {
		this.retuorg = retuorg;
	}

	public Long getRetwinecnt() {
		return retwinecnt;
	}

	public void setRetwinecnt(Long retwinecnt) {
		this.retwinecnt = retwinecnt;
	}

	public Long getChooukid() {
		return chooukid;
	}

	public void setChooukid(Long chooukid) {
		this.chooukid = chooukid;
	}

	public Long getChooe58hlnid() {
		return Chooe58hlnid;
	}

	public void setChooe58hlnid(Long chooe58hlnid) {
		Chooe58hlnid = chooe58hlnid;
	}

	public String getChhmco() {
		return chhmco;
	}

	public void setChhmco(String chhmco) {
		this.chhmco = chhmco;
	}

	// /////////////End by magical ///////////////////////////////////////

	public String getChuomDesc() {
		return chuomDesc;
	}

	public void setChuomDesc(String chuomDesc) {
		this.chuomDesc = chuomDesc;
	}

	public String getChuom2Desc() {
		return chuom2Desc;
	}

	public void setChuom2Desc(String chuom2Desc) {
		this.chuom2Desc = chuom2Desc;
	}
	
	@Transient
	private String imsrce;
	public void setImsrce(String imsrce) {
		this.imsrce = imsrce;
	}
	public String getImsrce() {
		return imsrce;
	}

	@Override
	public String toString() {
		return "F58h0411 [f58h0411pk=" + f58h0411pk.toString() + ", chdoco="
				+ chdoco + ", chhmco=" + chhmco + ", chcomm=" + chcomm
				+ ", chlnty=" + chlnty + ", chdcto=" + chdcto + ", chkcoo="
				+ chkcoo + ", chlnid=" + chlnid + ", chco=" + chco + ", chmcu="
				+ chmcu + ", che58han8m=" + che58han8m + ", che58han8c="
				+ che58han8c + ", che58mcno=" + che58mcno + ", che58df03="
				+ che58df03 + ", chtrdj=" + chtrdj + ", che58hrsd=" + che58hrsd
				+ ", che58hrst=" + che58hrst + ", che58hsid=" + che58hsid
				+ ", che58hsan8=" + che58hsan8 + ", chlocn=" + chlocn
				+ ", chlotn=" + chlotn + ", chitm=" + chitm + ", chlitm="
				+ chlitm + ", chalph=" + chalph + ", chaitm=" + chaitm
				+ ", che58hbarc=" + che58hbarc + ", che58jsid=" + che58jsid
				+ ", chuorg=" + chuorg + ", chuom=" + chuom + ", che58prdc="
				+ che58prdc + ", chnmcu=" + chnmcu + ", che58lspan="
				+ che58lspan + ", che58lsprt=" + che58lsprt + ", che58pdlup="
				+ che58pdlup + ", che58pael=" + che58pael + ", che58uprc="
				+ che58uprc + ", che58aexp=" + che58aexp + ", che58ccda="
				+ che58ccda + ", che58accpu=" + che58accpu + ", che58accda="
				+ che58accda + ", che58bcno=" + che58bcno + ", che58bcln="
				+ che58bcln + ", chfgy=" + chfgy + ", che58span=" + che58span
				+ ", che58sprt=" + che58sprt + ", che58tino=" + che58tino
				+ ", che58prov=" + che58prov + ", che58olda=" + che58olda
				+ ", che58prtp=" + che58prtp + ", che58spyn=" + che58spyn
				+ ", che58lprc=" + che58lprc + ", chtxr1=" + chtxr1
				+ ", chexr1=" + chexr1 + ", chtx=" + chtx + ", chtxa1="
				+ chtxa1 + ", chprrc=" + chprrc + ", chaexp=" + chaexp
				+ ", che58hkf=" + che58hkf + ", chkit=" + chkit
				+ ", che58hkpln=" + che58hkpln + ", chkitl=" + chkitl
				+ ", chkita=" + chkita + ", che58hsspf=" + che58hsspf
				+ ", che58hshm=" + che58hshm + ", che58hshs=" + che58hshs
				+ ", che58hhlid=" + che58hhlid + ", che58htlid=" + che58htlid
				+ ", che58df01=" + che58df01 + ", che58hcof=" + che58hcof
				+ ", che58df02=" + che58df02 + ", che58hqb=" + che58hqb
				+ ", che58san8=" + che58san8 + ", chan81=" + chan81
				+ ", chan82=" + chan82 + ", chan83=" + chan83 + ", che58ssot="
				+ che58ssot + ", che58hoca=" + che58hoca + ", chogno=" + chogno
				+ ", chodoc=" + chodoc + ", chodct=" + chodct + ", chokco="
				+ chokco + ", choorn=" + choorn + ", chrcto=" + chrcto
				+ ", chrorn=" + chrorn + ", chrkco=" + chrkco + ", chdgj="
				+ chdgj + ", che58hcjof=" + che58hcjof + ", che58hamf="
				+ che58hamf + ", che58hos=" + che58hos + ", che58gpayf="
				+ che58gpayf + ", chglc=" + chglc + ", che58huf01="
				+ che58huf01 + ", che58huf02=" + che58huf02 + ", che58huf03="
				+ che58huf03 + ", che58huf04=" + che58huf04 + ", che58huf05="
				+ che58huf05 + ", che58huf06=" + che58huf06 + ", che58huf07="
				+ che58huf07 + ", che58huf08=" + che58huf08 + ", che58huf09="
				+ che58huf09 + ", che58huf10=" + che58huf10 + ", che58hus01="
				+ che58hus01 + ", che58hus02=" + che58hus02 + ", che58hus03="
				+ che58hus03 + ", che58hus04=" + che58hus04 + ", che58hus05="
				+ che58hus05 + ", che58hus06=" + che58hus06 + ", che58hus07="
				+ che58hus07 + ", che58hus08=" + che58hus08 + ", che58hus09="
				+ che58hus09 + ", che58hus10=" + che58hus10 + ", che58hus11="
				+ che58hus11 + ", che58hus12=" + che58hus12 + ", che58hus13="
				+ che58hus13 + ", che58hus14=" + che58hus14 + ", che58hus15="
				+ che58hus15 + ", che58hus16=" + che58hus16 + ", che58hus17="
				+ che58hus17 + ", che58hus18=" + che58hus18 + ", che58hus19="
				+ che58hus19 + ", che58hus20=" + che58hus20 + ", che58hus21="
				+ che58hus21 + ", che58hus22=" + che58hus22 + ", che58hus23="
				+ che58hus23 + ", che58hus24=" + che58hus24 + ", che58hus25="
				+ che58hus25 + ", che58hus26=" + che58hus26 + ", che58hun01="
				+ che58hun01 + ", che58hun02=" + che58hun02 + ", che58hun03="
				+ che58hun03 + ", che58hun04=" + che58hun04 + ", che58hun05="
				+ che58hun05 + ", che58hud02=" + che58hud02 + ", che58hud01="
				+ che58hud01 + ", che58hud03=" + che58hud03 + ", che58hud04="
				+ che58hud04 + ", che58hud05=" + che58hud05 + ", churcd="
				+ churcd + ", churdt=" + churdt + ", churat=" + churat
				+ ", chrcd=" + chrcd + ", chsocn=" + chsocn + ", chsrp1="
				+ chsrp1 + ", chsrp2=" + chsrp2 + ", chsrp3=" + chsrp3
				+ ", chsrp4=" + chsrp4 + ", chsrp5=" + chsrp5 + ", chuncs="
				+ chuncs + ", chzinv=" + chzinv + ", chso01=" + chso01
				+ ", chso02=" + chso02 + ", chso03=" + chso03 + ", chso04="
				+ chso04 + ", chso05=" + chso05 + ", chso06=" + chso06
				+ ", chso07=" + chso07 + ", chso08=" + chso08 + ", chso09="
				+ chso09 + ", chso10=" + chso10 + ", chso11=" + chso11
				+ ", chsobk=" + chsobk + ", churab=" + churab + ", chupmj="
				+ chupmj + ", chupmt=" + chupmt + ", chjobn=" + chjobn
				+ ", chuser=" + chuser + ", chpid=" + chpid + ", che1psn="
				+ che1psn + ", chemcu=" + chemcu + ", churrf=" + churrf
				+ ", chslmcu=" + chslmcu + ", chprp1=" + chprp1 + ", chprp2="
				+ chprp2 + ", chprp3=" + chprp3 + ", chprp4=" + chprp4
				+ ", chprp5=" + chprp5 + ", che58hqg=" + che58hqg + ", chsqor="
				+ chsqor + ", chuom2=" + chuom2 + ", chconv=" + chconv
				+ ", chdsc1=" + chdsc1 + ", chu5dd=" + chu5dd + ", chmprice="
				+ chmprice + ", chtrqt=" + chtrqt + ", chukid=" + chukid
				+ ", chplprice=" + chplprice + ", chfmprice=" + chfmprice
				+ ", omprice=" + omprice + ", goodsCitm=" + goodsCitm
				+ ", goodsOrigin=" + goodsOrigin + ", goodsSpec=" + goodsSpec
				+ ", availQuantity=" + availQuantity + ", che58hlnid="
				+ che58hlnid + ", listprice4=" + listprice4 + ", listprice5="
				+ listprice5 + ", litmType=" + litmType + ", chsoqs=" + chsoqs
				+ ", chWaitUorg=" + chWaitUorg + ", shipmentUorg="
				+ shipmentUorg + ", surplusUorg=" + surplusUorg
				+ ", scanCodeUorg=" + scanCodeUorg + ", barcodeListGrid="
				+ barcodeListGrid + ", tiaoMaListGrid=" + tiaoMaListGrid
				+ ", che58lprc2=" + che58lprc2 + ", retuorg=" + retuorg
				+ ", retwinecnt=" + retwinecnt + ", chooukid=" + chooukid
				+ ", Chooe58hlnid=" + Chooe58hlnid + "]";
	}

}
