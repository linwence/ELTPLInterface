package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IF58h0401DAO;
import com.el.entity.erpdb.F58h0401;


@Repository("f58h0401DAO")
public class F58h0401DAO extends GenericDAO<F58h0401> implements IF58h0401DAO {

	public F58h0401DAO() {
		super(F58h0401.class);
	}

	@Override
	/**
	 * 查询f58h0401记录（根据ukid）
	 */
	public F58h0401 queryByUkid(long ukid) {
		F58h0401 f58h0401 = new F58h0401();
		String hql = "from F58h0401 where chukid = " + ukid;
		List<F58h0401> f58h0401s = queryForList(hql, null);
		if(f58h0401s.size()>0)
			f58h0401 = f58h0401s.get(0);
		return f58h0401;
	}

	@Override
	public F58h0401 queryByDoco(String doco) {
		F58h0401 f58h0401 = new F58h0401();
		String hql = "from F58h0401 where chdoco = " + doco;
		List<F58h0401> f58h0401s = queryForList(hql, null);
		if(f58h0401s.size()>0)
			f58h0401 = f58h0401s.get(0);
		return f58h0401;
	}
	
	
	
	
}
