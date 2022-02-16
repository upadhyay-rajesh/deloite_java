package com.myweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoadCaptchaServlet
 */
public class LoadCaptchaServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		
			int i=(int)((Math.random())*10000);
			out.println("<input type=text id=c5 disabled value="+i+"><button type=button value=refresh onclick=loadCaptcha()>refresh</button>");
			out.println("<br>Enter above number<input type=text id=c6 onblur=validatecaptcha()><div id=cresult></div>");
		
		out.println("</body></html>");
	}

}
