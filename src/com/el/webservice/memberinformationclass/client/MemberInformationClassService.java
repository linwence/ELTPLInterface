package com.el.webservice.memberinformationclass.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

import com.el.util.PropertiesUtil;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * MemberInformationClassService service = new MemberInformationClassService();
 * MemberInformationClass portType = service.getMemberInformationClassPort();
 * portType.memberInforRevision(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "MemberInformationClassService", targetNamespace = "http://oracle.e1.bssv.JE147106/", wsdlLocation = "http://192.168.10.51:8013/PY910/MemberInformationClass?WSDL")
public class MemberInformationClassService extends Service {

	private final static URL MEMBERINFORMATIONCLASSSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.el.webservice.memberinformationclass.client.MemberInformationClassService.class
					.getName());

	static {
		URL url = null;
		String strUrl = "";
		try {
			URL baseUrl;
			PropertiesUtil p = new PropertiesUtil("application.properties");
			strUrl = p.getPropertyByKey("WS_MemberInformationClass");
			baseUrl = com.el.webservice.memberinformationclass.client.MemberInformationClassService.class
					.getResource(".");
			url = new URL(baseUrl, strUrl);
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://192.168.10.51:8013/PY910/MemberInformationClass?WSDL', retrying as a local file");
			logger.warning(e.getMessage());
		}
		MEMBERINFORMATIONCLASSSERVICE_WSDL_LOCATION = url;
	}

	public MemberInformationClassService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public MemberInformationClassService() {
		super(MEMBERINFORMATIONCLASSSERVICE_WSDL_LOCATION, new QName(
				"http://oracle.e1.bssv.JE147106/",
				"MemberInformationClassService"));
	}

	/**
	 * 
	 * @return returns MemberInformationClass
	 */
	@WebEndpoint(name = "MemberInformationClassPort")
	public MemberInformationClass getMemberInformationClassPort() {
		return super.getPort(new QName("http://oracle.e1.bssv.JE147106/",
				"MemberInformationClassPort"), MemberInformationClass.class);
	}

}
