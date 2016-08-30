package com.el.util;

import java.util.List;

import com.el.entity.Fe14101a;

public class CommonHelper {
	public static int calcSumTotal(List<Fe14101a> lstFe14101a) {
		int sumTotal = 0;
		for (int j = 0; j < lstFe14101a.size(); j++) {
			sumTotal = sumTotal + lstFe14101a.get(j).getPtuprc().intValue()
					* lstFe14101a.get(j).getPtqnty().intValue();
		}
		return sumTotal / 100;
	}

	/**
	 * 左补齐空格
	 * 
	 * @param data
	 *            需要补齐的数据
	 * @param toLength
	 *            总共的长度
	 * @return
	 */
	public static String leftAdd(String data, int toLength) {
		int length = data.length();
		String str = data;
		if (length < toLength) {

			for (int ll = 1; ll <= (12 - length); ll++) {
				str = " " + str;
			}
		}
		return str;
	}

}
