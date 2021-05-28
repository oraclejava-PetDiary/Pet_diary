<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="appUrl" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#jsonOut1').click(function() {
			$.ajax({
				type: 'POST',
				url: '${appUrl}/ajax/lifeMovie'
			})
			   .done(function(hello){
				 
				//alert(html);
				 //for(var i=0; i<hello.length; i++){
					 //var movie=hello[i];
					//alert(movie.title);
					//alert(hello.length);
				
				
			$('#lifeMovie').html(hello.length+"편의 영화가 있습니다.");
				
				  
		});
		});
	});
</script>
</head>
<body>
	<a href="#" id=jsonOut1>movie</a>
	<div id="lifeMovie"></div>
</body>
</html>