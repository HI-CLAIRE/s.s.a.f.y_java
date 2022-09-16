<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>리뷰 목록</title>
  <!-- <link rel="stylesheet" href="main.css" /> -->
  <link href="reviewlist.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
</head>

<body>
  <div id="header">
    <span id="icon1" class="material-symbols-outlined">
      potted_plant
    </span>
    <span>운동 영상 리뷰</span>
    <span id="icon2" class="material-symbols-outlined">
      sick
    </span>
    <hr>
  </div>


  <div id="container">
    <iframe id="tube" width="560" height="315" title="YouTube video player" frameborder="0"
      allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
      allowfullscreen></iframe>
  </div>
  <hr>

  <div id="mb-1">
    <div id="mb-2">
      <button type="button" class="btn btn-outline-primary" id="regist">글 작성</button>
    </div>
    <div id="mb-3" class="input-group mb-3">
      <input type="text" class="form-control" placeholder="제목, 내용으로 검색" aria-label="Recipient's username"
        aria-describedby="button-addon2">
      <button class="btn btn-outline-secondary" type="button" id="button-addon2">검색</button>
    </div>
    <hr>
  </div>

  <div id="settable">
    <table class="table">
      <thead>
        <tr>
          <th scope="col">번호</th>
          <th scope="col">제목</th>
          <th scope="col">조회수</th>
          <th scope="col">작성시간</th>
        </tr>
      </thead>
      <tbody id = "table">
    </table>
  </div>
  <script src="reviewlist.js">
  </script>
</body>

</html>