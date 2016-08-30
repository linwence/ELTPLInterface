package com.el.service;

import java.util.List;

import com.el.entity.F0005L;
import com.el.entity.F55wsd02;
import com.el.entity.F55wsd03;
import com.el.entity.Fe14101a;
import com.el.entity.Fe14710a;
import com.el.entity.apporder.Member;
import com.el.entity.apporder.OrderInvoice;

public interface IOrderService {
	public List<F55wsd02> queryF55wsd02(Object[] params);

	/**
	 * 保存数据(订单数据，会员数据)到中间库的临时表
	 * 
	 * @param f55wsd02
	 * @param lstf55wsd03
	 * @throws Exception
	 */
	public void saveOrder(F55wsd02 f55wsd02, List<F55wsd03> lstf55wsd03,
			List<Fe14710a> lstFe14710a) throws Exception;

	/**
	 * app下单保存到中间库临时表
	 * 
	 * @param f55wsd02
	 *            订单临时表主表
	 * @param lstf55wsd03
	 *            订单临时表明细
	 * @param lstFe14710a
	 *            付款信息
	 * @throws Exception
	 */
	public void saveAppOrder(F55wsd02 f55wsd02, List<F55wsd03> lstf55wsd03,
			List<Fe14710a> lstFe14710a) throws Exception;

	/**
	 * 发票邮寄地址，发票的邮寄地址按会员多地址的信息存，只是atype为IM
	 * 
	 * @param f55wsd02
	 * @param orderInvoice
	 *            发票邮寄等信息
	 * @throws Exception
	 */
	public int saveInvoiceMememberInfo(F55wsd02 f55wsd02,
			OrderInvoice orderInvoice) throws Exception;

	// public void saveF55wsd02(F55wsd02 f55wsd02) throws Exception;

	// public void saveF55wsd03(F55wsd03 f55wsd03) throws Exception;

	public void callWebservice(F55wsd02 f55wsd02, List<F55wsd03> lstf55wsd03)
			throws Exception;

	/**
	 * 调用会员webservice
	 * 
	 * @param MemberCardNumber
	 *            会员号
	 * @throws Exception
	 */
	public void callMemberWebservice(String MemberCardNumber) throws Exception;

	public List<Fe14101a> queryFe14101a(Object[] params);

	/**
	 * 根据省、市、区名称查询对应的udc码
	 * 
	 * @param params
	 * @return
	 */
	public List<F0005L> queryLstF0005L(Object[] params);

	public F55wsd03 createWLB(F55wsd02 f55wsd02, int rownum);

	/**
	 * APP调用会员、及地址
	 * 
	 * @param member
	 *            会员信息
	 * @throws Exception
	 */
	public void saveMememberInfo(Member member) throws Exception;

}
