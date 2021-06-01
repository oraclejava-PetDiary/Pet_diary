<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#name").click(function(){
			//alert("김규리");
			$("#result").css("color","purple");
			$("#result").html("김규리");
		});
		$("#loc").click(function(){
			//alert("한국");
			$("#result").css("color","red");
			$("#result").html("한국");
		});
		$("#hob").click(function(){
			//alert("게임");
			$("#result").css("color","pink");
			$("#result").html("게임");
		});
		$("#spe").click(function(){
			//alert("컴퓨터");
			$("#result").css("color","green");
			$("#result").html("컴퓨터");
		});
	});
</script>
</head>
<body>
<a href="#" id="name">이름</a> 
<a href="#" id="loc">사는 곳</a>
<a href="#" id="hob">취미</a>
<a href="#" id="spe">특기</a> <br>
<span id="result"></span>
</body>
</html>