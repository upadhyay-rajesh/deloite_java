package com.facebookbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.facebookbootweb.entity.FacebookUser;
import com.facebookbootweb.service.FacebooServiceInterface;

@Controller
public class FacebookController {
	@Autowired
	FacebooServiceInterface fs;

	@RequestMapping("createProfile")
	public ModelAndView registerUser(@RequestParam("nm") String name,@RequestParam("pass") String password,@RequestParam("em") String email,@RequestParam("ad") String address) {
		/*
		 String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		String address=request.getParameter("ad");
		 */
		
		FacebookUser f=new FacebookUser();
		f.setAddress(address);
		f.setEmail(email);
		f.setName(name);
		f.setPassword(password);
		
		//FacebooServiceInterface fs=new FacebookService(); this object creation spring BeanFactory class will do internelly if we will write @Autowired as line no 13
		String msg="Registration Fail";
		
		int i=fs.createProfileService(f);
		if(i>0) {
			 msg="Registration Success";
		}
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("n1",msg);
				
		mv.setViewName("registerresult.jsp");
		
		return mv;
	}
	
	@RequestMapping("showAll")
	public ModelAndView displayallUser() {
		
		List<FacebookUser> ll=fs.displayAllProfileService();
				
		ModelAndView mv=new ModelAndView();
		mv.addObject("n1",ll);
				
		mv.setViewName("displayall.jsp");
		
		return mv;
	}
}














