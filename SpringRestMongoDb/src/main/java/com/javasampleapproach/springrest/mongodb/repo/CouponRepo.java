package com.javasampleapproach.springrest.mongodb.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.Coupon;
import com.javasampleapproach.springrest.mongodb.model.Customer;

public interface CouponRepo extends MongoRepository<Coupon, String>{
	List<Customer> findByCategory(String category);
}