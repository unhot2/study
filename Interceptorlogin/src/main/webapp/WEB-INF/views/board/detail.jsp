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
	<table border="1">
		<tr>
			<th>ID</th>
			<td colspan="2">${detail.id }</td>
		</tr>
		<tr>
			<th>NAME</th>
			<td colspan="2">${detail.name }</td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td colspan="2">${detail.title }</td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td colspan="2">${detail.content }</td>
		</tr>
		<tr>
			<c:if test="${login.userId eq detail.name }">
				<td><input type="button" value="수정"></td>
				<td><input type="button" value="삭제"></td>
			</c:if>
			<td><a href="listPage"><input type="button" value="목록"></a></td>
		</tr>
	</table>
</body>
</html>