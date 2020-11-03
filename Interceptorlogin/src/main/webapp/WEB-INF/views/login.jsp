<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${user.userId }
${user.userPw }
<c:choose>
<c:when test="${user == null}">
로그인 실패
</c:when>
<c:otherwise>
로그인 성공
</c:otherwise>
</c:choose>
<a href="/interceptor">index돌아가기</a>
</body>
</html>