package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet { // HttpServlet을 import 시켜준다.

	@Override // 재구현함 이 어노테이션은 삭제하면 안된다.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { // import 시켜준다.

		// 한글 깨짐 방지 - 이제부터 항상 넣어준다.
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain"); // 글자이고/순수한 글자다.

		PrintWriter out = response.getWriter(); // 응답에다가 쓰겠다. 또 한 번 import하고 오른쪽 예외처리
		out.println("안녕하세요.");

		// 날짜
		Date now = new Date(); // 객체 생성 import 하고 아래까 java.util.date 클릭
		out.println(now);

		// formatter
		// 2024-05-23 오후 16:50:30
		// yyyy-MM-dd a HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		out.println(sdf.format(now));
		// sdf.format(now);

	}
}
