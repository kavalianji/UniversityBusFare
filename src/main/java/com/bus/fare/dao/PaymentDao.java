package com.bus.fare.dao;

import org.springframework.stereotype.Service;

import com.bus.fare.model.Response;

@Service
public interface PaymentDao<T> {
 Response save(T cardDetails);
}
