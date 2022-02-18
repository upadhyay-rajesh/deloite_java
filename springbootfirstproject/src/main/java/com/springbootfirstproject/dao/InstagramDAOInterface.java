package com.springbootfirstproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootfirstproject.entity.InstagramUser;

@Repository
public interface InstagramDAOInterface extends JpaRepository<InstagramUser, String>{

	@Query("from com.springbootfirstproject.entity.InstagramUser f where f.email=:em and f.password=:pw")
	InstagramUser loginUser(@Param("em") String email, @Param("pw") String password);

}
