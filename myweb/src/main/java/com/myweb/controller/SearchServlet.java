package com.myweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.entity.MyWebEntity;
import com.myweb.service.MyWebService;
import com.myweb.service.MyWebServiceInterface;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		
		MyWebEntity m=new MyWebEntity();
		m.setName(name);
		
		MyWebServiceInterface ms=new MyWebService();
		List<MyWebEntity> b=ms.searchProfile(m);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body><center><table border=5>");
			out.println(b.size()+" Record Found");
			for(MyWebEntity mm:b) {
				out.println("<tr>");
					out.println("<td>Name is</td><td>"+mm.getName()+"</td>");
					out.println("<td>Password is </td><td>"+mm.getPassword()+"</td>");
					out.println("<td>Email is</td><td>"+mm.getEmail()+"</td>");
					out.println("<td>Address is </td><td>"+mm.getAddress()+"</td>");
				out.println("</tr>");
			}
		out.println("</table></center></body></html>");
	}

}











