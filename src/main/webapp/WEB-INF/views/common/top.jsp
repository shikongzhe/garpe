<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%
    HttpSession s = request.getSession(); 
	String userName = (String)s.getAttribute("userName");
    %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<script src="/resources/scripts/common/jquery/jquery.js"></script>
<script src="/resources/scripts/common/bootstarp/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/css/bootstarp/bootstrap.css">
<script src="https://cdn.bootcss.com/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<title class="glyphicon-user">秋天</title>
</head>
<body>
<div>

	<c:if test="${true}" >
		<nav class="navbar navbar-default navbar-static-top navbar-inverse">
		  	<div class="  container">
		  
		  		<ul class="nav navbar-nav " id="myNav" >
		             <li ><a data-toggle="modal" data-target="#myModal" style="cursor: pointer;"><%=s.getAttribute("userName")%></a></li>
			      </ul>
			  </div>
		</nav>
	</c:if>
	<c:if test="${true}" >
	<nav class="navbar navbar-default navbar-static-top navbar-inverse">
	  	<div class="  container">
	  
	  		<ul class="nav navbar-nav " id="myNav" >
	             <li ><a data-toggle="modal" data-target="#myModal" style="cursor: pointer;">登陆</a></li>
	             <li><a href="/main/registerUser.view">注册</a></li>
		      </ul>
		  </div>
	</nav>
	</c:if>
</div>
</body>
</html>