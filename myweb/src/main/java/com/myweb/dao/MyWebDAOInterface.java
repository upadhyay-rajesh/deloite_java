package com.myweb.dao;

import java.util.List;

import com.myweb.entity.MyWebEntity;

public interface MyWebDAOInterface {

	int createProfileDAO(MyWebEntity w);

	boolean loginProfileDAO(MyWebEntity m);

	MyWebEntity viewprofileDAO(MyWebEntity m);

	List<MyWebEntity> searchrofileDAO(MyWebEntity m);

	int deleteProfileDAO(MyWebEntity m);

	int editProfileDAO(MyWebEntity m);

	boolean checkemailDAO(MyWebEntity m);

}
