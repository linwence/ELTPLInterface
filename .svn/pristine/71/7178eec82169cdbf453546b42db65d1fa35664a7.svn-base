package com.el.dao.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.IF0005lDAO;
import com.el.dao.base.impl.GenericDAO;
import com.el.entity.F0005L;

@Repository
@Scope("prototype")
public class F0005lDAO extends GenericDAO<F0005L> implements IF0005lDAO {

	public F0005lDAO() {
		super(F0005L.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<F0005L> queryLstF0005L(Object[] params) {
		// TODO Auto-generated method stub
		String hql = "from F0005L where  trim(drrt)=? and trim(drdl01)=?";
		return queryForList(hql, params);
	}

}
