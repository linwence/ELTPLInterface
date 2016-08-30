package com.el.entity.eleme;

import java.util.List;

public class OrderDetail {

	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	private List<OrderGroup> group;
	private List<OrderExtra> extra;
	private List<String> abandoned_extra;

	public List<OrderGroup> getGroup() {
		return group;
	}

	public void setGroup(List<OrderGroup> group) {
		this.group = group;
	}

	public List<OrderExtra> getExtra() {
		return extra;
	}

	public void setExtra(List<OrderExtra> extra) {
		this.extra = extra;
	}

	public List<String> getAbandoned_extra() {
		return abandoned_extra;
	}

	public void setAbandoned_extra(List<String> abandoned_extra) {
		this.abandoned_extra = abandoned_extra;
	}

}
