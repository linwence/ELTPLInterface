package com.el.entity.erpdb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.elitesland.elbases.bases.BaseEntity;

/**
 * 零售订单表头
 * 
 * @className: F58h0401
 * @desc: TODO(这里用一句话描述这个类的作用)
 * @author：alon
 * @mender：alon
 * @modifiedTime：Aug 7, 2014 10:25:23 PM
 * @version 1.0.0
 */
@Entity
@Table(name = "F58h0401")
public class F58h0401 extends BaseEntity implements Serializable{

	/**
	 * //F58H0401:SLMCU, AN81,  E58HUS02
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "chukid")
	private Long  chukid = 0L;

	/**
	 * 订单号 后面生成
	 */
	@Column(name = "chdoco")
	private Long  chdoco = 0L;

	// @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinColumn(name="chdoco")
	@Transient
	private List<F58h0411> f58h0411s;
	
	@Transient
	private String isSchedule;//是否预订单
	public String getIsSchedule() {
		return isSchedule;
	}
	public void setIsSchedule(String isSchedule) {
		this.isSchedule = isSchedule;
	}

	@Transient
	private List<F58h0401> f58h0401s;
	
	public List<F58h0401> getF58h0401s() {
		return f58h0401s;
	}

	public void setF58h0401s(List<F58h0401> f58h0401s) {
		this.f58h0401s = f58h0401s;
	}

	/**
	 * 订单类型 
	 */
	@Column(name = "chdcto")
	private String  chdcto = " ";

	/**
	 * JDE订单公司和chco值一样
	 */
	@Column(name = "chkcoo")
	private String  chkcoo = " ";

	/**
	 * 订单公司和chkcoo值一样
	 */
	@Column(name = "chco")
	private String  chco = " ";

	/**
	 * 收入门店
	 */
	@Column(name = "chmcu")
	private String  chmcu = " ";
	/**
	 * 配送门店
	 */
	@Column(name = "chemcu")
	private String  chemcu = " ";

	@Column(name = "che58an8")
	private Long  che58an8 = 0L;

	@Column(name = "chan8")
	private Long  chan8 = 0L;

	@Column(name = "che58mcno")
	private String  che58mcno = " ";

	@Column(name = "chalph")
	private String  chalph = " ";

	@Column(name = "che58ccno")
	private String  che58ccno = " ";

	@Column(name = "che58hcino")
	private String  che58hcino = " ";

	/**
	 * 联系电话
	 */
	@Column(name = "che58hrno")
	private String  che58hrno = " ";

	@Column(name = "chsex")
	private String  chsex = " ";

	@Column(name = "che58mblv")
	private String  che58mblv = " ";

	@Column(name = "che58mdc")
	private Long  che58mdc = 0L;

	@Column(name = "che58df03")
	private String  che58df03 = " ";

	@Column(name = "che58fnmt")
	private String  che58fnmt = " ";

	@Column(name = "chtday")
	private Long  chtday = 0L;

	@Column(name = "che58hrsd")
	private Long  che58hrsd = 0L;

	@Column(name = "che58hrst")
	private Long  che58hrst = 0L;

	@Column(name = "che58olpf")
	private String  che58olpf = " ";

	@Column(name = "che58span")
	private String  che58span = " ";

	@Column(name = "che58sprt")
	private String  che58sprt = " ";

	@Column(name = "che58holdt")
	private String  che58holdt = " ";

	@Column(name = "che58sdt")
	private String  che58sdt = " ";

	@Column(name = "che58nspdc")
	private Long  che58nspdc = 0L;

	@Column(name = "che58tino")
	private String  che58tino = " ";

	@Column(name = "che58eccdc")
	private Long  che58eccdc = 0L;

	@Column(name = "che58oda")
	private Long  che58oda = 0L;

	/**
	 * 收货国家
	 */
	@Column(name = "chctr")
	private String  chctr = " ";

	/**
	 * 收货省
	 */
	@Column(name = "che58hproc")
	private String  che58hproc = " ";

	/**
	 * 收货市
	 */
	@Column(name = "che58hcity")
	private String  che58hcity = " ";

	/**
	 * 收货区域
	 */
	@Column(name = "che58hzone")
	private String  che58hzone = " ";

	/**
	 * 收货县区
	 */
	@Column(name = "che58hpref")
	private String  che58hpref = " ";

	/**
	 * 收货详细地址
	 */
	@Column(name = "che58madd")
	private String  che58madd = " ";

	/**
	 * 送货方式
	 */
	@Column(name = "che58hshm")
	private String  che58hshm = " ";

	@Column(name = "che58hshs")
	private Long  che58hshs = 0L;

	/**
	 * 付款标志(确认订单未付款是1这个OMS不成立必须付款，部分付款是2，全额付款是3。)
	 */
	@Column(name = "che58gpayf")
	private String  che58gpayf = " ";

	/**
	 * 邮政编码
	 */
	@Column(name = "che58mpst")
	private String  che58mpst = " ";

	/**
	 * 收货人姓名
	 */
	@Column(name = "che58hmn")
	private String  che58hmn = " ";

	@Column(name = "che58hsspf")
	private String  che58hsspf = " ";

	@Column(name = "che58hhlid")
	private Long  che58hhlid = 0L;

	@Column(name = "che58htlid")
	private Long  che58htlid = 0L;

	@Column(name = "che58hpaym")
	private String  che58hpaym = " ";

	@Column(name = "che58hpaam")
	private Double  che58hpaam = 0.0;

	@Column(name = "che58pufo")
	private String  che58pufo = " ";

	@Column(name = "che58tsua")
	private Double  che58tsua = 0.0;

	@Column(name = "che58tsuc")
	private Long  che58tsuc = 0L;

	@Column(name = "che58hinty")
	private String  che58hinty = " ";

	@Column(name = "che58hintl")
	private String  che58hintl = " ";

	@Column(name = "che58rfg3")
	private String  che58rfg3 = " ";

	@Column(name = "che58homcn")
	private String  che58homcn = " ";

	@Column(name = "che58omc4")
	private String  che58omc4 = " ";

	@Column(name = "che58hpmcn")
	private String  che58hpmcn = " ";

	@Column(name = "che58mblg")
	private String  che58mblg = " ";

	@Column(name = "che58mbwc")
	private String  che58mbwc = " ";

	@Column(name = "che58enam")
	private String  che58enam = " ";

	@Column(name = "che58imcn")
	private String  che58imcn = " ";

	@Column(name = "che58hrfg4")
	private String  che58hrfg4 = " ";

	@Column(name = "che58san8")
	private Long  che58san8 = 0L;

	@Column(name = "chan81")
	private Long  chan81 = 0L;

	@Column(name = "chan82")
	private Long  chan82 = 0L;

	@Column(name = "chan83")
	private Long  chan83 = 0L;

	@Column(name = "che58ssot")
	private String  che58ssot = " ";

	@Column(name = "che58hoca")
	private String  che58hoca = " ";

	@Column(name = "chodoc")
	private Long  chodoc = 0L;

	@Column(name = "chodct")
	private String  chodct = " ";

	@Column(name = "chokco")
	private String  chokco = " ";

	@Column(name = "che58hos")
	private String  che58hos = " ";

	@Column(name = "che58huf01")
	private String  che58huf01 = " ";

	@Column(name = "che58huf02")
	private String  che58huf02 = " ";

	@Column(name = "che58huf03")
	private String  che58huf03 = " ";

	@Column(name = "che58huf04")
	private String  che58huf04 = " ";

	@Column(name = "che58huf05")
	private String  che58huf05 = " ";

	@Column(name = "che58huf06")
	private String  che58huf06 = " ";

	@Column(name = "che58huf07")
	private String  che58huf07 = " ";

	@Column(name = "che58huf08")
	private String  che58huf08 = " ";

	@Column(name = "che58huf09")
	private String  che58huf09 = " ";

	@Column(name = "che58huf10")
	private String  che58huf10 = " ";

	@Column(name = "che58hus01")
	private String  che58hus01 = " ";

	@Column(name = "che58hus02")
	private String  che58hus02 = " ";

	@Column(name = "che58hus03")
	private String  che58hus03 = " ";

	@Column(name = "che58hus04")
	private String  che58hus04 = " ";

	@Column(name = "che58hus05")
	private String  che58hus05 = " ";

	@Column(name = "che58hus06")
	private String  che58hus06 = " ";

	@Column(name = "che58hus07")
	private String  che58hus07 = " ";

	@Column(name = "che58hus08")
	private String  che58hus08 = " ";

	@Column(name = "che58hus09")
	private String  che58hus09 = " ";

	@Column(name = "che58hus10")
	private String  che58hus10 = " ";

	@Column(name = "che58hus11")
	private String  che58hus11 = " ";

	@Column(name = "che58hus12")
	private String  che58hus12 = " ";

	@Column(name = "che58hus13")
	private String  che58hus13 = " ";

	@Column(name = "che58hus14")
	private String  che58hus14 = " ";

	@Column(name = "che58hus15")
	private String  che58hus15 = " ";

	@Column(name = "che58hus16")
	private String  che58hus16 = " ";

	@Column(name = "che58hus17")
	private String  che58hus17 = " ";

	@Column(name = "che58hus18")
	private String  che58hus18 = " ";

	@Column(name = "che58hus19")
	private String  che58hus19 = " ";

	@Column(name = "che58hus20")
	private String  che58hus20 = " ";

	@Column(name = "che58hus21")
	private String  che58hus21 = " ";

	@Column(name = "che58hus22")
	private String  che58hus22 = " ";

	@Column(name = "che58hus23")
	private String  che58hus23 = " ";

	@Column(name = "che58hus24")
	private String  che58hus24 = " ";

	@Column(name = "che58hus25")
	private String  che58hus25 = " ";

	@Column(name = "che58hus26")
	private String  che58hus26 = " ";

	@Column(name = "che58hun01")
	private Long  che58hun01 = 0L;

	@Column(name = "che58hun02")
	private Long  che58hun02 = 0L;

	@Column(name = "che58hun03")
	private Long  che58hun03 = 0L;

	@Column(name = "che58hun04")
	private Long  che58hun04 = 0L;

	@Column(name = "che58hud01")
	private Long  che58hud01 = 0L;

	@Column(name = "che58hud02")
	private Long  che58hud02 = 0L;

	@Column(name = "che58hud03")
	private Long  che58hud03 = 0L;

	@Column(name = "che58hud04")
	private Long  che58hud04 = 0L;

	@Column(name = "che58hud05")
	private Long  che58hud05 = 0L;

	@Column(name = "churcd")
	private String  churcd = " ";

	@Column(name = "churdt")
	private Long  churdt = 0L;

	@Column(name = "churat")
	private Long  churat = 0L;

	@Column(name = "churab")
	private Long  churab = 0L;

	@Column(name = "churrf")
	private String  churrf = " ";

	@Column(name = "chuser")
	private String  chuser = " ";

	@Column(name = "chpid")
	private String  chpid = " ";

	@Column(name = "chjobn")
	private String  chjobn = " ";

	@Column(name = "chupmt")
	private Long  chupmt = 0L;

	@Column(name = "chupmj")
	private Long  chupmj = 0L;

	@Column(name = "chtrdj")
	private Long  chtrdj = 0L;

	@Column(name = "che58hjded")
	private Long  che58hjded = 0L;

	@Column(name = "che58hjdet")
	private Long  che58hjdet = 0L;

	@Column(name = "chinvrec")
	private String  chinvrec = " ";

	@Column(name = "chslmcu")
	private String  chslmcu = " ";// 收入经营单位
	
	@Column(name = "che58pt")
	private String  che58pt = " ";// 付款方式
	
	@Column(name = "chcomitlvl")
	private Long  chcomitlvl = 0L;// 配送优先级
	
	@Transient
	private String  chcomitlvlShow;// 配送优先级描述
	
	@Column(name = "che58rp05")
	private String  che58rp05 = " ";// 金税接口部署方式

	@Column(name = "che58rp10")
	private String  che58rp10 = " ";// 发票打印模式INVREQ
	
	@Column(name = "chinvreq")
	private String  chinvreq = " ";// 是否需要生成发票标识
	
	@Column(name = "chcca1")
	private Long  chcca1 = 0L;// 统收公司地址号
	
	@Column(name = "chkcog")
	private String  chkcog = " ";// 记账公司,统收公司号
	
//	@Column(name = "che58longi")
//	private Double  che58longi = 0d;// 送货地址经度
//	
//	@Column(name = "che58lati")
//	private Double  che58lati = 0d;// 送货地址纬度
	@Column(name = "che58longi")
	private String  che58longi = "0";// 送货地址经度
	
	@Column(name = "che58lati")
	private String  che58lati = "0";// 送货地址纬度



	public String getChinvrec() {
		return chinvrec;
	}

	public void setChinvrec(String chinvrec) {
		this.chinvrec = chinvrec;
	}

	public F58h0401() {
	}

	public Long getChukid() {
		return chukid;
	}

	public void setChukid(Long chukid) {
		this.chukid = chukid;
	}

	public Long getChdoco() {
		return chdoco;
	}

	public void setChdoco(Long chdoco) {
		this.chdoco = chdoco;
	}

	public String getChdcto() {
		return chdcto;
	}

	public void setChdcto(String chdcto) {
		this.chdcto = chdcto;
	}

	public String getChkcoo() {
		return chkcoo;
	}

	public void setChkcoo(String chkcoo) {
		this.chkcoo = chkcoo;
	}

	public String getChco() {
		return chco;
	}

	public void setChco(String chco) {
		this.chco = chco;
	}

	public String getChmcu() {
		return chmcu;
	}

	public void setChmcu(String chmcu) {
		this.chmcu = chmcu;
	}

	public Long getChe58an8() {
		return che58an8;
	}

	public void setChe58an8(Long che58an8) {
		this.che58an8 = che58an8;
	}

	public Long getChan8() {
		return chan8;
	}

	public void setChan8(Long chan8) {
		this.chan8 = chan8;
	}

	public String getChe58mcno() {
		return che58mcno;
	}

	public void setChe58mcno(String che58mcno) {
		this.che58mcno = che58mcno;
	}

	public String getChalph() {
		return chalph;
	}

	public void setChalph(String chalph) {
		this.chalph = chalph;
	}

	public String getChe58ccno() {
		return che58ccno;
	}

	public void setChe58ccno(String che58ccno) {
		this.che58ccno = che58ccno;
	}

	public String getChe58hcino() {
		return che58hcino;
	}

	public void setChe58hcino(String che58hcino) {
		this.che58hcino = che58hcino;
	}

	public String getChe58hrno() {
		return che58hrno;
	}

	public void setChe58hrno(String che58hrno) {
		this.che58hrno = che58hrno;
	}

	public String getChsex() {
		return chsex;
	}

	public void setChsex(String chsex) {
		this.chsex = chsex;
	}

	public String getChe58mblv() {
		return che58mblv;
	}

	public void setChe58mblv(String che58mblv) {
		this.che58mblv = che58mblv;
	}

	public Long getChe58mdc() {
		return che58mdc;
	}

	public void setChe58mdc(Long che58mdc) {
		this.che58mdc = che58mdc;
	}

	public String getChe58df03() {
		return che58df03;
	}

	public void setChe58df03(String che58df03) {
		this.che58df03 = che58df03;
	}

	public String getChe58fnmt() {
		return che58fnmt;
	}

	public void setChe58fnmt(String che58fnmt) {
		this.che58fnmt = che58fnmt;
	}

	public Long getChtday() {
		return chtday;
	}

	public void setChtday(Long chtday) {
		this.chtday = chtday;
	}

	public Long getChe58hrsd() {
		return che58hrsd;
	}

	public void setChe58hrsd(Long che58hrsd) {
		this.che58hrsd = che58hrsd;
	}

	public Long getChe58hrst() {
		return che58hrst;
	}

	public void setChe58hrst(Long che58hrst) {
		this.che58hrst = che58hrst;
	}

	public String getChe58olpf() {
		return che58olpf;
	}

	public void setChe58olpf(String che58olpf) {
		this.che58olpf = che58olpf;
	}

	public String getChe58span() {
		return che58span;
	}

	public void setChe58span(String che58span) {
		this.che58span = che58span;
	}

	public String getChe58sprt() {
		return che58sprt;
	}

	public void setChe58sprt(String che58sprt) {
		this.che58sprt = che58sprt;
	}

	public String getChe58holdt() {
		return che58holdt;
	}

	public void setChe58holdt(String che58holdt) {
		this.che58holdt = che58holdt;
	}

	public String getChe58sdt() {
		return che58sdt;
	}

	public void setChe58sdt(String che58sdt) {
		this.che58sdt = che58sdt;
	}

	public Long getChe58nspdc() {
		return che58nspdc;
	}

	public void setChe58nspdc(Long che58nspdc) {
		this.che58nspdc = che58nspdc;
	}

	public String getChe58tino() {
		return che58tino;
	}

	public void setChe58tino(String che58tino) {
		this.che58tino = che58tino;
	}

	public Long getChe58eccdc() {
		return che58eccdc;
	}

	public void setChe58eccdc(Long che58eccdc) {
		this.che58eccdc = che58eccdc;
	}

	/**
	 * 汇总行的折让金额f58h0411.che58olda。
	 * 
	 * @methodName getChe58oda
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return Long
	 * @exception
	 * @since 1.0.0
	 */
	public Long getChe58oda() {
		return che58oda;
	}

	/**
	 * 汇总行的折让金额f58h0411.che58olda。
	 * 
	 * @methodName setChe58oda
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @param che58oda
	 *            void
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58oda(Long che58oda) {
		this.che58oda = che58oda;
	}

	@Transient
	private String  che58odaShow = " ";

	public String getChe58odaShow() {
		return che58odaShow;
	}

	public void setChe58odaShow(String che58odaShow) {
		this.che58odaShow = che58odaShow;
	}

	public String getChctr() {
		return chctr;
	}

	public void setChctr(String chctr) {
		this.chctr = chctr;
	}

	public String getChe58hproc() {
		return che58hproc;
	}

	public void setChe58hproc(String che58hproc) {
		this.che58hproc = che58hproc;
	}

	public String getChe58hcity() {
		return che58hcity;
	}

	public void setChe58hcity(String che58hcity) {
		this.che58hcity = che58hcity;
	}

	public String getChe58hzone() {
		return che58hzone;
	}

	public void setChe58hzone(String che58hzone) {
		this.che58hzone = che58hzone;
	}

	public String getChe58hpref() {
		return che58hpref;
	}

	public void setChe58hpref(String che58hpref) {
		this.che58hpref = che58hpref;
	}

	public String getChe58madd() {
		return che58madd;
	}

	public void setChe58madd(String che58madd) {
		this.che58madd = che58madd;
	}

	public String getChe58hshm() {
		return che58hshm;
	}

	public void setChe58hshm(String che58hshm) {
		this.che58hshm = che58hshm;
	}

	public Long getChe58hshs() {
		return che58hshs;
	}

	public void setChe58hshs(Long che58hshs) {
		this.che58hshs = che58hshs;
	}

	/**
	 * 付款标志(确认订单未付款是1这个OMS不成立必须付款，部分付款是2，全额付款是3。)
	 */
	public String getChe58gpayf() {
		return che58gpayf;
	}

	/**
	 * 付款标志(确认订单未付款是1这个OMS不成立必须付款，部分付款是2，全额付款是3。)
	 */
	public void setChe58gpayf(String che58gpayf) {
		this.che58gpayf = che58gpayf;
	}

	public String getChe58mpst() {
		return che58mpst;
	}

	public void setChe58mpst(String che58mpst) {
		this.che58mpst = che58mpst;
	}

	public String getChe58hmn() {
		return che58hmn;
	}

	public void setChe58hmn(String che58hmn) {
		this.che58hmn = che58hmn;
	}

	public String getChe58hsspf() {
		return che58hsspf;
	}

	public void setChe58hsspf(String che58hsspf) {
		this.che58hsspf = che58hsspf;
	}

	public Long getChe58hhlid() {
		return che58hhlid;
	}

	public void setChe58hhlid(Long che58hhlid) {
		this.che58hhlid = che58hhlid;
	}

	public Long getChe58htlid() {
		return che58htlid;
	}

	public void setChe58htlid(Long che58htlid) {
		this.che58htlid = che58htlid;
	}

	public String getChe58hpaym() {
		return che58hpaym;
	}

	public void setChe58hpaym(String che58hpaym) {
		this.che58hpaym = che58hpaym;
	}

	public Double getChe58hpaam() {
		return che58hpaam;
	}

	public void setChe58hpaam(Double che58hpaam) {
		this.che58hpaam = che58hpaam;
	}

	public String getChe58pufo() {
		return che58pufo;
	}

	public void setChe58pufo(String che58pufo) {
		this.che58pufo = che58pufo;
	}

	public Double getChe58tsua() {
		return che58tsua;
	}

	public void setChe58tsua(Double che58tsua) {
		this.che58tsua = che58tsua;
	}

	public Long getChe58tsuc() {
		return che58tsuc;
	}

	public void setChe58tsuc(Long che58tsuc) {
		this.che58tsuc = che58tsuc;
	}

	/**
	 * 开票类型
	 * 
	 * @methodName getChe58hinty
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public String getChe58hinty() {
		return che58hinty;
	}

	/**
	 * 开票类型
	 * 
	 * @methodName getChe58hinty
	 * @methodDesc (这里用一句话描述这个方法的作用)
	 * @conditionsUse：(应用条件)
	 * @return String
	 * @exception
	 * @since 1.0.0
	 */
	public void setChe58hinty(String che58hinty) {
		this.che58hinty = che58hinty;
	}

	public String getChe58hintl() {
		return che58hintl;
	}

	public void setChe58hintl(String che58hintl) {
		this.che58hintl = che58hintl;
	}

	public String getChe58rfg3() {
		return che58rfg3;
	}

	public void setChe58rfg3(String che58rfg3) {
		this.che58rfg3 = che58rfg3;
	}

	public String getChe58homcn() {
		return che58homcn;
	}

	public void setChe58homcn(String che58homcn) {
		this.che58homcn = che58homcn;
	}

	public String getChe58omc4() {
		return che58omc4;
	}

	public void setChe58omc4(String che58omc4) {
		this.che58omc4 = che58omc4;
	}

	public String getChe58hpmcn() {
		return che58hpmcn;
	}

	public void setChe58hpmcn(String che58hpmcn) {
		this.che58hpmcn = che58hpmcn;
	}

	public String getChe58mblg() {
		return che58mblg;
	}

	public void setChe58mblg(String che58mblg) {
		this.che58mblg = che58mblg;
	}

	public String getChe58mbwc() {
		return che58mbwc;
	}

	public void setChe58mbwc(String che58mbwc) {
		this.che58mbwc = che58mbwc;
	}

	public String getChe58enam() {
		return che58enam;
	}

	public void setChe58enam(String che58enam) {
		this.che58enam = che58enam;
	}

	public String getChe58imcn() {
		return che58imcn;
	}

	public void setChe58imcn(String che58imcn) {
		this.che58imcn = che58imcn;
	}

	public String getChe58hrfg4() {
		return che58hrfg4;
	}

	public void setChe58hrfg4(String che58hrfg4) {
		this.che58hrfg4 = che58hrfg4;
	}

	public Long getChe58san8() {
		return che58san8;
	}

	public void setChe58san8(Long che58san8) {
		this.che58san8 = che58san8;
	}

	public Long getChan81() {
		return chan81;
	}

	public void setChan81(Long chan81) {
		this.chan81 = chan81;
	}

	public Long getChan82() {
		return chan82;
	}

	public void setChan82(Long chan82) {
		this.chan82 = chan82;
	}

	public Long getChan83() {
		return chan83;
	}

	public void setChan83(Long chan83) {
		this.chan83 = chan83;
	}

	public String getChe58ssot() {
		return che58ssot;
	}

	public void setChe58ssot(String che58ssot) {
		this.che58ssot = che58ssot;
	}

	public String getChe58hoca() {
		return che58hoca;
	}

	public void setChe58hoca(String che58hoca) {
		this.che58hoca = che58hoca;
	}

	public Long getChodoc() {
		return chodoc;
	}

	public void setChodoc(Long chodoc) {
		this.chodoc = chodoc;
	}

	public String getChodct() {
		return chodct;
	}

	public void setChodct(String chodct) {
		this.chodct = chodct;
	}

	public String getChokco() {
		return chokco;
	}

	public void setChokco(String chokco) {
		this.chokco = chokco;
	}

	public String getChe58hos() {
		return che58hos;
	}

	public void setChe58hos(String che58hos) {
		this.che58hos = che58hos;
	}

	public String getChe58huf01() {
		return che58huf01;
	}

	public void setChe58huf01(String che58huf01) {
		this.che58huf01 = che58huf01;
	}

	public String getChe58huf02() {
		return che58huf02;
	}

	public void setChe58huf02(String che58huf02) {
		this.che58huf02 = che58huf02;
	}

	public String getChe58huf03() {
		return che58huf03;
	}

	public void setChe58huf03(String che58huf03) {
		this.che58huf03 = che58huf03;
	}

	public String getChe58huf04() {
		return che58huf04;
	}

	public void setChe58huf04(String che58huf04) {
		this.che58huf04 = che58huf04;
	}

	public String getChe58huf05() {
		return che58huf05;
	}

	public void setChe58huf05(String che58huf05) {
		this.che58huf05 = che58huf05;
	}

	public String getChe58huf06() {
		return che58huf06;
	}

	public void setChe58huf06(String che58huf06) {
		this.che58huf06 = che58huf06;
	}

	public String getChe58huf07() {
		return che58huf07;
	}

	public void setChe58huf07(String che58huf07) {
		this.che58huf07 = che58huf07;
	}

	public String getChe58huf08() {
		return che58huf08;
	}

	public void setChe58huf08(String che58huf08) {
		this.che58huf08 = che58huf08;
	}

	public String getChe58huf09() {
		return che58huf09;
	}

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

	public Long getChe58hun01() {
		return che58hun01;
	}

	public void setChe58hun01(Long che58hun01) {
		this.che58hun01 = che58hun01;
	}

	public Long getChe58hun02() {
		return che58hun02;
	}

	public void setChe58hun02(Long che58hun02) {
		this.che58hun02 = che58hun02;
	}

	public Long getChe58hun03() {
		return che58hun03;
	}

	public void setChe58hun03(Long che58hun03) {
		this.che58hun03 = che58hun03;
	}

	public Long getChe58hun04() {
		return che58hun04;
	}

	public void setChe58hun04(Long che58hun04) {
		this.che58hun04 = che58hun04;
	}

	public Long getChe58hud01() {
		return che58hud01;
	}

	public void setChe58hud01(Long che58hud01) {
		this.che58hud01 = che58hud01;
	}

	public Long getChe58hud02() {
		return che58hud02;
	}

	public void setChe58hud02(Long che58hud02) {
		this.che58hud02 = che58hud02;
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

	public Long getChurab() {
		return churab;
	}

	public void setChurab(Long churab) {
		this.churab = churab;
	}

	public String getChurrf() {
		return churrf;
	}

	public void setChurrf(String churrf) {
		this.churrf = churrf;
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

	public String getChjobn() {
		return chjobn;
	}

	public void setChjobn(String chjobn) {
		this.chjobn = chjobn;
	}

	public Long getChupmt() {
		return chupmt;
	}

	public void setChupmt(Long chupmt) {
		this.chupmt = chupmt;
	}

	public Long getChupmj() {
		return chupmj;
	}

	public void setChupmj(Long chupmj) {
		this.chupmj = chupmj;
	}

	public Long getChtrdj() {
		return chtrdj;
	}

	public void setChtrdj(Long chtrdj) {
		this.chtrdj = chtrdj;
	}

	public Long getChe58hjded() {
		return che58hjded;
	}

	public void setChe58hjded(Long che58hjded) {
		this.che58hjded = che58hjded;
	}

	public Long getChe58hjdet() {
		return che58hjdet;
	}

	public void setChe58hjdet(Long che58hjdet) {
		this.che58hjdet = che58hjdet;
	}

	public List<F58h0411> getF58h0411s() {
		return f58h0411s;
	}

	public void setF58h0411s(List<F58h0411> f58h0411s) {
		this.f58h0411s = f58h0411s;
	}




	// end by magical
	public String getChslmcu() {
		return chslmcu;
	}

	public void setChslmcu(String chslmcu) {
		this.chslmcu = chslmcu;
	}

	public String getChe58pt() {
		return che58pt;
	}

	public void setChe58pt(String che58pt) {
		this.che58pt = che58pt;
	}

	public Long getChcomitlvl() {
		return chcomitlvl;
	}

	public void setChcomitlvl(Long chcomitlvl) {
		this.chcomitlvl = chcomitlvl;
	}

	public String getChe58rp05() {
		return che58rp05;
	}

	public void setChe58rp05(String che58rp05) {
		this.che58rp05 = che58rp05;
	}

	public String getChe58rp10() {
		return che58rp10;
	}

	public void setChe58rp10(String che58rp10) {
		this.che58rp10 = che58rp10;
	}

	public String getChinvreq() {
		return chinvreq;
	}

	public void setChinvreq(String chinvreq) {
		this.chinvreq = chinvreq;
	}

	public Long getChcca1() {
		return chcca1;
	}

	public void setChcca1(Long chcca1) {
		this.chcca1 = chcca1;
	}

	public String getChkcog() {
		return chkcog;
	}

	public void setChkcog(String chkcog) {
		this.chkcog = chkcog;
	}

	public String getChemcu() {
		return chemcu;
	}

	public void setChemcu(String chemcu) {
		this.chemcu = chemcu;
	}
	
	// end by lisefo 
	
	public String getChcomitlvlShow() {
		return chcomitlvlShow;
	}
	public void setChcomitlvlShow(String chcomitlvlShow) {
		this.chcomitlvlShow = chcomitlvlShow;
	}
	
	public String getChe58longi() {
		return che58longi;
	}

	public void setChe58longi(String che58longi) {
		this.che58longi = che58longi;
	}

	public String getChe58lati() {
		return che58lati;
	}

	public void setChe58lati(String che58lati) {
		this.che58lati = che58lati;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Integer arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}