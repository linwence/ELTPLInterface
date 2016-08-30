package com.el.service.apporder;

import java.util.List;

import com.el.entity.erpdb.F58h0401;
import com.el.entity.erpdb.FE4PT001;

public interface IOrderPayService {
	/**
	 * 根据Ukid获取订单表数据
	 * 
	 * @param ukid
	 * @return
	 */
	public F58h0401 queryF58h0401ByUkid(long ukid);

	/**
	 * 付款的处理：1.接口提供信息更新中间表F55WSD02.IHE58GPAYF = 3，再更新F58H0401.E58PAYG = 3
	 * 2.插入jde系统中支付表Fe4pt001
	 * 
	 * @param e58huf02
	 *            "支付方式 对应JDE E58HSSPF 1， 货到付款 2， 在线支付 "
	 * 
	 * @param ukid
	 *            jde订单的ukdid
	 * @param fe4pt001
	 *            支付信息
	 */
	public void doPay(String e58huf02, long ukid, List<FE4PT001> lstfe4pt001);

	/**
	 * 更新f55wsd02的付款状态
	 * 
	 * @param ukid
	 *            这个ukid 是jde的订单ID
	 */
	public void updateF55wsd02(long ukid);

}
