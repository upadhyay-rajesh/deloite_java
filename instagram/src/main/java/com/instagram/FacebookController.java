package com.instagram;

import java.util.Scanner;

public class FacebookController {
	
	static FacebookUser uu[]=new FacebookUser[10];
	
	void createProfile() {
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
		
		for(int i=0;i<uu.length;i++) {
			if(uu[i]==null) {
				uu[i]=fb;
				break;
			}
		}
		
		
		System.out.println("your profile created successfully and detail is below");
		System.out.println("Name is "+fb.getName()+" password is "+fb.getPassword()+" email is "+fb.getEmail()+" address is "+fb.getAddress());
	}
	
	void deleteProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to delete profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile deleted successfully");
		
	}
	
	void viewProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to view profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile viewed successfully");
		
	}
	
	void searchProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to search profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile deleted successfully");
		
	}
	
	void viewAllProfile() {
		
		for(int i=0;i<uu.length;i++) {
			if(uu[i]!=null) {
				System.out.println("********************");
				System.out.println("Name is "+uu[i].getName()+" password is "+uu[i].getPassword()+" email is "+uu[i].getEmail()+" address is "+uu[i].getAddress());
			}
		
		}
		
	}
	void editProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to edit profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile edited successfully");
		
	}
}
