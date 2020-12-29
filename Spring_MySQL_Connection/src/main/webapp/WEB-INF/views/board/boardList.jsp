<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList.jsp</title>
</head>
<body>
	<h1>BoardList</h1>
	
	<table border="1">
	<col width="50">
	<col width="100">
	<col width="100">
	<col width="200">
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<c:choose>
			<!-- Controller에서 받아온 list라는 값이 비어있다면 -->
			<c:when test="${empty list }">
				<tr>
					<td colspan="4">글이 없습니다.</td>
				</tr>
			</c:when>
			<!-- 비어있지 않다면 -->
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
	</table>
</body>
</html>