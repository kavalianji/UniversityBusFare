package com.bus.fare.daoimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.fare.dao.PaymentDao;
import com.bus.fare.entity.CardDetails;
import com.bus.fare.entity.Payer;
import com.bus.fare.model.Response;
import com.bus.fare.repo.CustomJpaRepositroy;

@Service
@Transactional
public class PaymentDaoImpl implements PaymentDao<CardDetails>{

	@Autowired
	CustomJpaRepositroy custom_repo;
	@Override
	public Response save(CardDetails cardDetails) {
		// TODO Auto-generated method stub
		Response response = new Response();
		custom_repo.save(cardDetails);
		
		response.setErrorCode("1001");
		response.setErrorMessage("Error Occured Ashok");
		return response;
	}

}
