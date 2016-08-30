package com.el.dao.distribution;

import com.el.dao.base.IGenericDAO;
import com.el.entity.erpdb.FE1DM19;

public interface IFE1DM19DAO extends IGenericDAO<FE1DM19> {
	public FE1DM19 queryByCondition(long e1psn, String nxtr);
}
