package com.el.dao.distribution.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IMcuDAO;
import com.el.entity.erpdb.F0006;


@Repository("mcuDAO")
public class McuDAO extends GenericDAO<F0006> implements IMcuDAO {

	public McuDAO() {
		super(F0006.class);
	}

	@Override
	public String getMcuName(String mcu) {
		String name = "";
		String hql = "from F0006 f where f.mcmcu = '" + mcu + "' ";
		List<F0006> f0006s = queryForList(hql, null);
		if(f0006s.size()>0){
			name = f0006s.get(0).getMcdc();
		}
		return name;
	}

	@Override
	public Map<String, String> getAllMcu() {
		String key, value;
        Map<String, String> rst = new HashMap<String, String>();
        String hql = "from F0006 f";
		List<F0006> f0006s = queryForList(hql, null);
		if(f0006s.size()>0)
        {
        	for (F0006 f : f0006s) {
        		key = f.getMcmcu();
        		value = f.getMcdc();
        		rst.put(key, value);
        	}
        }
		return rst;
	}
	
}
