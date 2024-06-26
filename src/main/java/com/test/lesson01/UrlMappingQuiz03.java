package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/Quiz03") // web.xml 대체
public class UrlMappingQuiz03 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html"); // 문제에서 html로 하라고 함

		// 날짜
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		// pt
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>마론달 뉴스</title></head><body>");
		out.print("<h1>[단독] 고양이가 야옹해</h1><p>기사 입력 시간 : " + sdf.format(now) + "</p><hr>끝");
		out.print("</body></html>");
	}
}
