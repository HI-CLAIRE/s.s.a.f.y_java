<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<%@ include file="../common/bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>자동차 게시판</h2>
		<hr>
		<div>
			<table class="table text-center">
				<tr>
					<th>차대번호</th>
					<th>모델명</th>
					<th>출시연도</th>
					<th>조회수</th>
					<th>제조사</th>
				</tr>
				<c:forEach items="${list }" var="board">
					<tr>
						<td>${board.id }</td>				
						<td>
							<a href="detail?id=${board.id }">${board.title }</a>
						</td>				
						<td>${board.writer }</td>				
						<td>${board.viewCnt }</td>				
						<td>${board.regDate }</td>				
					</tr>
				</c:forEach>
			</table>
			
			<div class="d-flex justify-content-end">
				<a class="btn btn-outline-danger" href="writeform">중고차 등록</a>
			</div>
		</div>
	</div>
</body>
</html>