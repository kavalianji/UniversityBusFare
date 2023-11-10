package com.bus.fare.controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.bus.fare.daoimpl.BusDaoimpl;
import com.bus.fare.entity.BusModel;
import com.bus.fare.repo.BusFairRepo;

class BusControllerTest {
	BusController buscontroller = new BusController();
	BusDaoimpl busdaoimpl = new BusDaoimpl();
	BusFairRepo busrep ;
	BusModel busmodel=new BusModel(); 
	
	@Test
	void faredetailstest() {
		buscontroller.fareDetails();
	}
	
	@Test
	void updateFairChargestest() {
		buscontroller.updateFairCharges();
	}

	@Test
	void uploadFiletest() throws IOException {
		
		byte[] inputFile = new byte[4];
		inputFile[0]=78;
		MockMultipartFile file = new MockMultipartFile("file", "NameOfTheFile", "multipart/form-data", inputFile );
		 MockHttpServletRequest request = new MockHttpServletRequest();
		   request.addParameter("parameterName", "someValue");
		   buscontroller.uploadFile(file, request);
	}
	
	@Test
	void uploadFileCatch() throws IOException {
		buscontroller.uploadFile(null, null);
	}
	
	@Test
	void findTest() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		busrep =Mockito.mock(BusFairRepo.class);
		Field privateBusFairRepoField = BusDaoimpl.class.getDeclaredField("busrep");
		privateBusFairRepoField.setAccessible(true);
		privateBusFairRepoField.set(busdaoimpl, busrep);
		buscontroller.impl=busdaoimpl;
		buscontroller.find();
	}
}
