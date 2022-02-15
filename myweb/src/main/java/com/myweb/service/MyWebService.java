package com.myweb.service;

import java.util.List;

import com.myweb.dao.MyWebDAO;
import com.myweb.dao.MyWebDAOInterface;
import com.myweb.entity.MyWebEntity;

public class MyWebService implements MyWebServiceInterface {

	@Override
	public int createProfileService(MyWebEntity w) {
		MyWebDAOInterface md=new MyWebDAO();
		
		return md.createProfileDAO(w);
	}

	@Override
	public boolean loginProfile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.loginProfileDAO(m);
	}

	@Override
	public MyWebEntity viewprofile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.viewprofileDAO(m);
	}

	@Override
	public List<MyWebEntity> searchProfile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.searchrofileDAO(m);
	}

	@Override
	public int deleteprofile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.deleteProfileDAO(m);
	}

	@Override
	public int editprofile(MyWebEntity m) {
		MyWebDAOInterface md=new MyWebDAO();
		return md.editProfileDAO(m);
	}

}
