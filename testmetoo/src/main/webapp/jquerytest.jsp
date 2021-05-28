<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
<style>

</style>
</head>
<body>

<script>

$(document).ready(function(){//json(javascript object notation)
var man ={
		name: "홍선영",
		addr: "서울",
		hobby:"운동",
		skill:"arrow,fire,gun,jump"
};

var names=["아이언맨","블랙 위도우","캡틴 마블"];
	/*alert(names[0]);
	alert(names[1]);
	alert(names[2]);*/
	
	for(var i=0;i<names.length;i++){
		alert(names[i]);
	}

	/*alert("이름:"+man.name+"\n위치:"+man.addr+"\n취미:"+man.hobby+"\n특기:"+man.skill);*/
	//alert(JSON.stringify(man));//문자열로 전달
});

</script>

</body>
</html>