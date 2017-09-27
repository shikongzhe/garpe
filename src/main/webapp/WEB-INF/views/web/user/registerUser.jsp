<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<%   
String path = request.getContextPath();   
String basePath = request.getScheme()+"://" +request.getServerName()+":" +request.getServerPort()+path+"/" ;   
%>   
<base href="<%=basePath%>" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="../../common/top.jsp"/>
<script src="/resources/scripts/web/user/login.js"></script>
<link href="//vjs.zencdn.net/5.19/video-js.min.css" rel="stylesheet">
<script src="/resources/scripts/common/video/video.min.js"></script>



</head>
<body>
<div class="container">
 <div id="head">
     <div class="mod-header">
				欢迎到用户注册界面！

	</div>
 </div>
 
 <div class="btn-group-vertical" role="group" aria-label="...">
  	<form action="" id="addForm" name="addForm">
  	
  		<table class ="table">
  			<tr>
  				<td>用户名</td>
  				<td>
  				<input type="text" name="userName" id="userName"> 
  				</td>
  			</tr>
  			<tr>
  				<td>密码</td>
  				<td><input type="text" name="firstPassWord" id="firstPassWord"></td>
  			</tr>
  			<tr>
  				<td>确认密码</td>
  				<td><input type="text" name="seccondPassWord" id="seccondPassWord"></td>
  			</tr>
  			<tr>
  				<td>验证码</td>
  				<td></td>
  			</tr>
  			<tr>
  				<td colspan="2"><a onclick="registerUser()"  class="btn btn-primary right">注册</a></td>
  			</tr>
 
  		</table>
  		
	
	
	</form>
	
</div>


</div>


</body>
</html>