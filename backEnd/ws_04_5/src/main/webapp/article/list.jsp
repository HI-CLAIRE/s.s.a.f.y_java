<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ include file="./../include/header.jsp"  %>
	<div class="col-lg-8 mx-auto py-5">
		<h1>게시글 리스트</h1>
		<c:if test="${ !empty articles and fn:length(articles) > 0 }">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">게시글 번호</th>
			      <th scope="col">제목</th>
			      <th scope="col">글쓴이</th>
			      <th scope="col">작성일</th>
			      <th scope="col">조회수</th>
			      
			    </tr>
			  </thead>
			  <tbody>
			  <c:forEach items="${articles}" var="article">
			    <tr>
			      <td>${article.articleId }</td>
			      <td>${article.title }</td>
			      <td>${article.userSeq }</td>
			      <td>${article.regDate }</td>
			      <td>${article.viewCnt }</td>
			    </tr>
			    </c:forEach>
			  </tbody>
			</table>
		</c:if>
		<c:if test="${ empty articles or fn:length(articles) == 0 }">
			<div class="alert alert-primary" role="alert">
			  게시글이 없습니다.
			</div>
		</c:if>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>