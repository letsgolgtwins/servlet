package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_delete")
public class DeleteQuiz02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request
			,HttpServletResponse response) throws IOException {
		
		// rsc 생략
		
		// request params
		int id = Integer.valueOf(request.getParameter("id"));

		// db연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// deleteQuery
		// 여기서부터 하면 된다.
		String deleteQuery = "delete from `bookmark` where `id`=" + id;
		try {
			ms.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db연결 해제
		ms.disconnect();
		
		// 302 리닥& 예외처리
		response.sendRedirect("/lesson03/quiz02.jsp");
	}
}

