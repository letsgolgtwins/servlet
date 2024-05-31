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
	
	// for (int i = 0 ; i < typeArr.length; i++) {
	//	 out.print(typeArr[i] + " ");
	// } 중간 점검 차원
	
	// 각 타입별 공식
	double inch = 0;
	double yard = 0;
	double peet = 0;
	double meter = 0;	
	for (int i = 0 ; i < typeArr.length ; i++) {
		if (typeArr[i] == "inch") {
			inch = 0.39 * number;
		} else if (typeArr[i] == "yard") {
			yard = 0.01 * number; 
		} else if (typeArr[i] == "peet") {
			peet = 0.03 * number;
		} else {
			meter = 0.01 * number;
		}
	
	%>
	
	<%-- 자바 영역 밖 --%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<div class="d-flex">
			<span class="font-weight-bold display-4"> <%=number %> </span> 
			<h4 class="d-flex align-items-end">cm</h4>	
		</div><hr>
		<div>
		
		
		
		</div>
	</div>
</body>
</html>