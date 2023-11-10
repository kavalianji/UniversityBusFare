package com.bus.fare.model;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JwtRequestTest {
	static JwtRequest jwtrequest ;
	static long serialversion;
	@BeforeAll
	public static void before() {
		serialversion = 5926468583005150707L;
	}
	
	@BeforeEach
	public void setUp() {
		jwtrequest = new JwtRequest("hi", "123");
	}
	@Test
	void  JwtRequestTest() {
		new JwtRequest();
	}
	
	@Test
	void JwtRequestTest1() {
		new JwtRequest("hi", "123");
	}
	
	@Test
	void getUsernameTest() {
		String username  = jwtrequest.getUsername();
		assertEquals(username, "hi");
	}
	
	@Test
	void setUsernameTest() {
		String username ="John";
		jwtrequest.setUsername(username);
	}
	
	@Test
	void getPasswodTest() {
		String password =jwtrequest.getPassword();
		assertEquals(password, "123");
	}
	
	@Test
	void setPasswordTest() {
		jwtrequest.setPassword("89");
	}
	
	@Test
	void getSerialversionuidTest() {
		Long serial = jwtrequest.getSerialversionuid();
		assertEquals(serial,serialversion );
	}
	
	@Test
	void toStringTest()
	{
		String string = jwtrequest.toString();
		assertEquals(string, jwtrequest.toString());
	}
	
	@AfterAll
	public static void end() {
		jwtrequest = null;
	}
}
