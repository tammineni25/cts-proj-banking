package com.org.loan.service;

import com.org.loan.model.Customer;
import com.org.loan.model.Loan;

public interface ICustomerService {
	void createCustomer(Customer cust);
	// void addAccount(Loan account);
	void applyLoan(Loan account);
}
