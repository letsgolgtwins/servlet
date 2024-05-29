<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서버 페이지 - Servlet 용도</title>
</head>
<body>
	<%-- <%= %>이걸 익스프레션이라고 한다. 용어 주의 --%>
	<b>아이디</b>
	<%= request.getParameter("user_id") %><br>
	
	<b>이름</b>
	<%= request.getParameter("name") %><br>
	
	<b>나이</b>
	<%= request.getParameter("age") %>
</body>
</html>