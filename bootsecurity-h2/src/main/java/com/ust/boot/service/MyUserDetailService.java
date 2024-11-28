package com.ust.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ust.boot.repository.UserRepository;

public class MyUserDetailService implements UserDetailsService{
	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<MyUser> user=repo.findByUsername(username);
		if(user.isPresent()) {
			return loadUserByUsername(username);
		}else {
			throw new UsernameNotFoundException(username);
		}
	}
	

}
