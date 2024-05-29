package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 한글깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");

		// 오늘의 날짜는 20xx년 x월 xx일
		PrintWriter out = response.getWriter(); // 응답에다가 쓰여지는 것이므로 response.getWriter();
		Date now = new Date(); // 아 이걸 해줘야 하는구나
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
		out.print("오늘의 날짜는 " + sdf.format(now)); // sdf.format(new Date()) 으로 해도된다.

	}
}
