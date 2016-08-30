package com.el.service.apporder.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.el.connect.DBContextHolder;
import com.el.dao.jde.IInventoryDAO;
import com.el.dao.jde.IF58h0101DAO;
import com.el.entity.F0005L;
import com.el.entity.apporder.Coord;
import com.el.entity.apporder.Inventory;
import com.el.entity.apporder.Product;
import com.el.entity.apporder.Shop;
import com.el.entity.jde.F58h0101Id;
import com.el.entity.jde.JDEF4101;
import com.el.entity.jde.F58h0101;
import com.el.service.IOrderService;
import com.el.service.apporder.IStationService;
import com.el.util.BaiduMapUtil;

@Service("stationServiceImpl")
@Scope("prototype")
public class StationServiceImpl implements IStationService {
	/**
	 * 地球半径
	 */
	private final double EARTH_RADIUS = 6378.137;
	private IF58h0101DAO f58h0101DAO;
	private IOrderService orderServiceImpl;
	/**
	 * 商品DAO，可以用来查询库存可供量
	 */
	private IInventoryDAO inventoryDAO;

	public IF58h0101DAO getF58h0101DAO() {
		return f58h0101DAO;
	}

	@Resource
	public void setF58h0101DAO(IF58h0101DAO f58h0101dao) {
		f58h0101DAO = f58h0101dao;
	}

	public StationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public IOrderService getOrderServiceImpl() {
		return orderServiceImpl;
	}

	@Resource
	public void setOrderServiceImpl(IOrderService orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}

	public IInventoryDAO getInventoryDAO() {
		return inventoryDAO;
	}

	@Resource
	public void setInventoryDAO(IInventoryDAO inventoryDAO) {
		this.inventoryDAO = inventoryDAO;
	}

	@Override
	@Transactional
	public List<F58h0101> queryLstF58h0101(String province, String city,
			String district) {
		// TODO Auto-generated method stub
		Object[] params = new Object[3];
		params[0] = province;
		params[1] = city;
		params[2] = district;
		return f58h0101DAO.queryLstF58h0101(params);
	}

	@Override
	public F58h0101 calcNearestStation(List<F58h0101> lstF58h0101,
			double longitude, double latitude) {

		for (F58h0101 f58h0101 : lstF58h0101) {
			double distance = 0;
			try {
				distance = getDistance(
						Double.parseDouble(f58h0101.getSme58lati() == null ? "0"
								: f58h0101.getSme58lati()),
						Double.parseDouble(f58h0101.getSme58longi() == null ? "0"
								: f58h0101.getSme58longi()), latitude,
						longitude);
			} catch (Exception ex) {
				// 某些门店经纬度异常
				throw new RuntimeException("站点ID("
						+ f58h0101.getId().getSmmcu().trim()
						+ "): 经纬度异常. 请维护此门店经纬度");
			}
			f58h0101.setDistance(distance);
		}

		Collections.sort(lstF58h0101, new Comparator<F58h0101>() {
			public int compare(F58h0101 arg0, F58h0101 arg1) {
				double difference = arg0.getDistance() - arg1.getDistance();
				if (difference > 0)
					return 1;
				else if (difference < 0)
					return -1;
				else
					return 0;
			}
		});
		return lstF58h0101.get(0);
	}

	/**
	 * 根据经纬度计算距离
	 * 
	 * @param lat1
	 *            参照物的纬度
	 * @param lng1
	 *            参照物的经度
	 * @param lat2
	 *            当前地址的纬度
	 * @param lng2
	 *            当前地址的经度
	 * @return
	 */
	private double getDistance(double lat1, double lng1, double lat2,
			double lng2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);
		double a = radLat1 - radLat2;
		double b = rad(lng1) - rad(lng2);
		double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
				+ Math.cos(radLat1) * Math.cos(radLat2)
				* Math.pow(Math.sin(b / 2), 2)));
		s = s * EARTH_RADIUS;
		return Math.round(s * 10000) / 10000;
	}

	private double rad(double d) {
		return d * Math.PI / 180.0;
	}

	@Transactional
	public F58h0101 getNearestStation(Coord coord, String province,
			String city, String district) {

		List<F58h0101> lstF58h0101 = this.queryLstF58h0101(province, city,
				district);
		F58h0101 f58h0101 = null;
		if (lstF58h0101.size() > 0) {
			f58h0101 = this.calcNearestStation(lstF58h0101,
					Double.parseDouble(coord.getLongitude()),
					Double.parseDouble(coord.getLatitude()));
			return f58h0101;
		}

		return null;
	}

	@Override
	@Transactional
	public List<Inventory> queryInventory(Shop shop, List<Product> lstProduct) {
		// TODO Auto-generated method stub
		return inventoryDAO.queryInventory(shop, lstProduct);
	}

}
