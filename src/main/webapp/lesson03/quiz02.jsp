<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz02</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>
</head>
<body>
<div class="container text-center">
	<table class="table">
		<thead>
			<tr>
				<th>사이트</th>
				<th>사이트 주소</th>
				<th>삭제하기</th>
			</tr>
		</thead>
		<tbody>
			<%
			// 자바 영역
			// db 연결
			MysqlService ms = MysqlService.getInstance();
			ms.connect();

			// selectQuery
			String selectQuery = "select * from `bookmark` order by `id` desc";
			ResultSet res = ms.select(selectQuery);

			while (res.next()) {
				
			%>
			<tr>
				<td><%=res.getString("name") %></td>
				<td><a href="<%= res.getString("url") %>"><%= res.getString("url") %></a></td>
				<td><a class="btn btn-danger" href="/lesson03/quiz02_delete?id=<%= res.getInt("id")%>">삭제하기</a></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	</div>
	<%
	// db 연결 해제
	ms.disconnect();
	%>
</body>
</html>