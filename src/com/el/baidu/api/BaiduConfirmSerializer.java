package com.el.baidu.api;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class BaiduConfirmSerializer implements JsonSerializer<BaiduConfirm> {
	@Override
	public JsonElement serialize(BaiduConfirm baiduConfirm, Type type,
			JsonSerializationContext context) {
		JsonObject object = new JsonObject();
		object.add("order_id", context.serialize(baiduConfirm.getOrder_id()));
		return object;
	}
}
