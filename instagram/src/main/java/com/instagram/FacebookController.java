package com.instagram;

import java.util.Scanner;

public class FacebookController {
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
		
		System.out.println("your profile created successfully and detail is below");
		System.out.println("Name is "+name+" password is "+password+" email is "+email+" address is "+address);
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
		
		
		System.out.println("all profile are below");
		
	}
	void editProfile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name to edit profile : ");
		String name=sc.next();
		
		
		System.out.println("your profile edited successfully");
		
	}
}
