<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
<%@ include file="../common/bootstrap.jsp" %>
</head>
<body>
	<div class="container">
		<h2>자동차 등록</h2>
		<form action="write" method="POST">
			<div class="mb-3">
				<label for="vin" class="form-label">차대번호</label>
				<input type="text" class="form-control" id="vin" name="vin">
			</div>
			<div class="mb-3">
				<label for="modelname" class="form-label">모델명</label>
				<input type="text" class="form-control" id="modelname" name="modelname">
			</div>
			<div class="mb-3">
				<label for="yearOfManufacture" class="form-label">출시연도</label>
				<input type="text" class="form-control" id="yearOfManufacture" name="yearOfManufacture">
			</div>
			<div class="mb-3">
				<label for="mileage" class="form-label">주행거리</label>
				<input type="text" class="form-control" id="mileage" name="mileage">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label">가격</label>
				<input type="text" class="form-control" id="price" name="price">
			</div>
			<div class="mb-3">
				<label for="manufacturer" class="form-label">제조사</label>
				<select name="manufacturer" class="form-label">
					<option value="hyundai">현대자동차</option>
					<option value="kia">기아자동차</option>
					<option value="what">쉐보레</option>
					<option value="ford">포드</option>
				</select>
			</div>
			<button class="btn btn-primary">등록</button>
		</form>
	</div>
</body>
</html>