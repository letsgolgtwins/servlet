<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채널 안내</title>
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
		header {height: 80px}
		nav {height: 50px}
		.contents {min-height: 500px}
		footer {height: 80px}
		
		.nav-link {color:white} 
		.nav-link:hover {color: blue}
	</style>
</head>
<body>
<%
List<Map<String, String>> list = new ArrayList<>();
Map<String, String> map = new HashMap<String, String>() {{ put("ch", "5"); put("name", "SBS"); put("category", "지상파"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "7"); put("name", "KBS2"); put("category", "지상파"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "9"); put("name", "KBS1"); put("category", "지상파"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "11"); put("name", "MBC"); put("category", "지상파"); } };
list.add(map);

map = new HashMap<String, String>() {{ put("ch", "54"); put("name", "OCN"); put("category", "영화"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "56"); put("name", "Screen"); put("category", "영화"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "57"); put("name", "Mplex"); put("category", "영화"); } };
list.add(map);

map = new HashMap<String, String>() {{ put("ch", "30"); put("name", "KBS 드라마"); put("category", "드라마"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "32"); put("name", "MBC 드라마"); put("category", "드라마"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "34"); put("name", "Olive"); put("category", "드라마"); } };
list.add(map);

map = new HashMap<String, String>() {{ put("ch", "3"); put("name", "tvN"); put("category", "예능"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "28"); put("name", "MBC Every1"); put("category", "예능"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "48"); put("name", "JTBC2"); put("category", "예능"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "49"); put("name", "E채널"); put("category", "예능"); } };
list.add(map);

map = new HashMap<String, String>() {{ put("ch", "120"); put("name", "SPOTV"); put("category", "스포츠"); } };
list.add(map);
map = new HashMap<String, String>() {{ put("ch", "121"); put("name", "KBSN 스포츠"); put("category", "스포츠"); } };
list.add(map);

%>
	<div id="wrap" class="container">
		<header class="d-flex justify-content-center align-items-center">
			<h2 class="text-danger font-weight-bold">SK Broadband IPTV</h2>
		</header>
		<nav class="d-flex bg-danger justify-content-center align-items-center">
			<ul class="nav nav-fill w-100">
				<li class="nav-item"><a class="nav-link" href="/lesson02/quiz09s.jsp">전체</a></li> 
				<li class="nav-item"><a class="nav-link" href="/lesson02/quiz09s.jsp?category=지상파">지상파</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson02/quiz09s.jsp?category=드라마">드라마</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson02/quiz09s.jsp?category=예능">예능</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson02/quiz09s.jsp?category=영화">영화</a></li>
				<li class="nav-item"><a class="nav-link" href="/lesson02/quiz09s.jsp?category=스포츠">스포츠</a></li>
			</ul>	
		</nav>
		<section class="contents">
			<table class="table text-center">
				<thead>
					<tr>
						<th>채널</th>
						<th>채널명</th>
						<th>카테고리</th>
					</tr>
				</thead>
				<tbody>
				
				<% // 지상파
				//request params
				String category = request.getParameter("category");
				
				if (category.equals("지상파")) {
				for (int i = 0 ; i < list.size(); i++) {
					if (list.get(i).get("category").equals("지상파")) {	
					String ch = list.get(i).get("ch");
					String name = list.get(i).get("name");
					String category1 = list.get(i).get("category");
				%>
					<tr>
						<td><%=ch%></td>
						<td><%=name%></td>
						<td><%=category1%></td>
					</tr>
				<% 
					}
				}
				}
				%> 
				
				<% // 드라마
				if (category.equals("drama")) {
				for (int i = 0 ; i < list.size(); i++) {
					if (list.get(i).get("category").equals("드라마")) {	
					String ch = list.get(i).get("ch");
					String name = list.get(i).get("name");
					String category1 = list.get(i).get("category");
				%>
					<tr>
						<td><%=ch%></td>
						<td><%=name%></td>
						<td><%=category1%></td>
					</tr>
				<% 
					}
				}
				}
				%> 
				
				<% // 예능
				if (category.equals("variety")) {
				for (int i = 0 ; i < list.size(); i++) {
					if (list.get(i).get("category").equals("예능")) {	
					String ch = list.get(i).get("ch");
					String name = list.get(i).get("name");
					String category1 = list.get(i).get("category");
				%>
					<tr>
						<td><%=ch%></td>
						<td><%=name%></td>
						<td><%=category1%></td>
					</tr>
				<% 
					}
				}
				}
				%> 
				
				<% // 영화
				if (category.equals("movie")) {
				for (int i = 0 ; i < list.size(); i++) {
					if (list.get(i).get("category").equals("영화")) {	
					String ch = list.get(i).get("ch");
					String name = list.get(i).get("name");
					String category1 = list.get(i).get("category");
				%>
					<tr>
						<td><%=ch%></td>
						<td><%=name%></td>
						<td><%=category1%></td>
					</tr>
				<% 
					}
				}
				}
				%> 
				
				<% // 스포츠
				if (category.equals("sports")) {
				for (int i = 0 ; i < list.size(); i++) {
					if (list.get(i).get("category").equals("스포츠")) {	
					String ch = list.get(i).get("ch");
					String name = list.get(i).get("name");
					String category1 = list.get(i).get("category");
				%>
					<tr>
						<td><%=ch%></td>
						<td><%=name%></td>
						<td><%=category1%></td>
					</tr>
				<% 
					}
				}
				}
				%> 
				</tbody>
			</table>
		</section>
		<footer class="d-flex justify-content-center align-items-center">
			<small>Copyright © SK broadband IPTV 2024</small>
		</footer>
	</div>
</body>
</html>