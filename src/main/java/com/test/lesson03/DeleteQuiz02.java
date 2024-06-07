package com.test.lesson03;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_delete")
public class DeleteQuiz02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request
			,HttpServletResponse response) {
		
		// rsc 생략
		
		// request params
		int id = Integer.valueOf(request.getParameter("id"));

		// db연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// deleteQuery
		// 여기서부터 하면 된다.
		
		// db연결 해제
		ms.disconnect();
	}
}

