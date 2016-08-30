package com.el.dao.distribution.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IFE1DM11DAO;
import com.el.entity.erpdb.FE1dm11;
import com.el.util.JDType;
import com.jdedwards.base.datatypes.SqlDate;


@Repository("fe1dm11DAO")
public class FE1DM11DAO extends GenericDAO<FE1dm11> implements IFE1DM11DAO {

	public FE1DM11DAO() {
		super(FE1dm11.class);
	}

	@Override
	public List<FE1dm11> queryByCondition(String mcu, String trdj_from, String trdj_to, String nxtrArray) throws Exception {
		String hql = "FROM FE1dm11 where 1=1";
		
		//站点
		if(mcu!=null && !mcu.trim().equals("")) {
			hql += "and (domcu='"+JDType.fromMCU(mcu.trim())+"' or doslmcu='"+JDType.fromMCU(mcu.trim())+"') ";
		}
		//销售日期
		if(trdj_from!=null && !trdj_from.trim().equals("") && trdj_to!=null && !trdj_to.trim().equals("")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			int trdj1=JDType.fromDate(new SqlDate(sdf.parse(trdj_from)));
			int trdj2=JDType.fromDate(new SqlDate(sdf.parse(trdj_to)));
			hql+=" and (dotrdj between "+trdj1+" and "+trdj2+")";
		}
		//配送单状态
		if(nxtrArray!=null && !nxtrArray.trim().equals("")) {
			hql+=" and trim(donxtr) in ("+nxtrArray.trim()+")";
		}
		//排序
		hql += " order by to_number(donxtr), doe1psn";
		List<FE1dm11> l = this.queryForList(hql, null);
		return l;
	}

	@Override
	public FE1dm11 queryByE1psn(String e1psn) throws Exception {
		FE1dm11 fe1dm11 = new FE1dm11();
		String hql = "from FE1dm11 where doe1psn = " + e1psn;
		List<FE1dm11> fe1dm11s = queryForList(hql, null);
		if(fe1dm11s.size()>0)
			fe1dm11 = fe1dm11s.get(0);
		return fe1dm11;
	}
	
}
