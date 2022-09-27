<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정페이지</title>
</head>
<body>
	<div class="container">
		<h2>핸드폰 수정</h2>
		<form method="POST" action="main">
			<input type="hidden" name="act" value="update" />
			<div class="mb-3">
				<label for="serialNum" class="form-label">시리얼넘버</label> 
				<input type="text" class="form-control" id="serialNum" name="serialNum" value="${phone.serialNum}">
			</div>
			<div class="mb-3">
				<label for="model" class="form-label">모델명</label> 
				<input type="text" class="form-control" id="model" name="model" value="${phone.model}">
			</div>
			<div class="mb-3">
				<label for="year" class="form-label">출시연도</label> 
				<input type="number" class="form-control" id="year" name="year" value="${phone.year}">
			</div>
			<div class="mb-3">
				<label for="price" class="form-label">가격</label> 
				<input type="number" class="form-control" id="price" name="price" value="${phone.price}">
			</div>
			<div class="mb-3">
				<label for="code" class="form-label">제조사</label>
				<input type=text class="form-control" id="code" name="code" value="${phone.code}">
			</div>
			<button class="btn btn-primary">수정</button>
		</form>
	</div>
</body>
</html>