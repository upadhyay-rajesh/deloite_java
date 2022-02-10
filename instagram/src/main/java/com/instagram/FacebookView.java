package com.instagram;

import java.util.Scanner;

public class FacebookView {

	//system will create memory for all static method , here system will load main method into memory because it is static
	public static void main(String[] args) {
		String ss="y";
		
		while(ss.equals("y")) {
		System.out.println("****************MAIN MENU****************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to edit profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");

		System.out.println("enter your choice");

		// Scanner is used to take input from console or user
		Scanner sc = new Scanner(System.in); // scanf,cin

		int ch = sc.nextInt(); // nextInt() function will read user input in form of integer
		
		FacebookController fv=new FacebookController();

		switch (ch) {
		case 1:
			fv.createProfile();  //to call non-static method inside static we can use object of current class
			break;
		case 2:
			fv.viewProfile();
			break;
		case 3:
			fv.deleteProfile();
			break;
		case 4:
			fv.editProfile();
			break;
		case 5:
			fv.searchProfile();
			break;
		case 6:
			fv.viewAllProfile();
			break;
		default:
			System.out.println("wrong choice");

		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		}

	}
	
	//system will not create memory for all non static method , here system will not load createProfile method into memory because it is non-static
}


















