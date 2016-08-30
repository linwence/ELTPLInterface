package com.el.entity.eleme;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfo {

	public OrderInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * string 顾客送餐地址
	 */
	private String address;
	/**
	 * datetime 下单时间
	 */
	private Date created_at;
	/**
	 * float 配送费
	 */
	private BigDecimal deliver_fee;
	/**
	 * datetime 送餐时间
	 */
	private Date deliver_time;
	/**
	 * int 配送状态（仅用于第三方配送）
	 */
	private int deliver_status;
	/**
	 * string 订单备注
	 */
	private String description;
	

	/**
	 * string 发票抬头
	 */
	private String invoice;
	/**
	 * bool 是否预订单
	 */
	private int is_book;
	/**
	 * bool 是否在线支付 0不是在线支付 ；1在线支付
	 */
	private int is_online_paid;
	/**
	 * long 饿了么订单id
	 */
	private long order_id;
	/**
	 * string list 顾客联系电话
	 */
	private String[] phone_list;
	/**
	 * int 餐厅id
	 */
	private int restaurant_id;
	/**
	 * string 餐厅名称
	 */
	private String restaurant_name;
	/**
	 * int 餐厅当日订单序号
	 */
	private int restaurant_number;
	/**
	 * int 订单状态
	 */
	private int status_code;
	/**
	 * int 用户id
	 */
	private int user_id;
	/**
	 * string 用户名
	 */
	private String user_name;
	/**
	 * float 订单总价
	 */
	private BigDecimal total_price;
	/**
	 * float 菜价加上配送费和打包费（订单总价减去优惠的价格）
	 */
	private BigDecimal original_price;
	/**
	 * string 订单收货人，例如：张三
	 */
	private String consignee;
	/**
	 * string 订单收货地址经纬度，例如：31.2538,121.4185
	 */
	private String delivery_geo;
	/**
	 * string 顾客送餐详情地址，例如：近铁城市广场（普陀区金沙江路1518弄)
	 */
	private String delivery_poi_address;
	
	/**
	 * json 订单详细类目列表
	 */
	//private OrderDetail detail;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public BigDecimal getDeliver_fee() {
		return deliver_fee;
	}
	public void setDeliver_fee(BigDecimal deliver_fee) {
		this.deliver_fee = deliver_fee;
	}
	public Date getDeliver_time() {
		return deliver_time;
	}
	public void setDeliver_time(Date deliver_time) {
		this.deliver_time = deliver_time;
	}
	public int getDeliver_status() {
		return deliver_status;
	}
	public void setDeliver_status(int deliver_status) {
		this.deliver_status = deliver_status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	
	 
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String[] getPhone_list() {
		return phone_list;
	}
	public void setPhone_list(String[] phone_list) {
		this.phone_list = phone_list;
	}
	public int getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	public String getRestaurant_name() {
		return restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}
	public int getRestaurant_number() {
		return restaurant_number;
	}
	public void setRestaurant_number(int restaurant_number) {
		this.restaurant_number = restaurant_number;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public BigDecimal getTotal_price() {
		return total_price;
	}
	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}
	public BigDecimal getOriginal_price() {
		return original_price;
	}
	public void setOriginal_price(BigDecimal original_price) {
		this.original_price = original_price;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getDelivery_geo() {
		return delivery_geo;
	}
	public void setDelivery_geo(String delivery_geo) {
		this.delivery_geo = delivery_geo;
	}
	public String getDelivery_poi_address() {
		return delivery_poi_address;
	}
	public void setDelivery_poi_address(String delivery_poi_address) {
		this.delivery_poi_address = delivery_poi_address;
	}
	public int getIs_book() {
		return is_book;
	}
	public void setIs_book(int is_book) {
		this.is_book = is_book;
	}
	public int getIs_online_paid() {
		return is_online_paid;
	}
	public void setIs_online_paid(int is_online_paid) {
		this.is_online_paid = is_online_paid;
	}

}
