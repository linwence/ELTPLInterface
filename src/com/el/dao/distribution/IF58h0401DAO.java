package com.el.dao.distribution;

import com.el.dao.base.IGenericDAO;
import com.el.entity.erpdb.F58h0401;

public interface IF58h0401DAO extends IGenericDAO<F58h0401> {
	public F58h0401 queryByUkid(long ukid);
	public F58h0401 queryByDoco(String doco);
}
