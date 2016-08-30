package com.el.dao.jde.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.jde.IF58h0101DAO;
import com.el.entity.jde.F58h0101;

@Repository
@Scope("prototype")
public class F58h0101DAO extends GenericDAO<F58h0101> implements IF58h0101DAO {

	public F58h0101DAO() {
		super(F58h0101.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<F58h0101> queryLstF58h0101(Object[] params) {
		String hql = "select new com.el.entity.jde.F58h0101(FH.id,FH.sme58lati,FH.sme58longi,f6.mcdc) FROM  Fe10101 FE , F58h0101 FH , F0101 F1,F0006 f6"
				+ "   WHERE FH.id.smmcu=FE.id.sdmcu "
				+ " and f6.mcmcu=FH.id.smmcu"
				+ " AND F1.aban8=FH.id.sme58an8 "
				+ " AND FH.sme58huf02<>'1'"// 关闭站点不参与计算
				+ " AND FE.id.sde58hproc=? AND FE.id.sde58hcity=? AND FE.id.sde58hpref=? "
				+ " AND FE.id.sdcomitlvl='2' ";
		return (List<F58h0101>) queryForList(hql, params);
	}

}
