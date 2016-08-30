package com.el.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.IFe14101aDAO;
import com.el.dao.base.impl.GenericDAO;
import com.el.entity.Fe14101a;

@Repository
@Scope("prototype")
public class Fe14101aDAO extends GenericDAO<Fe14101a> implements IFe14101aDAO {

	public Fe14101aDAO() {
		super(Fe14101a.class);
		// TODO Auto-generated constructor stub
	}

}
