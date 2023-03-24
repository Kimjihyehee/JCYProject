<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>signup</title>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>


<!--  영역    name =" "이 파라미터로써, dto에 정보를 전달하는 것임. 따라서 dto와 name속성값이 같아야 -->  
<form action ="/user/signup" method="post" name ="">
	<div> 아이디  : <input type="text" id="" name="id"> </div>
	<div> 이메일 : <input type="email" id="" name="email"> </div>
	<div> 이름  : <input type="text" id="" name="name"> </div>
	<div> 비번  : <input type="password" id="" name="password"> </div>
	<div> 전화번호  : <input type="text" id="" name="phone_num"> </div>
	<div> 주소  : <input type="text" id="" name="address"> </div>

	<button type="submit">회원가입</button>
</form>