package com.org.loan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.loan.model.Customer;
@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
