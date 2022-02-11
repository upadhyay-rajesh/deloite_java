package com.instagram.controller;

import java.util.Scanner;
import com.instagram.entity.*;
import com.instagram.service.*;
public class FacebookController implements FacebookControllerInterface{
	
	
	
	public void createProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.next();
		
		System.out.println("Enter Password : ");
		String password=sc.next();
		
		System.out.println("Enter Email : ");
		String email=sc.next();
		
		System.out.println("Enter Address : ");
		String address=sc.next();
		
		FacebookUser fb=new FacebookUser();
		fb.setName(name);
		fb.setPassword(password);
		fb.setEmail(email);
		fb.setAddress(address);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.createProfileService(fb);
		
		if(i>0) {
			System.out.println("your profile created successfully and detail is below");
		}
		
		
		
		
		
	}
	
	public void deleteProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to delete profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile deleted successfully");
		
	}
	
	public void viewProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to view profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile viewed successfully");
		
	}
	
	public void searchProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to search profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile deleted successfully");
		
	}
	
	public void viewAllProfile() {
		
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser uu[]=fs.viewAllProfileService();
		
		for(int i=0;i<uu.length;i++) {
			if(uu[i]!=null) {
				System.out.println("********************");
				System.out.println("Name is "+uu[i].getName()+" password is "+uu[i].getPassword()+" email is "+uu[i].getEmail()+" address is "+uu[i].getAddress());
			}
		
		}
		
	}
	public void editProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to edit profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile edited successfully");
		
	}
}
