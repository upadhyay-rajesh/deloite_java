package com.facebookbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FacebookController {

	@RequestMapping("createProfile")
	public ModelAndView registerUser(@RequestParam("nm") String name,@RequestParam("pass") String password,@RequestParam("em") String email,@RequestParam("ad") String address) {
		/*
		 String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		String address=request.getParameter("ad");
		 */
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("n1",name);
		mv.addObject("n2",password);
		mv.addObject("n3",email);
		mv.addObject("n4",address);
		
		mv.setViewName("registerresult.jsp");
		
		return mv;
	}
}
