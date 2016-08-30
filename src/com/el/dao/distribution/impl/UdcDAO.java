package com.el.dao.distribution.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.distribution.IUdcDAO;
import com.el.entity.erpdb.F0005;
import com.el.util.TH;


@Repository("udcDAO")
public class UdcDAO extends GenericDAO<F0005> implements IUdcDAO {

	public UdcDAO() {
		super(F0005.class);
	}

	@Override
	/**
	 * 获得UDC的值 并且 drky 有值
	 * @param drsy 		udc的key1
	 * @param drrt		udc的key2
	 * @return    		map = udc
	 */
	public Map<String, String> getUdc(String drsy, String drrt) {
		String key, value;
        Map<String, String> rst = new HashMap<String, String>();
		String hql = "from F0005 f where f.f0005pk.drsy = '" + drsy + "' and f.f0005pk.drrt='" + drrt + "' and LENGTH(TRIM(drky)) > 0";
		List<F0005> f0005s = queryForList(hql, null);
		if(f0005s.size()>0)
        {
        	for (F0005 f : f0005s) {
        		key = TH.getString(f.getF0005pk().getDrky()).trim();
        		value = TH.getString(f.getDrdl01()).trim();
        		rst.put(key, value);
        	}
        }
		return rst;
	}
	
	
	
	
}
