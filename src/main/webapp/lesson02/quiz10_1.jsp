<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>노래 - 세부사항</title>
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
header {
	height: 50px
}

nav {
	height: 40px
}

.contents {
	min-height: 350px
}

footer {
	height: 50px
}

.left {
	width: 555px
}

.button {
	height: 38px
}
</style>
</head>
<body>

<%
//아이유 노래 리스트 
List<Map<String, Object>> musicList = new ArrayList<>();

Map<String, Object> musicInfo = new HashMap<>();
musicInfo.put("id", 1);
musicInfo.put("title", "팔레트");
musicInfo.put("album", "Palette");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/b/b6/IU_Palette_final.jpg");
musicInfo.put("time", 217);
musicInfo.put("composer", "아이유");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 2);
musicInfo.put("title", "좋은날");
musicInfo.put("album", "Real");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/3/3c/IU_-_Real.jpg");
musicInfo.put("time", 233);
musicInfo.put("composer", "이민수");
musicInfo.put("lyricist", "김이나");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 3);
musicInfo.put("title", "밤편지");
musicInfo.put("album", "palette");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/b/b6/IU_Palette_final.jpg");
musicInfo.put("time", 253);
musicInfo.put("composer", "제휘,김희원");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 4);
musicInfo.put("title", "삐삐");
musicInfo.put("album", "삐삐");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/111/535/81111535_1539157728291_1_600x600.JPG");
musicInfo.put("time", 194);
musicInfo.put("composer", "이종훈");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 5);
musicInfo.put("title", "스물셋");
musicInfo.put("album", "CHAT-SHIRE");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/080/724/877/80724877_1445520704274_1_600x600.JPG");
musicInfo.put("time", 194);
musicInfo.put("composer", "아이유,이종훈,이채규");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 6);
musicInfo.put("title", "Blueming");
musicInfo.put("album", "Love poem");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/6/65/%EC%95%84%EC%9D%B4%EC%9C%A0_-_Love_poem.jpg");
musicInfo.put("time", 217);
musicInfo.put("composer", "아이유,이종훈,이채규");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);
%>

	<div id="wrap" class="container">
		<form method="get" action="/lesson02/quiz10_1.jsp">
			<header class="d-flex">
				<div class="left d-flex align-items-center">
					<h3 class="text-success">Melong</h3>
					<div class="d-flex ml-5">
						<input type="text" class="form-control" name="search">
					</div>
					<div class="input-group-append">
						<button class="btn btn-info" type="submit">검색</button>
					</div>
				</div>
				<div></div>
			</header>
		</form>
		<nav class= d-flex">
			<div class="left d-flex align-items-center font-weight-bold">
				<ul class="nav nav-fill w-100">
					<li class="nav-item">멜론차트</li>
					<li class="nav-item">최신음악</li>
					<li class="nav-item">장르음악</li>
					<li class="nav-item">멜론DJ</li>
					<li class="nav-item">뮤직어워드</li>
				</ul>
			</div>
			<div></div>
		</nav>
		
		<% // 자바 영역
		// request params
		// 밑에 a태그 
		int id = Integer.valueOf(request.getParameter("id"));
	 	// 검색창 여
		String search = request.getParameter("search");
		// 예외처리를 해줘야 하는 에러가 뜨는데 애초에 일반 for문을 사용하면 안되는 거였나?
		%>
		
		<%
		if (request.getParameter("id") != null) {
		for (int i = 0 ; i < musicList.size() ; i++) {
			if (id == (int) musicList.get(i).get("id")) {
				Object title1 = musicList.get(i).get("title");
				Object singer = musicList.get(i).get("singer");
				Object album = musicList.get(i).get("album");
				Object time = musicList.get(i).get("time");
				Object composer = musicList.get(i).get("composer");
				Object lyricist = musicList.get(i).get("lyricist");	
				Object thumbnail = musicList.get(i).get("thumbnail");	
				
		%>
		<section class="contents">
			<h5 class="font-weight-bold">곡 정보</h5>
			<div class="up border border-success p-3">
				<div class="d-flex">
					<div>
						<img width="200" height="200" alt="아티스트사진" src="<%=thumbnail%>">
					</div>
					<div class="ml-3 mt-3">
						<h2><%=title1 %></h2>
						<div class="text-success font-weight-bold mb-2"><%=singer %></div>
						
						<div class="d-flex">
							<div class="mr-5">앨범</div>
							<div><%= album%></div>
						</div>
						<div class="d-flex">
							<div class="mr-3">재생시간</div>
							<div><%= (int) time / 60%>:</div>
							<div><%= (int) time % 60%></div>
						</div>
						<div class="d-flex">
							<div class="mr-5">작곡가</div>
							<div><%= composer%></div>
						</div>
						<div class="d-flex">
							<div class="mr-5">작사가</div>
							<div><%= lyricist%></div>
						</div>
					</div>
				</div>
			</div>
			<%
				}
			}
		}
		
		// 2. search 로 들어온 경우
	
			%>
			<div class="down">
				<h5 class="font-weight-bold ml-3 mt-3">가사</h5>
				<hr>
				<span class="ml-3">가사 정보 없음</span>
			</div>
		</section>
		<footer class="d-flex align-items-center">
			<small>Copyright 2024. melong All Rights Reserved.</small>
		</footer>
	</div>
</body>
</html>