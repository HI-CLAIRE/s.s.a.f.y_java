<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="ko">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>SSAFIT</title>

  <link href="main.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.	min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>

<body>

  <header class="p-3 text-bg-dark">
    <div class="container">
      <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
        <a href="/" class="d-flex align-items-center mb-2 mb-lg-1 text-white text-decoration-none">
        </a>
          <a href="#" class="nav-link px-2 text-secondary" id="head_SSAFYUSERS">SSAFIT</a>

        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
          <li><a href="#" class="nav-link px-2 text-white">Home</a></li>
          <li><a href="#" class="nav-link px-2 text-white">헬스장 찾기</a></li>
        </ul>

        <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
          <input type="search" class="form-control form-control-dark text-bg-dark" placeholder="영상검색" aria-label="Search">
        </form>

        <div class="text-end">
          <button type="button" class="btn btn-outline-light me-2" onclick="location.href='login.jsp'">로그인</button>
          <button type="button" class="btn btn-warning" onclick="location.href='signin.jsp'">회원가입</button>
        </div>
      </div>
    </div>
    <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="헬스장사진1.jpg" class="d-block w-100 h-100" alt="...">
        </div>
        <div class="carousel-item">
          <img src="헬스장사진2.jpg" class="d-block w-100 h-100" alt="...">
        </div>
        <div class="carousel-item">
          <img src="헬스장사진3.jpg" class="d-block w-100 h-100" alt="...">
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
  </header>

  <main>
    <button class="prev" ><svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" fill="currentColor" class="bi bi-chevron-bar-left" viewBox="0 0 16 16">
      <path fill-rule="evenodd" d="M11.854 3.646a.5.5 0 0 1 0 .708L8.207 8l3.647 3.646a.5.5 0 0 1-.708.708l-4-4a.5.5 0 0 1 0-.708l4-4a.5.5 0 0 1 .708 0zM4.5 1a.5.5 0 0 0-.5.5v13a.5.5 0 0 0 1 0v-13a.5.5 0 0 0-.5-.5z"/>
    </svg></button>
    <article>
      <br>
      <h5>최근 가장 많이 본 영상</h5>
      <form action="${ pageContext.request.contextPath }/main" method="post">
      <input type="submit" name="" >
      </form>
      <section>
          <div id="slides">
            <div class="card" style="width: 380px; height: 430px; margin: 30px 10px;">
            <a href="${pageContext.request.contextPath}/main?action=reviewlist&videoId=${mostView[0].id}&videoUrl=${mostView[0].url}">
              <img src="https://img.youtube.com/vi/${mostView[0].id}/0.jpg" class="card-img-top" alt="..." id="img1">
              <div class="card-body">
            <h5 class="card-title" >${mostView[0].title}</h5>
            <p class="card-text" >${mostView[0].channelName}</p>
            <p class="card-text" >조회수 ${mostView[0].viewCnt}회</p>
              </div>
            </a>
            </div>
            <div class="card" style="width: 380px; height: 430px; margin: 30px 10px;">
            <a href="${pageContext.request.contextPath}/main?action=reviewlist&videoId=${mostView[1].id}&videoUrl=${mostView[1].url}">
              <img src="https://img.youtube.com/vi/${mostView[1].id}/0.jpg" class="card-img-top" alt="..."  id="img2">
              <div class="card-body">
            <h5 class="card-title" >${mostView[1].title}</h5>
            <p class="card-text" >${mostView[1].channelName}</p>
            <p class="card-text" >조회수 ${mostView[1].viewCnt}회</p>
              </div>
              </a>
            </div>
            <div class="card" style="width: 380px; height: 430px; margin:30px 10px;">
            <a href="${pageContext.request.contextPath}/main?action=reviewlist&videoId=${mostView[2].id}&videoUrl=${mostView[2].url}">
              <img src="https://img.youtube.com/vi/${mostView[2].id}/0.jpg" class="card-img-top" alt="..." id="img3">
              <div class="card-body">
            <h5 class="card-title" >${mostView[2].title}</h5>
            <p class="card-text" >${mostView[2].channelName}</p>
            <p class="card-text" >조회수 ${mostView[2].viewCnt}회</p>
              </div>
              </a>
            </div>
            <div class="card" style="width: 380px; height: 430px; margin: 30px 10px ;">
            <a href="${pageContext.request.contextPath}/main?action=reviewlist&videoId=${mostView[3].id}&videoUrl=${mostView[3].url}">
              <img src="https://img.youtube.com/vi/${mostView[3].id}/0.jpg" class="card-img-top" alt="..."  id="img4">
              <div class="card-body">
            <h5 class="card-title" >${mostView[3].title}</h5>
            <p class="card-text" >${mostView[3].channelName}</p>
            <p class="card-text" >조회수 ${mostView[3].viewCnt}회</p>
              </div>
              </a>
            </div>
          </div>
       
      </section>
      <br>
      <h5>운동 부위 선택</h5>
      <form action="${ pageContext.request.contextPath }/main" method="post">
      <div>
        <button type="submit" class="btn btn-primary" name = "action" value="전신">전신</button>
        <button type="submit" class="btn btn-primary" name = "action" value="상체">상체</button>
        <button type="submit" class="btn btn-primary" name = "action" value="하체">하체</button>
        <button type="submit" class="btn btn-primary" name = "action" value="복부">복부</button>
      </div>
      </form>
      <section>
		<c:forEach items="${videos}" var="video"> 
        <div class="card" style="width: 380px; height: 430px; margin:30px 10px;">
        <a href="${pageContext.request.contextPath}/main?action=reviewlist&videoId=${video.id}&videoUrl=${video.url}">
          <img src= "https://img.youtube.com/vi/${video.id}/0.jpg"  class="card-img-top" alt="..." id="img5">
          <div class="card-body">
            <h5 class="card-title" >${video.title}</h5>
            <p class="card-text" >${video.channelName}</p>
            <p class="card-text" >조회수 ${video.viewCnt}회</p>
          </div>
        </a>
        </div>	
		</c:forEach>
      </section>
    </article>
    <button class="next"><svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" fill="currentColor" class="bi bi-chevron-bar-right" viewBox="0 0 16 16">
      <path fill-rule="evenodd" d="M4.146 3.646a.5.5 0 0 0 0 .708L7.793 8l-3.647 3.646a.5.5 0 0 0 .708.708l4-4a.5.5 0 0 0 0-.708l-4-4a.5.5 0 0 0-.708 0zM11.5 1a.5.5 0 0 1 .5.5v13a.5.5 0 0 1-1 0v-13a.5.5 0 0 1 .5-.5z"/>
    </svg></button>
  </main>
    

  <footer class="py-3 my-4">
      <ul class="nav justify-content-center border-bottom pb-3 mb-3">
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">개인정보 처리방침</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">이용약관</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">오시는 길</a></li>
        <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">About_SSAFIT</a></li>
      </ul>
      <p class="text-center text-muted">© 2022 SSAFIT</p>
    </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

  <script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.19.0/axios.min.js"></script>
  <script src="main.js"> 
  </script>
</body>

</html>