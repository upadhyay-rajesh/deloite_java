package com.springbootfirstproject.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfirstproject.entity.InstagramUser;
import com.springbootfirstproject.service.InstagramServiceInterface;

@RestController
public class FacebookBootController {

	Logger log=Logger.getLogger("FacebookBootController");
	
	@Autowired
	InstagramServiceInterface is1;
	
	@GetMapping("showAll") //it is to retrieve information
	public List<InstagramUser> hello() {
		log.info("inside hello method");
		
		List<InstagramUser> ll=is1.viewAllProfile();
		return ll;
	}
	
	
	@GetMapping("viewProfile/{uid}") //it is to retrieve information
	public InstagramUser show(@PathVariable("uid") String userid) {
		log.info("inside hello method");
		
		InstagramUser i=new InstagramUser();
		i.setEmail(userid);
		
		InstagramUser ll=is1.viewProfile(i);
		return ll;
	}
	
	
	@PostMapping("create") //it is to create information
	public String hello1(@RequestBody InstagramUser iu) {
		int i=is1.createProfile(iu);
		
		String msg="profile creation failed";
		
		if(i>0) {
			msg="profile created";
		}
		
		
		return msg;
	}
	
	@PutMapping("editProfile/{uid}")  //it is to edit information
	public String hello2(@RequestBody InstagramUser iu,@PathVariable("uid") String userid) {
		iu.setEmail(userid);
		
		int i=is1.editProfileService(iu);
		
		String msg="could not edit profile ";
		
		if(i>0) {
			msg="profile edited";
		}
		
		
		return msg;
	}
	
	@DeleteMapping("deleteProfile/{uid}")  //it is to delete information
	public String hello3(@PathVariable("uid") String userid) {
		InstagramUser i1=new InstagramUser();
		i1.setEmail(userid);
		
		int i=is1.deleteProfileService(i1);
		
		String msg="could not delete profile ";
		
		if(i>0) {
			msg="profile deleted";
		}
		
		
		return msg;
	}
	
	
	@GetMapping("loginProfile/{uid}/{pass}") //it is to retrieve information
	public String login(@PathVariable("uid") String userid,@PathVariable("pass") String password) {
		log.info("inside hello method");
		
		InstagramUser i=new InstagramUser();
		i.setEmail(userid);
		i.setPassword(password);
		
		String ll=is1.loginProfile(i);
		return ll;
	}
	
	
	@PostMapping("assigndealertoshop/{shopid}/{dealerid}")
	
	public String assign(@PathVariable("shopid") String shopid,@PathVariable("dealerid") String dealerid) {
		String str=is1.assigndealertoshop(shopid,dealerid);
		return str;
	}
	
	
	
	
	
	
	
	
	
}
