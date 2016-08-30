package com.el.dao.distribution.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IF41021DAO;
import com.el.entity.erpdb.F41021;


@Repository("f41021DAO")
public class F41021DAO extends GenericDAO<F41021> implements IF41021DAO {

	public F41021DAO() {
		super(F41021.class);
	}

	@Override
	public List<F41021> queryByCondition(Long itm, String mcu) throws Exception {
		String hql = "FROM F41021 where liitm="+itm+" and TRIM(limcu)='"+mcu+"' and trim(lilots) is null and liPQOH>0 order by lilotn";
		List<F41021> list = this.queryForList(hql, null);
		for(F41021 f41021 : list){
			this.getSessionFactory().getCurrentSession().evict(f41021);//清除实例与数据库间的关联
		}
		return list;
	}
	
	
}
