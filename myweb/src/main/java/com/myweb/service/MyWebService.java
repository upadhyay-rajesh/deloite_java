package com.myweb.service;

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

}
