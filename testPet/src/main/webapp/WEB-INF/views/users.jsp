<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users List</title>
</head>
<body>
	<div>
		<table border="1">
		<tr>
			<th>사용자 id</th>
			<th>사용자 이름</th>
			<th>이메일</th>
			<th>비밀번호</th>
		</tr>
		<c:forEach var="t" items="${users}">
		<tr>
			<td>${t.id}</td>
			<td><a href="/springWeb/userDetail?id=${t.id}">${t.name}</a></td>
			<td>${t.email}</td>
			<td>${t.password}</td>
		</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>