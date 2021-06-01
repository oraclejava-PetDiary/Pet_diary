<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>사용자 목록</h1>
	</div>
	 
	<table border="1">
		<tr>
			<th>user_id</th>
			<th>user_name</th>
			<th>email</th>
			<th>passwd</th>
			<th>birthday</th>
			<th>marriage</th>
			
		</tr>
		<c:forEach var="t" items="${users}" varStatus="loop">
			<tr>
				<td>${t.id}</td>
				<th><a href="/springWeb/userDetail?id=${t.id}">${t.name}</a></th>
				<th>${t.email}</th>
				<th>${t.passwd}</th>
				<th>${t.birthday}</th>
				<th>${t.marriage}</th>
				
			</tr>
		</c:forEach>

	</table>



</body>
</html>