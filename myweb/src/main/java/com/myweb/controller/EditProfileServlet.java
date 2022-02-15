package com.myweb.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myweb.entity.MyWebEntity;
import com.myweb.service.MyWebService;
import com.myweb.service.MyWebServiceInterface;

/**
 * Servlet implementation class EditProfileServlet
 */
public class EditProfileServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession(true);
		Object oo=s.getAttribute("id");
		String email=oo.toString();
		
		MyWebEntity m=new MyWebEntity();
		m.setEmail(email);
		
		MyWebServiceInterface ms=new MyWebService();
		MyWebEntity mm=ms.viewprofile(m);
		
		request.setAttribute("result", mm);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/editprofile.jsp");
		rd.forward(request, response);
		
		
	}

}
