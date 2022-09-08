<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
<title>SSAFY 게시판</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">SSAFY 게시판</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Home</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Link</a>
	        </li>
	      </ul>
	      
	      <!-- me를 ms로 바꾸기 (정렬) (왼쪽을 알아서 정해라 -> 오른쪽 정렬)-->
	      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
	      
	      <c:if test="${empty loginUser }">
	      
	        <li class="nav-item">
	          <a class="nav-link active" href="${pageContext.request.contextPath }/user/signup.jsp">회원가입</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="${pageContext.request.contextPath }/user/login.jsp">로그인</a>
	        </li>
	        
	       </c:if>
	       <c:if test="${!empty loginUser }">
	      
	        <li class="nav-item">
	          <p class="nav-link" >${loginUser.userName }님 환영합니다.</p>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="${pageContext.request.contextPath }/UserServlet?action=logout">로그아웃</a>
	        </li>
	       </c:if>
	       
	      </ul>
	    </div>
	  </div>
	</nav>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>