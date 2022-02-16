package com.myweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.entity.MyWebEntity;
import com.myweb.service.MyWebService;
import com.myweb.service.MyWebServiceInterface;

/**
 * Servlet implementation class CheckEmailServlet
 */
public class CheckEmailServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("myemail");
		
		MyWebEntity m=new MyWebEntity();
		m.setEmail(email);
		
		MyWebServiceInterface ms=new MyWebService();
		boolean mm=ms.checkemail(m);
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		if(mm) {
			out.println("<font color=red>Email Already Exist</font>");
		}
		else {
			out.println("<font color=green>Valid Email</font>");
		}
		out.println("</body></html>");
	}

}





