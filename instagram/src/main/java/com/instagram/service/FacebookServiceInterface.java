package com.instagram.service;

import com.instagram.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createProfileService(FacebookUser fb) ;
	public FacebookUser[] viewAllProfileService() ;
}
