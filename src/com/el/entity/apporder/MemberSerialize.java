package com.el.entity.apporder;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class MemberSerialize implements JsonSerializer<Member> {

	@Override
	public JsonElement serialize(Member member, Type type,
			JsonSerializationContext context) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.add("address", context.serialize(member.getAddress()));
		jsonObject.add("city", context.serialize(member.getCity()));
		jsonObject.add("district", context.serialize(member.getDistrict()));
		jsonObject.add("gender", context.serialize(member.getGender()));
		jsonObject.add("name", context.serialize(member.getName()));
		jsonObject.add("phone", context.serialize(member.getPhone()));
		jsonObject.add("province", context.serialize(member.getProvince()));
		return jsonObject;
	}

}
