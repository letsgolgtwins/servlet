package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { // doGet 주의

		// 한글 깨짐 방지용 - response header
		response.setCharacterEncoding("utf-8"); // setC 까지 누르고 1번쨰
		response.setContentType("text/plain"); // setC 까지 누르고 4번쨰

		PrintWriter out = response.getWriter();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		out.println("현재 시간은 " + sdf.format(now));

	}
}
