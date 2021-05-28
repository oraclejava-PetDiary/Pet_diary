<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/springWeb/bmi2.do" method="post">
		키 <input type="text" name="tall" id="tall"> m <br/>
		몸무게 <input type="text" name="weight" id="weight"> kg <br/>
		<input type="submit" value="전송">
	</form>
</body>
</html>