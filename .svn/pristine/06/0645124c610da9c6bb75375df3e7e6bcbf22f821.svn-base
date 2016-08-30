package com.el.service.impl;

import javax.xml.ws.Holder;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.el.service.IJDEWebService;
import com.el.webservice.genereateretailorder.client.GenerateRetailOrderClass;
import com.el.webservice.genereateretailorder.client.GenerateRetailOrderClassService;
import com.el.webservice.getnextukid.client.*;
import com.el.webservice.memberinformationclass.client.BusinessServiceException_Exception;
import com.el.webservice.memberinformationclass.client.MemberInformationClass;
import com.el.webservice.memberinformationclass.client.MemberInformationClassService;
import com.el.webservice.membermutipleaddressclass.client.MemberMutipleAddressClass;
import com.el.webservice.membermutipleaddressclass.client.MemberMutipleAddressClassService;

@Component("jdeWebServiceImpl")
@Scope("prototype")
public class JDEWebServiceImpl implements IJDEWebService {

	@Override
	public Integer GetNextUniqueID(Holder<Integer> ukid,
			Holder<String> tableName)
			throws com.el.webservice.getnextukid.client.BusinessServiceException_Exception {
		ukid.value = 0;

		GetNextUniqueIDService service = new GetNextUniqueIDService();
		GetNextUniqueID portType = service.getGetNextUniqueIDPort();
		portType.getNextUID(ukid, tableName);

		return ukid.value;
	}

	@Override
	public String GenerateRetailOrder(Holder<Integer> mnNumberOfRowsNUR,
			Holder<Integer> mnSerialNumberUKID, Holder<String> szStatusMessage,
			Holder<String> szSuccessFLagYNDL01)
			throws com.el.webservice.genereateretailorder.client.BusinessServiceException_Exception {
		GenerateRetailOrderClassService service = new GenerateRetailOrderClassService();
		GenerateRetailOrderClass portType = service
				.getGenerateRetailOrderClassPort();
		portType.generateRetailOrder(mnNumberOfRowsNUR, mnSerialNumberUKID,
				szStatusMessage, szSuccessFLagYNDL01);
		return null;
	}

	@Override
	public void MemberInforRevision(Holder<String> cErrorFlag,
			Holder<String> szAlternateDirectionType,
			Holder<String> szErrorCode, Holder<String> szErrorMessage,
			Holder<String> szMemberCardNumber) throws Exception {
		MemberInformationClassService service = new MemberInformationClassService();
		MemberInformationClass portType = service
				.getMemberInformationClassPort();
		portType.memberInforRevision(cErrorFlag, szAlternateDirectionType,
				szErrorCode, szErrorMessage, szMemberCardNumber);

	}

	@Override
	public void MemberMutipleAddressRevision(Holder<String> cErrorFlag,
			Holder<String> szAlternateDirectionType,
			Holder<String> szE58MemberCardNumber, Holder<String> szErrorCode,
			Holder<String> szErrorMessage, Holder<String> szValidateString)
			throws Exception {
		MemberMutipleAddressClassService service = new MemberMutipleAddressClassService();
		MemberMutipleAddressClass portType = service
				.getMemberMutipleAddressClassPort();

		portType.memberMutipleAddressRevision(cErrorFlag,
				szAlternateDirectionType, szE58MemberCardNumber, szErrorCode,
				szErrorMessage, szValidateString);

	}
}
