package com.lamichhane.userws.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,String> {
	
	UserEntity findByUsername(String username);
	
	
}
