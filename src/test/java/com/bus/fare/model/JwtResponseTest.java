package com.bus.fare.model;

import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JwtResponseTest {
	public static JwtResponse jwtresponse;
	@BeforeEach
	public void setup() {
		jwtresponse = new JwtResponse("hi");
	}
	@Test
	void JwtResponseTest() {
		String jwttoken = jwtresponse.getJwttoken();
		new JwtResponse(jwttoken);
		assertEquals(jwttoken, "hi");
	}
	@Test
	void getJwttokenTest() {
		String jwttoken = jwtresponse.getJwttoken(); 
		jwtresponse.getJwttoken();
		assertEquals(jwttoken, "hi");
	}
	@AfterAll
	public static void end() {
		jwtresponse = null;
	}

}
