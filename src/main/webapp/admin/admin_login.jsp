<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE HTML>
<html dir="ltr" lang="en-US">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<title>码蚁商城后台管理系统</title>
	
	<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/style.css" type="text/css" />

	</head>

	<body>
		<div id="container">

			<!--
			服务器跳转时，路径相对的是服务器WebContent
			浏览器请求跳转时， 路径相对的当前的jsp
			
			 在JSP  凡是有  action  src  href 都要去写绝对路径  加上工程名称的路径
		    -->
			<form action="${pageContext.request.contextPath }/Admin?method=loginAdmin" method="post">
				<div class="login">码蚁商城后台管理系统
				<span style="color:red">${msg}</span>
				</div>
				<div class="username-text">用户名:</div>
				<div class="password-text">密码:</div>
				<div class="username-field">
					<input type="text" name="username" value="" />
				</div>
				<div class="password-field">
					<input type="password" name="password" value="" />
				</div>
				<input type="checkbox" name="remember" id="remember" /><label for="remember">记住用户名</label>

				<input type="checkbox" name="free" value="free"><label for="remember">自动登录</label>
				<input type="submit" value="GO" />
			</form>
		</div>

	</body>
</html>
