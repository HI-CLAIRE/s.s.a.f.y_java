<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty loginUser }">
	<div class="d-flex justify-content-end">
		<a class="btn btn-outline-info" href="../user/loginPage.jsp">로그인</a>
	</div>
</c:if>

<c:if test="${!empty loginUser">
	<div class="d-flex justify-content-end">
		<span>${loginUser.name }님 반갑습니다.</span>
		<a class="btn btn-outline-info" href="main??action=logout">로그아웃</a>
	</div>
</c:if>
