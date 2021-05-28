<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>트윈스 선수 수정</title>
<link rel="stylesheet" href="/springWeb/resources/css/twins.css"/>
</head>
<body>
	<form:form action="/springWeb/edit" method="post" modelAttribute="twins">
		 
		<form:hidden path="id"/> 
		 
		
	 <p>
			<form:label path="name" cssErrorClass="error-label">선수이름:</form:label>
			<form:input path="name" cssErrorClass="error-input"/>
			<form:errors path="name" cssClass="error-messages"/></p>
	 <p>	 
		    <form:label path="salary" cssErrorClass="error-label"> 선수연봉(단위 만원):</form:label>
		    <form:input path="salary" cssErrorClass="error-input"/>
		    <form:errors path="salary" cssClass="error-messages"/></p>
		   
		<input type="submit" value="수정">
		 
	</form:form>
</body>
</html>