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
	<div id="wrap" class="container">
		<form method="get" action="">
			<header class="d-flex bg-warning">
				<div class="left d-flex align-items-center">
					<h3 class="text-success">Melong</h3>
					<div class="d-flex ml-5">
						<input type="text" class="form-control">
					</div>
					<input type="submit" value="검색" class="btn btn-info">
				</div>
				<div></div>
			</header>
		</form>
		<nav class="bg-danger d-flex">
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
		<section class="contents bg-info">
			<div class="up">
				<div class="d-flex">
					<div>
						<img width="200" height="200" alt="아티스트사진"
							src="#">
					</div>
					<div class="ml-3">
						<h3>아이유</h3>
						<div>엔터테인먼트</div>
						<div>2008데뷔</div>
					</div>
				</div>
			</div>
			<div class="down">
				<h5 class="font-weight-bold">가사</h5>
				<hr>
				<span>가사 정보 없음</span>
			</div>
		</section>
		<footer class="d-flex align-items-center bg-success">
			<small>Copyright 2024. melong All Rights Reserved.</small>
		</footer>
	</div>
</body>
</html>