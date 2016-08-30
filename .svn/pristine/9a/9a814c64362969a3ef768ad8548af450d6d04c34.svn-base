package com.el.service.distribution;

import java.util.TreeMap;

import com.el.action.distribution.RequestParameterBody;

public interface IDistributionService {
	public int test_interfaceDB() throws Exception;

	public int test_erpDB() throws Exception;

	public TreeMap<String, Object> getOrder_todo(RequestParameterBody body);

	public TreeMap<String, Object> getOrder_done(RequestParameterBody body);

	public TreeMap<String, Object> grabOrder(RequestParameterBody body);

	public TreeMap<String, Object> reduceInventory(RequestParameterBody body);

	public TreeMap<String, Object> distribute_complete(RequestParameterBody body);

	public TreeMap<String, Object> distribute_reject(RequestParameterBody body);

	public TreeMap<String, Object> reduceInventory_callPro(
			RequestParameterBody body);

	/**
	 * 调用下单app，告知下单app已经配送或者完成
	 * 
	 * @param type
	 *            distribution代表配送；其他的就代表完成
	 * @param e1psn
	 *            配送单号，根据配送单号要找到网单号
	 */
	public void callAppOrderChangeStatus(String type, String e1psn);
}
