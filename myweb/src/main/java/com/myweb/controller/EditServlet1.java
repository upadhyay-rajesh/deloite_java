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
 * Servlet implementation class EditServlet1
 */
public class EditServlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		HttpSession s=request.getSession(true);
		Object oo=s.getAttribute("id");
		String email=oo.toString();
		String address=request.getParameter("ad");
		
		MyWebEntity w=new MyWebEntity();
		w.setAddress(address);
		w.setEmail(email);
		w.setPassword(password);
		w.setName(name);
		
		MyWebServiceInterface ms=new MyWebService();
		int i=ms.editprofile(w);
		
		System.out.println(i);
		
		if(i>0) {
			request.setAttribute("rr", "Profile edited");
			
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/editprofilesuccess.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("rr","could not edit profile");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/editprofilesuccess.jsp");
			rd.forward(request, response);
		}
	}

}
