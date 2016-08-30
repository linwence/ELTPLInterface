/**
 * 
 */
// var ctx='<%=basePath%>';
function btClick() {
	var url = ctx + "baidu/orderCreate.action";
	/*
	 * var dataInfo = { "body" : { "shop" : { "id" : "2520", "name" :
	 * "百度外卖（测试店）" }, "order" : { "order_id" : "14347012309352",
	 * "send_immediately" : 1, "send_time" : "1", "send_fee" : 500,
	 * "package_fee" : 200, "discount_fee" : 0, "total_fee" : 3700, "shop_fee" :
	 * 3200, "user_fee" : 3700, "pay_type" : 1, "pay_status" : 1, "need_invoice" :
	 * 2, "invoice_title" : "", "remark" : "请提供餐具", "delivery_party" : 1,
	 * "create_time" : "1434701230" }, "user" : { "name" : "测试订单请勿操作", "phone" :
	 * "18912345678", "gender" : 1, "address" : "北京海淀区奎科科技大厦 测试", "coord" : {
	 * "longitude" : 116.143145, "latitude" : 39.741426 } }, "products" : [ {
	 * "product_id" : "12277320", "product_name" : "酱肉包（/份）", "product_price" :
	 * 1200, "product_amount" : 1, "product_fee" : 1200, "package_price" : 100,
	 * "package_amount" : 1, "package_fee" : 100, "total_fee" : 1300, "upc" : "" } ],
	 * "discount" : [] }, "cmd" : "order.create", "sign" :
	 * "E362B8AACE4F7A77047A885C0C0D230D", "source" : "65400", "ticket" :
	 * "909C3B92-8CDD-AF2C-C887-5B660233E2B2", "timestamp" : 1434701234,
	 * "version" : "2.0" }; var data1 = JSON.stringify(dataInfo);
	 */
	var data1 = $("#textarea").val();
	$.ajax({
		url : url,
		data : data1,
		dataType : 'json',
		contentType : 'application/json',
		// contentType : 'application/x-www-form-urlencoded',
		type : 'POST',
		async : true,
		success : function(data) {
			console.log(data);
			$("#pksort2").text(JSON.stringify(data));
		}
	});

	// var data2 = {
	// "cmd" : "order.status.get",
	// "timestamp" : "1432119870",
	// "version" : "2",
	// "ticket" : "C6F2BF8C-162E-4820-9878-755021FD2912",
	// "source" : "65400 ",
	// "sign" : "F001DC5AF88F2915B575226469DDE9C1",
	// "body" : {
	// "order_id" : "14347012309352"
	// }
	// };
	// var data3 = JSON.stringify(data2);
	// $.ajax({
	// url : url,
	// data : data3,
	// dataType : 'json',
	// // contentType : 'application/json',
	// contentType : 'application/x-www-form-urlencoded',
	// type : 'POST',
	// async : true,
	// success : function(data) {
	// console.log(data);
	// $("#pksort").text(JSON.stringify(data));
	// }
	// });

}

function btnBaiduGetClick() {
	var dataInfo = {
		"body" : {
			"shop" : {
				"id" : "2520",
				"name" : "百度外卖（测试店）"
			},
			"order" : {
				"order_id" : "14347012309352",
				"send_immediately" : 1,
				"send_time" : "1",
				"send_fee" : 500,
				"package_fee" : 200,
				"discount_fee" : 0,
				"total_fee" : 3700,
				"shop_fee" : 3200,
				"user_fee" : 3700,
				"pay_type" : 1,
				"pay_status" : 1,
				"need_invoice" : 2,
				"invoice_title" : "",
				"remark" : "请提供餐具",
				"delivery_party" : 1,
				"create_time" : "1434701230"
			},
			"user" : {
				"name" : "测试订单请勿操作",
				"phone" : "18912345678",
				"gender" : 1,
				"address" : "北京海淀区奎科科技大厦 测试",
				"coord" : {
					"longitude" : 116.143145,
					"latitude" : 39.741426
				}
			},
			"products" : [ {
				"product_id" : "12277320",
				"product_name" : "酱肉包（/份）",
				"product_price" : 1200,
				"product_amount" : 1,
				"product_fee" : 1200,
				"package_price" : 100,
				"package_amount" : 1,
				"package_fee" : 100,
				"total_fee" : 1300,
				"upc" : ""
			} ],
			"discount" : []
		},
		"cmd" : "order.create",
		"sign" : "E362B8AACE4F7A77047A885C0C0D230D",
		"source" : "65400",
		"ticket" : "909C3B92-8CDD-AF2C-C887-5B660233E2B2",
		"timestamp" : 1434701234,
		"version" : "2.0"

	};
	var data1 = JSON.stringify(dataInfo);
	var str = data1;
	$("#textarea").text(str);
}

function btnMeiTuanClick() {
	var str = "delivery_time=1446534823&total=100&utime=1446534823&wm_poi_name=%E6%B5%8B%E8%AF%95%E5%95%86%E5%AE%B6&detail=%5B%7B+%22app_food_code%22%3A+1%2C+%22food_name%22%3A+%22%E7%8B%97%E4%B8%8D%E7%90%86%22%2C+%22sku_id%22%3A+%221%22%2C+%22quantity%22%3A+6%2C+%22price%22%3A+100%2C+%22box_num%22%3A2%2C+%22box_price%22%3A1%2C+%22unit%22%3A+%22%E4%BB%BD%22%2C+%22food_discount%22%3A+0.8+%7D%5D&caution=%E4%B8%8D%E6%94%BE%E9%A6%99%E8%8F%9C&original_price=90&recipient_name=%E6%B5%8B%E8%AF%95%E6%94%B6%E4%BB%B6%E4%BA%BA&order_id=1&wm_poi_phone=15010138804&city_id=1&timestamp=1446536793&pay_type=1&longitude=116.241019&status=1&invoice_title=%E4%B8%AA%E4%BA%BA&app_poi_code=1&shipper_phone=15010138804&is_third_shipping=0&ctime=1446534823&shipping_fee=10&has_invoiced=1&extras=%5B%5D&recipient_phone=15010138804&wm_poi_address=%E6%B5%8B%E8%AF%95%E5%95%86%E5%AE%B6%E5%9C%B0%E5%9D%80&wm_order_id_view=1&app_id=147&latitude=39.957172&recipient_address=%E6%B5%8B%E8%AF%95%E6%94%B6%E4%BB%B6%E4%BA%BA&sig=a01c13d0e2c9f22823d4c4515cfc4848";

	$("#textarea").text(str);

}
function btnMeiTuanSubmit() {
	var url = ctx + "meituan/meituanOrderCreate.action";
	var str = $("#textarea").val();
	$.ajax({
		url : url,
		data : str,
		dataType : 'json',
		// contentType : 'application/json',
		contentType : 'application/x-www-form-urlencoded',
		type : 'POST',
		async : true,
		success : function(data) {
			console.log(data);
			$("#pksort").text(JSON.stringify(data));
		}
	});

}
function btKsort() {
	var sr = {
		"cmd" : "shop.create",
		"timestamp" : "1430719064",
		"version" : "2",
		"ticket" : "CBB291F6-33BE-57CC-8FE3-441FE6E7BA6C",
		"source" : "65400",
		"body" : {
			"shop_id" : "123456",
			"name" : "测试商户"

		},
		"secret" : "test_secret"
	}
	var ksr = ksort(sr, "SORT_LOCALE_STRING");
	var jstr = JSON.stringify(ksr);
	$("#pksort").text(jstr);
}
function btnAppSubmit() {
	var url = ctx + "app/appAccess.action";
	var data1 = $("#textarea").val();
	$.ajax({
		url : url,
		data : data1,
		dataType : 'json',
		contentType : 'application/json',
		// contentType : 'application/x-www-form-urlencoded',
		type : 'POST',
		async : true,
		success : function(data) {
			console.log(data);
			$("#pksort2").text(JSON.stringify(data));
		}
	});

}
