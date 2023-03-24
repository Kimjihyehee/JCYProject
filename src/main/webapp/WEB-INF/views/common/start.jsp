<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<link rel="stylesheet" href="">
<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
</head>
<body> 

<div class="header-nav">네비바 영역</div>

<img src="" class="header-main-poster" alt="메인포스터">



<div class="main-section main-section">
	<div class="main-section-in">
	    <div class="video-algorithm-box-title">
	        <p class="title-p-1">어떤 활동을 할까?</p>
	        <p class="title-p-2">알고리즘 공유</p>
	        <span><button>영상 자세히 보러가기</button></span>
	    </div>
	    <div class="tab-box-tab" id="divTab">
	        <div class="tab-header hash-btn-box">
	            <span class="tab-btn-hash-btn-v1"><span>#</span><span>드라마예배</span></span>
	            <span class="tab-btn-hash-btn-v2"><span>#</span><span>나도 CCM스타</span></span>
	            <span class="tab-btn-hash-btn-v3"><span>#</span><span>설교말씀</span></span>
	            <span class="tab-btn-hash-btn-v4"><span>#</span><span>간증</span></span>
	        </div>
	        <div class="tab-container">
	            <div class="tab-content" id="tab-content-v1"></div>
	            <div class="tab-content" id="tab-content-v2"></div>
	        </div>
	    </div>
	    <div class="btn-box">
	        <span class="video-algorithm-btn" onclick="test()">더 많은 알고리즘 보기</span>
	        <span class="video-algorithm-btn1"><a href="https://wikidocs.net/162041" target="_blank">공유 알고리즘 활용방법</a></span>
	    </div>
	</div>
</div>

</body>
<script src="/resources/js/common/main_start.js"></script>
</html>