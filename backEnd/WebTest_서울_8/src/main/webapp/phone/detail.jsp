<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
	<div class="container">
		<h2>상세보기</h2>
		<hr />
		<div class="card" style="width: 30rem;">
			<div class="card-header">시리얼넘버 : ${phone.serialNum }</div>
			<ul class="list-group list-group-flush">
				<li class="list-group-item">모델명 : ${phone.name }</li>
				<li class="list-group-item">출시연도 : ${phone.year }</li>
				<li class="list-group-item">가격 : ${phone.price }</li>
				<li class="list-group-item">제조사 : ${phone.code }</li>
				<li class="list-group-item">조회수 : ${phone.viewCount }</li>
			</ul>
			<div class="d-flex justify-content-end">
				<!-- 수정 / 삭제 / 목록 버튼 기능  -->
			</div>
		</div>

	</div>

</body>
</html>