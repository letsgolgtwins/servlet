package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/ex02_delete")
public class DeleteEx02 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request
			, HttpServletResponse response) throws IOException {
		
		// rsc 생략
		
		// request params
		int id = Integer.valueOf(request.getParameter("id"));
		
		// db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		// deleteQuery
		String deleteQuery = "delete from `new_user` where id =" + id;
		try {
			ms.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db 연결 해제
		ms.disconnect(); // 여기까지만 하면 안되고 다시 목록화면으로 보내야 하므로
		
		// 302 리닥
		response.sendRedirect("/lesson03/ex02_1.jsp"); // 예외처리는 위로 넘기기 
	}
}
