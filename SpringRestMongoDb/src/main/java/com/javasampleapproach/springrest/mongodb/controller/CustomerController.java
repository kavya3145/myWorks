package com.javasampleapproach.springrest.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mongodb.model.Admin;
import com.javasampleapproach.springrest.mongodb.model.Cart;
import com.javasampleapproach.springrest.mongodb.model.Coupon;
import com.javasampleapproach.springrest.mongodb.model.Customer;
import com.javasampleapproach.springrest.mongodb.repo.AdminRepo;
import com.javasampleapproach.springrest.mongodb.repo.CartRepo;
import com.javasampleapproach.springrest.mongodb.repo.CouponRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	Customer repository;
	
	@Autowired
	AdminRepo repo;
	
	@Autowired
	CartRepo repo3;
	
	@Autowired
	CouponRepo repo2;

	@GetMapping("/coupon")
	public List<Coupon> getAllCustomers() {
		System.out.println("Get all Customers...");

		List<Coupon> customers = new ArrayList<>();
		repo2.findAll().forEach(customers::add);

		return customers;
	}
	
	@GetMapping("/cart")
	public List<Cart> getCartCoupon() {
		System.out.println("Get all Customers...");

		List<Cart> customers = new ArrayList<>();
		repo3.findAll().forEach(customers::add);

		return customers;
	}


	@PostMapping("/customers/valid")
	Customer validateUser(@RequestBody Customer userlog) {
System.out.println(userlog);
	List<Customer> login=repository.findAll();
	System.out.println(login);
	for(Customer dblog:login) {
		System.out.println(dblog.getUname()+" ="+userlog.getUname());
		if(dblog.getUname().equals(userlog.getUname())&&dblog.getPass().equals(userlog.getPass())) {
		
			return dblog;
	}	
}
	return null;
}
	
	@PostMapping("/admin/valid")
	Admin validateAdmin(@RequestBody Admin userlog) {
System.out.println(userlog);
	List<Admin> login=repo.findAll();
	System.out.println(login);
	for(Admin dblog:login) {
		System.out.println(dblog.getUname()+" ="+userlog.getUname());
		if(dblog.getUname().equals(userlog.getUname())&&dblog.getPass().equals(userlog.getPass())) {
			
			return dblog;
	}	
}
	return null;
}

	@PostMapping("/coupon/create")
	public Coupon postCustomer(@RequestBody Coupon customer) {

		Coupon _customer = repo2.save(new Coupon(customer.getName(),customer.getCategory(),customer.getPrice(),customer.getDescription(),customer.getImgurl()));
		return _customer;
	}
	

	@PostMapping("/customers/create")
	public Customer postCustomer(@RequestBody Customer customer) {

		Customer _customer = repository.save(new Customer(customer.getName(),customer.getEmail(),customer.getUname(),customer.getPass()));
		return _customer;
	}
	
	
	@PostMapping("/cart/add")
	public Cart addCart(@RequestBody Cart customer) {

		Cart _customer = repo3.save(new Cart(customer.getUname(),customer.getCoupon()));
		return _customer;
	}
	
	@PostMapping("/admin/create")
	public Admin postAdmin(@RequestBody Admin customer) {

		Admin _customer = repo.save(new Admin(customer.getName(),customer.getEmail(),customer.getUname(),customer.getPass()));
		return _customer;
	}

	@DeleteMapping("/coupon/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("id") String id) {
		System.out.println("Delete Customer with ID = " + id + "...");

		repo2.deleteById(id);

		return new ResponseEntity<>("Customer has been deleted!", HttpStatus.OK);
	}

	@DeleteMapping("/customers/delete")
	public ResponseEntity<String> deleteAllCustomers() {
		System.out.println("Delete All Customers...");

		repository.deleteAll();

		return new ResponseEntity<>("All customers have been deleted!", HttpStatus.OK);
	}

	@GetMapping("customers/age/{uname}")
	public String findByName(@PathVariable String name) {

		List<Customer> customers = repository.findByName(name);
		return "Hi customer"+name;
	}

	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable("id") String id, @RequestBody Customer customer) {
		System.out.println("Update Customer with ID = " + id + "...");

		Optional<Customer> customerData = repository.findById(id);

		if (customerData.isPresent()) {
			Customer _customer = customerData.get();
			_customer.setName(customer.getName());
			_customer.setEmail(customer.getEmail());
			
			return new ResponseEntity<>(repository.save(_customer), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
