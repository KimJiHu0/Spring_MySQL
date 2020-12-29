<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	
	<h1>메인화면입니다.</h1>
	
	<!-- List라는 버튼을 클릭하게 되면 list.do라는 요청값을 Controller으로 넘기게 됩니다. -->
	<!-- 이제 이 요청값을 RequestMapping으로 받아줄 Method를 구현하면 됩니다. -->
	<button onclick="location.href='list.do'">List</button>

</body>
</html>