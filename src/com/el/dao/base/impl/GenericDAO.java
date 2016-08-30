package com.el.dao.base.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.el.dao.base.IGenericDAO;

public abstract class GenericDAO<T> implements IGenericDAO<T> {

	private Class<T> entityClass;

	public GenericDAO(Class<T> clazz) {
		this.entityClass = clazz;
	}

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(T t) {
		sessionFactory.getCurrentSession().save(t);
	}

	@Override
	public void delete(T t) {
		sessionFactory.getCurrentSession().delete(t);
	}

	@Override
	public void update(T t) {
		sessionFactory.getCurrentSession().update(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T queryById(String id) {
		return (T) sessionFactory.getCurrentSession().get(entityClass, id);
	}

	@Override
	public List<T> queryAll() {
		String hql = "from " + entityClass.getSimpleName();
		return queryForList(hql, null);
	}

	@SuppressWarnings("unchecked")
	public T queryForObject(String hql, Object[] params) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		setQueryParams(query, params);
		return (T) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	protected T queryForTopObject(String hql, Object[] params) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		setQueryParams(query, params);
		return (T) query.setFirstResult(0).setMaxResults(1).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> queryForList(String hql, Object[] params) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		setQueryParams(query, params);
		return query.list();
	}

	@Override
	public void update(String hql, Object[] params) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		setQueryParams(query, params);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	protected List<T> queryForList(final String hql, final Object[] params,
			final int recordNum) {
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		setQueryParams(query, params);
		return query.setFirstResult(0).setMaxResults(recordNum).list();
	}

	private void setQueryParams(Query query, Object[] params) {
		if (null == params) {
			return;
		}
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
	}

}
