package com.newer.web.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newer.web.Order;


public interface OrderRepository extends MongoRepository<Order, String> {
	
}
