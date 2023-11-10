package com.bus.fare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.fare.entity.CardDetails;

public interface CustomJpaRepositroy extends JpaRepository<CardDetails, Integer>/* ,QuerydslPredicateExecutor<Payer> */{

}
