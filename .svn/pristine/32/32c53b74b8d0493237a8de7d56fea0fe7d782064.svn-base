package com.el.entity.erpdb;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.elitesland.elbases.bases.BaseEntity;

/**
 * 订单单头
 * @className: FE1DM11 
 * @desc: TODO(这里用一句话描述这个类的作用) 
 * @author：alon
 * @mender：alon
 * @modifiedTime：2014年9月15日 下午3:43:48
 * @version 1.0.0
 */
@Entity
@Table(name="FE1DM11")
public class FE1dm11 extends BaseEntity {
	
//FROM FE1dm11 where  1<>1 or  (domcu='      100001' or doslmcu='      100001' or (select chemcu FROM F58h0401 WHERE chukid=doukid)='      100001') 
	//and  trim(donxtr) BETWEEN 1 and 10 AND dotrdj BETWEEN 115187 AND 115187

	
	@EmbeddedId
	private FE1dm11PK fe1dm11pk;

	/**
	 * 配送门店
	 */
	@Column(name = "domcu")
	private String domcu;//1

	/**
         * 没找到
         */
	@Column(name = "doco")
	private String doco;//1

	/**
         * 没找到
         */
	@Column(name = "doe58an8")
	private Long doe58an8;//1
	
	/**
         * 没找到
         */
	@Column(name = "dotrdj")
	private Long dotrdj;//1
	
	/**
         * 没找到
         */
        @Column(name = "dohmco")
        private String dohmco;//1
        
        /**
         * 没找到
         */
        @Column(name = "doukid")
        private Long doukid;//1
        
        /**
         * 没找到
         */
        @Column(name = "dorkco")
        private String dorkco;

	/**
	 * 制作订单时间，计算机计时：小时:分钟:秒
	 */
	@Column(name = "dotday")
	private Long dotday;//1

	/**
	 * 仓库,配送站点
	 */
	@Column(name = "doe58hsid")
	private String doe58hsid;//1

	/**
	 * 3PL编号,第三方物流公司
	 */
	@Column(name = "doe58htlid")
	private Long doe58htlid;//1

	/**
	 * 物流配送模式，直接配送-门店配送-送货上门M1-M3
	 */
	@Column(name = "doe58hshm")
	private String doe58hshm;//1

	/**
	 ？* 订单配送优先级，udc 01/pt()
	 */
	@Column(name = "docomitlvl")
	private Long docomitlvl;//1

	/**
	 * 核算单号,网单号，线下DOCO号
	 */
	@Column(name = "doe58hus12")
	private String doe58hus12;//1

	/**
	 * 会员号
	 */
	@Column(name = "doe58mcno")
	private String doe58mcno;//1

	/**
	 * 客户号，有客户号的，自动带出，否则根据不同级别的会员，使用虚拟的客户号
	 */
	@Column(name = "doan8")
	private Long doan8;//1

	/**
	 * 相关订单类型,原JDE销售单类型DCTO
	 */
	@Column(name = "dorcto")
	private String dorcto;//1

	/**
	 * 原JDE销售单号DOCO
	 */
	@Column(name = "dororn")
	private String dororn;//1

	/**
	 * 单据状态
	 */
	@Column(name = "donxtr")
	private String donxtr;
	/**
	 * 单据结束状态
	 */
	@Transient
	private String donxtrTo;
	
	
	public String getDonxtrTo() {
		return donxtrTo;
	}
	public void setDonxtrTo(String donxtrTo) {
		this.donxtrTo = donxtrTo;
	}
	/**
	 * 新增DD UDC E1/DR 
	 * UDC 拒收原因：破损漏液，送货超时，实物和宣传不符，价格原因，客户原因，包装破损，商品质量
	 * UDC 延交原因：客户更换时间，客户还未到达收货地点
	 */
	@Column(name = "doe1dmrcd")
	private String doe1dmrcd;

	/**
	 * 收款状态
	 */
	@Column(name = "doe58hsspf")
	private String doe58hsspf;

	/**
	 * 重量
	 */
	@Column(name = "doawgt")
	private Long doawgt;

	/**
	 * 体积
	 */
	@Column(name = "doavol")
	private Long doavol;

	/**
	 * 箱数
	 */
	@Column(name = "donbout")
	private Long donbout;

	/**
	 * 金额
	 */
	@Column(name = "doaexp")
	private Long doaexp;

	/**
	 * 未付金额
	 */
	@Column(name = "doaopn")
	private Long doaopn;

	/**
	 * 支付方式
	 */
	@Column(name = "doe58pt")
	private String doe58pt;

	/**
	 * 送货地址-国家
	 */
	@Column(name = "doctr")
	private String doctr;

	/**
         * 送货地址-省
         */
	@Column(name = "doe58hproc")
	private String doe58hproc;

	/**
         * 送货地址-市
         */
	@Column(name = "doe58hcity")
	private String doe58hcity;
	/**
         * 送货地址-县
         */
	@Column(name = "doe58hzone")
	private String doe58hzone;

	/**
         * 送货地址-区
         */
	@Column(name = "doe58hpref")
	private String doe58hpref;

	/**
         * 送货地址-明细
         */
	@Column(name = "doe58madd")
	private String doe58madd;

	/**
	 * 邮政编码
	 */
	@Column(name = "doe58mpst")
	private String doe58mpst;

	/**
	 * 收货人姓名
	 */
	@Column(name = "doe58hmn")
	private String doe58hmn;
	
	/**
	 * 收货人电话
	 */
	@Column(name = "doe58hrno")
	private String doe58hrno;

	/**
	 * 配送员
	 */
	@Column(name = "doan85")
	private Long doan85;
	/**
	 * 要求送货日期,默认=当天
	 */
	@Column(name="doe58hrsd")
	private Long doe58hrsd;//1
	/**
	 * 要求送货时间,默认=当前时间
	 */
	@Column(name="doe58hrst")
	private Long doe58hrst;//1
	
	@Column(name = "doe58huf01")
	private String doe58huf01;//是否统送

	@Column(name = "doe58huf02")//回款状态
	private String doe58huf02;
	
	@Transient
	private String doe58huf02Show;//回款状态描述
	public String getDoe58huf02Show() {
		return doe58huf02Show;
	}
	public void setDoe58huf02Show(String doe58huf02Show) {
		this.doe58huf02Show = doe58huf02Show;
	}

	@Column(name = "doe58huf03")
	private String doe58huf03;

	@Column(name = "doe58huf04")
	private String doe58huf04;
	@Column(name = "doe58huf05")
	private String doe58huf05;

	@Column(name = "doe58hun01")
	private Long doe58hun01;

	@Column(name = "doe58hun02")
	private Long doe58hun02;

	@Column(name = "doe58hun03")
	private Long doe58hun03;

	@Column(name = "doe58hun04")
	private Long doe58hun04;

	@Column(name = "doe58hun05")
	private Long doe58hun05;

	@Column(name = "doe58hus01")
	private String doe58hus01;

	@Column(name = "doe58hus02")
	private String doe58hus02;

	@Column(name = "doe58hus03")
	private String doe58hus03;

	@Column(name = "doe58hus04")
	private String doe58hus04;

	@Column(name = "doe58hus05")
	private String doe58hus05;

	/**
	 * 更新日期
	 */
	@Column(name = "doupmj")
	private Long doupmj;

	/**
	 * 更新时间
	 */
	@Column(name = "doupmt")
	private Long doupmt;

	/**
	 * 用户号,所有程序的标准函数赋值
	 */
	@Column(name = "douser")
	private String douser;

	/**
	 * 用户保留参考
	 */
	@Column(name = "dourrf")
	private String dourrf;

	/**
	 * 程序号
	 */
	@Column(name = "dopid")
	private String dopid;

	/**
	 * 收入单位
	 */
	@Column(name = "doslmcu")
	private String doslmcu;
	
		@Transient
        private String comitlvludc;

        @Transient
        private String doe1psnShow;//显示配送单号
        
        @Transient
        private String dodcto;
        @Transient
        private String isMainOrder;//是否主配送门店 Y N
        @Transient
        private String f0101Alph;//3PL公司取 F0101.ALPH where aban8=F58H0401.E58HTLID
        @Transient
        private String orderSource;//订单来源   取F58H0401.MCU的描述
        @Transient
        private String che58mcno;//会员号
        @Transient
        private String chalph;//会员名称
		@Transient
        private String noPayMoney;//未付金额
		@Transient
		private String emcuDesc;//主配送门店描述
		@Transient
		private String allNotMainMcuDesc;//所有非主配送门店描述 的字符串拼接
		
		@Transient
		private String emcu;
		@Transient
        private Integer subCount;//同一销售单对应的配送单数量
		@Transient
        private String isNeedReceive;//是否需要收款 Y N
		@Transient
		private String slmcuDesc;//开票门店描述
		@Transient
		private String che58hus19;//收货人固话
		
		
		public String getChe58hus19() {
			return che58hus19;
		}
		public void setChe58hus19(String che58hus19) {
			this.che58hus19 = che58hus19;
		}
		public String getSlmcuDesc() {
			return slmcuDesc;
		}
		public void setSlmcuDesc(String slmcuDesc) {
			this.slmcuDesc = slmcuDesc;
		}
		public String getIsNeedReceive() {
			return isNeedReceive;
		}
		public void setIsNeedReceive(String isNeedReceive) {
			this.isNeedReceive = isNeedReceive;
		}
		public Integer getSubCount() {
			return subCount;
		}
		public void setSubCount(Integer subCount) {
			this.subCount = subCount;
		}
		public String getEmcu() {
			return emcu;
		}
		public void setEmcu(String emcu) {
			this.emcu = emcu;
		}
		public String getAllNotMainMcuDesc() {
			return allNotMainMcuDesc;
		}
		public void setAllNotMainMcuDesc(String allNotMainMcuDesc) {
			this.allNotMainMcuDesc = allNotMainMcuDesc;
		}
		public String getEmcuDesc() {
			return emcuDesc;
		}
		public void setEmcuDesc(String emcuDesc) {
			this.emcuDesc = emcuDesc;
		}
		public String getNoPayMoney() {
			return noPayMoney;
		}
		public void setNoPayMoney(String noPayMoney) {
			this.noPayMoney = noPayMoney;
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
		public String getIsMainOrder() {
			return isMainOrder;
		}
		public void setIsMainOrder(String isMainOrder) {
			this.isMainOrder = isMainOrder;
		}
		
		public String getF0101Alph() {
			return f0101Alph;
		}
		public void setF0101Alph(String f0101Alph) {
			this.f0101Alph = f0101Alph;
		}
		public String getOrderSource() {
			return orderSource;
		}
		public void setOrderSource(String orderSource) {
			this.orderSource = orderSource;
		}
		public String getDoe1psnShow() {
                return doe1psnShow;
        }
        

        public void setDoe1psnShow(String doe1psnShow) {
                this.doe1psnShow = doe1psnShow;
        }

        @Transient
        private Long doe1psn;//配送单号
	
	
        public String getComitlvludc() {
                return comitlvludc;
        }

        public void setComitlvludc(String comitlvludc) {
                this.comitlvludc = comitlvludc;
        }
	public String getDomcu() {
		return domcu;
	}

	public void setDomcu(String domcu) {
		this.domcu = domcu;
	}

	public String getDoco() {
		return doco;
	}

	public void setDoco(String doco) {
		this.doco = doco;
	}

	public Long getDoe58an8() {
		return doe58an8;
	}

	public void setDoe58an8(Long doe58an8) {
		this.doe58an8 = doe58an8;
	}

	public Long getDoe1psn() {
		return doe1psn;
	}

	public void setDoe1psn(Long doe1psn) {
		this.doe1psn = doe1psn;
	}

	public Long getDotrdj() {
		return dotrdj;
	}

	public void setDotrdj(Long dotrdj) {
		this.dotrdj = dotrdj;
	}

	public Long getDotday() {
		return dotday;
	}

	public void setDotday(Long dotday) {
		this.dotday = dotday;
	}

	public Long getDoe58hrsd() {
		return doe58hrsd;
	}

	public void setDoe58hrsd(Long doe58hrsd) {
		this.doe58hrsd = doe58hrsd;
	}

	public Long getDoe58hrst() {
		return doe58hrst;
	}

	public void setDoe58hrst(Long doe58hrst) {
		this.doe58hrst = doe58hrst;
	}

	public String getDohmco() {
		return dohmco;
	}

	public void setDohmco(String dohmco) {
		this.dohmco = dohmco;
	}

	public String getDoe58hsid() {
		return doe58hsid;
	}

	public void setDoe58hsid(String doe58hsid) {
		this.doe58hsid = doe58hsid;
	}

	public Long getDoe58htlid() {
		return doe58htlid;
	}

	public void setDoe58htlid(Long doe58htlid) {
		this.doe58htlid = doe58htlid;
	}

	public String getDoe58hshm() {
		return doe58hshm;
	}

	public void setDoe58hshm(String doe58hshm) {
		this.doe58hshm = doe58hshm;
	}

	public Long getDocomitlvl() {
		return docomitlvl;
	}

	public void setDocomitlvl(Long docomitlvl) {
		this.docomitlvl = docomitlvl;
	}

	public String getDoe58hus12() {
		return doe58hus12;
	}

	public void setDoe58hus12(String doe58hus12) {
		this.doe58hus12 = doe58hus12;
	}

	public String getDoe58mcno() {
		return doe58mcno;
	}

	public void setDoe58mcno(String doe58mcno) {
		this.doe58mcno = doe58mcno;
	}

	public Long getDoan8() {
		return doan8;
	}

	public void setDoan8(Long doan8) {
		this.doan8 = doan8;
	}

	public Long getDoukid() {
		return doukid;
	}

	public void setDoukid(Long doukid) {
		this.doukid = doukid;
	}

	public String getDorcto() {
		return dorcto;
	}

	public void setDorcto(String dorcto) {
		this.dorcto = dorcto;
	}

	public String getDororn() {
		return dororn;
	}

	public void setDororn(String dororn) {
		this.dororn = dororn;
	}

	public String getDorkco() {
		return dorkco;
	}

	public void setDorkco(String dorkco) {
		this.dorkco = dorkco;
	}

	public String getDonxtr() {
		return donxtr;
	}

	public void setDonxtr(String donxtr) {
		this.donxtr = donxtr;
	}

	public String getDoe1dmrcd() {
		return doe1dmrcd;
	}

	public void setDoe1dmrcd(String doe1dmrcd) {
		this.doe1dmrcd = doe1dmrcd;
	}

	public String getDoe58hsspf() {
		return doe58hsspf;
	}

	public void setDoe58hsspf(String doe58hsspf) {
		this.doe58hsspf = doe58hsspf;
	}

	public Long getDoawgt() {
		return doawgt;
	}

	public void setDoawgt(Long doawgt) {
		this.doawgt = doawgt;
	}

	public Long getDoavol() {
		return doavol;
	}

	public void setDoavol(Long doavol) {
		this.doavol = doavol;
	}

	public Long getDonbout() {
		return donbout;
	}

	public void setDonbout(Long donbout) {
		this.donbout = donbout;
	}

	public Long getDoaexp() {
		return doaexp;
	}

	public void setDoaexp(Long doaexp) {
		this.doaexp = doaexp;
	}

	public Long getDoaopn() {
		return doaopn;
	}

	public void setDoaopn(Long doaopn) {
		this.doaopn = doaopn;
	}

	public String getDoe58pt() {
		return doe58pt;
	}

	public void setDoe58pt(String doe58pt) {
		this.doe58pt = doe58pt;
	}

	public String getDoctr() {
		return doctr;
	}

	public void setDoctr(String doctr) {
		this.doctr = doctr;
	}

	public String getDoe58hproc() {
		return doe58hproc;
	}

	public void setDoe58hproc(String doe58hproc) {
		this.doe58hproc = doe58hproc;
	}

	public String getDoe58hcity() {
		return doe58hcity;
	}

	public void setDoe58hcity(String doe58hcity) {
		this.doe58hcity = doe58hcity;
	}

	public String getDoe58hzone() {
		return doe58hzone;
	}

	public void setDoe58hzone(String doe58hzone) {
		this.doe58hzone = doe58hzone;
	}

	public String getDoe58hpref() {
		return doe58hpref;
	}

	public void setDoe58hpref(String doe58hpref) {
		this.doe58hpref = doe58hpref;
	}

	public String getDoe58madd() {
		return doe58madd;
	}

	public void setDoe58madd(String doe58madd) {
		this.doe58madd = doe58madd;
	}

	public String getDoe58mpst() {
		return doe58mpst;
	}

	public void setDoe58mpst(String doe58mpst) {
		this.doe58mpst = doe58mpst;
	}

	public String getDoe58hmn() {
		return doe58hmn;
	}

	public void setDoe58hmn(String doe58hmn) {
		this.doe58hmn = doe58hmn;
	}

	public String getDoe58hrno() {
		return doe58hrno;
	}

	public void setDoe58hrno(String doe58hrno) {
		this.doe58hrno = doe58hrno;
	}

	public Long getDoan85() {
		return doan85;
	}

	public void setDoan85(Long doan85) {
		this.doan85 = doan85;
	}

	public String getDoe58huf01() {
		return doe58huf01;
	}

	public void setDoe58huf01(String doe58huf01) {
		this.doe58huf01 = doe58huf01;
	}

	public String getDoe58huf02() {
		return doe58huf02;
	}

	public void setDoe58huf02(String doe58huf02) {
		this.doe58huf02 = doe58huf02;
	}

	public String getDoe58huf03() {
		return doe58huf03;
	}

	public void setDoe58huf03(String doe58huf03) {
		this.doe58huf03 = doe58huf03;
	}

	public String getDoe58huf04() {
		return doe58huf04;
	}

	public void setDoe58huf04(String doe58huf04) {
		this.doe58huf04 = doe58huf04;
	}

	public String getDoe58huf05() {
		return doe58huf05;
	}

	public void setDoe58huf05(String doe58huf05) {
		this.doe58huf05 = doe58huf05;
	}

	public Long getDoe58hun01() {
		return doe58hun01;
	}

	public void setDoe58hun01(Long doe58hun01) {
		this.doe58hun01 = doe58hun01;
	}

	public Long getDoe58hun02() {
		return doe58hun02;
	}

	public void setDoe58hun02(Long doe58hun02) {
		this.doe58hun02 = doe58hun02;
	}

	public Long getDoe58hun03() {
		return doe58hun03;
	}

	public void setDoe58hun03(Long doe58hun03) {
		this.doe58hun03 = doe58hun03;
	}

	public Long getDoe58hun04() {
		return doe58hun04;
	}

	public void setDoe58hun04(Long doe58hun04) {
		this.doe58hun04 = doe58hun04;
	}

	public Long getDoe58hun05() {
		return doe58hun05;
	}

	public void setDoe58hun05(Long doe58hun05) {
		this.doe58hun05 = doe58hun05;
	}

	public String getDoe58hus01() {
		return doe58hus01;
	}

	public void setDoe58hus01(String doe58hus01) {
		this.doe58hus01 = doe58hus01;
	}

	public String getDoe58hus02() {
		return doe58hus02;
	}

	public void setDoe58hus02(String doe58hus02) {
		this.doe58hus02 = doe58hus02;
	}

	public String getDoe58hus03() {
		return doe58hus03;
	}

	public void setDoe58hus03(String doe58hus03) {
		this.doe58hus03 = doe58hus03;
	}

	public String getDoe58hus04() {
		return doe58hus04;
	}

	public void setDoe58hus04(String doe58hus04) {
		this.doe58hus04 = doe58hus04;
	}

	public String getDoe58hus05() {
		return doe58hus05;
	}

	public void setDoe58hus05(String doe58hus05) {
		this.doe58hus05 = doe58hus05;
	}

	public Long getDoupmj() {
		return doupmj;
	}

	public void setDoupmj(Long doupmj) {
		this.doupmj = doupmj;
	}

	public Long getDoupmt() {
		return doupmt;
	}

	public void setDoupmt(Long doupmt) {
		this.doupmt = doupmt;
	}

	public String getDouser() {
		return douser;
	}

	public void setDouser(String douser) {
		this.douser = douser;
	}

	public String getDourrf() {
		return dourrf;
	}

	public void setDourrf(String dourrf) {
		this.dourrf = dourrf;
	}

	public String getDopid() {
		return dopid;
	}

	public void setDopid(String dopid) {
		this.dopid = dopid;
	}

	public String getDoslmcu() {
		return doslmcu;
	}

	public void setDoslmcu(String doslmcu) {
		this.doslmcu = doslmcu;
	}
	
	@Transient
	private String dotrdjDate;
	
	public String getDotrdjDate() {
		return dotrdjDate;
	}

	public void setDotrdjDate(String string) {
		this.dotrdjDate = string;
	}
	@Transient
	private String doe58hrsdDate;
	@Transient
	private String doe58hrstDate;
	
	public String getDoe58hrsdDate() {
		return doe58hrsdDate;
	}

	public void setDoe58hrsdDate(String doe58hrsdDate) {
		this.doe58hrsdDate = doe58hrsdDate;
	}

	public String getDoe58hrstDate() {
		return doe58hrstDate;
	}

	public void setDoe58hrstDate(String doe58hrstDate) {
		this.doe58hrstDate = doe58hrstDate;
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
	
	//editor by magical
	@Transient
	private String productid;
	
	@Transient
	private String productname;
	
	@Transient
	private String donxtrShow;//配送状态显示的值，根据udc
	@Transient
	private String doe58hrsdShow;
	@Transient
	private String doe58hrstShow;//配送时间从
	
	@Transient
	private String e58hus01Show;//配送时间到
	
	@Transient
	private Double e58tsua;//应收金额
	@Transient
	private String urrf;//配送员
	@Transient
	private String urffid;//配送员ID
	
	
	public String getUrffid() {
		return urffid;
	}
	public void setUrffid(String urffid) {
		this.urffid = urffid;
	}
	public String getUrrf() {
		return urrf;
	}
	public void setUrrf(String urrf) {
		this.urrf = urrf;
	}
	public Double getE58tsua() {
		return e58tsua;
	}
	public void setE58tsua(Double e58tsua) {
		this.e58tsua = e58tsua;
	}
	public String getE58hus01Show() {
		return e58hus01Show;
	}
	public void setE58hus01Show(String e58hus01Show) {
		this.e58hus01Show = e58hus01Show;
	}
	public String getDoe58hrsdShow() {
		return doe58hrsdShow;
	}

	public void setDoe58hrsdShow(String doe58hrsdShow) {
		this.doe58hrsdShow = doe58hrsdShow;
	}

	public String getDoe58hrstShow() {
		return doe58hrstShow;
	}

	public void setDoe58hrstShow(String doe58hrstShow) {
		this.doe58hrstShow = doe58hrstShow;
	}

	public String getDonxtrShow() {
		return donxtrShow;
	}
	public void setDonxtrShow(String donxtrShow) {
		this.donxtrShow = donxtrShow;
	}
	
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public FE1dm11PK getFe1dm11pk() {
		return fe1dm11pk;
	}
	public void setFe1dm11pk(FE1dm11PK fe1dm11pk) {
		this.fe1dm11pk = fe1dm11pk;
	}
	public String getDodcto() {
		return dodcto;
	}
	public void setDodcto(String dodcto) {
		this.dodcto = dodcto;
	}
	// end editor
	
	@Transient
	private String abalph;
	
	@Transient
	private String doe58htlidShow; //公司编号显示字段
	
	public String getDoe58htlidShow() {
		return doe58htlidShow;
	}

	public void setDoe58htlidShow(String doe58htlidShow) {
		this.doe58htlidShow = doe58htlidShow;
	}

	public String getAbalph() {
		return abalph;
	}

	public void setAbalph(String abalph) {
		this.abalph = abalph;
	}
	
	@Transient
    private String plalph;//3PL公司   editor by magical  10-14
	@Transient
    private String e58hus24;//订单备注   editor by magical  10-14
	
	@Transient
	private String dcto;
	@Transient
	private String kcoo;
	
	public String getPlalph() {
		return plalph;
	}
	public void setPlalph(String plalph) {
		this.plalph = plalph;
	}
	public String getE58hus24() {
		return e58hus24;
	}
	public void setE58hus24(String e58hus24) {
		this.e58hus24 = e58hus24;
	}
	public String getDcto() {
		return dcto;
	}
	public void setDcto(String dcto) {
		this.dcto = dcto;
	}
	public String getKcoo() {
		return kcoo;
	}
	public void setKcoo(String kcoo) {
		this.kcoo = kcoo;
	}
	
	
	//editor by magical 2014-10-18
	@Transient
	private String orderNo;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	//End by magical
	@Override
    public FE1dm11 clone(){
		FE1dm11 fe1dm11 = null;
        try{
        	fe1dm11 = (FE1dm11) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return fe1dm11;
    }
	
	@Transient
	private String lilotn;//批次
	@Transient
	private String lipqoh;//库存货量
	@Transient
	private String lidqoh;//发货数量
	@Transient
	private String lirmk;//备注
	@Transient
	private String lilnid;//明细行号
	@Transient
	private String lilitm;//商品编号
	
	public String getLilnid() {
		return lilnid;
	}
	public void setLilnid(String lilnid) {
		this.lilnid = lilnid;
	}
	
	public String getLilotn() {
		return lilotn;
	}
	public void setLilotn(String lilotn) {
		this.lilotn = lilotn;
	}
	public String getLipqoh() {
		return lipqoh;
	}
	public void setLipqoh(String lipqoh) {
		this.lipqoh = lipqoh;
	}
	public String getLidqoh() {
		return lidqoh;
	}
	public void setLidqoh(String lidqoh) {
		this.lidqoh = lidqoh;
	}
	public String getLirmk() {
		return lirmk;
	}
	public void setLirmk(String lirmk) {
		this.lirmk = lirmk;
	}
	public String getLilitm() {
		return lilitm;
	}
	public void setLilitm(String lilitm) {
		this.lilitm = lilitm;
	}
	 
	@Transient
	private String doe58gpayf;//支付标识
	@Transient
	private String doe58gpayfShow;
	
	/**
	 * 付款标识
	 * @return
	 */
	@Transient
	private String doe58hsspfKey;
	public void setDoe58hsspfKey(String doe58hsspfKey) {
		this.doe58hsspfKey = doe58hsspfKey;
	}
	public String getDoe58hsspfKey() {
		return doe58hsspfKey;
	}
	
	
	public String getDoe58gpayf() {
		return doe58gpayf;
	}
	public void setDoe58gpayf(String doe58gpayf) {
		this.doe58gpayf = doe58gpayf;
	}
	public String getDoe58gpayfShow() {
		return doe58gpayfShow;
	}
	public void setDoe58gpayfShow(String doe58gpayfShow) {
		this.doe58gpayfShow = doe58gpayfShow;
	}
	/**
	 * 送货地址-完整地址
	 */
	@Transient
    private String fullAddress;


	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
}
