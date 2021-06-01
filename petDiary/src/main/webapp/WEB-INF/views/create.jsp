<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
		prefix="form" %>    
<c:set var="appUrl" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>트윈스 선수 추가</title>
<script src="/springWeb/webjars/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="/springWeb/resources/css/twins.css"/>
<script type="text/javascript">
$(document).ready(function () {
	//아이디 중복 점검
	$("#id").on('focusout', function() {
		var chkId = $(this).val();
		if(chkId != "") {
			//$("#chk_id").css("color", "red");
			//$("#chk_id").html("현재 사용중인 아이디입니다.");
			$.ajax({
				type: 'POST',
				url: '${appUrl}/id_check',
				data: {id:chkId}
			})
		.done(function(html) {
		if (html.id != undefined){
			$("#chk_id").css("color", "red");
			$("#chk_id").html("현재 사용중인 아이디입니다.");
		}else{
			$("#chk_id").css("color", "");
			$("#chk_id").html("");
			}
				});
			}
	});
});
</script>
</head>
<body>
	<form:form action="/springWeb/create" method="post"
		modelAttribute="twins">
		<p>
			<form:label path="id" cssErrorClass="error-label">선수id:</form:label>
			<form:input path="id" cssErrorClass="error-input"/>
			<span id="chk_id"></span>
			<form:errors path="id" cssClass="error-messages"/> </p>
		<p>
			<form:label path="name" cssErrorClass="error-label">선수이름:</form:label> 
			<form:input path="name" cssErrorClass="error-input"/> 
			<form:errors path="name" cssClass="error-messages"/> </p>
		<p>
			<form:label path="salary" cssErrorClass="error-label"> 선수연봉(단위 만원): </form:label>
			<form:input path="salary" cssErrorClass="error-input"/>
			<form:errors path="salary" cssClass="error-messages"/> </p>
		<input type="submit" value="추가">
	</form:form>
</body>
</html>