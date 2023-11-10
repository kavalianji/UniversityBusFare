package com.bus.fare.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bus.fare.daoimpl.PaymentDaoImpl;
import com.bus.fare.entity.CardDetails;
import com.bus.fare.model.DoSupport;
import com.bus.fare.model.Response;

@Validated
@RestController
@RequestMapping(value = "payer",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class PayerController extends DoSupport{
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired 
	PaymentDaoImpl pay_dao_impl;
	
	@PostMapping("doPayment")
	public Response doPay(@Valid @RequestBody CardDetails txnDetails,BindingResult result) {
		log.debug("PayController:Executed");
		return result.hasErrors()?constructErrorMessage(result):pay_dao_impl.save(txnDetails);	
	}	
}
