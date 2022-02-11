package com.whatsapp.dao;

import java.util.List;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappDAOInterface {

	int createProfileDAO(WhatsappUser wu);

	List<WhatsappUser> viewAllProfileDAO();

	WhatsappUser viewProfileDAO(WhatsappUser ws);

	int deleteProfileDAO(WhatsappUser wu);

}
