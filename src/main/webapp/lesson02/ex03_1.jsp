<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST form 태그 - 서버페이지</title>
</head>
<body>
	<%
	// 자바영역
	// request params
	String nickname = request.getParameter("nickname");
	String hobby = request.getParameter("hobby");
	String animal = request.getParameter("animal"); // 라디오 버튼 둘 중 하나.
	// 여러 개의 값을 받을때는 배열로 받는다
	String[] foodArr = request.getParameterValues("food"); // 여러개의 항목을 받을 때
	String fruit = request.getParameter("fruit");

	// 선반복문
	%>
	<table border="1">
		<tr>
			<th>별명</th>
			<td><%=nickname%></td>
		</tr>
		<tr>
			<th>취미</th>
			<td><%=hobby%></td>
		</tr>
		<tr>
			<th>좋아하는 동물</th>
			<td><%=animal%></td>
		</tr>
		<tr>
			<th>선호하는 음식</th>
			<td>
				<%
				if (foodArr != null) { // foodArr 이 null이 아닐 때만~					
					String result = ""; // null로 하면 안된다. 이래야 누적이 된다.
					for (String food : foodArr) {
						result += food + ",";
					}
					// 맨 뒤에 붙은 ,(콤마) 제거
					// 예를들어서 abc일 때 ab만 추출해서 가져오는 거
					result = result.substring(0, result.length() - 1 );
					out.print(result);
				}
				%>
			</td>
		</tr>
		<tr>
			<th>좋아하는 과일</th>
			<td><%=fruit%></td>
		</tr>
	</table>
</body>
</html>