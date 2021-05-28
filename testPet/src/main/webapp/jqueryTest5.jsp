<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="appUrl" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#jsonOut1").click(function(){
			$.ajax({
				type: 'POST' ,
				url: '${appUrl}/ajax/lifeMovie'
			})
			.done(function(html){
				$("#lifeMovie").html(html.length + "편의 영화가 있습니다.<br>");
				$("#lifeMovie").empty();
				for (var i=0; i<html.length; i++){
					var movie = html[i];
					$("#lifeMovie").append(movie.title + "<br>");
				}
			
			});
		});
	});
</script>
</head>
<body>
<a href="#" id="jsonOut1">movie</a>
<div id="LifeMovie"></div>
</body>
</html>