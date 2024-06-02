<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>

	<% // 자바 영역
	 // request params
	 int number1 = Integer.valueOf(request.getParameter("number1"));
	 int number2 = Integer.valueOf(request.getParameter("number2"));
	 String type = request.getParameter("type"); // 어차피 하나만 선택되므로 굳이 배열을 선택할 필요가 없다.
	 %>
	
	<div class="container">
		<h1>계산 결과</h1>
		<div class="d-flex">
		<h1>
		<%=number1 %> 
		<%
		if (type.equals("plus")) {
			out.print("+");
		} else if (type.equals("minus")) {
			out.print("-");
		} else if (type.equals("multiple")) {
			out.print("*");
		} else if (type.equals("divide")) {
			out.print("/");
		}
		%>
		<%=number2 %>
		
		=
		
		<% 
		//계산 결과 영역 
		if (type.equals("plus")) {
			out.print(number1 + number2);
		} else if(type.equals("minus")) {
			out.print(number1 - number2);
		} else if (type.equals("multiple")) {
			out.print(number1 * number2);
		} else if (type.equals("divide")) {
			out.print(number1 / number2);
		}
		%>
		</h1>
		</div>
	</div>
</body>
</html>