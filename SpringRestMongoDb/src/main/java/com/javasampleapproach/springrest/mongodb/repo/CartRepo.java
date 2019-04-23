package com.javasampleapproach.springrest.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.Cart;
import com.javasampleapproach.springrest.mongodb.model.Coupon;

public interface CartRepo extends MongoRepository<Cart, String>{

}
