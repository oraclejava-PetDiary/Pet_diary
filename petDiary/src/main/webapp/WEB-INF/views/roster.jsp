<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/springWeb/resources/css/twins.css">
</head>
<body>
	<div style="text-align:right">
		<a href="/springWeb/logout">로그아웃</a>
	</div>
	<div>
		<h1>서울의 자존심! LG Twins Go for V3!</h1>
		<p>현재 선수: ${myung}명</p>
		<a href="/springWeb/create">추가하기</a>
	</div>
	
	<c:if test="${not empty success}">
	<div class="error_message success_message">
		<ul>
			<li>${success}</li>
		</ul>
	</div>
	</c:if>
	
	<c:if test="${not empty fail}">
	<div class="error_message fail_message">
		<ul>
			<li>${fail}</li>
		</ul>
	</div>
	</c:if>
	
	
	
	<table border="1">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>salary</th>
	</tr>
	<c:forEach var="t" items="${twins}" varStatus="loop">

	<tr>
		<td>${t.SUNSU_ID}</td>
		<td><a href="/springWeb/edit?id=${t.SUNSU_ID}">${t.SUNSU}</a></td>
		<td>${t.SALARY}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>





