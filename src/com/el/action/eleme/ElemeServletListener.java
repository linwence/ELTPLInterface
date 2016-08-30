package com.el.action.eleme;

import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ElemeServletListener implements ServletContextListener {
	private Timer timer;
	private TimerTask elemeOrderTimeTask;

	

	

	@Override
	public void contextDestroyed(ServletContextEvent servletcontextevent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent servletcontextevent) {
		// TODO Auto-generated method stub
		System.out.println("定时任务开始~~");
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(servletcontextevent.getServletContext());
		elemeOrderTimeTask = (TimerTask) context.getBean("elemeOrderTimeTask");
		timer = new Timer(true);
		timer.schedule(elemeOrderTimeTask, 0, 1 * 60 * 1000);
	}

}