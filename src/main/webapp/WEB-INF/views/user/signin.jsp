<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>signin</title>
	<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
</head>
<body>
<!-- name속성값은 해당 dto의 파라미터명과 동일해야 함. -->
<form method="post" action="login" >
	<div>아이디 : <input type="text" name="id" placeholder="ID" autocomplete="off"> </div>
	<div>비밀번호 : <input type="password" name="password" autocomplete="off"></div>
	<button type="submit">로그인</button>

</form>
	
</body>
</html>