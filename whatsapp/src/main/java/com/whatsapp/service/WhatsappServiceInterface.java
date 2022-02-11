package com.whatsapp.service;

import java.util.List;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	int createprofileService(WhatsappUser wu);

	List<WhatsappUser> viewallProfileService();

	WhatsappUser viewProfileService(WhatsappUser ws);

	int deleteProfileService(WhatsappUser wu);

}
