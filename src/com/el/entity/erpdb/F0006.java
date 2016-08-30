package com.el.entity.erpdb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.elitesland.elbases.bases.BaseEntity;

/**
 * 库名称表（存所有MCU）
 * @desc: 
 * @author：alon
 * @modifiedTime：2014年8月20日
 * @version 1.0.0
 */
@Entity
@Table( name = "F0006")
public class F0006 extends BaseEntity implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 库位，经营单位
     */
    @Id
    @Column(name="mcmcu") 
    private String mcmcu;
    
    @Column(name="mcstyl") 
    private String mcstyl;
    
    @Column(name="mcdc") 
    private String mcdc;
    
    @Column(name="mcldm") 
    private String mcldm;
    /**
     * 公司
     */
    @Column(name="mcco") 
    private String mcco;
    
    @Column(name="mcan8") 
    private Long mcan8;
    
    @Column(name="mcan8o") 
    private Long mcan8o;
    
    @Column(name="mccnty") 
    private String mccnty;
    
    @Column(name="mcadds") 
    private String mcadds;
    
    @Column(name="mcfmod") 
    private String mcfmod;
    
    /**
     * 仓库名，说明字段
     */
    @Column(name="mcdl01") 
    private String mcdl01;
    
    @Column(name="mcdl02") 
    private String mcdl02;
    
    @Column(name="mcdl03") 
    private String mcdl03;
    
    @Column(name="mcdl04") 
    private String mcdl04;
    
    @Column(name="mcrp01") 
    private String mcrp01;
    
    @Column(name="mcrp02") 
    private String mcrp02;
    
    @Column(name="mcrp03") 
    private String mcrp03;
    
    @Column(name="mcrp04") 
    private String mcrp04;
    
    @Column(name="mcrp05") 
    private String mcrp05;
    
    @Column(name="mcrp06") 
    private String mcrp06;
    
    @Column(name="mcrp07") 
    private String mcrp07;
    
    @Column(name="mcrp08") 
    private String mcrp08;
    
    @Column(name="mcrp09") 
    private String mcrp09;
    
    @Column(name="mcrp10") 
    private String mcrp10;
    
    @Column(name="mcrp11") 
    private String mcrp11;
    
    @Column(name="mcrp12") 
    private String mcrp12;
    
    @Column(name="mcrp13") 
    private String mcrp13;
    
    @Column(name="mcrp14") 
    private String mcrp14;
    
    @Column(name="mcrp15") 
    private String mcrp15;
    
    @Column(name="mcrp16") 
    private String mcrp16;
    
    @Column(name="mcrp17") 
    private String mcrp17;
    
    @Column(name="mcrp18") 
    private String mcrp18;
    
    @Column(name="mcrp19") 
    private String mcrp19;
    
    @Column(name="mcrp20") 
    private String mcrp20;
    
    @Column(name="mcrp21") 
    private String mcrp21;
    
    @Column(name="mcrp22") 
    private String mcrp22;
    
    @Column(name="mcrp23") 
    private String mcrp23;
    
    @Column(name="mcrp24") 
    private String mcrp24;
    
    @Column(name="mcrp25") 
    private String mcrp25;
    
    @Column(name="mcrp26") 
    private String mcrp26;
    
    @Column(name="mcrp27") 
    private String mcrp27;
    
    @Column(name="mcrp28") 
    private String mcrp28;
    
    @Column(name="mcrp29") 
    private String mcrp29;
    
    @Column(name="mcrp30") 
    private String mcrp30;
    
    @Column(name="mcta") 
    private String mcta;
    
    @Column(name="mctxjs") 
    private Long mctxjs;
    
    @Column(name="mctxa1") 
    private String mctxa1;
    
    @Column(name="mcexr1") 
    private String mcexr1;
    
    @Column(name="mctc01") 
    private String mctc01;
    
    @Column(name="mctc02") 
    private String mctc02;
    
    @Column(name="mctc03") 
    private String mctc03;
    
    @Column(name="mctc04") 
    private String mctc04;
    
    @Column(name="mctc05") 
    private String mctc05;
    
    @Column(name="mctc06") 
    private String mctc06;
    
    @Column(name="mctc07") 
    private String mctc07;
    
    @Column(name="mctc08") 
    private String mctc08;
    
    @Column(name="mctc09") 
    private String mctc09;
    
    @Column(name="mctc10") 
    private String mctc10;
    
    @Column(name="mcnd01") 
    private String mcnd01;
    
    @Column(name="mcnd02") 
    private String mcnd02;
    
    @Column(name="mcnd03") 
    private String mcnd03;
    
    @Column(name="mcnd04") 
    private String mcnd04;
    
    @Column(name="mcnd05") 
    private String mcnd05;
    
    @Column(name="mcnd06") 
    private String mcnd06;
    
    @Column(name="mcnd07") 
    private String mcnd07;
    
    @Column(name="mcnd08") 
    private String mcnd08;
    
    @Column(name="mcnd09") 
    private String mcnd09;
    
    @Column(name="mcnd10") 
    private String mcnd10;
    
    @Column(name="mccc01") 
    private String mccc01;
    
    @Column(name="mccc02") 
    private String mccc02;
    
    @Column(name="mccc03") 
    private String mccc03;
    
    @Column(name="mccc04") 
    private String mccc04;
    
    @Column(name="mccc05") 
    private String mccc05;
    
    @Column(name="mccc06") 
    private String mccc06;
    
    @Column(name="mccc07") 
    private String mccc07;
    
    @Column(name="mccc08") 
    private String mccc08;
    
    @Column(name="mccc09") 
    private String mccc09;
    
    @Column(name="mccc10") 
    private String mccc10;
    
    @Column(name="mcpecc") 
    private String mcpecc;
    
    @Column(name="mcals") 
    private String mcals;
    
    @Column(name="mciss") 
    private String mciss;
    
    @Column(name="mcglba") 
    private String mcglba;
    
    @Column(name="mcalcl") 
    private String mcalcl;
    
    @Column(name="mclmth") 
    private String mclmth;
    
    @Column(name="mclf") 
    private Long mclf;
    
    @Column(name="mcobj1") 
    private String mcobj1;
    
    @Column(name="mcobj2") 
    private String mcobj2;
    
    @Column(name="mcobj3") 
    private String mcobj3;
    
    @Column(name="mcsub1") 
    private String mcsub1;
    
    @Column(name="mctou") 
    private Long mctou;
    
    @Column(name="mcsbli") 
    private String mcsbli;
    
    @Column(name="mcanpa") 
    private Long mcanpa;
    
    @Column(name="mcct") 
    private String mcct;
    
    @Column(name="mccert") 
    private String mccert;
    
    @Column(name="mcmcus") 
    private String mcmcus;
    
    @Column(name="mcbtyp") 
    private String mcbtyp;
    
    @Column(name="mcpc") 
    private Long mcpc;
    
    @Column(name="mcpca") 
    private Long mcpca;
    
    @Column(name="mcpcc") 
    private Long mcpcc;
    
    @Column(name="mcinta") 
    private String mcinta;
    
    @Column(name="mcintl") 
    private String mcintl;
    
    @Column(name="mcd1j") 
    private Long mcd1j;
    
    @Column(name="mcd2j") 
    private Long mcd2j;
    
    @Column(name="mcd3j") 
    private Long mcd3j;
    
    @Column(name="mcd4j") 
    private Long mcd4j;
    
    @Column(name="mcd5j") 
    private Long mcd5j;
    
    @Column(name="mcd6j") 
    private Long mcd6j;
    
    @Column(name="mcfpdj") 
    private Long mcfpdj;
    
    @Column(name="mccac") 
    private Long mccac;
    
    @Column(name="mcpac") 
    private Long mcpac;
    
    @Column(name="mceeo") 
    private String mceeo;
    
    @Column(name="mcerc") 
    private String mcerc;
    
    @Column(name="mcuser") 
    private String mcuser;
    
    @Column(name="mcpid") 
    private String mcpid;
    
    @Column(name="mcupmj") 
    private Long mcupmj;
    
    @Column(name="mcjobn") 
    private String mcjobn;
    
    @Column(name="mcupmt") 
    private Long mcupmt;
    
    @Column(name="mcbptp") 
    private String mcbptp;
    
    @Column(name="mcapsb") 
    private String mcapsb;
    
    @Column(name="mctsbu") 
    private String mctsbu;
    
    @Column(name="mcrp31") 
    private String mcrp31;
    
    @Column(name="mcrp32") 
    private String mcrp32;
    
    @Column(name="mcrp33") 
    private String mcrp33;
    
    @Column(name="mcrp34") 
    private String mcrp34;
    
    @Column(name="mcrp35") 
    private String mcrp35;
    
    @Column(name="mcrp36") 
    private String mcrp36;
    
    @Column(name="mcrp37") 
    private String mcrp37;
    
    @Column(name="mcrp38") 
    private String mcrp38;
    
    @Column(name="mcrp39") 
    private String mcrp39;
    
    @Column(name="mcrp40") 
    private String mcrp40;
    
    @Column(name="mcrp41") 
    private String mcrp41;
    
    @Column(name="mcrp42") 
    private String mcrp42;
    
    @Column(name="mcrp43") 
    private String mcrp43;
    
    @Column(name="mcrp44") 
    private String mcrp44;
    
    @Column(name="mcrp45") 
    private String mcrp45;
    
    @Column(name="mcrp46") 
    private String mcrp46;
    
    @Column(name="mcrp47") 
    private String mcrp47;
    
    @Column(name="mcrp48") 
    private String mcrp48;
    
    @Column(name="mcrp49") 
    private String mcrp49;
    
    @Column(name="mcrp50") 
    private String mcrp50;
    
    @Column(name="mcan8gca1") 
    private Long mcan8gca1;
    
    @Column(name="mcan8gca2") 
    private Long mcan8gca2;
    
    @Column(name="mcan8gca3") 
    private Long mcan8gca3;
    
    @Column(name="mcan8gca4") 
    private Long mcan8gca4;
    
    @Column(name="mcan8gca5") 
    private Long mcan8gca5;
    
    @Column(name="mcrmcu1") 
    private String mcrmcu1;
    
    @Column(name="mcdoco") 
    private Long mcdoco;
    
    @Column(name="mcpctn") 
    private Long mcpctn;
    
    @Column(name="mcclnu") 
    private Long mcclnu;
    
    @Column(name="mcbuca") 
    private String mcbuca;
    
    @Column(name="mcadjent") 
    private String mcadjent;
    
    @Column(name="mcuafl") 
    private String mcuafl;
    

	public String getMcmcu() {
        return mcmcu;
    }

    public void setMcmcu(String mcmcu) {
        this.mcmcu = mcmcu;
    }

    public String getMcstyl() {
        return mcstyl;
    }

    public void setMcstyl(String mcstyl) {
        this.mcstyl = mcstyl;
    }

    public String getMcdc() {
        return mcdc;
    }

    public void setMcdc(String mcdc) {
        this.mcdc = mcdc;
    }

    public String getMcldm() {
        return mcldm;
    }

    public void setMcldm(String mcldm) {
        this.mcldm = mcldm;
    }

    public String getMcco() {
        return mcco;
    }

    public void setMcco(String mcco) {
        this.mcco = mcco;
    }

    public Long getMcan8() {
        return mcan8;
    }

    public void setMcan8(Long mcan8) {
        this.mcan8 = mcan8;
    }

    public Long getMcan8o() {
        return mcan8o;
    }

    public void setMcan8o(Long mcan8o) {
        this.mcan8o = mcan8o;
    }

    public String getMccnty() {
        return mccnty;
    }

    public void setMccnty(String mccnty) {
        this.mccnty = mccnty;
    }

    public String getMcadds() {
        return mcadds;
    }

    public void setMcadds(String mcadds) {
        this.mcadds = mcadds;
    }

    public String getMcfmod() {
        return mcfmod;
    }

    public void setMcfmod(String mcfmod) {
        this.mcfmod = mcfmod;
    }
    /**
     * 仓库名
     */
    public String getMcdl01() {
        return mcdl01;
    }
    /**
     * 仓库名
     */
    public void setMcdl01(String mcdl01) {
        this.mcdl01 = mcdl01;
    }

    public String getMcdl02() {
        return mcdl02;
    }

    public void setMcdl02(String mcdl02) {
        this.mcdl02 = mcdl02;
    }

    public String getMcdl03() {
        return mcdl03;
    }

    public void setMcdl03(String mcdl03) {
        this.mcdl03 = mcdl03;
    }

    public String getMcdl04() {
        return mcdl04;
    }

    public void setMcdl04(String mcdl04) {
        this.mcdl04 = mcdl04;
    }

    public String getMcrp01() {
        return mcrp01;
    }

    public void setMcrp01(String mcrp01) {
        this.mcrp01 = mcrp01;
    }

    public String getMcrp02() {
        return mcrp02;
    }

    public void setMcrp02(String mcrp02) {
        this.mcrp02 = mcrp02;
    }

    public String getMcrp03() {
        return mcrp03;
    }

    public void setMcrp03(String mcrp03) {
        this.mcrp03 = mcrp03;
    }

    public String getMcrp04() {
        return mcrp04;
    }

    public void setMcrp04(String mcrp04) {
        this.mcrp04 = mcrp04;
    }

    public String getMcrp05() {
        return mcrp05;
    }

    public void setMcrp05(String mcrp05) {
        this.mcrp05 = mcrp05;
    }

    public String getMcrp06() {
        return mcrp06;
    }

    public void setMcrp06(String mcrp06) {
        this.mcrp06 = mcrp06;
    }

    public String getMcrp07() {
        return mcrp07;
    }

    public void setMcrp07(String mcrp07) {
        this.mcrp07 = mcrp07;
    }

    public String getMcrp08() {
        return mcrp08;
    }

    public void setMcrp08(String mcrp08) {
        this.mcrp08 = mcrp08;
    }

    public String getMcrp09() {
        return mcrp09;
    }

    public void setMcrp09(String mcrp09) {
        this.mcrp09 = mcrp09;
    }

    public String getMcrp10() {
        return mcrp10;
    }

    public void setMcrp10(String mcrp10) {
        this.mcrp10 = mcrp10;
    }

    public String getMcrp11() {
        return mcrp11;
    }

    public void setMcrp11(String mcrp11) {
        this.mcrp11 = mcrp11;
    }

    public String getMcrp12() {
        return mcrp12;
    }

    public void setMcrp12(String mcrp12) {
        this.mcrp12 = mcrp12;
    }

    public String getMcrp13() {
        return mcrp13;
    }

    public void setMcrp13(String mcrp13) {
        this.mcrp13 = mcrp13;
    }

    public String getMcrp14() {
        return mcrp14;
    }

    public void setMcrp14(String mcrp14) {
        this.mcrp14 = mcrp14;
    }

    public String getMcrp15() {
        return mcrp15;
    }

    public void setMcrp15(String mcrp15) {
        this.mcrp15 = mcrp15;
    }

    public String getMcrp16() {
        return mcrp16;
    }

    public void setMcrp16(String mcrp16) {
        this.mcrp16 = mcrp16;
    }

    public String getMcrp17() {
        return mcrp17;
    }

    public void setMcrp17(String mcrp17) {
        this.mcrp17 = mcrp17;
    }

    public String getMcrp18() {
        return mcrp18;
    }

    public void setMcrp18(String mcrp18) {
        this.mcrp18 = mcrp18;
    }

    public String getMcrp19() {
        return mcrp19;
    }

    public void setMcrp19(String mcrp19) {
        this.mcrp19 = mcrp19;
    }

    public String getMcrp20() {
        return mcrp20;
    }

    public void setMcrp20(String mcrp20) {
        this.mcrp20 = mcrp20;
    }

    public String getMcrp21() {
        return mcrp21;
    }

    public void setMcrp21(String mcrp21) {
        this.mcrp21 = mcrp21;
    }

    public String getMcrp22() {
        return mcrp22;
    }

    public void setMcrp22(String mcrp22) {
        this.mcrp22 = mcrp22;
    }

    public String getMcrp23() {
        return mcrp23;
    }

    public void setMcrp23(String mcrp23) {
        this.mcrp23 = mcrp23;
    }

    public String getMcrp24() {
        return mcrp24;
    }

    public void setMcrp24(String mcrp24) {
        this.mcrp24 = mcrp24;
    }

    public String getMcrp25() {
        return mcrp25;
    }

    public void setMcrp25(String mcrp25) {
        this.mcrp25 = mcrp25;
    }

    public String getMcrp26() {
        return mcrp26;
    }

    public void setMcrp26(String mcrp26) {
        this.mcrp26 = mcrp26;
    }

    public String getMcrp27() {
        return mcrp27;
    }

    public void setMcrp27(String mcrp27) {
        this.mcrp27 = mcrp27;
    }

    public String getMcrp28() {
        return mcrp28;
    }

    public void setMcrp28(String mcrp28) {
        this.mcrp28 = mcrp28;
    }

    public String getMcrp29() {
        return mcrp29;
    }

    public void setMcrp29(String mcrp29) {
        this.mcrp29 = mcrp29;
    }

    public String getMcrp30() {
        return mcrp30;
    }

    public void setMcrp30(String mcrp30) {
        this.mcrp30 = mcrp30;
    }

    public String getMcta() {
        return mcta;
    }

    public void setMcta(String mcta) {
        this.mcta = mcta;
    }

    public Long getMctxjs() {
        return mctxjs;
    }

    public void setMctxjs(Long mctxjs) {
        this.mctxjs = mctxjs;
    }

    public String getMctxa1() {
        return mctxa1;
    }

    public void setMctxa1(String mctxa1) {
        this.mctxa1 = mctxa1;
    }

    public String getMcexr1() {
        return mcexr1;
    }

    public void setMcexr1(String mcexr1) {
        this.mcexr1 = mcexr1;
    }

    public String getMctc01() {
        return mctc01;
    }

    public void setMctc01(String mctc01) {
        this.mctc01 = mctc01;
    }

    public String getMctc02() {
        return mctc02;
    }

    public void setMctc02(String mctc02) {
        this.mctc02 = mctc02;
    }

    public String getMctc03() {
        return mctc03;
    }

    public void setMctc03(String mctc03) {
        this.mctc03 = mctc03;
    }

    public String getMctc04() {
        return mctc04;
    }

    public void setMctc04(String mctc04) {
        this.mctc04 = mctc04;
    }

    public String getMctc05() {
        return mctc05;
    }

    public void setMctc05(String mctc05) {
        this.mctc05 = mctc05;
    }

    public String getMctc06() {
        return mctc06;
    }

    public void setMctc06(String mctc06) {
        this.mctc06 = mctc06;
    }

    public String getMctc07() {
        return mctc07;
    }

    public void setMctc07(String mctc07) {
        this.mctc07 = mctc07;
    }

    public String getMctc08() {
        return mctc08;
    }

    public void setMctc08(String mctc08) {
        this.mctc08 = mctc08;
    }

    public String getMctc09() {
        return mctc09;
    }

    public void setMctc09(String mctc09) {
        this.mctc09 = mctc09;
    }

    public String getMctc10() {
        return mctc10;
    }

    public void setMctc10(String mctc10) {
        this.mctc10 = mctc10;
    }

    public String getMcnd01() {
        return mcnd01;
    }

    public void setMcnd01(String mcnd01) {
        this.mcnd01 = mcnd01;
    }

    public String getMcnd02() {
        return mcnd02;
    }

    public void setMcnd02(String mcnd02) {
        this.mcnd02 = mcnd02;
    }

    public String getMcnd03() {
        return mcnd03;
    }

    public void setMcnd03(String mcnd03) {
        this.mcnd03 = mcnd03;
    }

    public String getMcnd04() {
        return mcnd04;
    }

    public void setMcnd04(String mcnd04) {
        this.mcnd04 = mcnd04;
    }

    public String getMcnd05() {
        return mcnd05;
    }

    public void setMcnd05(String mcnd05) {
        this.mcnd05 = mcnd05;
    }

    public String getMcnd06() {
        return mcnd06;
    }

    public void setMcnd06(String mcnd06) {
        this.mcnd06 = mcnd06;
    }

    public String getMcnd07() {
        return mcnd07;
    }

    public void setMcnd07(String mcnd07) {
        this.mcnd07 = mcnd07;
    }

    public String getMcnd08() {
        return mcnd08;
    }

    public void setMcnd08(String mcnd08) {
        this.mcnd08 = mcnd08;
    }

    public String getMcnd09() {
        return mcnd09;
    }

    public void setMcnd09(String mcnd09) {
        this.mcnd09 = mcnd09;
    }

    public String getMcnd10() {
        return mcnd10;
    }

    public void setMcnd10(String mcnd10) {
        this.mcnd10 = mcnd10;
    }

    public String getMccc01() {
        return mccc01;
    }

    public void setMccc01(String mccc01) {
        this.mccc01 = mccc01;
    }

    public String getMccc02() {
        return mccc02;
    }

    public void setMccc02(String mccc02) {
        this.mccc02 = mccc02;
    }

    public String getMccc03() {
        return mccc03;
    }

    public void setMccc03(String mccc03) {
        this.mccc03 = mccc03;
    }

    public String getMccc04() {
        return mccc04;
    }

    public void setMccc04(String mccc04) {
        this.mccc04 = mccc04;
    }

    public String getMccc05() {
        return mccc05;
    }

    public void setMccc05(String mccc05) {
        this.mccc05 = mccc05;
    }

    public String getMccc06() {
        return mccc06;
    }

    public void setMccc06(String mccc06) {
        this.mccc06 = mccc06;
    }

    public String getMccc07() {
        return mccc07;
    }

    public void setMccc07(String mccc07) {
        this.mccc07 = mccc07;
    }

    public String getMccc08() {
        return mccc08;
    }

    public void setMccc08(String mccc08) {
        this.mccc08 = mccc08;
    }

    public String getMccc09() {
        return mccc09;
    }

    public void setMccc09(String mccc09) {
        this.mccc09 = mccc09;
    }

    public String getMccc10() {
        return mccc10;
    }

    public void setMccc10(String mccc10) {
        this.mccc10 = mccc10;
    }

    public String getMcpecc() {
        return mcpecc;
    }

    public void setMcpecc(String mcpecc) {
        this.mcpecc = mcpecc;
    }

    public String getMcals() {
        return mcals;
    }

    public void setMcals(String mcals) {
        this.mcals = mcals;
    }

    public String getMciss() {
        return mciss;
    }

    public void setMciss(String mciss) {
        this.mciss = mciss;
    }

    public String getMcglba() {
        return mcglba;
    }

    public void setMcglba(String mcglba) {
        this.mcglba = mcglba;
    }

    public String getMcalcl() {
        return mcalcl;
    }

    public void setMcalcl(String mcalcl) {
        this.mcalcl = mcalcl;
    }

    public String getMclmth() {
        return mclmth;
    }

    public void setMclmth(String mclmth) {
        this.mclmth = mclmth;
    }

    public Long getMclf() {
        return mclf;
    }

    public void setMclf(Long mclf) {
        this.mclf = mclf;
    }

    public String getMcobj1() {
        return mcobj1;
    }

    public void setMcobj1(String mcobj1) {
        this.mcobj1 = mcobj1;
    }

    public String getMcobj2() {
        return mcobj2;
    }

    public void setMcobj2(String mcobj2) {
        this.mcobj2 = mcobj2;
    }

    public String getMcobj3() {
        return mcobj3;
    }

    public void setMcobj3(String mcobj3) {
        this.mcobj3 = mcobj3;
    }

    public String getMcsub1() {
        return mcsub1;
    }

    public void setMcsub1(String mcsub1) {
        this.mcsub1 = mcsub1;
    }

    public Long getMctou() {
        return mctou;
    }

    public void setMctou(Long mctou) {
        this.mctou = mctou;
    }

    public String getMcsbli() {
        return mcsbli;
    }

    public void setMcsbli(String mcsbli) {
        this.mcsbli = mcsbli;
    }

    public Long getMcanpa() {
        return mcanpa;
    }

    public void setMcanpa(Long mcanpa) {
        this.mcanpa = mcanpa;
    }

    public String getMcct() {
        return mcct;
    }

    public void setMcct(String mcct) {
        this.mcct = mcct;
    }

    public String getMccert() {
        return mccert;
    }

    public void setMccert(String mccert) {
        this.mccert = mccert;
    }

    public String getMcmcus() {
        return mcmcus;
    }

    public void setMcmcus(String mcmcus) {
        this.mcmcus = mcmcus;
    }

    public String getMcbtyp() {
        return mcbtyp;
    }

    public void setMcbtyp(String mcbtyp) {
        this.mcbtyp = mcbtyp;
    }

    public Long getMcpc() {
        return mcpc;
    }

    public void setMcpc(Long mcpc) {
        this.mcpc = mcpc;
    }

    public Long getMcpca() {
        return mcpca;
    }

    public void setMcpca(Long mcpca) {
        this.mcpca = mcpca;
    }

    public Long getMcpcc() {
        return mcpcc;
    }

    public void setMcpcc(Long mcpcc) {
        this.mcpcc = mcpcc;
    }

    public String getMcinta() {
        return mcinta;
    }

    public void setMcinta(String mcinta) {
        this.mcinta = mcinta;
    }

    public String getMcintl() {
        return mcintl;
    }

    public void setMcintl(String mcintl) {
        this.mcintl = mcintl;
    }

    public Long getMcd1j() {
        return mcd1j;
    }

    public void setMcd1j(Long mcd1j) {
        this.mcd1j = mcd1j;
    }

    public Long getMcd2j() {
        return mcd2j;
    }

    public void setMcd2j(Long mcd2j) {
        this.mcd2j = mcd2j;
    }

    public Long getMcd3j() {
        return mcd3j;
    }

    public void setMcd3j(Long mcd3j) {
        this.mcd3j = mcd3j;
    }

    public Long getMcd4j() {
        return mcd4j;
    }

    public void setMcd4j(Long mcd4j) {
        this.mcd4j = mcd4j;
    }

    public Long getMcd5j() {
        return mcd5j;
    }

    public void setMcd5j(Long mcd5j) {
        this.mcd5j = mcd5j;
    }

    public Long getMcd6j() {
        return mcd6j;
    }

    public void setMcd6j(Long mcd6j) {
        this.mcd6j = mcd6j;
    }

    public Long getMcfpdj() {
        return mcfpdj;
    }

    public void setMcfpdj(Long mcfpdj) {
        this.mcfpdj = mcfpdj;
    }

    public Long getMccac() {
        return mccac;
    }

    public void setMccac(Long mccac) {
        this.mccac = mccac;
    }

    public Long getMcpac() {
        return mcpac;
    }

    public void setMcpac(Long mcpac) {
        this.mcpac = mcpac;
    }

    public String getMceeo() {
        return mceeo;
    }

    public void setMceeo(String mceeo) {
        this.mceeo = mceeo;
    }

    public String getMcerc() {
        return mcerc;
    }

    public void setMcerc(String mcerc) {
        this.mcerc = mcerc;
    }

    public String getMcuser() {
        return mcuser;
    }

    public void setMcuser(String mcuser) {
        this.mcuser = mcuser;
    }

    public String getMcpid() {
        return mcpid;
    }

    public void setMcpid(String mcpid) {
        this.mcpid = mcpid;
    }

    public Long getMcupmj() {
        return mcupmj;
    }

    public void setMcupmj(Long mcupmj) {
        this.mcupmj = mcupmj;
    }

    public String getMcjobn() {
        return mcjobn;
    }

    public void setMcjobn(String mcjobn) {
        this.mcjobn = mcjobn;
    }

    public Long getMcupmt() {
        return mcupmt;
    }

    public void setMcupmt(Long mcupmt) {
        this.mcupmt = mcupmt;
    }

    public String getMcbptp() {
        return mcbptp;
    }

    public void setMcbptp(String mcbptp) {
        this.mcbptp = mcbptp;
    }

    public String getMcapsb() {
        return mcapsb;
    }

    public void setMcapsb(String mcapsb) {
        this.mcapsb = mcapsb;
    }

    public String getMctsbu() {
        return mctsbu;
    }

    public void setMctsbu(String mctsbu) {
        this.mctsbu = mctsbu;
    }

    public String getMcrp31() {
        return mcrp31;
    }

    public void setMcrp31(String mcrp31) {
        this.mcrp31 = mcrp31;
    }

    public String getMcrp32() {
        return mcrp32;
    }

    public void setMcrp32(String mcrp32) {
        this.mcrp32 = mcrp32;
    }

    public String getMcrp33() {
        return mcrp33;
    }

    public void setMcrp33(String mcrp33) {
        this.mcrp33 = mcrp33;
    }

    public String getMcrp34() {
        return mcrp34;
    }

    public void setMcrp34(String mcrp34) {
        this.mcrp34 = mcrp34;
    }

    public String getMcrp35() {
        return mcrp35;
    }

    public void setMcrp35(String mcrp35) {
        this.mcrp35 = mcrp35;
    }

    public String getMcrp36() {
        return mcrp36;
    }

    public void setMcrp36(String mcrp36) {
        this.mcrp36 = mcrp36;
    }

    public String getMcrp37() {
        return mcrp37;
    }

    public void setMcrp37(String mcrp37) {
        this.mcrp37 = mcrp37;
    }

    public String getMcrp38() {
        return mcrp38;
    }

    public void setMcrp38(String mcrp38) {
        this.mcrp38 = mcrp38;
    }

    public String getMcrp39() {
        return mcrp39;
    }

    public void setMcrp39(String mcrp39) {
        this.mcrp39 = mcrp39;
    }

    public String getMcrp40() {
        return mcrp40;
    }

    public void setMcrp40(String mcrp40) {
        this.mcrp40 = mcrp40;
    }

    public String getMcrp41() {
        return mcrp41;
    }

    public void setMcrp41(String mcrp41) {
        this.mcrp41 = mcrp41;
    }

    public String getMcrp42() {
        return mcrp42;
    }

    public void setMcrp42(String mcrp42) {
        this.mcrp42 = mcrp42;
    }

    public String getMcrp43() {
        return mcrp43;
    }

    public void setMcrp43(String mcrp43) {
        this.mcrp43 = mcrp43;
    }

    public String getMcrp44() {
        return mcrp44;
    }

    public void setMcrp44(String mcrp44) {
        this.mcrp44 = mcrp44;
    }

    public String getMcrp45() {
        return mcrp45;
    }

    public void setMcrp45(String mcrp45) {
        this.mcrp45 = mcrp45;
    }

    public String getMcrp46() {
        return mcrp46;
    }

    public void setMcrp46(String mcrp46) {
        this.mcrp46 = mcrp46;
    }

    public String getMcrp47() {
        return mcrp47;
    }

    public void setMcrp47(String mcrp47) {
        this.mcrp47 = mcrp47;
    }

    public String getMcrp48() {
        return mcrp48;
    }

    public void setMcrp48(String mcrp48) {
        this.mcrp48 = mcrp48;
    }

    public String getMcrp49() {
        return mcrp49;
    }

    public void setMcrp49(String mcrp49) {
        this.mcrp49 = mcrp49;
    }

    public String getMcrp50() {
        return mcrp50;
    }

    public void setMcrp50(String mcrp50) {
        this.mcrp50 = mcrp50;
    }

    public Long getMcan8gca1() {
        return mcan8gca1;
    }

    public void setMcan8gca1(Long mcan8gca1) {
        this.mcan8gca1 = mcan8gca1;
    }

    public Long getMcan8gca2() {
        return mcan8gca2;
    }

    public void setMcan8gca2(Long mcan8gca2) {
        this.mcan8gca2 = mcan8gca2;
    }

    public Long getMcan8gca3() {
        return mcan8gca3;
    }

    public void setMcan8gca3(Long mcan8gca3) {
        this.mcan8gca3 = mcan8gca3;
    }

    public Long getMcan8gca4() {
        return mcan8gca4;
    }

    public void setMcan8gca4(Long mcan8gca4) {
        this.mcan8gca4 = mcan8gca4;
    }

    public Long getMcan8gca5() {
        return mcan8gca5;
    }

    public void setMcan8gca5(Long mcan8gca5) {
        this.mcan8gca5 = mcan8gca5;
    }

    public String getMcrmcu1() {
        return mcrmcu1;
    }

    public void setMcrmcu1(String mcrmcu1) {
        this.mcrmcu1 = mcrmcu1;
    }

    public Long getMcdoco() {
        return mcdoco;
    }

    public void setMcdoco(Long mcdoco) {
        this.mcdoco = mcdoco;
    }

    public Long getMcpctn() {
        return mcpctn;
    }

    public void setMcpctn(Long mcpctn) {
        this.mcpctn = mcpctn;
    }

    public Long getMcclnu() {
        return mcclnu;
    }

    public void setMcclnu(Long mcclnu) {
        this.mcclnu = mcclnu;
    }

    public String getMcbuca() {
        return mcbuca;
    }

    public void setMcbuca(String mcbuca) {
        this.mcbuca = mcbuca;
    }

    public String getMcadjent() {
        return mcadjent;
    }

    public void setMcadjent(String mcadjent) {
        this.mcadjent = mcadjent;
    }

    public String getMcuafl() {
        return mcuafl;
    }

    public void setMcuafl(String mcuafl) {
        this.mcuafl = mcuafl;
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

	@Override
	public String toString() {
		return "F0006 [mcmcu=" + mcmcu + ", mcstyl=" + mcstyl + ", mcdc="
				+ mcdc + ", mcldm=" + mcldm + ", mcco=" + mcco + ", mcan8="
				+ mcan8 + ", mcan8o=" + mcan8o + ", mccnty=" + mccnty
				+ ", mcadds=" + mcadds + ", mcfmod=" + mcfmod + ", mcdl01="
				+ mcdl01 + ", mcdl02=" + mcdl02 + ", mcdl03=" + mcdl03
				+ ", mcdl04=" + mcdl04 + ", mcrp01=" + mcrp01 + ", mcrp02="
				+ mcrp02 + ", mcrp03=" + mcrp03 + ", mcrp04=" + mcrp04
				+ ", mcrp05=" + mcrp05 + ", mcrp06=" + mcrp06 + ", mcrp07="
				+ mcrp07 + ", mcrp08=" + mcrp08 + ", mcrp09=" + mcrp09
				+ ", mcrp10=" + mcrp10 + ", mcrp11=" + mcrp11 + ", mcrp12="
				+ mcrp12 + ", mcrp13=" + mcrp13 + ", mcrp14=" + mcrp14
				+ ", mcrp15=" + mcrp15 + ", mcrp16=" + mcrp16 + ", mcrp17="
				+ mcrp17 + ", mcrp18=" + mcrp18 + ", mcrp19=" + mcrp19
				+ ", mcrp20=" + mcrp20 + ", mcrp21=" + mcrp21 + ", mcrp22="
				+ mcrp22 + ", mcrp23=" + mcrp23 + ", mcrp24=" + mcrp24
				+ ", mcrp25=" + mcrp25 + ", mcrp26=" + mcrp26 + ", mcrp27="
				+ mcrp27 + ", mcrp28=" + mcrp28 + ", mcrp29=" + mcrp29
				+ ", mcrp30=" + mcrp30 + ", mcta=" + mcta + ", mctxjs="
				+ mctxjs + ", mctxa1=" + mctxa1 + ", mcexr1=" + mcexr1
				+ ", mctc01=" + mctc01 + ", mctc02=" + mctc02 + ", mctc03="
				+ mctc03 + ", mctc04=" + mctc04 + ", mctc05=" + mctc05
				+ ", mctc06=" + mctc06 + ", mctc07=" + mctc07 + ", mctc08="
				+ mctc08 + ", mctc09=" + mctc09 + ", mctc10=" + mctc10
				+ ", mcnd01=" + mcnd01 + ", mcnd02=" + mcnd02 + ", mcnd03="
				+ mcnd03 + ", mcnd04=" + mcnd04 + ", mcnd05=" + mcnd05
				+ ", mcnd06=" + mcnd06 + ", mcnd07=" + mcnd07 + ", mcnd08="
				+ mcnd08 + ", mcnd09=" + mcnd09 + ", mcnd10=" + mcnd10
				+ ", mccc01=" + mccc01 + ", mccc02=" + mccc02 + ", mccc03="
				+ mccc03 + ", mccc04=" + mccc04 + ", mccc05=" + mccc05
				+ ", mccc06=" + mccc06 + ", mccc07=" + mccc07 + ", mccc08="
				+ mccc08 + ", mccc09=" + mccc09 + ", mccc10=" + mccc10
				+ ", mcpecc=" + mcpecc + ", mcals=" + mcals + ", mciss="
				+ mciss + ", mcglba=" + mcglba + ", mcalcl=" + mcalcl
				+ ", mclmth=" + mclmth + ", mclf=" + mclf + ", mcobj1="
				+ mcobj1 + ", mcobj2=" + mcobj2 + ", mcobj3=" + mcobj3
				+ ", mcsub1=" + mcsub1 + ", mctou=" + mctou + ", mcsbli="
				+ mcsbli + ", mcanpa=" + mcanpa + ", mcct=" + mcct
				+ ", mccert=" + mccert + ", mcmcus=" + mcmcus + ", mcbtyp="
				+ mcbtyp + ", mcpc=" + mcpc + ", mcpca=" + mcpca + ", mcpcc="
				+ mcpcc + ", mcinta=" + mcinta + ", mcintl=" + mcintl
				+ ", mcd1j=" + mcd1j + ", mcd2j=" + mcd2j + ", mcd3j=" + mcd3j
				+ ", mcd4j=" + mcd4j + ", mcd5j=" + mcd5j + ", mcd6j=" + mcd6j
				+ ", mcfpdj=" + mcfpdj + ", mccac=" + mccac + ", mcpac="
				+ mcpac + ", mceeo=" + mceeo + ", mcerc=" + mcerc + ", mcuser="
				+ mcuser + ", mcpid=" + mcpid + ", mcupmj=" + mcupmj
				+ ", mcjobn=" + mcjobn + ", mcupmt=" + mcupmt + ", mcbptp="
				+ mcbptp + ", mcapsb=" + mcapsb + ", mctsbu=" + mctsbu
				+ ", mcrp31=" + mcrp31 + ", mcrp32=" + mcrp32 + ", mcrp33="
				+ mcrp33 + ", mcrp34=" + mcrp34 + ", mcrp35=" + mcrp35
				+ ", mcrp36=" + mcrp36 + ", mcrp37=" + mcrp37 + ", mcrp38="
				+ mcrp38 + ", mcrp39=" + mcrp39 + ", mcrp40=" + mcrp40
				+ ", mcrp41=" + mcrp41 + ", mcrp42=" + mcrp42 + ", mcrp43="
				+ mcrp43 + ", mcrp44=" + mcrp44 + ", mcrp45=" + mcrp45
				+ ", mcrp46=" + mcrp46 + ", mcrp47=" + mcrp47 + ", mcrp48="
				+ mcrp48 + ", mcrp49=" + mcrp49 + ", mcrp50=" + mcrp50
				+ ", mcan8gca1=" + mcan8gca1 + ", mcan8gca2=" + mcan8gca2
				+ ", mcan8gca3=" + mcan8gca3 + ", mcan8gca4=" + mcan8gca4
				+ ", mcan8gca5=" + mcan8gca5 + ", mcrmcu1=" + mcrmcu1
				+ ", mcdoco=" + mcdoco + ", mcpctn=" + mcpctn + ", mcclnu="
				+ mcclnu + ", mcbuca=" + mcbuca + ", mcadjent=" + mcadjent
				+ ", mcuafl=" + mcuafl + "]";
	}
    
}
