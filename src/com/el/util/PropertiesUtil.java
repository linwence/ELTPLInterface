package com.el.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获取 src 下的配置文件
 * 
 */
public class PropertiesUtil {

	private Properties pro;

	public PropertiesUtil(String fileUrl) {
		pro = new Properties();
		setProperties(fileUrl);
	}

	private void setProperties(String fileUrl) {
		InputStream in = PropertiesUtil.class.getClassLoader()
				.getResourceAsStream(fileUrl);
		try {
			if (in != null)
				pro.load(in);
			else
				System.out.println("文件不存在！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 获取配置属性数据
	 * 
	 * @param key
	 * @return value
	 */
	public String getPropertyByKey(String key) {
		String str = (String) pro.get(key);
		return str;
	}

	public String getPropertyByKey(String key, String defaultValue) {
		String str = (String) pro.get(key);
		if (str == null)
			return defaultValue;
		else
			return str;
	}

	/**
	 * 设置配置属性数据
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public Object setPropertyByKey(String key, String value) {
		if (key != null && value != null)
			return pro.setProperty(key, value);
		else
			return "input key or value is null!";
	}
}
