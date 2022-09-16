<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>로그인</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body style="display: flex; flex-flow: column; align-items: center;">
  <div class="shadow" style="padding: 30px; margin-top: 2%;">
    <h1>로그인</h1>
    <form>
      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">아이디</label>
        <input type="id" class="form-control" id="exampleInputId1">
      </div>
      <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">비밀번호</label>
        <input type="password" class="form-control" id="exampleInputPassword1">
      </div>
      
      <button type="submit" class="btn btn-primary" id="loginbt">로그인</button>
      <button type="button" class="btn btn-secondary" id="backbt">돌아가기</button>
    </form>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</script>
<script src="login.js"></script>
</body>
</html>

