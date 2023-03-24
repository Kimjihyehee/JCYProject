<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>

<h2>저자상품 목록</h2>
<!-- 세션 권한 줘서 관리자만 보여줄 수 있는 코드 - 권한 쪽 많이 쓰이는 형태임  -->
	<c:if test="${sessionScope.user!= null}">
		<button type="button" id="btnAdd">상품등록</button>
	</c:if>

	<table border="1" width="500px">
		<tr>
			<th>상품ID</th>
		    <th>&nbsp;</th>
		    <th>상품명</th>
		    <th>가격</th>
		</tr>
		<c:forEach var="row" items="${list}">
			<tr>
				<td>${row.product_code}</td>
				<td><img src="/images/${row.filename}" width="100px" height="100px"></td>
				<td><a href="/product/detail/${row.product_code}">${row.product_name}</a>
				<c:if test="${sessionScope.admin_userid != null}">
					<br>
					<a href="/product/edit/${row.product_code}">[편집]</a>
				</c:if></td>
				<td><fmt:formatNumber value="${row.price}" pattern="#,###" /></td>	
			</tr>
		</c:forEach>
	</table>
	



</body>
</html>