<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"  %>
	<div class="col-lg-8 mx-auto py-5">
		<a href="${pageContext.request.contextPath }/article/write.jsp" class="btn btn-primary">게시글 등록</a>
		<a href="${pageContext.request.contextPath }/article?action=list" class="btn btn-primary">게시글 리스트</a>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>