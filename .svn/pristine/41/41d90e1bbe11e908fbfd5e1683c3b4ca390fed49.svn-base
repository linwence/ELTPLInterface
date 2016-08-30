<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>

<script type="text/javascript">
    var ctx='<%=basePath%>';
</script>
<script type="text/javascript"
	src="${ctx }system/plugins/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript"
	src="${ctx }system/functions/i18n/i18n_loc_get_default.js"></script>
<script type="text/javascript"
	src="${ctx }system/functions/i18n/i18n_loc_set_default.js"></script>
<script type="text/javascript"
	src="${ctx }system/functions/strings/strnatcmp.js"></script>
<script type="text/javascript"
	src="${ctx }system/functions/strings/strncmp.js"></script>
<script type="text/javascript"
	src="${ctx }system/functions/array/ksort.js"></script>
<script type="text/javascript" src="${ctx}js/test.js"></script>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	参数.
	<br>
	<textarea id="textarea" rows="" cols="" style="width: 1098px; height: 488px;">
	</textarea>
	<br>
	<input type="button" id="btnBaiduGet" onclick="btnBaiduGetClick()" value="获取百度示例参数"/>
	<input type="button" id="btn" onclick="btClick()" value="百度提交" />
	<br>
	<input type="button" id="btnMeiTuan" onclick="btnMeiTuanClick()" value="获取美团示例参数"/>
	<input type="button" id="btnMeiTuanSubmit" onclick="btnMeiTuanSubmit()" value="美团提交"/>
	<br>
	<input type="button" id="btnAppSubmit" onclick="btnAppSubmit()" value="App下单"/>
	<br>
	<input type="button" id="btnKsort" onclick="btKsort()" value="ksort">
	<p id="pksort"></p>
	<p id="pksort2"></p>
</body>
</html>
