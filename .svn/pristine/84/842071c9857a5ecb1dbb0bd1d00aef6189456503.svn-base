package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IF4101DAO;
import com.el.entity.erpdb.F4101;


@Repository("f4101DAO")
public class F4101DAO extends GenericDAO<F4101> implements IF4101DAO {

	public F4101DAO() {
		super(F4101.class);
	}

	@Override
	/**
	 * 查询f4101记录（根据litm）
	 */
	public F4101 queryByLitm(String litm) {
		F4101 f4101 = new F4101();
		String hql = "from F4101 where imlitm = '" + litm + "'";
		List<F4101> f4101s = queryForList(hql, null);
		if(f4101s.size()>0)
			f4101 = f4101s.get(0);
		return f4101;
	}
	
	
	
	
}
