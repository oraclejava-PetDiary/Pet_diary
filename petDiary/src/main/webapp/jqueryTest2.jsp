<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자기소개</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<script type="text/javascript">
	$(document).ready(function(){
		//JSON(Javascript Object Notation)
		var man = {
			name : "김규리",
			loc : "한국",
			hobby : "게임",
			spe : "컴퓨터"
		};
		
		var names = ["아이언맨", "블랙 위도우", "캡틴 마블","토르"];
		/*alert(names[0]);
		alert(names[1]);
		alert(names[2]); */
	
		for (var i=0; i<names.length; i++) {
			alert(names[i]);
		}
		
	//	alert (" 이름 : " + man.name + "\n 사는 곳 : " + man.loc + " \n 취미는 : " + man.hobby + "\n 특기는 : " + man.spe);
	// alert(JSON.stringlify(man));
		
		
	});
</script>
</body>
</html>