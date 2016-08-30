package com.el.webservice.membermutipleaddressclass.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for de147108 complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="de147108">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oracle.e1.bssv.JE147107/}valueObject">
 *       &lt;sequence>
 *         &lt;element name="CErrorFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szAlternateDirectionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szE58MemberCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szValidateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "de147108", propOrder = { "cErrorFlag",
		"szAlternateDirectionType", "szE58MemberCardNumber", "szErrorCode",
		"szErrorMessage", "szValidateString" })
public class De147108 extends ValueObject {

	@XmlElement(name = "CErrorFlag")
	protected String cErrorFlag;
	protected String szAlternateDirectionType;
	protected String szE58MemberCardNumber;
	protected String szErrorCode;
	protected String szErrorMessage;
	protected String szValidateString;

	/**
	 * Gets the value of the cErrorFlag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCErrorFlag() {
		return cErrorFlag;
	}

	/**
	 * Sets the value of the cErrorFlag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCErrorFlag(String value) {
		this.cErrorFlag = value;
	}

	/**
	 * Gets the value of the szAlternateDirectionType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSzAlternateDirectionType() {
		return szAlternateDirectionType;
	}

	/**
	 * Sets the value of the szAlternateDirectionType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSzAlternateDirectionType(String value) {
		this.szAlternateDirectionType = value;
	}

	/**
	 * Gets the value of the szE58MemberCardNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSzE58MemberCardNumber() {
		return szE58MemberCardNumber;
	}

	/**
	 * Sets the value of the szE58MemberCardNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSzE58MemberCardNumber(String value) {
		this.szE58MemberCardNumber = value;
	}

	/**
	 * Gets the value of the szErrorCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSzErrorCode() {
		return szErrorCode;
	}

	/**
	 * Sets the value of the szErrorCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSzErrorCode(String value) {
		this.szErrorCode = value;
	}

	/**
	 * Gets the value of the szErrorMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSzErrorMessage() {
		return szErrorMessage;
	}

	/**
	 * Sets the value of the szErrorMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSzErrorMessage(String value) {
		this.szErrorMessage = value;
	}

	/**
	 * Gets the value of the szValidateString property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSzValidateString() {
		return szValidateString;
	}

	/**
	 * Sets the value of the szValidateString property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSzValidateString(String value) {
		this.szValidateString = value;
	}

}
