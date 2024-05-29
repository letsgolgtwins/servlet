package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex02") // import 이걸로 web.xml에 치는 걸 대체한다.
public class UrlMappingEx02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html"); // 이제 내려가는 문서는 html이므로 돔트리가 만들어지고 해석을 하려고 할 것이다.

		// 서블릿 : 자바 + html
		// 1+2+...+10 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		PrintWriter out = response.getWriter();
		out.println("<html><head><title>합계</title></head><body>");
		out.println("합계: <b>" + sum + "</b>");
		out.println("</body></html>");
	}

}
