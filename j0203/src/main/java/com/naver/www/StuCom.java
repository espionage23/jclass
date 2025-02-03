package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StuCom")
public class StuCom extends HttpServlet {
	
	// 학번, 이름, 국어, 영어, 수학, 합계, 평균 콘솔창, 웹페이지로 출력하시오.
	// String -> int	Integer.parseInt
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stuNo = request.getParameter("stuNo");
		String name = request.getParameter("name");
		String kor = request.getParameter("kor");
		String eng = request.getParameter("eng");
		String math = request.getParameter("math");
		
		int kor2 = Integer.parseInt(kor);
		int eng2 = Integer.parseInt(eng);
		int math2 = Integer.parseInt(math);
		int total = kor2+eng2+math2;
		double avg = total/3.0;
		
		System.out.println("학번 : "+ stuNo);
		System.out.println("이름 : "+ name);
		System.out.println("이름 : "+ kor);
		System.out.println("이름 : "+ eng);
		System.out.println("이름 : "+ math);
		System.out.println("이름 : "+ total);
		System.out.println("이름 : "+ avg);
		
		//
    	response.setContentType("text/html;charset=utf-8");
    	request.setCharacterEncoding("utf-8");
    	PrintWriter writer = response.getWriter();
    	writer.println("<html>");
		writer.println("<head><title></title></head>");
		writer.println("<body>");		
		writer.println("<h2>학생성적 정보</h2>");		
		writer.printf("<h4>학번 : %s </h4><br/>",stuNo);		
		writer.printf("<h4>이름 : %s </h4><br/>",name);		
		writer.printf("<h4>국어 : %s </h4><br/>",kor);		
		writer.printf("<h4>영어 : %s </h4><br/>",eng);		
		writer.printf("<h4>수학 : %s </h4><br/>",math);		
		writer.printf("<h4>합계 : %s </h4><br/>",total);		
		writer.printf("<h4>평균 : %s </h4><br/>",avg);		
		writer.println("</body>");		
		writer.println("</html>");
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}

}
