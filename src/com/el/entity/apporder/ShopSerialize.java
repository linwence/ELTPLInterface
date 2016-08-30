package com.el.entity.apporder;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ShopSerialize implements JsonSerializer<Shop> {

	@Override
	public JsonElement serialize(Shop shop, Type type,
			JsonSerializationContext context) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.add("id", context.serialize(shop.getId()));
		jsonObject.add("name", context.serialize(shop.getName()));
		return jsonObject;
	}

}
