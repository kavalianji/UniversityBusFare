package com.bus.fare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bus.fare.config.JwtTokenUtil;
import com.bus.fare.daoimpl.JwtUserDetailsService;
import com.bus.fare.model.JwtRequest;
import com.bus.fare.model.JwtResponse;

/*
 * @CrossOrigin annotation for the controller method. This @CrossOrigin
 * annotation supports specific REST API, and not for the entire application.
 */
@RestController
@CrossOrigin
public class JwtAuthenticationController {
	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationManager authenticationManager; 

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new JwtResponse(token));
	}

	void authenticate(String username, String password) throws Exception {
		System.out.println("User Name:"+username);
		System.out.println("User password:"+password);
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}

}
