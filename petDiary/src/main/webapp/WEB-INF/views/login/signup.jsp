<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입입니다. </h1>
<form:form modelAttribute = "users">
	<dl>
		<dt>사용자 이름</dt>
		<dd>
			<form:input path="name" />
		</dd>
		<dt>이메일</dt>
		<dd>
			<form:input path="email" />
		</dd>
		<dt>비밀번호</dt>
		<dd>
			<form:input path="password" />
		</dd>
		<dt>생일</dt>
		<dd>
			<form:input path="birthday" />
		</dd>
		<dt>나이</dt>
		<dd>
			<form:input path="age" />
		</dd>
		<dt>결혼 여부</dt>
		<dd>
			<form:radiobuttons path="marriage"  items="${radioMarriage}"/>
		</dd>
	</dl>
	<input type= "submit" value="회원가입" />
</form:form>
</body>
</html>