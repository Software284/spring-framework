package com.lamichhane.userws.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lamichhane.userws.user.User;
import com.lamichhane.userws.user.UserService;



@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		User user = userService.getUserByUsername(username);
//		System.out.println(user);
		if(user != null) {
			return user;
		}
		else {
			throw new UsernameNotFoundException(username+" does not exist");
	
		}
		
	}

}
