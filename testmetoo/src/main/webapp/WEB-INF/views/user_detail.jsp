<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 목록 수정</title>
</head>
<body>
	<form:form action="/springWeb/userUpdate" method="post"
		modelAttribute="user">
	<form:hidden path="id"/>
	<table border="1">
	<tr>
		<td>사용자이름</td>
		<td><form:input path="name"/> </td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><form:input path="email"/></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td> <form:input path="passwd"/> </td>
	</tr>
	</table>
	<input type="submit" name="update" value="수정"/>
	<input type="submit" name="delete" value="삭제"/>
	</form:form>
</body>
</html>