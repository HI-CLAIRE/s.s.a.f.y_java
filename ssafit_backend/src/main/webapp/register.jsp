<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>리뷰등록</title>
  <link href="reviewlist.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous"> 
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
</head>
<body>
  <div id="header">
    <span id="icon1" class="material-symbols-outlined">
      potted_plant
    </span>
    <span>운동영상 리뷰작성</span>
    <span id="icon2" class="material-symbols-outlined">
        sick
    </span>
    <hr>
  </div>
  <div style="display: flex; justify-content: center;">
    <div class="form-floating mb-3" style="width: 95%;">
      <input type="text" class="form-control" id="floatingInput" placeholder="제목">
      <label for="floatingInput">제목</label>
    </div>
  </div>
  <div style="display: flex; justify-content: center;">
    <div class="form-floating"  style="width: 95%;">
      <input style="height: 200px; padding: 10px;"
      type="text" class="form-control" id="floatingPassword" placeholder="내용">
      <label for="floatingPassword">내용</label>
    </div>
  </div>
  
  <div style="padding-top: 20px; padding-left: 20px;"> 
    <button type="button" id="regist_bt" class="btn btn-outline-primary">등록</button>
    <button type="button" class="btn btn-outline-danger" id="cancel_bt">취소</button>
  </div>
  <script src="register.js">
  </script>
</body>
</html>