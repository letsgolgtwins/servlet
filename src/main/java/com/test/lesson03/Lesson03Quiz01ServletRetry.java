package com.test.lesson03;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz01retry")
public class Lesson03Quiz01ServletRetry extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request 
			, HttpServletResponse response) {
		
		// rsc 
		response.setContentType("text/plain");
		
		// db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		
		
		
		// db 연결 해제
		ms.disconnect();
		
	}
}
