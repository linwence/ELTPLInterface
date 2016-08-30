package com.el.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.IFe14710aDAO;
import com.el.dao.base.impl.GenericDAO;
import com.el.entity.Fe14710a;

@Repository
@Scope("prototype")
public class Fe14710aDAO extends GenericDAO<Fe14710a> implements IFe14710aDAO {

	public Fe14710aDAO(Class<Fe14710a> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}

	public Fe14710aDAO() {
		super(Fe14710a.class);
	}

}
