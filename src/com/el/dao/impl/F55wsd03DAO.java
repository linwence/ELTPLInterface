package com.el.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.IF55wsd03DAO;
import com.el.dao.base.impl.GenericDAO;
import com.el.entity.F55wsd03;

@Repository
@Scope("prototype")
public class F55wsd03DAO extends GenericDAO<F55wsd03> implements IF55wsd03DAO {

	public F55wsd03DAO() {
		super(F55wsd03.class);
	}

}
