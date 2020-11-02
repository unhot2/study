<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String uri  = request.getRequestURI();
Object num = request.getParameter("num");%>
넘어온 uri : <%= uri %>
넘어온 값 : ${num }
</body>
</html>