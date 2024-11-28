package com.ust.bootsql.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.bootsql.Model.MyUser;
import com.ust.bootsql.repository.UserRepository;


@Service
public class MyUserdetailsservice implements UserDetailsService{
    @Autowired
    private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> user=repo.findByUsername(username);
		System.out.println(user.get().getUsername());
		return user.map(MyUserDetails::new)
				.orElseThrow(()->new UsernameNotFoundException("user not found"+username));
		
	}
	
	

}
