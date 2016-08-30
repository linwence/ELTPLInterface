package com.el.service;

import javax.jws.WebParam;
import javax.xml.ws.Holder;

import com.el.webservice.genereateretailorder.client.BusinessServiceException_Exception;

public interface IJDEWebService {

	/**
	 * @param tableName
	 *            中间表名称，字符串
	 * 
	 * @param ukid
	 *            中间表的UKID编号，数字Integer
	 * 
	 * @return
	 * @throws com.el.webservice.getnextukid.client.BusinessServiceException_Exception
	 */
	public Integer GetNextUniqueID(Holder<Integer> ukid,
			Holder<String> tableName)
			throws com.el.webservice.getnextukid.client.BusinessServiceException_Exception;

	/**
	 * @param mnNumberOfRowsNUR
	 *            订单明细行的行数；
	 * 
	 * @param mnSerialNumberUKID
	 *            插入到中间表的数据的UKID；
	 * 
	 * @param szStatusMessage
	 *            "成功标识
	 * 
	 *            Y标识成功；N标识失败；"
	 * 
	 * @param szSuccessFLagYNDL01
	 *            错误描述；
	 * 
	 * @return
	 * @throws BusinessServiceException_Exception
	 */
	public String GenerateRetailOrder(Holder<Integer> mnNumberOfRowsNUR,
			Holder<Integer> mnSerialNumberUKID, Holder<String> szStatusMessage,
			Holder<String> szSuccessFLagYNDL01

	) throws BusinessServiceException_Exception;

	/**
	 * 会员信息同步
	 * 
	 * @param cErrorFlag
	 *            "错误标记N无错误，Y有错误"
	 * 
	 * @param szAlternateDirectionType
	 *            "传输方向，默认B2C B2C：官网->JDE； JDE：JDE->官网；"
	 * 
	 * @param szErrorCode
	 *            "错误代码0002：会员账号不能为空；0200：会员信息不存在于中间表；089WIM：会员主数据更新失败；"
	 * 
	 * @param szErrorMessage
	 *            错误描述
	 * 
	 * @param szMemberCardNumber
	 *            *会员账号，F58H0201.E58MCNO
	 * 
	 * @return
	 * @throws Exception
	 */
	public void MemberInforRevision(Holder<String> cErrorFlag,
			Holder<String> szAlternateDirectionType,
			Holder<String> szErrorCode, Holder<String> szErrorMessage,
			Holder<String> szMemberCardNumber) throws Exception;

	/**
	 * 会员多地址同步
	 * 
	 * @param cErrorFlag
	 *            "错误标记N无错误，Y有错误"
	 * 
	 * @param szAlternateDirectionType
	 *            "传输方向，默认B2C B2C：官网->JDE；JDE：JDE->官网；"
	 * 
	 * @param szE58MemberCardNumber
	 *            会员账号，F58H0201.E58MCNO
	 * 
	 * @param szErrorCode
	 *            "错误代码0002：会员账号不能为空；164F：会员多地址数据更新失败；"
	 * 
	 * @param szErrorMessage
	 *            错误描述
	 * 
	 * @param szValidateString
	 * @throws Exception
	 */
	public void MemberMutipleAddressRevision(Holder<String> cErrorFlag,
			Holder<String> szAlternateDirectionType,
			Holder<String> szE58MemberCardNumber, Holder<String> szErrorCode,
			Holder<String> szErrorMessage, Holder<String> szValidateString)
			throws Exception;
}
