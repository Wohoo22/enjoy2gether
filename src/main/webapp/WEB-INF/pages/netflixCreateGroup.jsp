<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/topnav.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/styles/login.css">
<link rel="icon"
	href="https://www.clipartmax.com/png/middle/21-210980_green-letter-e-clip-art-green-letter-e-clipart.png">
<title>Enjoy2gether</title>
</head>
<body>

	<jsp:include page="topNav.jsp"></jsp:include>


	<div class="login-page">
		<div class="label">
			<h1>TẠO NHÓM ${service }.</h1>
		</div>
		<s:url var="createGroupUrl" value="/groups/netflix/create" />
		<div class="form">
			<div style="width: auto">
				<a style="padding: 15px; font-size: 16px;">TÊN NHÓM: ${groupName }</a>
			</div>
			<br>
			<form class="login-form" action="${createGroupUrl }" method="POST">
				<button type="submit">TẠO</button>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		document.getElementsByName("groupList")[0].style.backgroundColor = "#4caf50";
		document.getElementsByName("groupList")[0].style.color = "white";
	</script>
</body>
</html>