package com.el.dao.distribution;

import java.util.List;

import com.el.dao.base.IGenericDAO;
import com.el.entity.erpdb.FE4PT001;

public interface IFE4PT001DAO extends IGenericDAO<FE4PT001> {
	public List<FE4PT001> queryByCondition(String doco, String dcto, String kcoo);
}
