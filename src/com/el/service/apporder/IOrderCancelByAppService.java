package com.el.service.apporder;

public interface IOrderCancelByAppService {
	int OrderCancelByApp(long ukid) throws Exception;

	/**
	 * 接口提供信息更新中间表F55WSD02.IHE58HOS = 980 F55WSD03.IDE58HOS = 980，
	 * 
	 * @param ukid
	 * @return
	 * @throws Exception
	 */
	void cancelF55wsd02AndF55wsd03(long ukid) throws Exception;
}
