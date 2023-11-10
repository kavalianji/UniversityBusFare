package com.bus.fare.daoimpl;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bus.fare.model.JwtRequest;


@Service
public class JwtUserDetailsService implements UserDetailsService{

	@org.springframework.beans.factory.annotation.Value("${jwt.secret}")
	private String secret;
	
	@org.springframework.beans.factory.annotation.Value("${jwt.password}")
	private String password;
	
	@Autowired
	private BCryptPasswordEncoder enCounter;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (secret.equals(username)) {
			JwtRequest jwt = new JwtRequest();
			jwt.setPassword(enCounter.encode(password));
			  return new User(secret,
			  jwt.getPassword(), new
			  ArrayList<>());
			 
			
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}