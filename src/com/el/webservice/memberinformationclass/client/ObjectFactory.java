package com.el.webservice.memberinformationclass.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.el.webservice.memberinformationclass.client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _MemberInforRevisionResponse_QNAME = new QName(
			"http://oracle.e1.bssv.JE147106/", "MemberInforRevisionResponse");
	private final static QName _BusinessServiceException_QNAME = new QName(
			"http://oracle.e1.bssv.JE147106/", "BusinessServiceException");
	private final static QName _MemberInforRevision_QNAME = new QName(
			"http://oracle.e1.bssv.JE147106/", "MemberInforRevision");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.el.webservice.memberinformationclass.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link De147107 }
	 * 
	 */
	public De147107 createDe147107() {
		return new De147107();
	}

	/**
	 * Create an instance of {@link BusinessServiceException }
	 * 
	 */
	public BusinessServiceException createBusinessServiceException() {
		return new BusinessServiceException();
	}

	/**
	 * Create an instance of {@link ValueObject }
	 * 
	 */
	public ValueObject createValueObject() {
		return new ValueObject();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link De147107 }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://oracle.e1.bssv.JE147106/", name = "MemberInforRevisionResponse")
	public JAXBElement<De147107> createMemberInforRevisionResponse(
			De147107 value) {
		return new JAXBElement<De147107>(_MemberInforRevisionResponse_QNAME,
				De147107.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BusinessServiceException }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://oracle.e1.bssv.JE147106/", name = "BusinessServiceException")
	public JAXBElement<BusinessServiceException> createBusinessServiceException(
			BusinessServiceException value) {
		return new JAXBElement<BusinessServiceException>(
				_BusinessServiceException_QNAME,
				BusinessServiceException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link De147107 }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://oracle.e1.bssv.JE147106/", name = "MemberInforRevision")
	public JAXBElement<De147107> createMemberInforRevision(De147107 value) {
		return new JAXBElement<De147107>(_MemberInforRevision_QNAME,
				De147107.class, null, value);
	}

}
