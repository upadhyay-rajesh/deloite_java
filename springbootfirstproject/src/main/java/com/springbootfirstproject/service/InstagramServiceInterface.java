package com.springbootfirstproject.service;

import java.util.List;

import com.springbootfirstproject.entity.InstagramUser;

public interface InstagramServiceInterface {

	int createProfile(InstagramUser iu);

	List<InstagramUser> viewAllProfile();

	InstagramUser viewProfile(InstagramUser i);

	int editProfileService(InstagramUser iu);

	int deleteProfileService(InstagramUser i1);

	String loginProfile(InstagramUser i);

	String assigndealertoshop(String shopid, String dealerid);

}
