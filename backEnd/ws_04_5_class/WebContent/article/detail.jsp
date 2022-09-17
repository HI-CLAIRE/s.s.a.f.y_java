<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../include/header.jsp"%>
<div class="col-lg-8 mx-auto py-5">

	<div class="mb-3">
		<label for="title" class="form-label">제목</label> <input type="text"
			class="form-control" id="title" name="title" value="${article.title}"
			disabled readonly>
	</div>
	<div class="mb-3">
		<label for="content" class="form-label">내용</label>
		<textarea rows="10" class="form-control" id="content" name="content"
			disabled readonly>${article.content}</textarea>
	</div>

	<hr>
	<div class="mt-3">
		<h3>댓글 목록</h3>
		<div class="row">
			<form>
				<div class="col">
					<textarea class="form-control" id="commentContent" name="commentContent">
					</textarea>
				</div>
				<div class="col">
					<input type="submit" value="저장" class="btn btn-primary">
				</div>
			</form>
		</div>

	</div>
</div>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
</body>
</html>