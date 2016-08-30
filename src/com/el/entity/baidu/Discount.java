package com.el.entity.baidu;

public class Discount {
	public Discount(){
		System.out.println("discout construct create");
	}
	public Discount(String type, int fee, String activity_id,
			String baidu_rate, String shop_rate, String agent_rate,
			String logistics_rate, String desc) {
		super();
		this.type = type;
		this.fee = fee;
		this.activity_id = activity_id;
		this.baidu_rate = baidu_rate;
		this.shop_rate = shop_rate;
		this.agent_rate = agent_rate;
		this.logistics_rate = logistics_rate;
		this.desc = desc;
	}
	private String type;// string 是 优惠类型，枚举值参见附录
	private int fee;// int 是 优惠金额，单位：分
	private String activity_id;// string 是 活动 ID
	private String baidu_rate;// string 是 百度承担金额
	private String shop_rate;// string 是 商户承担金额
	private String agent_rate;// string 是 代理商承担金额
	private String logistics_rate;// string 是 物流承担金额
	private String desc;// string 否 优惠描述
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getActivity_id() {
		return activity_id;
	}
	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}
	public String getBaidu_rate() {
		return baidu_rate;
	}
	public void setBaidu_rate(String baidu_rate) {
		this.baidu_rate = baidu_rate;
	}
	public String getShop_rate() {
		return shop_rate;
	}
	public void setShop_rate(String shop_rate) {
		this.shop_rate = shop_rate;
	}
	public String getAgent_rate() {
		return agent_rate;
	}
	public void setAgent_rate(String agent_rate) {
		this.agent_rate = agent_rate;
	}
	public String getLogistics_rate() {
		return logistics_rate;
	}
	public void setLogistics_rate(String logistics_rate) {
		this.logistics_rate = logistics_rate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
