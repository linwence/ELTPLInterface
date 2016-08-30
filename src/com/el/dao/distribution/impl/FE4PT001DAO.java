package com.el.dao.distribution.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IFE4PT001DAO;
import com.el.entity.erpdb.FE4PT001;


@Repository("fe4pt001DAO")
public class FE4PT001DAO extends GenericDAO<FE4PT001> implements IFE4PT001DAO {

	public FE4PT001DAO() {
		super(FE4PT001.class);
	}

	@Override
	/**
	 * 查询fe4pt001记录（根据doco、dcto、kcoo）
	 */
	public List<FE4PT001> queryByCondition(String doco, String dcto, String kcoo) {
		List<FE4PT001> fe4pt001List = new ArrayList<FE4PT001>();
		String hql = " from FE4PT001  "
				+ "	WHERE fe4pt001pk.ptdoco = " + doco+" and fe4pt001pk.ptdcto='"+dcto+"' "
				+ " and fe4pt001pk.ptkcoo='"+kcoo+"' ";
		fe4pt001List = queryForList(hql, null);
		return fe4pt001List;
	}
	
	
	
	
}
