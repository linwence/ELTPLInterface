package com.el.entity.baidu;

public class Order {
	private String order_id; // 是 百度订单编号
	private int send_immediately; // 是 是否立即送餐，1 是 2 否
	private String send_time;// 是 期望送达时间
	private int send_fee;// 是 配送费，单位：分
	private int package_fee; // 否 餐盒费，单位：分
	private int discount_fee;// 否 优惠总金额，单位：分
	private int shop_fee;// 是 商户实收总价，单位：分
	private int total_fee;// 是 订单总价，单位：分
	private int user_fee;// 是 用户实付总价，单位：分
	private String pay_type;// 是 支付类型，1 下线 2 在线
	private int need_invoice;// 是 是否需要发票 1:是 2:否
	private String invoice_title;// 否 发票抬头
	private String remark;// 否 订单备注
	private int delivery_party;// 是 物流 1 百度 2 自配送
	private int create_time;// 是 订单创建时间
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getSend_immediately() {
		return send_immediately;
	}
	public void setSend_immediately(int send_immediately) {
		this.send_immediately = send_immediately;
	}
	public String getSend_time() {
		return send_time;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
	public int getSend_fee() {
		return send_fee;
	}
	public void setSend_fee(int send_fee) {
		this.send_fee = send_fee;
	}
	public int getPackage_fee() {
		return package_fee;
	}
	public void setPackage_fee(int package_fee) {
		this.package_fee = package_fee;
	}
	public int getDiscount_fee() {
		return discount_fee;
	}
	public void setDiscount_fee(int discount_fee) {
		this.discount_fee = discount_fee;
	}
	public int getShop_fee() {
		return shop_fee;
	}
	public void setShop_fee(int shop_fee) {
		this.shop_fee = shop_fee;
	}
	public int getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(int total_fee) {
		this.total_fee = total_fee;
	}
	public int getUser_fee() {
		return user_fee;
	}
	public void setUser_fee(int user_fee) {
		this.user_fee = user_fee;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public int getNeed_invoice() {
		return need_invoice;
	}
	public void setNeed_invoice(int need_invoice) {
		this.need_invoice = need_invoice;
	}
	public String getInvoice_title() {
		return invoice_title;
	}
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getDelivery_party() {
		return delivery_party;
	}
	public void setDelivery_party(int delivery_party) {
		this.delivery_party = delivery_party;
	}
	public int getCreate_time() {
		return create_time;
	}
	public void setCreate_time(int create_time) {
		this.create_time = create_time;
	}

}
