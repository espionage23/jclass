package com.naver.www;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FormSend")
public class FormSend extends HttpServlet {

    protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doAction 호출");
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String gender = request.getParameter("gender");
    	String major = request.getParameter("major");
    	String[] hobby =request.getParameterValues("hobby");
    	System.out.println("아이디 : "+id);
    	System.out.println("패스워드 : "+pw);
    	System.out.println("이름 : "+name);
    	System.out.println("성별 : "+gender);
    	System.out.println("학과 : "+major);
    	String hobbys = "";
    	for(int i=0; i<hobby.length; i++) {
    		if(i==0)hobbys += hobby[i];
    		hobbys += ","+hobby[i];
    		System.out.println(hobby[i]+" ");
    	}
    	System.out.println();
    	System.out.println("취미 : "+hobbys);
    	//String[] h = hobbys.split(",");// 분리
    	
    	//
    	response.setContentType("text/html;charset=utf-8");
    	request.setCharacterEncoding("utf-8");
    	PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title></title></head>");
		writer.println("<body>");		
		writer.println("<h2>서블릿 페이지 오픈</h2>");		
		writer.println("</body>");		
		writer.println("</html>");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}

}
