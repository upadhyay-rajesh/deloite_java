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

public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("em");
		String password =request.getParameter("pass");
		
		MyWebEntity m=new MyWebEntity();
		m.setEmail(email);
		m.setPassword(password);
		
		MyWebServiceInterface ms=new MyWebService();
		boolean b=ms.loginProfile(m);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body><center>");
			if(b) {
				out.println("Welcome "+email);
				out.println("<button><a href=ViewProfileServlet>View Profile</a></button>");
				out.println("<button><a href=EditProfileServlet>Edit Profile</a></button>");
				out.println("<button><a href=DeleteProfileServlet>Delete Profile</a></button>");
				out.println("<button><a href=SearchProfileServlet>Search Profile</a></button>");
				out.println("<button><a href=ViewAllProfileServlet>View All Profile</a></button>");
			}
			else {
				out.println("Invalid Id and Password <a href=login.html>Try Again</a>");
				
			}
		out.println("</center></body></html>");
	}

}
