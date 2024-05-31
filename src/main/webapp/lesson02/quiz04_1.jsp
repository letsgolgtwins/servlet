<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환</title>
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
	<%
	// 자바 영역
	// request params
	int number = Integer.valueOf(request.getParameter("number"));
	String[] types = request.getParameterValues("type");

	// for (int i = 0 ; i < types.length; i++) {
	//	 out.print(types[i] + " ");
	// } 중간 점검 차원
	%>

	<%-- 자바 영역 밖 --%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<div class="d-flex">
			<h3><%=number%>
				cm
			</h3>
		</div>
		<hr>
		<h2>
			<%
			if (types != null) { // 예외처리
				for (String type : types) { // inch, meter, feet 선택했다면 
					if (type.equals("inch")) { // inch
				// cm를 인치로 바꾸는 공식 
				double inch = number * 0.393701;
				out.print(inch + "in<br>");
					} else if (type.equals("yard")) { // yard
				// cm를 yard로 바꾸는 공식
				double yard = number * 0.010936;
				out.print(yard + "yd<br>");
					} else if (type.equals("feet")) { // feet
				// cm를 feet로 바꾸는 공식
				double feet = number * 0.032808;
				out.print(feet + "ft<br>");
					} else if (type.equals("meter")) { // meter
				// cm를 meter로 바꾸는 공식 
				double meter = number * 0.01;
				out.print(meter + "m<br>");
					}
				}

			}
			// 이 부분을 다시 한 번 생각해보자 왜 이런 생각을 하지 못했는지 파악
			%>
		</h2>
	</div>
</body>
</html>