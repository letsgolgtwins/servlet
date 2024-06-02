<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>

	
	<% // 자바 영역
	// request params
	int number = Integer.valueOf(request.getParameter("number"));
 	String[] typeArr = request.getParameterValues("type");
 	%>	
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h3><%= number %>cm</h3>
		<hr>
	<h3> 
	<%
	double inch = 0;
	double yard = 0;
	double feet = 0;
	double meter = 0;
	for (String type : typeArr) {
		if (type.equals("inch")) {
			inch = number * 0.393701;
			out.print(inch + "in <br>");
		} else if (type.equals("yard")) {
			yard = number * 0.010936;
			out.print(yard + "yd <br>");
		} else if (type.equals("feet")) {
			feet = number * 0.032808;
			out.print(feet +"ft <br>");
		} else if (type.equals("meter")) {
			meter = number * 0.01;
			out.print(meter + "m <br>");
		}
	}
	%>
	</h3>

	</div>
</body>
</html>