<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<b>로그인</b>
<form action="login">
	userId : <input type="text" name="userId">
	userPw : <input type="text" name="userPw">
	<input type="submit" value="로그인">
</form>
</body>
</html>
