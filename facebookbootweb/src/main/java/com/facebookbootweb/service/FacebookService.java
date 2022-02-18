package com.facebookbootweb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebookbootweb.dao.FacebookDAOInterface;
import com.facebookbootweb.entity.FacebookUser;

@Service
@Transactional
public class FacebookService implements FacebooServiceInterface{
	@Autowired
	FacebookDAOInterface fd;

	@Override
	public int createProfileService(FacebookUser f) {
		// FacebookDAOInterface fd=new FacebookDAO();
		int i=0;
		fd.save(f);
		
		i=1;
		return i;
	}

	@Override
	public List<FacebookUser> displayAllProfileService() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}

}












