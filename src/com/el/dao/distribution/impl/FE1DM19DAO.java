package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IFE1DM19DAO;
import com.el.entity.erpdb.FE1DM19;


@Repository("fe1dm19DAO")
public class FE1DM19DAO extends GenericDAO<FE1DM19> implements IFE1DM19DAO {

	public FE1DM19DAO() {
		super(FE1DM19.class);
	}

	@Override
	/**
	 * 查询fe1dm19记录（根据e1psn、nxtr）
	 */
	public FE1DM19 queryByCondition(long e1psn, String nxtr) {
		FE1DM19 fe1dm19 = new FE1DM19();
		String hql = "FROM FE1DM19 where dle1psn=" + e1psn+" and dlnxtr="+nxtr+" order by dlukid desc";
		List<FE1DM19> fe1dm19s = queryForList(hql, null);
		if(fe1dm19s.size()>0)
			fe1dm19 = fe1dm19s.get(0);
		return fe1dm19;
	}
	
	
	
	
}
