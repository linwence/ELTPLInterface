package com.el.dao.base;

import java.util.List;

public interface IGenericDAO<T> {

	void insert(T t);

	void delete(T t);

	void update(T t);

	public void update(String hql, Object[] params);

	T queryById(String id);

	List<T> queryAll();

	public List<T> queryForList(String hql, Object[] params);

}
