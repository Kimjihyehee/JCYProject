<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품저자 등록페이지</title>
</head>
<body>

<h2>상품(책) 등록</h2>
<form name="form1" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>상품명</td>
			<td><input name="product_name"></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><input name="price"></td>
		</tr>
		<tr>
			<td>상품설명</td>
			<td><textarea rows="5" cols="60" name="description"></textarea></td>
		</tr>
		<tr>
			<td>상품이미지</td>
			<td><input type="file" name="image"></td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="등록" onclick="product_write()">
				<input type="button" value="목록" onclick="location.href='/list'">
			</td>
		</tr>
	</table>
</form>
<script>
// 상품등록 버튼 클릭시, 호출되는 함수 
function product_write(){
	let product_name = document.form1.product_name.value;
	let price = document.form1.price.value;
	let description = document.form1.description.value;
	
	

	if(product_name == "" || product_name === undefined){
	    alert("상품명을 입력하세요."); 
	    document.form1.product_name.focus(); 
	    return; // 리턴처리해야 서브밋을 차단
	    }
	 if(price == ""){
	    alert("가격을 입력하세요."); 
	    document.form1.price.focus(); 
	    return; 
	    }
	 if(description == ""){ 
	    alert("상품설명을 입력하세요."); 
	    document.form1.description.focus(); 
	    return;
	 }
	
	document.form1.action = "/product/insert";
	document.form1.submit();
	alert("상품목록에 추가되었습니다.");
}




</script>
<!-- 


 -->
</body>
</html>