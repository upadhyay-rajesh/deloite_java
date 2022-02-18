package com.facebookbootweb.service;

import java.util.List;

import com.facebookbootweb.entity.FacebookUser;

public interface FacebooServiceInterface {

	int createProfileService(FacebookUser f);

	List<FacebookUser> displayAllProfileService();

}
