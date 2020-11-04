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
로그인 된 ID : ${login.userId }
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>TITLE</th>
			<th>CONTENT</th>
		</tr>
		<c:choose>
			<c:when test="${pagelist eq null}">
				<tr>
					<th>저장된 글이 없습니다.</th>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="cnt" items="${pagelist }">
					<tr>
						<td>${cnt.id}</td>
						<td>${cnt.name }</td>
						<td>${cnt.title }</td>
						<td>${cnt.content }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td><a href="write">글쓰기</a></td>
			<td><a href="logout">로그아웃</a></td>
			<td><a href="/interceptor">메인화면</a></td>
		</tr>
	</table>
</body>
</html>