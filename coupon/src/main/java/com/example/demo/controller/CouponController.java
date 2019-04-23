package com.example.demo.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coupon;
import com.example.demo.repo.Repository;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CouponController {
	
	
	@Autowired
	Repository repo;
	
	
	
	@GetMapping("/coupons")
	public List<Coupon> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Coupon> customers = new ArrayList<>();
		repo.findAll().forEach(customers::add);

		return customers;
	}

}
