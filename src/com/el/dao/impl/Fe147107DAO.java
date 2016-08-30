package com.el.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.IFe147107DAO;
import com.el.dao.base.impl.GenericDAO;
import com.el.entity.Fe147107;

@Repository
@Scope("prototype")
public class Fe147107DAO extends GenericDAO<Fe147107> implements IFe147107DAO {

	public Fe147107DAO() {
		super(Fe147107.class);
		// TODO Auto-generated constructor stub
	}

}
