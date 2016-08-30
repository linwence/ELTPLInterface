/**
 * 
 */
package com.el.timetask;

import java.util.TimerTask;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.el.service.IWaimaiStatusService;

/**
 * @author Vincent 外卖接口自动调用订单完成接口
 * 
 */
@Component("waimaiStatusTimeTask")
public class WaimaiStatusTimeTask extends TimerTask {
	private IWaimaiStatusService waimaiStatusServiceImpl;

	public IWaimaiStatusService getWaimaiStatusServiceImpl() {
		return waimaiStatusServiceImpl;
	}

	@Resource
	public void setWaimaiStatusServiceImpl(
			IWaimaiStatusService waimaiStatusServiceImpl) {
		this.waimaiStatusServiceImpl = waimaiStatusServiceImpl;
	}

	/**
	 * 
	 */
	public WaimaiStatusTimeTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		waimaiStatusServiceImpl.doFinish();

	}

}
