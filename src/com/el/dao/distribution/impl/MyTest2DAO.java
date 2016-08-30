package com.el.dao.distribution.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IMyTest2DAO;
import com.el.entity.Fe14710a;
import com.el.entity.erpdb.F00022;

@Repository("myTest2DAO")
public class MyTest2DAO extends GenericDAO<F00022> implements IMyTest2DAO {

	public MyTest2DAO() {
		super(F00022.class);
	}

	@Override
	public String testQuery() {
		String str = "this is testDAO-2";
		return str;
	}
	
	
}
