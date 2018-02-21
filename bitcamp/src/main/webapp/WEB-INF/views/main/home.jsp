<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src="${js}/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>
<button id="btn" >
로그인
</button>
</body>
<script>
$('#btn').on('click',function(){
	alert('제이쿼리가 작동한다 || ');
});
</script>
</html>
