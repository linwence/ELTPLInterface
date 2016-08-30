package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IFE1DM12DAO;
import com.el.entity.erpdb.FE1dm12;


@Repository("fe1dm12DAO")
public class FE1DM12DAO extends GenericDAO<FE1dm12> implements IFE1DM12DAO {

	public FE1DM12DAO() {
		super(FE1dm12.class);
	}

	@Override
	public List<FE1dm12> queryByCondition(Long e1psn) throws Exception {
		String hql = "from FE1dm12 f where f.fe1dm12pk.dle1psn="+e1psn+ " order by dllnid";
		List<FE1dm12> l = this.queryForList(hql, null);
		return l;
	}

	@Override
	public void update_e58huf05(Long e1psn, String e58huf05) throws Exception {
		String hql = " update FE1dm12 set Dle58huf05='"+e58huf05+"' where dle1psn= "+e1psn;
		this.update(hql, null);
	}

	@Override
	public void update_e58huf05_e58huf04(Long e1psn, String e58huf05,
			String e58huf04) throws Exception {
		String hql = " update FE1dm12 set Dle58huf05='"+e58huf05+"', Dle58huf04='"+e58huf04+"' where dle1psn= "+e1psn;
		this.update(hql, null);
	}
	
}
