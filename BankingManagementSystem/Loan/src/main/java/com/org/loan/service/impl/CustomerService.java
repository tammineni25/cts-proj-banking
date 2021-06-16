package com.org.loan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.common.exception.BankManagementSystemException;
import com.org.loan.model.Customer;
import com.org.loan.model.Loan;
import com.org.loan.repository.CustomerRepository;
import com.org.loan.repository.LoanRepository;
import com.org.loan.service.ICustomerService;
import java.util.Objects;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	LoanRepository loanRepository;

	@Override
	public void createCustomer(Customer cust) {
		if(!isDuplicateCustomer(cust.getCustomerId())) { 
			customerRepository.save(cust);
		}

	}
	
	public boolean isDuplicateCustomer(String custId) {
		return customerRepository.findFirstByCustomerId(custId)
				.map(cust-> !Objects.isNull(cust))
				.orElseThrow(()-> new BankManagementSystemException("Customer already there."));

	}

	@Override
	public void applyLoan(Loan loan) {
		loanRepository.save(loan);
		
	}

}
