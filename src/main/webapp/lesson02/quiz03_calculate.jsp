<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산</title>	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

	<style>
		.blue {
			color: blue;
		}
	</style>

</head>
<body>
	<% // 자바영역
	// request params
	int height = Integer.valueOf(request.getParameter("height"));
	int weight = Integer.valueOf(request.getParameter("weight"));
	
	// bmi 분류 조건
	String status = "";
	double bmi = (double) weight / ((height / 100.0) * (height / 100.0));
	if (bmi <= 20.0) {
		status = "저체중";
	} else if (bmi > 20.0 && bmi <= 25.0) {
		status = "정상";
	} else if (bmi >= 26.0 && bmi <= 30) {
		status = "과체중";
	} else {
		status = "비만";
	}
	%>
	
	<%-- 자바 영역 아님 --%>
	<div class="container">
	<h3>BMI 측정 결과</h3><br>
	<h1>당신은 <span class="blue"><%=status %> </span> 
	입니다.</h1><br>
	BMI 수치: <%= bmi  %> 	
	</div>
</body>
</html>