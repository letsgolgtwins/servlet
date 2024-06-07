package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_insert")
public class InsertQuiz02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request
			, HttpServletResponse response) throws IOException {
		
		// rsc - 필요X
		
		// request params
		String site = request.getParameter("site");
		String link = request.getParameter("link");
		
		// db 연결 
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// insertQuery
		String insertQuery = "insert into `bookmark`"
				+ "(`name`, `url`)"
				+ "values"
				+ "('" + site + "', ' " + link + "')";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db 연결 해제
		ms.disconnect();
		
		// 302 리닥
		response.sendRedirect("/lesson03/quiz02.jsp");
	}
}
