<%@page import="java.io.PrintWriter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz02_1</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
		<% // 자바 영역	
		// request params
		String type = request.getParameter("type");
		
		//
		Date now = new Date();
		
		// if문		
		SimpleDateFormat sdf = null;
		if (type.equals("time")) {
			sdf = new SimpleDateFormat("HH시 mm분 ss초 입니다.");
		} else {
			sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 M월 dd일 입니다.");
		}
		String timeNow = sdf.format(new Date()); //어디를 줄일 수 있는지 눈여겨볼 것.
		%>
	<div class="container d-flex justify-content-center">
		<div class="display-4"><%= timeNow %></div>
	</div>
</body>
</html>