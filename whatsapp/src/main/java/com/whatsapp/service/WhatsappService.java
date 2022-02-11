package com.whatsapp.service;

import java.util.List;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {
	
	//static WhatsappUser wu1[]=new WhatsappUser[10];

	public int createprofileService(WhatsappUser wu) {
		/*
		 * int a=0; for(int i=0;i<wu1.length;i++) { if(wu1[i]==null) { wu1[i]=wu; a=1;
		 * break; } }
		 */
		
		WhatsappDAOInterface wd=new WhatsappDAO();
		return wd.createProfileDAO(wu);
	}

	public List<WhatsappUser> viewallProfileService() {
		// TODO Auto-generated method stub
		WhatsappDAOInterface wd=new WhatsappDAO();
		
		List<WhatsappUser> w=wd.viewAllProfileDAO();
		return w;
	}

	public WhatsappUser viewProfileService(WhatsappUser ws) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		return wd.viewProfileDAO(ws);
	}

	public int deleteProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		return wd.deleteProfileDAO(wu);
	}

}
