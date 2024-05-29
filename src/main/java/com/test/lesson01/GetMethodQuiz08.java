package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// rsc
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		// request parameter
		String search = request.getParameter("search");

		// List
		List<String> list = new ArrayList<String>(List.of(
				"강남역 최고 맛집 소개 합니다.", 
				"오늘 기분 좋은 일이 있었네요.",
				"역시 맛집 데이트가 제일 좋네요.", 
				"집에 가는 길에 동네 맛집 가서 안주 사갑니다.", 
				"자축 저 오늘 생일 이에요."));

		// pt
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>검색 결과</title></head><body>");

		// 내가 쓴 방법 - for문
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(search)) {
				String sentense = list.get(i).replaceAll(search, "<b>" + search + "</b>"); // 내가 검색한 단어를 b태그로 강조
				out.print(sentense + "<br>");
			}
		}

		// iterator 방법
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String line = iter.next();
//			// System.out.println(line); // 중간점검
//			if (line.contains(search)) {
//				String sentense = line.replaceAll(search, "<b>"+search+"</b>");
//				out.print(sentense + "<br>");
//			}
//		}

		out.print("</body></html>");

	}
}
