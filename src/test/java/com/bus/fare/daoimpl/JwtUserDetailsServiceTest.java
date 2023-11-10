package com.bus.fare.daoimpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.reflection.Whitebox;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class JwtUserDetailsServiceTest {
	JwtUserDetailsService jwtuserdetailsservices;
	String secret;
	String password;
	BCryptPasswordEncoder enCounter;
	@BeforeEach
	public void setup() throws Exception {
		enCounter = new BCryptPasswordEncoder();
		jwtuserdetailsservices = new JwtUserDetailsService();
		secret = "value";
		password = "pwd";
		Whitebox.setInternalState(jwtuserdetailsservices, "secret", secret);
		Whitebox.setInternalState(jwtuserdetailsservices, "password", password);
		Whitebox.setInternalState(jwtuserdetailsservices, "enCounter", enCounter);
	}

	@Test
	void loadUserByUsernametest() {
		String username=secret;
		jwtuserdetailsservices.loadUserByUsername(username);
//		secret.equals(username);
	}
	
	@Test
	void loadUserByUsernametestelse() {
		String username=null;
		try {
		jwtuserdetailsservices.loadUserByUsername(username);
		}
		catch(Exception e) {
	}
}
}


