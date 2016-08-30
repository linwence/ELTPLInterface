/**
 * 
 */
package com.el.servlet;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author Vincent 运行一个servlet 调用定时任务，执行订单调用完成状态的接口
 * 
 */
public class WaimaiStatusServletListener implements ServletContextListener {
	private static Logger logger = Logger
			.getLogger(WaimaiStatusServletListener.class);
	private TimerTask waimaiStatusTimeTask;
	private Timer timer;

	/**
	 * 
	 */
	public WaimaiStatusServletListener() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent servletcontextevent) {
		// TODO Auto-generated method stub
		System.out.println("调用外卖完成接口...............");
		logger.info("调用外卖完成接口...............");
		WebApplicationContext webAppContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(servletcontextevent
						.getServletContext());
		waimaiStatusTimeTask = (TimerTask) webAppContext
				.getBean("waimaiStatusTimeTask");
		timer = new Timer(true);
		Calendar calender=Calendar.getInstance();
		//calender.set(2015, 11, 16, 3, 0, 0);
		calender.set(Calendar.HOUR_OF_DAY, 3); // 控制时  
		calender.set(Calendar.MINUTE, 0); // 控制分  
		calender.set(Calendar.SECOND, 0); // 控制秒  
		Date date=calender.getTime();
		timer.schedule(waimaiStatusTimeTask,date,21*60*60*1000 );

	}

}
