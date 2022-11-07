<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글수정</title>
<%@ include file="../common/bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>자동차 수정</h2>
		<form action="update" method="POST">			
			<div>
				<label for="vin" class="form-label">차대번호</label>
				<input type="text"  class="form-control" id="vin" name="vin" readonly value="${board.vin }">
			</div>
			<div>
				<label for="modelname" class="form-label">모델명</label>
				<input type="text"  class="form-control" id="modelname" name="modelname" readonly value="${board.modelname }">
			</div>
			<div>
				<label for="yearOfManufacture" class="form-label">출시연도</label>
				<input type="text"  class="form-control" id="yearOfManufacture" name="yearOfManufacture" readonly value="${board.yearOfManufacture }">
			</div>
			<div>
				<label for="mileage" class="form-label">주행거리</label>
				<textarea rows="10"  class="form-control" id="mileage" name="mileage" readonly value="${board.mileage }"></textarea>
			</div>
			<div>
				<label for="price" class="form-label">가격</label>
				<textarea rows="10"  class="form-control" id="price" name="price">${board.price }</textarea>
			</div>
			<div>
				<label for="manufacturer" class="form-label">제조사</label>
				<textarea rows="10"  class="form-control" id="manufacturer" name="manufacturer" readonly value="${board.manufacturer }"></textarea>
			</div>
			<button class="btn btn-primary">수정</button>
		</form>
	</div>
</body>
</html>