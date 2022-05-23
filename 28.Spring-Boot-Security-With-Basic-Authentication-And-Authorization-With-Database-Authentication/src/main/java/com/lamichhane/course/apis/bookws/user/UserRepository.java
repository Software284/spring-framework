package com.lamichhane.course.apis.bookws.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,String> {
	
	UserEntity findByUsername(String username);
	
	
}
