<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<div class="container">
		<h2>로그인페이지</h2>
		<hr>
		<form action="main" method="POST">
			<input type="hidden" name="act" value="login">
			<div class="mb-3">
				<label for="id" class="form-label">아이디</label> 
				<input type="text" class="form-control" id="id" ____________>
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">비밀번호</label> 
				<input type="password" class="form-control" id="password" ____________>
			</div>
			<div class="d-flex justify-content-center">
				<button class="btn btn-outline-success">로그인</button>
				<a class="btn btn-outline-danger" href=____________>홈으로</a>
			</div>
		</form>
	</div>
</body>
</html>