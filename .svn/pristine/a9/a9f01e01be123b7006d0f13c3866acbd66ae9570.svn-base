package com.el.entity.jde;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * F58h0101Id entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class F58h0101Id  implements java.io.Serializable {


    // Fields    

     private String smco;
     private BigDecimal sme58an8;
     private String smmcu;


    // Constructors

    /** default constructor */
    public F58h0101Id() {
    }

    
    /** full constructor */
    public F58h0101Id(String smco, BigDecimal sme58an8, String smmcu) {
        this.smco = smco;
        this.sme58an8 = sme58an8;
        this.smmcu = smmcu;
    }

   
    // Property accessors

    @Column(name="SMCO", nullable=false)

    public String getSmco() {
        return this.smco;
    }
    
    public void setSmco(String smco) {
        this.smco = smco;
    }

    @Column(name="SME58AN8", nullable=false, precision=22, scale=0)

    public BigDecimal getSme58an8() {
        return this.sme58an8;
    }
    
    public void setSme58an8(BigDecimal sme58an8) {
        this.sme58an8 = sme58an8;
    }

    @Column(name="SMMCU", nullable=false)

    public String getSmmcu() {
        return this.smmcu;
    }
    
    public void setSmmcu(String smmcu) {
        this.smmcu = smmcu;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof F58h0101Id) ) return false;
		 F58h0101Id castOther = ( F58h0101Id ) other; 
         
		 return ( (this.getSmco()==castOther.getSmco()) || ( this.getSmco()!=null && castOther.getSmco()!=null && this.getSmco().equals(castOther.getSmco()) ) )
 && ( (this.getSme58an8()==castOther.getSme58an8()) || ( this.getSme58an8()!=null && castOther.getSme58an8()!=null && this.getSme58an8().equals(castOther.getSme58an8()) ) )
 && ( (this.getSmmcu()==castOther.getSmmcu()) || ( this.getSmmcu()!=null && castOther.getSmmcu()!=null && this.getSmmcu().equals(castOther.getSmmcu()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSmco() == null ? 0 : this.getSmco().hashCode() );
         result = 37 * result + ( getSme58an8() == null ? 0 : this.getSme58an8().hashCode() );
         result = 37 * result + ( getSmmcu() == null ? 0 : this.getSmmcu().hashCode() );
         return result;
   }   





}