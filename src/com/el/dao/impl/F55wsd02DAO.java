package com.el.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.IF55wsd02DAO;
import com.el.dao.base.impl.GenericDAO;
import com.el.entity.F55wsd02;

@Repository
@Scope("prototype")
public class F55wsd02DAO extends GenericDAO<F55wsd02> implements IF55wsd02DAO {

	public F55wsd02DAO() {
		super(F55wsd02.class);
		// TODO Auto-generated constructor stub

	}

	@Override
	public List<F55wsd02> queryF55wsd02(Object[] params) {
		String hql = "from F55wsd02 where trim(IHE58HEDID)=? and  trim(IHE58EBOID)=? and trim(ihmcu)=?";
		return this.queryForList(hql, params);
	}

}
