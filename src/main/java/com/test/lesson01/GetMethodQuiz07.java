package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07") // (액션 주소)복사로 가져올 것.
public class GetMethodQuiz07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// response header setting
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		// request parameter
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.valueOf(request.getParameter("price"));

		// pt
		// response 출력(분기) 
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>주문 결과</title></head><body>");
		
		if (address.startsWith("서울시")) {
			if (card.equals("신한카드")) {
				out.print("결제 불가 카드입니다.");
			} else {
				out.print(address + " <b>배달 준비중</b> <br> 결제금액 : " + price + "원");
			}
		} else {
			out.print("배달 불가 지역입니다.");
		}
		
//		모범답안
//		if (address.startsWith("서울시") == false) { // ~가 거짓일때
//			out.print("배달 불가 지역입니다.");
//		} else if (card.contains("신한")) {
//			out.print("결제 불가 카드입니다.");
//		} else {
//			out.print(address + " <b>배달 준비중</b> <br> 결제금액 : " + price + "원");
//		}
		
		out.print("</body></html>");

	}
}
