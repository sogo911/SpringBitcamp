<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<link rel="stylesheet" href="${css}/common.css" />
</head>
<body>
<div id="wrapper">
<%@ include file="../common/header.jsp" %>
<%@ include file="../common/nav.jsp" %>
<section>
<article>
<h1>SK 텔레콤 메인</h1>
<button id="skt_make_btn">번호개통</button>
</article>
</section>
<aside></aside>

<%@ include file="../common/footer.jsp" %>
</div>
</body>
<script>
document.querySelector('#skt_make_btn').addEventListener("click",
		function(){
	alert('번호개통');
	location.href = "${ctx}/mobile.do?cmd=make_phone&dir=user&page=mypage";
},false);
</script>
</html>