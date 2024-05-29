<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01 - JSP</title>
</head>
<body>
	<%-- 1번 --%>
	<%! 
	public int Sum(int number) {
		int sum = 0;
		for (int i = 1 ; i <= number ; i++) {
			sum += i;
		}
		return sum;
	}
	%>
	<b>1부터 50까지의 합은 <%= Sum(50) %>이다</b>
	<br>
	
	<%-- 2번 --%>
	<% 
	int[] scores = {81, 90, 100, 95, 80};
	int sum2 = 0;
	double average = 0;
	for (int i = 0 ; i < scores.length ; i++) {
		sum2 += scores[i];
	}
	average = (double) sum2 /scores.length;
	%>
	<b>평균 점수는 <%= average%>입니다.</b>
	<br>
	
	<%-- 3번 --%>
	<% 
	int count = 0;
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	for (int i = 0 ; i < scoreList.size() ; i++) {
		// out.print(score)해줘도 된다
		if (scoreList.get(i).equals("O")) {
			count++;
		} else {
			
		}
	}
	int finalscore = count * 10;
	%>
	<b>채점 결과는 <%= finalscore%>점 입니다.</b>
	<br>
	
	<%-- 4번 --%>
	<% 
	String birthDay = "20010820";
	String birthYear = birthDay.substring(0, 4);
	int birth = Integer.valueOf(birthYear);
	int age = 2025 - birth;
	%>
	<b><%=birthDay %>의 나이는 <%=age%>세 입니다.</b>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>