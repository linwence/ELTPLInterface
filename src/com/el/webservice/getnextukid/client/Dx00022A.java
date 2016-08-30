package com.el.webservice.getnextukid.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dx00022A complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dx00022A">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oracle.e1.bssv.JE147101/}valueObject">
 *       &lt;sequence>
 *         &lt;element name="mnUniqueKeyID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="szObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dx00022A", propOrder = { "mnUniqueKeyID", "szObjectName" })
public class Dx00022A extends ValueObject {

	protected Integer mnUniqueKeyID;
	protected String szObjectName;

	/**
	 * Gets the value of the mnUniqueKeyID property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMnUniqueKeyID() {
		return mnUniqueKeyID;
	}

	/**
	 * Sets the value of the mnUniqueKeyID property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMnUniqueKeyID(Integer value) {
		this.mnUniqueKeyID = value;
	}

	/**
	 * Gets the value of the szObjectName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSzObjectName() {
		return szObjectName;
	}

	/**
	 * Sets the value of the szObjectName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSzObjectName(String value) {
		this.szObjectName = value;
	}

}
