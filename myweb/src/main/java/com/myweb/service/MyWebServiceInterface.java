package com.myweb.service;

import java.util.List;

import com.myweb.entity.MyWebEntity;

public interface MyWebServiceInterface {

	int createProfileService(MyWebEntity w);

	boolean loginProfile(MyWebEntity m);

	MyWebEntity viewprofile(MyWebEntity m);

	List<MyWebEntity> searchProfile(MyWebEntity m);

	int deleteprofile(MyWebEntity m);

	int editprofile(MyWebEntity m);

	boolean checkemail(MyWebEntity m);

}
