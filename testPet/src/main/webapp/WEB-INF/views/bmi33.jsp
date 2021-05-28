<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" 
	prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form 
		action="/springWeb/bmi2.do"
		method="post"
		modelAttribute="bmiForm">
		키:
		<form:input path="tall"/> <br/>
		몸무게:
		<form:input path="weight"/> <br/>
		<input type="submit" value="전송">
	</form:form>
</body>
</html>






