package com.whatsapp.controller;

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
		WhatsappUser w[]=ws.viewallProfileService();
		
		for(int i=0;i<w.length;i++) {
			if(w[i]!=null) {
				System.out.println(w[i].getName());
			}
		}
		
	}

}









