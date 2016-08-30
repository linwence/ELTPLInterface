package com.el.dao.distribution;

import java.util.List;

import com.el.dao.base.IGenericDAO;
import com.el.entity.erpdb.F58h0411;

public interface IF58h0411DAO extends IGenericDAO<F58h0411> {
	public List<F58h0411> queryByCondition(Long e1psn) throws Exception;
}
