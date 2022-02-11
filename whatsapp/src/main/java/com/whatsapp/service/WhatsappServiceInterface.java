package com.whatsapp.service;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	int createprofileService(WhatsappUser wu);

	WhatsappUser[] viewallProfileService();

}
