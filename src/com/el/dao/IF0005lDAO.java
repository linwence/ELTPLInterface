package com.el.dao;

import java.util.List;

import com.el.dao.base.IGenericDAO;
import com.el.entity.F0005L;

public interface IF0005lDAO extends IGenericDAO<F0005L> {
	public List<F0005L> queryLstF0005L(Object[] params);
}
