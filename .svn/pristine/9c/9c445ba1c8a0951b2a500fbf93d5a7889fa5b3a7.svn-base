package com.el.service.apporder.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.dao.IF55wsd02DAO;
import com.el.dao.IF55wsd03DAO;
import com.el.dao.Procedures.IProceDAO;
import com.el.dao.Procedures.ProceWork;
import com.el.dao.distribution.IF58h0401DAO;
import com.el.entity.erpdb.F58h0401;
import com.el.service.apporder.IOrderCancelByAppService;

@Service("orderCancelByAppServiceImpl")
public class OrderCancelByAppServiceImpl implements IOrderCancelByAppService {
	private IProceDAO proceDAO;
	private IF58h0401DAO f58h0401DAO;
	private IF55wsd02DAO f55wsd02DAO;
	private IF55wsd03DAO f55wsd03DAO;

	public IProceDAO getProceDAO() {
		return proceDAO;
	}

	@Resource
	public void setProceDAO(IProceDAO proceDAO) {
		this.proceDAO = proceDAO;
	}

	public IF58h0401DAO getF58h0401DAO() {
		return f58h0401DAO;
	}

	@Resource
	public void setF58h0401DAO(IF58h0401DAO f58h0401dao) {
		f58h0401DAO = f58h0401dao;
	}

	public IF55wsd02DAO getF55wsd02DAO() {
		return f55wsd02DAO;
	}

	@Resource
	public void setF55wsd02DAO(IF55wsd02DAO f55wsd02dao) {
		f55wsd02DAO = f55wsd02dao;
	}

	public IF55wsd03DAO getF55wsd03DAO() {
		return f55wsd03DAO;
	}

	@Resource
	public void setF55wsd03DAO(IF55wsd03DAO f55wsd03dao) {
		f55wsd03DAO = f55wsd03dao;
	}

	public OrderCancelByAppServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public int CallProcedure_OrderCancel(long doco) throws Exception {

		Object result = proceDAO.executePro(new ProceWork(
				"{call  EL_ROH_CANCEL2(?,?)}", doco) {
			// 新建ProWork 抽象类 ，第一个参数为存储过程调用语句，之后的参数为不定长参数。游标参数不用传入！
			// 实现ProWork 抽象方法。
			@Override
			public void execute(Connection conn) throws SQLException {
				CallableStatement statement = conn.prepareCall(this.getProSql());
				// 为存储过程设置参数，用this.getParams(Index ) 获取传入参数。
				statement.setString(1, this.getParams(1).toString());
				statement.registerOutParameter(2, Types.CHAR);
				statement.execute();
				// 将存储过程返回结果赋值.
				this.setResult(statement.getString(2));
			}
		});
		return Integer.valueOf(result.toString().trim());
	}

	@Override
	@Transactional
	public int OrderCancelByApp(long ukid) throws Exception {
		// TODO Auto-generated method stub
		F58h0401 f58h0401 = f58h0401DAO.queryByUkid(ukid);
		return CallProcedure_OrderCancel(f58h0401.getChdoco());
	}

	@Override
	@Transactional
	public void cancelF55wsd02AndF55wsd03(long ukid) throws Exception {
		// TODO Auto-generated method stub
		String hql = " update F55wsd02 set ihe58hos=980 where id.ihukid="
				+ ukid;
		f55wsd02DAO.update(hql, null);

		hql = " update F55wsd03 set ide58hos=980 where id.idukid=" + ukid;
		f55wsd03DAO.update(hql, null);
	}

}
