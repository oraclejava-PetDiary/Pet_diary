<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#name').click(function() {
			//alert("홍선영");
			$("#result").css("color", "red");
			$("#result").html("홍선영");
		});
		$('#addr').click(function() {
			//alert("지구");
			$("#result").css("color", "blue");
			$("#result").html("지구");
		});
		$('#hobby').click(function() {
			//alert("세계여행");
			$("#result").css("color", "pink");
			$("#result").html("세계여행");
		});
		$('#skill').click(function() {
			//alert("순간이동");
			$("#result").css("color", "green");
			$("#result").html("순간이동");
		});
	});
</script>
</head>
<body>
	<a href="#" id="name">이름!</a>
	<a href="#" id="addr">사는곳!</a>
	<a href="#" id="hobby">취미!</a>
	<a href="#" id="skill">특기!</a>
	<br>
	<span id="result"></span>

</body>
</html>