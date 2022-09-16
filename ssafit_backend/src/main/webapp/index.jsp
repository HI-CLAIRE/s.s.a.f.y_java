<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFIT에 오신 것을 환영합니다.</title>
</head>
<body>
로딩 중...
<form action="${pageContext.request.contextPath }/main" method="post">
<input type="hidden" name="action" value="main">
<input type="submit">
</form>
</body>
</html>