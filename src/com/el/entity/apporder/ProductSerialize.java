package com.el.entity.apporder;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ProductSerialize implements JsonSerializer<Product> {

	@Override
	public JsonElement serialize(Product product, Type type,
			JsonSerializationContext context) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.add("product_amount",
				context.serialize(product.getProduct_amount()));
		jsonObject.add("product_fee",
				context.serialize(product.getProduct_fee()));

		jsonObject
				.add("product_id", context.serialize(product.getProduct_id()));
		jsonObject.add("product_name",
				context.serialize(product.getProduct_name()));
		jsonObject.add("product_price",
				context.serialize(product.getProduct_price()));
		return jsonObject;
	}

}
