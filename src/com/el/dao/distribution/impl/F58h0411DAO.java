package com.el.dao.distribution.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IF58h0411DAO;
import com.el.entity.erpdb.F58h0411;
import com.el.util.JDType;
import com.jdedwards.base.datatypes.SqlDate;


@Repository("f58h0411DAO")
public class F58h0411DAO extends GenericDAO<F58h0411> implements IF58h0411DAO {

	public F58h0411DAO() {
		super(F58h0411.class);
	}

	@Override
	public List<F58h0411> queryByCondition(Long e1psn) throws Exception {
		String hql = "from F58h0411 f where f.che1psn="+e1psn+ " order by chlnid";
		List<F58h0411> l = this.queryForList(hql, null);
		return l;
	}
	
}
