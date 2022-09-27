<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>핸드폰 목록</title>
</head>
<body>
	<div class="container">
		<h2>핸드폰 게시판</h2>
		<table class="table text-center">
			<tr>
				<th>시리얼넘버</th>
				<th>모델명</th>
				<th>출시연도</th>
				<th>조회수</th>
				<th>제조사</th>
			</tr>
			<c:forEach items="${phones }" var="phone">
				<tr>
					<td>${phones.serialNum }</td>
					<td>${phones.model }</td>
					<td>${phones.year }</td>
					<td>${phones.viewCount }</td>
					<td>${phones.code }</td>
				</tr>
			</c:forEach>
		</table>
		<a class="btn btn-outline-danger" href=regist.jsp>핸드폰 등록</a>	
	</div>
</body>
</html>