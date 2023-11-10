package com.bus.fare.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.authentication.AuthenticationManager;

import com.bus.fare.config.JwtTokenUtil;
import com.bus.fare.daoimpl.BusDaoimpl;
import com.bus.fare.daoimpl.JwtUserDetailsService;
import com.bus.fare.model.JwtRequest;
import com.bus.fare.repo.BusFairRepo;

public class JwtAuthenticationControllerTest {
	static JwtAuthenticationController JwtAuthenticationController 
							= new JwtAuthenticationController();
	JwtRequest jwt = new JwtRequest();
	
	
	private static AuthenticationManager authenticationManager; 
	
	private static JwtUserDetailsService userDetailsService;
	@Mock

	private static JwtTokenUtil jwtTokenUtil;

	@BeforeAll
	public static void setUp() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		authenticationManager = Mockito.mock(AuthenticationManager.class);
		Field privateJWTControllerField = JwtAuthenticationController.class.getDeclaredField("authenticationManager");
		privateJWTControllerField.setAccessible(true);
		privateJWTControllerField.set(JwtAuthenticationController, authenticationManager);
		
		
		userDetailsService = Mockito.mock(JwtUserDetailsService.class);
		Field privateJWTControllerField1 = JwtAuthenticationController.class.getDeclaredField("userDetailsService");
		privateJWTControllerField1.setAccessible(true);
		privateJWTControllerField1.set(JwtAuthenticationController, userDetailsService);

		
		jwtTokenUtil = Mockito.mock(JwtTokenUtil.class);
		Field privateJWTControllerField2= JwtAuthenticationController.class.getDeclaredField("userDetailsService");
		privateJWTControllerField2.setAccessible(true);
		privateJWTControllerField2.set(JwtAuthenticationController, jwtTokenUtil);

	}
	@Test
	void createAuthenticationTokenTest() throws Exception {
		jwt.setUsername("hi");
		jwt.setPassword("123");
		JwtAuthenticationController.createAuthenticationToken(jwt);
	}
	
	/*
	 * @Test void authenticateTest() throws Exception {
	 * JwtAuthenticationController.authenticate("j", "k"); }
	 */
}
