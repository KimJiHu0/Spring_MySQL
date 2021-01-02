<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>boardList</h1>

	<table border="1">
	<col width="50">
	<col width="100">
	<col width="100">
	<col width="200">
		<tr>
			<th>No</th>
			<th>Writer</th>
			<th>Title</th>
			<th>Content</th>
		</tr>
		<c:choose>
			<c:when test="${empty list}">
				<tr>
					<td colspan="4" align="center">
						등록된 글이 없습니다.
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="list">
					<tr>
						<td>${list.boardno }</td>
						<td>${list.boardwriter }</td>
						<td>${list.boardtitle }</td>
						<td>${list.boardcontent }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td colspan="4" align="right">
				<button>글작성</button>
			</td>
		</tr>
	</table>

</body>
</html>