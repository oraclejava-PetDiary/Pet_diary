<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 완료</h1>

<p>이름: ${name}</p> 
<p>이메일: ${email}</p>
<p>나이: ${age}</p>
<p>성별: ${gender}</p>
${gender==true?'남성':'여성'}


</body>
</html>