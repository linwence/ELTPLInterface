package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IFE4LN001DAO;
import com.el.entity.erpdb.FE4ln001;


@Repository("fe4ln001DAO")
public class FE4LN001DAO extends GenericDAO<FE4ln001> implements IFE4LN001DAO {

	public FE4LN001DAO() {
		super(FE4ln001.class);
	}
	
//	@Override
//	public void delete(Long e1psn, Long lnid, String litm) throws Exception {
//		String hql = "delete from FE4ln001 where lne1psn="+e1psn+" and trim(lnlitm)='"+litm+"' and lnlnid="+lnid;
//		this.update(hql, null);
//	}
	
	@Override
	public void delete(Long e1psn) throws Exception {
		String hql = "delete from FE4ln001 where lne1psn="+e1psn;
		this.update(hql, null);
	}

	@Override
	public List<FE4ln001> queryByCondition(Long e1psn) throws Exception {
		String hql = "from FE4ln001 where lne1psn="+e1psn;
		List<FE4ln001> l = this.queryForList(hql, null);
		return l;
	}
	
}
