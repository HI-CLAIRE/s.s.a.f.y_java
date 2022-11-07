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
		<img alt="" src="/test.png">
		<h2>자동차 게시판</h2>
		<hr>
		<div>
			<table class="table text-center">
				<thead>
					<tr>	
						<th>차대번호</th>
						<th>모델명</th>
						<th>출시연도</th>
						<th>조회수</th>
						<th>제조사</th>
					</tr>
				</thead>
				<tbody id="boardTbody">
				
				</tbody>
				
			</table>
			
			<div class="d-flex justify-content-end">
				<a class="btn btn-outline-primary" href="writeform">글 등록</a>
			</div>
		</div>
	</div>
	<script>
		const xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			//서버에 요청한 데이터 처리가 완료 (에러든 정상디든)
			if(xhr.readyState == 4){
				if(xhr.status == 200){
					console.log(xhr.response) //데이터
					
					const list = JSON.parse(xhr.response)
					let html = "";
					
					for(let board of list){
						html += `
							<tr>
								<td>\${board.vin }</td>				
								<td>\${board.modelname }</td>				
								<td>\${board.yearOfManufavture }</td>				
								<td>\${board.viewCnt }</td>				
								<td>\${board.manufavturer }</td>				
							</tr>
						`
					}
					
					document.getElementById("boardTbody").innerHTML = html;
				}
			}
		}
		
		
		
		xhr.open("GET", "/api/board"); //어떤 페이지에 어떤 방식으로 처리를 할지 쓴다.
		xhr.send(); //데이터 요청을 진행
	
	
	</script>
</body>
</html>