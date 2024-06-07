package com.test.lesson03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz01retry")
public class Lesson03Quiz01ServletRetry extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request 
			, HttpServletResponse response) throws IOException {
		
		// rsc 
		response.setContentType("text/plain");
		
		// db 연결
		MysqlService ms = MysqlService.getInstance(); // msm ms = msm.gI();
		ms.connect();
		
		// insert 
		String insertQuery = "insert into `real_estate`"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)"
				+ "values"
				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, null)";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// select - id기준 오름차순 10개만 / 출력 컬럼: 매물 주소, 면적, 타입 
		String selectQuery = "select * from `real_estate` order by `id` desc limit 10";
		// pt
		PrintWriter out = response.getWriter();
		try {
			ResultSet res = ms.select(selectQuery); // 이게 중요
			while (res.next()) {
				out.print("매물 주소: " + res.getString("address"));
				out.print(", 면적: " + res.getInt("area"));
				out.print(", 타입: " + res.getString("type"));
				out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// db 연결 해제
		ms.disconnect();
	}
}
