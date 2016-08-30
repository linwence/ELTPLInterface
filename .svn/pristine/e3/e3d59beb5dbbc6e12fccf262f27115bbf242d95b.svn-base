/*****
 * elitesland 自己公用的js
 * 勿修改里面的js文件. 很多地方引用了. 
 * 如果不合适自己的函数请勿修改. 请在自己的js文件中加一个类似的函数做修改
 * (如果引入了此js文件 请不要取同名的函数. )
 */

/**
 * udc值写入select标签中
 * @param key1 udc的第一个 key
 * @param key2 udc的第二个 key
 * @param id select的id
 */
function getUDCtoSelect( key1 , key2 , id ){
	var date = new Date();
	id.length = 1;
	$.get(ctx+"callcenter/callhistory!searchAllUDC?date="+date,{"udcKey":key1,"type":key2},function(data){
		if( data == "error" ){
			//alert(data);
		}else{
			setUDCtheOption( data , id );
		}
	});
}

/**
 * 解析后台回调的udc. 将其放入到select下拉单中
 * @param data 后台回调的值
 * @param id select的id
 */
function setUDCtheOption( data , id ){
	var typeArr = data.replace("[{","").replace("}]","");
	if( typeArr == "" ){
		return;
	}
	var typeList = typeArr.split("\",\"");
	var typeKey = null ;
	var typeValue = null ;
	for( var i = 0 ; i < typeList.length ; i++ ){
		var type2 ;
		if( i == 0 || i == "0" ){
			type2 = typeList[i].split("\":\"");
			typeKey = type2[0].split("\"")[1];
			typeValue = type2[1];
		}else if( i == typeList.length-1 ){
			type2 = typeList[i].split("\":\"");
			typeKey = type2[0];
			typeValue = type2[1].split("\"")[0];
		}else{
			type2 = typeList[i].split("\":\"");
			typeKey = type2[0];
			typeValue = type2[1];
		}
		$('<option value="' + typeKey + '">' + typeValue + '</option>').appendTo(id);
	}
}

/**
 * 获得easyui的日期格式可做为easyui日期控件设置(当前本地日期)
 */
var dateStr = function() {
	var today = new Date();
	return today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
};

/**
 * 获得easyui的日期时间格式可做为easyui日期时间控件设置(当前本地日期+时间)
 */
var timeStr = function() {
	var today = new Date();
	return today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate()
	+' '+today.getHours()+':'+today.getMinutes()+':'+today.getSeconds();
};

/**
 * 获得easyui的日期格式可做为easyui日期控件设置(当前本地日期)
 */
var setDateStr = function(date) {
	return date.getFullYear()+'-'+(date.getMonth()+1)+'-'+date.getDate();
};

/**
 * 获得easyui的日期时间格式可做为easyui日期时间控件设置(当前本地时间)
 */
var setTimeStr = function(time) {
	return time.getHours()+':'+time.getMinutes()+':'+time.getSeconds();
};

/**
 * 关闭easyui弹窗
 * @param id 为 字符串id. 例如 id=memberId
 */
function closeDialog(id){
	$("#"+id).dialog('close');
}

/**
 * 去掉前后空格 使用方式 text = trim(text) ; 
 * 不能传入数组或者json . 只能是字符串
 * @param text 传入的文本信息
 * @return 去掉空格后的文本信息
 */
function trim(text){
	//如果是 null 或者 undefined 则直接返回空字符串
	if( text != null && text != undefined ){
		text = text + "" ; //如果是数字类型则转型字符串类型
		//使用正则去除前后空格
		return text.replace(/(^\s+)|(\s+$)/g,"");
	}else{
		return "";
	}
}

var yzType;    //定义价格的圆整位数，"1"=元，"2"=角，"3"=分
yzType="2";

/**
 * 针对价格进行四舍五入的圆整处理
 1 - 取整数
 2 - 取1位小数
3 - 取2位小数
4 - 取3位小数
5 - 取4位小数
 */
function mingRound(inputNumber,yzType)
{
	var byNumber;
	
	switch(yzType)
	{
	case "1":
		byNumber=1;
		break;
	case "2":
		byNumber=10;
		break;
	case "3":
		byNumber=100;
		break;
	case "4":
		byNumber=1000;
		break;
	case "5":
		byNumber=10000;
		break;
	default:
		return 0;
	}
	return Math.round(inputNumber*byNumber)/byNumber;
}

var select_uiTime = "" ;
/**
 * easy ui 时间控件 : 只显示时间
 * 控制easy ui 选择时间的问题. 使用方式 data-options="formatter:uiTime"
 * @param date	选中的时间
 * @returns {String}
 */
function uiTime(date){  
//    var y = date.getFullYear();  
//    var m = date.getMonth()+1;  
//    var d = date.getDate();  
	var dt = new Date() ;
	
    var h = date.getHours();  
    var min = date.getMinutes();  
    var sec = date.getSeconds();  
    
    var h2 = dt.getHours();  
    var min2 = dt.getMinutes(); 
    var sec2 = dt.getSeconds(); 
    
    var tm = (h<10?('0'+h):h)+""+(min<10?('0'+min):min)+""+(sec<10?('0'+sec):sec) ;
    var tm2 = (h2<10?('0'+h2):h2)+""+(min2<10?('0'+min2):min2)+""+(sec2<10?('0'+sec2):sec2) ;
    
    if( -1 < ( parseInt(tm) - parseInt(tm2) ) && ( parseInt(tm) - parseInt(tm2) ) < 2 ){
    	return select_uiTime ;
    }
    //var str = y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d)+' '+(h<10?('0'+h):h);  
    var str = (h<10?('0'+h):h) + ":" + (min<10?('0'+min):min) + ":" + (sec<10?('0'+sec):sec) ;
    select_uiTime = str ;
    return str;  
}

/**
 * easy ui 日期时间控件 : 显示日期和时间
 * 控制easy ui 选择时间的问题. 使用方式 data-options="formatter:uiDatetime"
 * @param date	选中的日期时间
 * @returns {String}
 */
function uiDatetime(date){  
    var y = date.getFullYear();  
    var m = date.getMonth()+1;  
    var d = date.getDate();  
	var dt = new Date() ;
	
    var h = date.getHours();  
    var min = date.getMinutes();  
    var sec = date.getSeconds();  
    
    var y2 = dt.getFullYear();  
    var m2 = dt.getMonth()+1;  
    var d2 = dt.getDate();  
    var h2 = dt.getHours();  
    var min2 = dt.getMinutes(); 
    var sec2 = dt.getSeconds(); 
    
    var tm = y+""+(m<10?('0'+m):m)+""+(d<10?('0'+d):d) +
    	(h<10?('0'+h):h)+""+(min<10?('0'+min):min)+""+(sec<10?('0'+sec):sec) ;
    
    var tm2 =  y2+""+(m2<10?('0'+m2):m2)+""+(d2<10?('0'+d2):d2) +
    	(h2<10?('0'+h2):h2)+""+(min2<10?('0'+min2):min2)+""+(sec2<10?('0'+sec2):sec2) ;
    
    if( -1 < ( parseInt(tm) - parseInt(tm2) ) && ( parseInt(tm) - parseInt(tm2) ) < 2 ){
    	return select_uiTime ;
    }
    //var str = y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d)+' '+(h<10?('0'+h):h);  
    var select_uiTime = y+"-"+(m<10?('0'+m):m)+"-"+(d<10?('0'+d):d) + " " +
    	(h<10?('0'+h):h) + ":" + (min<10?('0'+min):min) + ":" + (sec<10?('0'+sec):sec) ;
    return select_uiTime;  
}

/**
 * 
 * @param s
 * @returns {Date}
 */
function uiParserTime(s){  
    if (!s) return new Date();  
    var y = s.substring(0,4);  
    var m =s.substring(5,7);  
    var d = s.substring(8,10);  
    var h = s.substring(11,14);  
    var min = s.substring(15,17);  
    var sec = s.substring(18,20);  
    if (!isNaN(y) && !isNaN(m) && !isNaN(d) && !isNaN(h) && !isNaN(min) && !isNaN(sec)){  
        return new Date(y,m-1,d,h,min,sec);  
    } else {  
        return new Date();  
    }  
}

/**
 * 验证日期 > 当前日期
 * @param date 日期
 */
function ckTime_CurrentTime( date ){
	var dt = new Date() ; //当前日期时间
	
	//获取选中的日期和时间
	var y = date.getFullYear() ;
	var m = date.getMonth() ;
	var d = date.getDate() ;
    //获取当前日期和时间
    var y2 = dt.getFullYear();
	var m2 = dt.getMonth(); 
	var d2 = dt.getDate();
    //拼接日期时间进行比较
    var tm = y+""+(m<10?('0'+m):m)+""+(d<10?('0'+d):d);
    
    var tm2 =  y2+""+(m2<10?('0'+m2):m2)+""+(d2<10?('0'+d2):d2);
    if( parseInt(tm) >= parseInt(tm2) ){
    	return true ;
    }
    return false ;
}

/**
 * 验证日期 > 当前日期
 * 日期的时间 > 当前日期的时间
 * @param date 日期
 * @param time 时间
 */
function ckTd_CurrentTd( date , time ){
	var dt = new Date() ; //当前时间
	
	var dateArr = date.split("-");
	//获取选中的日期和时间
	var y = dateArr[0];
	var m = dateArr[1]; 
	var d = dateArr[2];
    var h = time.getHours();
    var min = time.getMinutes(); 
    var sec = time.getSeconds(); 
    //获取当前日期和时间
    var y2 = dt.getFullYear();
	var m2 = dt.getMonth()+1; 
	var d2 = dt.getDate();
    var h2 = dt.getHours();  
    var min2 = dt.getMinutes(); 
    var sec2 = dt.getSeconds(); 
    //拼接日期时间进行比较
    var tm = y+""+(m<10?('0'+m):m)+""+(d<10?('0'+d):d)+""+
    	(h<10?('0'+h):h)+""+(min<10?('0'+min):min)+""+(sec<10?('0'+sec):sec) ;
    
    var tm2 =  y2+""+(m2<10?('0'+m2):m2)+""+(d2<10?('0'+d2):d2)+""+
    	(h2<10?('0'+h2):h2)+""+(min2<10?('0'+min2):min2)+""+(sec2<10?('0'+sec2):sec2) ;
    if( parseInt(tm) >= parseInt(tm2) ){
    	return true ;
    }
    return false ;
}

/**
 * 日期时间 > 当前日期时间
 * @param date 日期,时间   DateTime控件
 */
function ckTd_CurrentDatetime( date ){
	var dt = new Date() ; //当前时间
	
	//获取选中的日期和时间
	var y = date.getFullYear();
	var m = date.getMonth()+1; 
	var d = date.getDate();
    var h = date.getHours();
    var min = date.getMinutes(); 
    var sec = date.getSeconds(); 
    //获取当前日期和时间
    var y2 = dt.getFullYear();
	var m2 = dt.getMonth()+1; 
	var d2 = dt.getDate();
    var h2 = dt.getHours();  
    var min2 = dt.getMinutes(); 
    var sec2 = dt.getSeconds(); 
    //拼接日期时间进行比较
    var tm = y+""+(m<10?('0'+m):m)+""+(d<10?('0'+d):d)+""+
    	(h<10?('0'+h):h)+""+(min<10?('0'+min):min)+""+(sec<10?('0'+sec):sec) ;
    
    var tm2 =  y2+""+(m2<10?('0'+m2):m2)+""+(d2<10?('0'+d2):d2)+""+
    	(h2<10?('0'+h2):h2)+""+(min2<10?('0'+min2):min2)+""+(sec2<10?('0'+sec2):sec2) ;
    if( parseInt(tm) >= parseInt(tm2) ){
    	return true ;
    }
    return false ;
}

//added by gavin start 2015/03/29
/**
 * 按钮的禁止和恢复通用函数
 * @param disable:true时禁止,否则，允许
 * */
function disableButtons(disable){
	var disabled = "true";
	if (disable) {
		$("input[type='button']").removeClass("button").addClass("buttondisabled");
		$("input[type='button']").attr("disabled",disabled);
	} else {
		$("input[type='button']").removeClass("buttondisabled").addClass("button");
		$("input[type='button']").removeAttr("disabled");
	}
}

/**
 * 单个按钮的禁止和恢复通用函数
 * @param:buttonName button name
 * @param disable:true时禁止,否则，允许
 * */
function disableButton(buttonName,disable){
	var disabled = "true";
	var target = "input[name='"+ buttonName + "']";
	if (disable) {
		$(target).removeClass("button").addClass("buttondisabled");
		$(target).attr("disabled",disabled);
	} else {
		$(target).removeClass("buttondisabled").addClass("button");
		$(target).removeAttr("disabled");
	}
}

//added by gavin end 2015/03/29
//add by gavin 2015/05/18 start

/**
 * 向下取整
 * @param：amount --要取整的数据
 * @param：point--小数位数
 * **/
function trimPoint(num,digit) {
	var powDigit = Math.pow(10,digit);
	num = Number(Math.floor(Number(num).mul(powDigit))).div(powDigit);
	return num;
}
//add by gavin 2015/05/19
//圆整规则，对单价和金额
function doRound(value,roundRule){
	var afterValue = 0;
	
	//默认四舍五入
	if (roundRule == "") {
		roundRule = "01";
	}
//	alert(roundRule);
  switch (roundRule) {
	  case '01': 
		afterValue = Math.round(value);
	    break;
	  case '02': 
		afterValue = Number(Math.round(Number(value).mul(10))).div(10);
	    break;
	  case '03':
		afterValue = Number(Math.round(Number(value).mul(100))).div(100);
	    break;
	  case '04': 
		afterValue = Number(Math.ceil(Number(value)));
	    break;
	  case '05': 
		afterValue = Number(Math.ceil(Number(value).mul(10))).div(10);
	    break;
	  case '06':
		afterValue = Number(Math.ceil(Number(value).mul(100))).div(100);
	    break;	
	  case '07': 
		afterValue = Math.floor(value);
	    break;
	  case '08': 
		afterValue = Number(Math.floor(Number(value).mul(10))).div(10);;
	    break;
	  case '09':
		afterValue = Number(Math.floor(Number(prrc).mul(100))).div(100);
	    break;		    
	  default: 
	}
	return afterValue;
}
//add by gavin 2015/05/18 end