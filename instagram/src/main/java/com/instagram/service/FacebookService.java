package com.instagram.service;

import com.instagram.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface{
	static FacebookUser uu[]=new FacebookUser[10];
	
	public int createProfileService(FacebookUser fb) {
		int i1=0;
		
		for(int i=0;i<uu.length;i++) {
			if(uu[i]==null) {
				uu[i]=fb;
				i1=1;
				break;
			}
		}
		
		return i1;
	}
	
	public FacebookUser[] viewAllProfileService() {
			return uu;
	}
}
