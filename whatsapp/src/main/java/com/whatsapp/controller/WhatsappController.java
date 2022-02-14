package com.whatsapp.controller;

import java.util.List;
import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {

	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		WhatsappServiceInterface ws=new WhatsappService();
		
		int i=ws.createprofileService(wu);
		
		if(i>0) {
			System.out.println("profile created successfully");
		}

	}

	public void viewallProfileController() {
		WhatsappServiceInterface ws=new WhatsappService();
		List<WhatsappUser> w=ws.viewallProfileService();
		
		System.out.println(w.size()+"  record found");
		
		for(WhatsappUser a:w) {
			if(a!=null) {
				System.out.println("********************");
				System.out.println("Name is "+a.getName());
				System.out.println("Password is "+a.getPassword());
				System.out.println("Email is "+a.getEmail());
				System.out.println("Address is "+a.getAddress());
			}
		}
		
	}

	public void viewProfileController() {
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name to view profile");
		String name=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		
		WhatsappServiceInterface ws=new WhatsappService();
		
		WhatsappUser w1=ws.viewProfileService(wu);
		
		if(w1!=null) {
			System.out.println("profile is below");
			System.out.println("Name is "+w1.getName());
			System.out.println("Password is "+w1.getPassword());
			System.out.println("Email is "+w1.getEmail());
			System.out.println("Address is "+w1.getAddress());
		}
		else {
			System.out.println("profile not exist for user "+name);
		}
		
	}

	public void deleteProfileController() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name to delete profile");
		String name=sc.next();
		
		WhatsappUser wu=new WhatsappUser();
		wu.setName(name);
		
		WhatsappServiceInterface ws=new WhatsappService();
		
		int i=ws.deleteProfileService(wu);
		
		if(i>0) {
			System.out.println("profile deleted successfully");
		}
		else {
			System.out.println("could not delete");
		}
		
	}

}









