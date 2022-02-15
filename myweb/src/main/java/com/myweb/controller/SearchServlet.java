package com.myweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("nm");

		MyWebEntity m = new MyWebEntity();
		m.setName(name);

		MyWebServiceInterface ms = new MyWebService();
		List<MyWebEntity> b = ms.searchProfile(m);
		if (b.size() > 0) {
			request.setAttribute("result", b);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/searchresult.jsp");
			rd.forward(request, response);
		}

	}

}
