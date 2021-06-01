<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="/springWeb/webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<script src="/springWeb/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>LOGIN</title>
</head>
<body class="text-center">
	<h1>Login</h1>
	<form:form modelAttribute="users">
	<label>사용자 아이디</label>
	<form:input path="name" /> <br/><br/>
	
	<label>비밀번호</label>
	<form:password path="password"/><br/><br/>
	
	<button class="btn btn-primary" type="submit">로그인</button>
	</form:form>
로그인 화면입니다.
</body>
</html>