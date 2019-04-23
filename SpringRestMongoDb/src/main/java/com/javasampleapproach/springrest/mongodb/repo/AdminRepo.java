package com.javasampleapproach.springrest.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.Admin;

public interface AdminRepo extends MongoRepository<Admin, String>{
	
}
