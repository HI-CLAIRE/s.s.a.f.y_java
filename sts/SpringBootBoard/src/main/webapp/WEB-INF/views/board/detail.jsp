<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<%@ include file="../common/bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>상세보기</h2>
		<hr>
		<div class="card">
			<div class="card-body">
				<h5 class="card-title">${board.vin }</h5>
				<div class="d-flex justify-content-between">
					<div class="card-subtitle mb-2 text-muted">${board.modelname }</div>
					<div class="card-subtitle mb-2 text-muted">${board.yearOfManufacture }</div>
					<div class="card-subtitle mb-2 text-muted">${board.price }</div>
					<div class="card-subtitle mb-2 text-muted">${board.milage }</div>
					<div class="card-subtitle mb-2 text-muted">${board.manufacturer }</div>
					<div class="card-subtitle mb-2 text-muted">${board.viewCnt }</div>
				</div>
				<div>
					<a href="updateform?id=${board.vin }" class="btn btn-success">수정</a>
					<a href="delete?id=${board.vin }" class="btn btn-info">삭제</a>
					<a href="list" class="btn btn-warning">목록</a>
				</div>
			
			</div>
		</div>
	</div>
</body>
</html>