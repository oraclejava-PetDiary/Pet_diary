<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/springWeb/manInfo2.do" method="post"
		enctype="multipart/form-data">
		이름: <input type="text" name="name" id="name"><br/>
		메일: <input type="text" name="mail" id="mail"><br/>
		나이: <input type="text" name="age" id="age"><br/>
		성별: <input type="text" name="gender" id="gender"><br/>
		사진: <input type="file" name="photo" id="photo"><br/>
		<input type="submit" value="전송">
	</form>
</body>
</html>