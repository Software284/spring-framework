package com.lamichhane.course.apis.bookws.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

//	private User user = null;
	public UserService() {
//		user = new User("mahesh","$2a$12$gpf7xoaToIIxcwtq89RkzO.E.GGZNgjlWXvMMZcTXZIzYAAO1oZL2",true);
	}
	
	public User getUserByUsername(String username) {
	    
		Optional<User> optionalUser = UserRepository.findByUsername(username);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}
		else {
			return null;
		}
	}
}
