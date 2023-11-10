package com.bus.fare.daoimpl;

import static org.junit.jupiter.api.Assertions.*;



import javax.persistence.MapKey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bus.fare.entity.CardDetails;
import com.bus.fare.repo.CustomJpaRepositroy;

class PaymentDaoImplTest {
	PaymentDaoImpl paymentdaoimpl;
	CardDetails cardDetails;
	
	@InjectMocks
	CustomJpaRepositroy custom_repo;
	@BeforeEach
	public void setup() {
		//custom_repo = Mockito.mock(CustomJpaRepositroy.class);
		paymentdaoimpl = new PaymentDaoImpl();
		cardDetails = new CardDetails();
		cardDetails.setCard_Holder_Name("rahim");
		cardDetails.setExp_Date(12);
		cardDetails.setCard_Cvv(998);
	}
	
	@Test
	void savetest() {
		paymentdaoimpl.save(cardDetails);
	}

}
