package com.el.action.distribution;

import java.util.TreeMap;

import com.el.util.CalculateSignHelp;

public class RequestParameter {
	private String cmd;
	private int timestamp;
	private String source;
	private String sign;
	private RequestParameterBody body;

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public RequestParameterBody getBody() {
		return body;
	}

	public void setBody(RequestParameterBody body) {
		this.body = body;
	}
	
	public TreeMap<String, Object> toMap() {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		map.put("cmd", cmd);
		map.put("timestamp", timestamp);
		map.put("source", source);
//		map.put("sign", sign);
		map.put("body", body.toMap());
		return map;
	}
	
	public String getSignedStr(String secretKey) {
		TreeMap<String, Object> map = this.toMap();
		map.put("secret", secretKey);
		String signedStr = CalculateSignHelp.CalculateSign(map);
		return signedStr;
	}

}
