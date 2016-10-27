<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>My index JSP page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords" content="HTML5,CSS3,JavaScript V8,JSP,PHP,ASP.NET,C#..."/>
<meta name="author" content="xgqfrms"/>
<meta name="description" content="HTML5,CSS3,JavaScript V8,JSP,PHP,ASP.NET,C#..."/>

<link href="favicon.ico" rel="icon" type="image/x-icon" />
<link href="favicon.ico" rel="shortcut icon" type="image/x-icon" />

<link href="css/index.css" rel="stylesheet" type="text/css" />
<link href="js/01.js" type="text/javascript" />
</head>
<body>
<div id="register">
<a href="html/register.html" style="color:#00FF00" target="_blank"><h3>注册</h3></a>
</div>
<div id="container" class="div01">
<h3>
&nbsp;&nbsp; <span><small>欢迎登陆&nbsp;</small><mark style="color:#00FF00;">&nbsp;<b style="font-size:40px;">云课堂</b>&nbsp;&nbsp;</mark></span>
</h3>
<br/>
<hr/>
<form action="input.jsp" id="form1" class="form01" method="post" >
&nbsp;&nbsp;ID:&nbsp;<input type="text" name="ID"/><input type="hidden" value="ID Error!"/><br/>
<br/>用户名:&nbsp;<input type="text" name="userno"/><input type="hidden" value="username Error!"/><br/>
<br/>&nbsp;密码:&nbsp;<input type="password" name="pwd"/><input type="hidden" value="password Error!"/><br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交"/>
&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"/>
</form>
</div>
</body>
</html>