<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>所有DVD信息</h1>
		<table border="2" cellpadding="10" cellspacing="0">
			<tr>
				<td>序号</td>
				<td>牒名</td>
				<td>被借次数</td>
				<td>借出时间</td>
				<td>状态</td>
				<td>借</td>
				<td>还</td>
			</tr>
			<c:forEach items="${requestScope.dvds}" var="dvd">
				<tr>
					<td>${dvd.id}</td>
					<td>${dvd.name}</td>
					<td>${dvd.lendCount}</td>
					<td>
						<f:formatDate value="${dvd.lendDate}" pattern="yyyy-MM-dd HH:mm"/>
					</td>
					<td>${dvd.status}</td>
					<td>
						<c:if test="${dvd.status.equals('available')}">
							<a href="${pageContext.request.contextPath}/DVD/lend?id=${dvd.id}">借</a>
						</c:if>
					</td>
					<td>
						<c:if test="${dvd.status.equals('unavailable')}">
							<a href="${pageContext.request.contextPath}/DVD/return?id=${dvd.id}">还</a>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>