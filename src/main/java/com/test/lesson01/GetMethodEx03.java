package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex03")
public class GetMethodEx03 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// git 테스트용 주석 추가(240528)
		// git 테스트용 주석 추가(240529)
		// stash 테스트용 주석 추가(240529)
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/plain");
		response.setContentType("text/json");

		// request parameter
		String userId = request.getParameter("user_id"); // user_id키
		String name = request.getParameter("name"); // naem키
		int age = Integer.valueOf(request.getParameter("age")); // age키

		PrintWriter out = response.getWriter();
//		out.println("서블릿 수행");
//		out.println("userId : " + userId);
//		out.println("name : " + name);
//		out.println("age : " + age);

		// {"user_id":"lgtwins", "name":"오지환", "age"=35} 의 형태로 만들어보기
		out.print("{\"user_id\":\"" + userId + "\", \"name\":\"" + name + "\", \"age\":" + age + "}");
	}
}
