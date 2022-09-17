<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>리뷰상세</title>
  <link href="reviewlist.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous"> 
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
</head>
<body>
  <div id="header">
    <span id="icon1" class="material-symbols-outlined">
      potted_plant
    </span>
    <span>운동영상 상세</span>
    <span id="icon2" class="material-symbols-outlined">
        sick
    </span>
    <hr>
  </div>
  
  <article >
<p>&nbsp;&nbsp;&nbsp;${review.title}</p>
    <span>&nbsp;&nbsp;&nbsp;작성일 : ${review.timeStamp}</span>
    <br>
    <span>&nbsp;&nbsp;&nbsp;조회수 : ${review.viewCnt}</span>
    <hr>
    <p>&nbsp;&nbsp;&nbsp;${review.content}</p>
    <hr>
  </article>
  
  <div style="padding-top: 20px; padding-left: 3px;"> 
  <form action="${pageContext.request.contextPath}/main" method="post">
  	<input type="hidden" name="articleNum" value="${review.articleNum}">
    <button type="submit" class="btn btn-outline-primary" name="action" value="fix">글수정</button>
    <button type="submit" class="btn btn-outline-danger" name="action" value="delete">글삭제</button>
    <button type="submit" class="btn btn-outline-success" name="action" value="reviewlist">목록</button>
  </form>
  </div>  
</body>
</html>