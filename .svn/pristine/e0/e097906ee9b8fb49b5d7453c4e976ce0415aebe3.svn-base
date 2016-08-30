package com.el.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * Fe14710aId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class Fe14710aId  implements java.io.Serializable {


    // Fields    

     private BigDecimal lsukid;
     private String lse58pt;


    // Constructors

    /** default constructor */
    public Fe14710aId() {
    }

    
    /** full constructor */
    public Fe14710aId(BigDecimal lsukid, String lse58pt) {
        this.lsukid = lsukid;
        this.lse58pt = lse58pt;
    }

   
    // Property accessors

    @Column(name="LSUKID", nullable=false, precision=22, scale=0)

    public BigDecimal getLsukid() {
        return this.lsukid;
    }
    
    public void setLsukid(BigDecimal lsukid) {
        this.lsukid = lsukid;
    }

    @Column(name="LSE58PT", nullable=false)

    public String getLse58pt() {
        return this.lse58pt;
    }
    
    public void setLse58pt(String lse58pt) {
        this.lse58pt = lse58pt;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Fe14710aId) ) return false;
		 Fe14710aId castOther = ( Fe14710aId ) other; 
         
		 return ( (this.getLsukid()==castOther.getLsukid()) || ( this.getLsukid()!=null && castOther.getLsukid()!=null && this.getLsukid().equals(castOther.getLsukid()) ) )
 && ( (this.getLse58pt()==castOther.getLse58pt()) || ( this.getLse58pt()!=null && castOther.getLse58pt()!=null && this.getLse58pt().equals(castOther.getLse58pt()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLsukid() == null ? 0 : this.getLsukid().hashCode() );
         result = 37 * result + ( getLse58pt() == null ? 0 : this.getLse58pt().hashCode() );
         return result;
   }   





}