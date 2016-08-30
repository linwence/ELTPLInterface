package com.el.action.distribution.reponseModel;

import java.util.TreeMap;

/**
 * 配送单信息
 */
public class DistributionModel {
	private String rorn;//ERP 订单编号
	private String createdate;//订单日期
	private String e1psn;//配送单号
	private String senddate;//要求送货日期
	private String sendtime;//要求送货时间从
	private String sendtotime;//要求送货时间到
	private String sourcemcu;//订单来源
	private String paystatus;//付款标志(0 未支付、1 已支付)
	private String totalMoney;//配送单总金额
	private String remark;//备注
	private String status;//配送单状态 1待抢单;2已抢单;3已配送
	public String getRorn() {
		return rorn;
	}
	public void setRorn(String rorn) {
		this.rorn = rorn;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getE1psn() {
		return e1psn;
	}
	public void setE1psn(String e1psn) {
		this.e1psn = e1psn;
	}
	public String getSenddate() {
		return senddate;
	}
	public void setSenddate(String senddate) {
		this.senddate = senddate;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
	public String getSendtotime() {
		return sendtotime;
	}
	public void setSendtotime(String sendtotime) {
		this.sendtotime = sendtotime;
	}
	public String getSourcemcu() {
		return sourcemcu;
	}
	public void setSourcemcu(String sourcemcu) {
		this.sourcemcu = sourcemcu;
	}
	public String getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}
	public String getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DistributionModel(String rorn, String createdate, String e1psn, String senddate,
			String sendtime, String sendtotime, String sourcemcu,
			String paystatus, String totalMoney, String remark, String status) {
		super();
		this.rorn = rorn;
		this.createdate = createdate;
		this.e1psn = e1psn;
		this.senddate = senddate;
		this.sendtime = sendtime;
		this.sendtotime = sendtotime;
		this.sourcemcu = sourcemcu;
		this.paystatus = paystatus;
		this.totalMoney = totalMoney;
		this.remark = remark;
		this.status = status;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("rorn", rorn);
		map.put("createdate", createdate);
		map.put("e1psn", e1psn);
		map.put("senddate", senddate);
		map.put("sendtime", sendtime);
		map.put("sendtotime", sendtotime);
		map.put("sourcemcu", sourcemcu);
		map.put("paystatus", paystatus);
		map.put("totalMoney", totalMoney);
		map.put("remark", remark);
		map.put("status", status);
		return map;
	}
	
}
