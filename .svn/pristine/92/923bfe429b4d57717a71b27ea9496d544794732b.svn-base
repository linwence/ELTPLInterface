package com.el.dao.distribution.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IMyTestDAO;
import com.el.entity.Fe14710a;

@Repository("myTestDAO")
public class MyTestDAO extends GenericDAO<Fe14710a> implements IMyTestDAO {

	public MyTestDAO() {
		super(Fe14710a.class);
	}
	

	@Override
	public String testQuery() {
		String str = "this is testDAO-1";
		return str;
	}

	
}
