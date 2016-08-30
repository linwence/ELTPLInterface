package com.el.service;

import java.util.List;

import com.el.entity.F55wsd02;

/**
 * @author Vincent
 * 
 */
public interface IWaimaiStatusService {

	/**
	 * 根据要求送货时间到和当前时间比较，如果已经超过四个小时的单据，需要设置为完成状态，例如：百度的小度掌柜默认是4个小时
	 */
	public List<F55wsd02> queryF55wsd02ByTime();

	/**
	 * 根据单据进行完成状态调用
	 * 
	 */
	public void doFinish();

	/**
	 * 调用百度完成接口
	 * 
	 * @param orderid
	 * @return 
	 */
	public boolean doBaiduFinish(String orderid);

	/**
	 * 调用饿了么完成接口
	 * 
	 * @param orderid
	 */
	public void doElemeFinish(String orderid);

	/**
	 * 调用美团完成接口
	 * 
	 * @param orderid
	 */
	public void doMeituanFinish(String orderid);

}
