package com.el.dao.distribution;

import java.util.Map;

import com.el.dao.base.IGenericDAO;
import com.el.entity.erpdb.F0005;

public interface IUdcDAO extends IGenericDAO<F0005> {
	public Map<String, String> getUdc(String drsy, String drrt);
}
