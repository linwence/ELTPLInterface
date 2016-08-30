package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IFE4DS001DAO;
import com.el.entity.erpdb.FE4DS001;


@Repository("fe4ds001DAO")
public class FE4DS001DAO extends GenericDAO<FE4DS001> implements IFE4DS001DAO {

	public FE4DS001DAO() {
		super(FE4DS001.class);
	}

	@Override
	/**
	 * 查询fe4ds001记录（根据an8）
	 */
	public FE4DS001 queryByAn8(String an8) {
		FE4DS001 fe4ds001 = new FE4DS001();
		if(an8!=null){
			String hql = "from FE4DS001 a  WHERE a.dse58an8 = '"+an8+"'";
			List<FE4DS001> fe4ds001s = queryForList(hql, null);
			if(fe4ds001s.size()>0)
				fe4ds001 = fe4ds001s.get(0);
		}
		return fe4ds001;
	}
	
	
	
	
}
