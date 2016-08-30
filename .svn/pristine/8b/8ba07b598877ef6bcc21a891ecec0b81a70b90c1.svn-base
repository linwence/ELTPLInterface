package com.el.dao.jde.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.el.dao.base.impl.GenericDAO;
import com.el.dao.jde.IInventoryDAO;
import com.el.entity.apporder.Inventory;
import com.el.entity.apporder.Product;
import com.el.entity.apporder.Shop;

@Repository
@Scope("prototype")
public class InventoryDAO extends GenericDAO<Inventory> implements
		IInventoryDAO {

	public InventoryDAO() {
		super(Inventory.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Inventory> queryInventory(Shop shop, List<Product> lstProduct) {
		// TODO Auto-generated method stub
		String hql = "select new com.el.entity.apporder.Inventory(trim(a.imlitm),trim(a.imdsc1), case when (f_get_atp(a.imitm,"
				+ shop.getId()
				+ ")/1000)<=0 then 0 else (f_get_atp(a.imitm,"
				+ shop.getId()
				+ ")/1000) end ||'',a.imuom1) "
				+ "from JDEF4101 a"
				+ " where 1=1 and imlnty='S'";
				//+ " where f_get_atp(a.imitm," + shop.getId() + ")>0";
		String subwhere = "";
		if (lstProduct != null && lstProduct.size() > 0) {
			for (Product p : lstProduct) {
				subwhere = subwhere + " or trim(a.imlitm)='" + p.getProduct_id() + "'";
			}
		}
		if (!subwhere.isEmpty()) {
			subwhere = " and (" + subwhere.replaceFirst(" or ", "") + ")";
			hql = hql + subwhere;
		}
		return this.queryForList(hql, null);
	}

}
