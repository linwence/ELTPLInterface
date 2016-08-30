package com.el.webservice.getnextukid.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.el.webservice.getnextukid.client
 * package.
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

	private final static QName _BusinessServiceException_QNAME = new QName(
			"http://oracle.e1.bssv.JE147101/", "BusinessServiceException");
	private final static QName _GetNextUIDResponse_QNAME = new QName(
			"http://oracle.e1.bssv.JE147101/", "GetNextUIDResponse");
	private final static QName _GetNextUID_QNAME = new QName(
			"http://oracle.e1.bssv.JE147101/", "GetNextUID");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.el.webservice.getnextukid.client
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link ValueObject }
	 * 
	 */
	public ValueObject createValueObject() {
		return new ValueObject();
	}

	/**
	 * Create an instance of {@link Dx00022A }
	 * 
	 */
	public Dx00022A createDx00022A() {
		return new Dx00022A();
	}

	/**
	 * Create an instance of {@link BusinessServiceException }
	 * 
	 */
	public BusinessServiceException createBusinessServiceException() {
		return new BusinessServiceException();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link BusinessServiceException }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://oracle.e1.bssv.JE147101/", name = "BusinessServiceException")
	public JAXBElement<BusinessServiceException> createBusinessServiceException(
			BusinessServiceException value) {
		return new JAXBElement<BusinessServiceException>(
				_BusinessServiceException_QNAME,
				BusinessServiceException.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Dx00022A }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://oracle.e1.bssv.JE147101/", name = "GetNextUIDResponse")
	public JAXBElement<Dx00022A> createGetNextUIDResponse(Dx00022A value) {
		return new JAXBElement<Dx00022A>(_GetNextUIDResponse_QNAME,
				Dx00022A.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Dx00022A }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://oracle.e1.bssv.JE147101/", name = "GetNextUID")
	public JAXBElement<Dx00022A> createGetNextUID(Dx00022A value) {
		return new JAXBElement<Dx00022A>(_GetNextUID_QNAME, Dx00022A.class,
				null, value);
	}

}
