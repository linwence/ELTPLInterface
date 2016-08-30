package com.el.dao.distribution;

import java.util.List;

import com.el.dao.base.IGenericDAO;
import com.el.entity.erpdb.FE1dm11;

public interface IFE1DM11DAO extends IGenericDAO<FE1dm11> {
	public List<FE1dm11> queryByCondition(String mcu, String trdj_from, String trdj_to, String nxtrArray) throws Exception;
	public FE1dm11 queryByE1psn(String e1psn) throws Exception ;
}
