package com.springbootfirstproject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootfirstproject.dao.InstagramDAOInterface;
import com.springbootfirstproject.entity.InstagramUser;

@Service
@Transactional
public class InstagramService implements InstagramServiceInterface{
	
	@Autowired
	InstagramDAOInterface id;

	@Override
	public int createProfile(InstagramUser iu) {
		int i=0;
		id.save(iu);
		i=1;
		return i;
	}

	@Override
	public List<InstagramUser> viewAllProfile() {
		// TODO Auto-generated method stub
		return id.findAll();
	}

	@Override
	public InstagramUser viewProfile(InstagramUser i) {
		// TODO Auto-generated method stub
		Optional<InstagramUser> ii1=id.findById(i.getEmail());
		return ii1.get();
	}

	@Override
	public int editProfileService(InstagramUser iu) {
		int i=0;
		id.saveAndFlush(iu);
		i=1;
		return i;
	}

	@Override
	public int deleteProfileService(InstagramUser i1) {
		int i=0;
		id.deleteById(i1.getEmail());
		i=1;
		return i;
	}

	@Override
	public String loginProfile(InstagramUser i) {
		InstagramUser dd=id.loginUser(i.getEmail(),i.getPassword());
		if(dd!=null) {
			return "login success";
		}
		else {
			return "login fail";
		}
		
	}

}
