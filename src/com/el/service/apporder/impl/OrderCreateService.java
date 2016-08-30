package com.el.service.apporder.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.dao.Procedures.IProceDAO;
import com.el.dao.Procedures.ProceWork;
import com.el.service.apporder.IOrderCreateService;
import com.el.util.JDType;
import com.el.util.PropertiesUtil;

@Service("orderCreateService")
public class OrderCreateService implements IOrderCreateService {
	private IProceDAO proceDAO;

	public IProceDAO getProceDAO() {
		return proceDAO;
	}

	@Resource
	public void setProceDAO(IProceDAO proceDAO) {
		this.proceDAO = proceDAO;
	}

	public OrderCreateService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public int CallProcedures_DeductInventory(Long ukid) throws Exception {
		PropertiesUtil props = new PropertiesUtil("application.properties");
		String schema = props.getPropertyByKey("ojdbc2.username").trim();
		Date now = new Date();
		// 取修改文件的日期
		int d = JDType.fromDate(now);
		// 取修改文件的时间
		int t = JDType.fromTime(now);
		Object result = proceDAO.executePro(new ProceWork("{call " + schema
				+ ".EL_F41021.ATP_DEAL_UKID( ? , ? , ? , ? , ? )}", ukid,
				"APP", d, t) {
			// 新建ProWork 抽象类 ，第一个参数为存储过程调用语句，之后的参数为不定长参数。游标参数不用传入！
			// 实现ProWork 抽象方法。
			@Override
			public void execute(Connection conn) throws SQLException {
				CallableStatement statement = conn.prepareCall(this.getProSql());
				// 为存储过程设置参数，用this.getParams(Index ) 获取传入参数。
				statement.setLong(1, Long.valueOf(this.getParams(1).toString()));
				statement.setString(2, this.getParams(2).toString());
				statement.setLong(3, Long.valueOf(this.getParams(3).toString()));
				statement.setLong(4, Long.valueOf(this.getParams(4).toString()));
				statement.registerOutParameter(5, Types.INTEGER);
				statement.execute();
				// 将存储过程返回结果赋值.
				this.setResult(statement.getInt(5));
			}
		});
		return Integer.valueOf(result.toString());

	}

}
