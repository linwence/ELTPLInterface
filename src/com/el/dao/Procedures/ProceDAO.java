package com.el.dao.Procedures;

import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("proceDAO")
public class ProceDAO implements IProceDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public ResultSet executeProRs(ProceWork work) {
		Session session = sessionFactory.getCurrentSession();
		session.doWork(work);
		return work.getRs();
	}
	
	@Override
	public Object executePro(ProceWork work) {
		Session session = sessionFactory.getCurrentSession();
		session.doWork(work);
		return work.getResult();
	}

}
