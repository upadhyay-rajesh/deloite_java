package com.whatsapp.view;

import java.util.Scanner;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappView {

	public static void main(String[] args) {
		
		String ss="y"; //////
		
		while(ss.equals("y")) {
		System.out.println("*************MAIN MENU****************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view all profile");
		System.out.println("press 3 to view  profile");
		System.out.println("press 4 to delete  profile"); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		
		int ch=sc.nextInt();
		
		WhatsappControllerInterface wc=new WhatsappController();
		
		switch(ch) {
		case 1: wc.createProfileController();
			break;
		case 2: wc.viewallProfileController();
		break;
		case 3: wc.viewProfileController();
		break;
		case 4: wc.deleteProfileController();
		break;
			default:System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		}

	}

}
