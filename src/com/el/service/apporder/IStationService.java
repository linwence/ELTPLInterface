package com.el.service.apporder;

import java.util.List;

import com.el.entity.apporder.Coord;
import com.el.entity.apporder.Inventory;
import com.el.entity.apporder.Product;
import com.el.entity.apporder.Shop;
import com.el.entity.jde.JDEF4101;
import com.el.entity.jde.F58h0101;

public interface IStationService {
	/**
	 * 根据省市区，查询门店站点列表
	 * 
	 * @param province
	 *            省
	 * @param city
	 *            市
	 * @param district
	 *            区
	 * @return
	 */
	public List<F58h0101> queryLstF58h0101(String province, String city,
			String district);

	/**
	 * 根据收货地址的经纬度，查找最近的站点
	 * 
	 * @param lstF58h0101
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	public F58h0101 calcNearestStation(List<F58h0101> lstF58h0101,
			double longitude, double latitude);

	/**
	 * 获取最近的站点
	 * 
	 * @param coord
	 *            经纬度
	 * @param province
	 *            省
	 * @param city
	 *            市
	 * @param district
	 *            区
	 * @return
	 */
	public F58h0101 getNearestStation(Coord coord, String province,
			String city, String district);

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
