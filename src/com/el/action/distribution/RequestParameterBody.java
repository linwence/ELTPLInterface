package com.el.action.distribution;

import java.util.TreeMap;

import com.el.action.distribution.reponseModel.DeliverymanModel;

public class RequestParameterBody {
	private String shop_id;//站点 ID
	private String deliverymanid;//配送员 ID
	private String status;//配送单状态 1待抢单;2已抢单;3已配送
	private String startdate;//抢单起始日期
	private String enddate;//抢单截止日期
	private String e1psn;//配送单号
	private DeliverymanModel deliveryman;//配送员信息
	private String reasontype;//拒收原因码 J1~J7
	private String reason;//原因说明
	
	public String getShop_id() {
		return shop_id;
	}
	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	public String getDeliverymanid() {
		return deliverymanid;
	}
	public void setDeliverymanid(String deliverymanid) {
		this.deliverymanid = deliverymanid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getE1psn() {
		return e1psn;
	}
	public void setE1psn(String e1psn) {
		this.e1psn = e1psn;
	}
	public String getReasontype() {
		return reasontype;
	}
	public void setReasontype(String reasontype) {
		this.reasontype = reasontype;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public DeliverymanModel getDeliveryman() {
		return deliveryman;
	}
	public void setDeliveryman(DeliverymanModel deliveryman) {
		this.deliveryman = deliveryman;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("shop_id", shop_id);
		map.put("deliverymanid", deliverymanid);
		map.put("status", status);
		map.put("startdate", startdate);
		map.put("enddate", enddate);
		map.put("e1psn", e1psn);
		if(deliveryman!=null)
			map.put("deliveryman", deliveryman.toMap());
		map.put("reasontype", reasontype);
		map.put("reason", reason);
		return map;
	}
}
