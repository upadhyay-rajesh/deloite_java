package com.myweb.dao;

import com.myweb.entity.MyWebEntity;

public interface MyWebDAOInterface {

	int createProfileDAO(MyWebEntity w);

	boolean loginProfileDAO(MyWebEntity m);

}
