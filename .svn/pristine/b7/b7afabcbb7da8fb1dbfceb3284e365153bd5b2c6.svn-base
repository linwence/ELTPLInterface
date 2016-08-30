package com.el.dao.jde;

import java.util.List;

import com.el.dao.base.IGenericDAO;
import com.el.entity.apporder.Inventory;
import com.el.entity.apporder.Product;
import com.el.entity.apporder.Shop;
import com.el.entity.jde.JDEF4101;

public interface IInventoryDAO extends IGenericDAO<Inventory> {
	/**
	 * 根据站点、商品获取商品的可销库存
	 * 
	 * @param shop
	 *            站点
	 * @param lstProduct
	 *            要查询的商品列表，可为null，如果Null就代表查询站点下的所有商品库存
	 * @return
	 */
	
	public List<Inventory> queryInventory(Shop shop, List<Product> lstProduct);

}
