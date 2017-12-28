<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="${pageContext.request.contextPath}/DVD/addDVD2" method="post">
			牒名：<input type="text" name="name">
			<br/>
			<input type="submit" value="添加">
		</form>
	</center>
</body>
</html>