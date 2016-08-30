package com.el.service.apporder.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.dao.IF55wsd02DAO;
import com.el.dao.distribution.IF58h0401DAO;
import com.el.dao.distribution.IFE4PT001DAO;
import com.el.entity.erpdb.F58h0401;
import com.el.entity.erpdb.FE4PT001;
import com.el.service.apporder.IOrderPayService;

@Service("orderPayService")
public class OrderPayService implements IOrderPayService {
	private IF58h0401DAO f58h0401DAO;
	private IFE4PT001DAO fe4pt001DAO;
	private IF55wsd02DAO f55wsd02DAO;

	public IF58h0401DAO getF58h0401DAO() {
		return f58h0401DAO;
	}

	@Resource
	public void setF58h0401DAO(IF58h0401DAO f58h0401dao) {
		f58h0401DAO = f58h0401dao;
	}

	public IFE4PT001DAO getFe4pt001DAO() {
		return fe4pt001DAO;
	}

	@Resource
	public void setFe4pt001DAO(IFE4PT001DAO fe4pt001dao) {
		fe4pt001DAO = fe4pt001dao;
	}

	public OrderPayService() {
		// TODO Auto-generated constructor stub
	}

	public IF55wsd02DAO getF55wsd02DAO() {
		return f55wsd02DAO;
	}

	@Resource
	public void setF55wsd02DAO(IF55wsd02DAO f55wsd02dao) {
		f55wsd02DAO = f55wsd02dao;
	}

	@Override
	@Transactional
	public F58h0401 queryF58h0401ByUkid(long ukid) {
		// TODO Auto-generated method stub
		return f58h0401DAO.queryByUkid(ukid);
	}

	@Override
	@Transactional
	public void doPay(String e58huf02, long ukid, List<FE4PT001> lstfe4pt001) {
		// TODO Auto-generated method stub
		// String hql="update F58h0401 set "
		// f58h0401DAO.update(hql, params);
		double total = 0;
		for (FE4PT001 fe4pt001 : lstfe4pt001) {
			fe4pt001DAO.insert(fe4pt001);
			total = total + fe4pt001.getPtaap();
		}
		// 在线支付时，更新JDE订单表上的支付状态为已支付
		if (e58huf02.equals("2")) {
			String hql = "update F58h0401 set che58gpayf=3,Che58hpaam=" + total
					+ " where chukid=" + ukid;
			f58h0401DAO.update(hql, null);
		}
	}

	@Override
	@Transactional
	public void updateF55wsd02(long ukid) {
		// TODO Auto-generated method stub
		String hql = " update F55wsd02 set ihe58gpayf=3 where ihprukid=" + ukid;
		f55wsd02DAO.update(hql, null);
	}

}
