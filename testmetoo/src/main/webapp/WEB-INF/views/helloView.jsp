<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<ul>
	<li>message1=${message1}</li>
	<li>message2(커스텀태그)=<c:out value="${message2}"/></li>
	 
	<li><strong>${message3}</strong></li>
	</ul>
</body>
</html>