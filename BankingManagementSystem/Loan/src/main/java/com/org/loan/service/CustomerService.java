package com.org.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.loan.model.Customer;

import com.org.loan.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepo;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

}
