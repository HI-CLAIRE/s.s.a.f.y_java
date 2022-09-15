<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../include/header.jsp"  %>
	<div class="col-lg-6 mx-auto py-5">
		<form action="${ pageContext.request.contextPath }/ArticleServlet" method="post">
			<input type="hidden" name="action" value="write">
			<div class="mb-3">
				<label for="title" class="form-label">제목</label>
				<input type="text" class="form-control" id="title" name="title">
			</div>
			<div class="mb-3">
				<label for="content" class="form-label">내용</label>
				<textarea rows="10" class="form-control" id="content" name="content"></textarea>
			</div>
			
			<input type="submit" class="btn btn-primary" value="저장">
		
		</form>
	</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
</body>
</html>