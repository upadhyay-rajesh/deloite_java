package com.springbootfirstproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootfirstproject.entity.InstagramUser;
import com.springbootfirstproject.entity.Shop;

@Repository
public interface ShopDAOInterface extends JpaRepository<Shop, String>{

	
}
