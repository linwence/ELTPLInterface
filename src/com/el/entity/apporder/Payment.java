package com.el.entity.apporder;

import java.util.TreeMap;

public class Payment {

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	private String paytype;
	private int payfee;
	private int paytimestamp;
	private String payno;

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public int getPayfee() {
		return payfee;
	}

	public void setPayfee(int payfee) {
		this.payfee = payfee;
	}

	public int getPaytimestamp() {
		return paytimestamp;
	}

	public void setPaytimestamp(int paytimestamp) {
		this.paytimestamp = paytimestamp;
	}

	public String getPayno() {
		return payno;
	}

	public void setPayno(String payno) {
		this.payno = payno;
	}

	public TreeMap<String, Object> toMap() {

		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("paytype", paytype);
		treeMap.put("payfee", payfee);
		treeMap.put("paytimestamp", paytimestamp);
		treeMap.put("payno", payno);
		return treeMap;
	}

}
