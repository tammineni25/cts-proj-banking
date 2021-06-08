package com.org.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.loan.config.ResponseEnvelope;
import com.org.loan.model.Customer;
import com.org.loan.service.CustomerService;

import io.swagger.annotations.Api;

@RestController
@Api
@CrossOrigin
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@PostMapping("/updateCustomer")
	public ResponseEnvelope<Customer> customerUpdate(@RequestBody Customer customer) throws Exception {
		Customer customerObj = null;
		customerObj = customerService.saveCustomer(customer);
		return ResponseEnvelope.of(customerObj);
	}
}
