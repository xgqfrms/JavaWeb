﻿<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JSP login</title>
<style type="text/css">
.form1{
position: absolute;
width:300px;
height:200px
margin-left:200px;
margin-top:100px;

}
</style>
</head>
<body>
<script language="javascript">
	function validate(f){
		if(!(/^\w{5,15}$/.test(f.userid.value))){
			alert("用户ID必须是5~15位！") ;
			f.userid.focus() ;
			return false ;
		}
		if(!(/^\w{5,15}$/.test(f.userpass.value))){
			alert("密码必须是5~15位！") ;
			f.userpass.focus() ;
			return false ;
		}
	}
</script>
<%
	request.setCharacterEncoding("UTF-8") ;
%>
<%
	List<String> info = (List<String>) request.getAttribute("info") ;
	if(info != null){	//有信息返回
		Iterator<String> iter = info.iterator() ;
		while(iter.hasNext()){
%>
			<h4><%=iter.next()%></h4>
<%
		}
	}
%>
<div class="form1">
<form action="LoginServlet" method="post" onSubmit="return validate(this)">
	用户ID:<input type="text" name="userid"><br>
	密&nbsp;&nbsp;码:<input type="password" name="userpass"><br>
	<input type="submit" value="登陆">
	<input type="reset" value="重置">
</form>
</div>
</body>
</html>