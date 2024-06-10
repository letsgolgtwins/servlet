<%@page import="java.sql.ResultSet"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물건 올리기</title>
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
<style>
header {height: 50px}
nav {height: 40px}
section {min-height: 300px}
.top {height: 150px}
.down {min-height: 250px}
footer {
	height: 50px;
	color: gray;
}
</style>
</head>
<body>
	<%
	// 자바영역
	// db 연결
	MysqlService ms = MysqlService.getInstance();
	ms.connect();

	// select Query
	String selectQuery = "select * from `seller`";
	ResultSet res = ms.select(selectQuery);
	%>
	<div id="wrap" class="container">
		<header class="d-flex bg-danger justify-content-center align-items-center ">
			<h4 class="d-flex font-weight-bold text-white">HONG당무 마켓</h4>
		</header>
		<nav class="bg-danger">
			<ul class="nav nav-fill w-100">
				<li class="nav-item"><small><a
						class="nav-link text-white" href="#">리스트</a></small></li>
				<li class="nav-item"><small><a
						class="nav-link text-white" href="#">물건 올리기</a></small></li>
				<li class="nav-item"><small><a
						class="nav-link text-white" href="#">마이페이지</a></small></li>
			</ul>
		</nav>
		<section class="contents">
			<div class="top d-flex bg-success">
				<div class="d-flex justify-content-center align-items-center left display-4 col-6">물건 올리기</div>
				<div></div>
			</div>
			<div class="down d-flex bg-warning">
				<select class="form-control col-3 ml-5">
					<option>--아이디 선택--</option>
					<%// 자바영역
					while (res.next()) {
					%>
					<option><%= res.getString("nickname")%></option>
					<%
					}
					%>
				</select>
				<input type="text" class="form-control col-4 ml-4" placeholder="제목">
				<input type="text" class="form-control col-3 ml-5" placeholder="가격">
			</div>
		</section>
		<footer class="d-flex justify-content-center align-items-end">
			<small>Copyright 2019. HONG All Rights Reserved.</small>
		</footer>
	</div>
	<%
	// db 연결 해제
	ms.disconnect();
	%>
</body>
</html>