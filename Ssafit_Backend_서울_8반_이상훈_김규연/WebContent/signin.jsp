<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입</title>
  <link href="reviewlist.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous"> 
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
</head>
<body style="display: flex; justify-content: center;">
  <div class="shadow" style="padding: 30px; width: 40%; margin-top: 2%;">
    <h1 style="text-align: center;">회원가입</h1>
    <br>
  <div style="display: flex; flex-direction: column; align-items: center; ">
  <form action="${pageContext.request.contextPath }/main" method="post">
  <div style="width: 60%;" class="input-group mb-3">
    <span class="input-group-text" id="basic-addon1">아이디</span>
    <input type="text" class="form-control" placeholder="id" id="inputid" aria-label="Username" aria-describedby="basic-addon1" name="userId">
  </div>
  <div style="width: 60%;" class="input-group mb-3">
    <span class="input-group-text" id="basic-addon2">이  름</span>
    <input type="text" class="form-control" placeholder="name" id="inputname" aria-label="Username" aria-describedby="basic-addon1" name="userName">
  </div>
  <div style="width: 60%;" class="input-group mb-3">
    <span class="input-group-text" id="basic-addon3">이메일</span>
    <input type="text" class="form-control" placeholder="email" id="inputemail" aria-label="Username" aria-describedby="basic-addon1" name="email">
  </div>
  <div style="width: 60%;" class="input-group mb-3">
    <span class="input-group-text" id="basic-addon4">비밀번호</span>
    <input type="text" class="form-control" placeholder="password" id="inputpassword" aria-label="Username" aria-describedby="basic-addon1" name="userPassword">
  </div>
  <div>
    <button style="text-align: center;" type="submit" class="btn btn-primary" name="action" value="signIn">회원가입</button>
    <button style="text-align: center;" type="submit" class="btn btn-secondary" name="action" value="main">돌아가기</button>
  </div>
  </form>
</div>
</div>
<script src="signin.js"></script>
</body>
</html>