package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz10")
public class PostMethodQuiz10 extends HttpServlet {

	private final Map<String, String> userMap = new HashMap<>() {
		{
			put("id", "marobiana");
			put("password", "qwerty1234");
			put("name", "신보람");
		}
	};


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// rsc
		response.setContentType("text/html");

		// request params
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		// pt
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>HTML 화면</title></head><body>");
		
//		Iterator<String> iter = userMap.keySet().iterator();
//		while(iter.hasNext()) {
//			String user = iter.next();
//			if ()
//		}
		
		if (!id.equals(userMap.get("id"))) { // == false로 해도 된다.
			out.print("id가 일치하지 않습니다.");
		} else if (!pw.equals(userMap.get("password"))) { // == false로 해도 된다.
			out.print("password가 일치하지 않습니다.");
		} else {
			out.print(userMap.get("name") +"님 환영합니다!");
		}
		
		out.print("</body></html>");
		// 브레이크 포인트 찍는 위치는 중괄호 안쪽에 실질적으로 시작되는 코드 (if문에는 잘 걸지 않는다)
		
	}
}
