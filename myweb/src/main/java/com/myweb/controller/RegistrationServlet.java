package com.myweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.entity.MyWebEntity;
import com.myweb.service.MyWebService;
import com.myweb.service.MyWebServiceInterface;


public class RegistrationServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		String address=request.getParameter("ad");
		
		MyWebEntity w=new MyWebEntity();
		w.setAddress(address);
		w.setEmail(email);
		w.setPassword(password);
		w.setName(name);
		
		MyWebServiceInterface ms=new MyWebService();
		int i=ms.createProfileService(w);
		
		if(i>0) {
			request.setAttribute("result", "Profile created <a href=login.jsp>Sign In</a>");
			
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/register.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("result","could not create profile");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/register.jsp");
			rd.forward(request, response);
		}
		
		
		/*
		 * response.setContentType("text/html"); PrintWriter out=response.getWriter();
		 * 
		 * out.println("<html><body><center>");
		 * 
		 * out.println("</center></body></html>");
		 */
		
	}

}
