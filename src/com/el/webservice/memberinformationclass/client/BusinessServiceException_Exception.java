package com.el.webservice.memberinformationclass.client;

import javax.xml.ws.WebFault;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "BusinessServiceException", targetNamespace = "http://oracle.e1.bssv.JE147106/")
public class BusinessServiceException_Exception extends Exception {

	/**
	 * Java type that goes as soapenv:Fault detail element.
	 * 
	 */
	private BusinessServiceException faultInfo;

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public BusinessServiceException_Exception(String message,
			BusinessServiceException faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public BusinessServiceException_Exception(String message,
			BusinessServiceException faultInfo, Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	/**
	 * 
	 * @return returns fault bean:
	 *         com.el.webservice.memberinformationclass.client
	 *         .BusinessServiceException
	 */
	public BusinessServiceException getFaultInfo() {
		return faultInfo;
	}

}
