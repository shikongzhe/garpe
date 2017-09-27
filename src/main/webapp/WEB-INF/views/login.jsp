<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="common/top.jsp"/>
<script src="/resources/scripts/web/user/login.js"></script>
<link href="//vjs.zencdn.net/5.19/video-js.min.css" rel="stylesheet">
<script src="/resources/scripts/common/video/video.min.js"></script>

</head>
<body>
<div class="container">
  <!-- Content here -->
	
	<form action="" id="addForm" name="addForm">
		<input type="text" name="userName" id="userName"> 
		
		<input type="text" name="passWord" id="passWord"> 
	
		<a onclick="registerUser()">注册</a>
		
		
	
	</form>
	
	<video  id="my-player"  class="video-js" controls preload="auto"  width="640" height="600"  data-setup='{}'>
  <source src="/resources/videos/test.mp4" type="video/mp4"></source>
  
</video>
 欢迎到登陆界面来

</div>


</body>
</html>