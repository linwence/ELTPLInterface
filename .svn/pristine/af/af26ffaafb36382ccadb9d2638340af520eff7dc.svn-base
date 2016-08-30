package com.el.entity.apporder;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CmdSerialize implements JsonSerializer<Cmd> {

	@Override
	public JsonElement serialize(Cmd cmd, Type type,
			JsonSerializationContext context) {
		JsonObject jsonObject = new JsonObject();
		// 注意：此处必须按照字母顺序依次加入元素
		jsonObject.add("body", context.serialize(cmd.getBody()));
		jsonObject.add("cmd", context.serialize(cmd.getCmd()));
		jsonObject.add("secret", context.serialize(cmd.getSecret()));
		jsonObject.add("sign", context.serialize(cmd.getSign()));
		jsonObject.add("source", context.serialize(cmd.getSource()));
		jsonObject.add("timestamp", context.serialize(cmd.getTimestamp()));
		return jsonObject;

	}

}
