package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// rsc
		response.setContentType("text/html");

		// request parameter
		String name = request.getParameter("name");
		String join = request.getParameter("join");

		// 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>입사 지원서</title></head><body>");
		
		out.print("<b>" + name + "</b> 님 지원이 완료 되었습니다.<br>");
		out.print("<b>지원 내용</b><br>");
		out.print(join);

		out.print("</body></html>");
	}
}
