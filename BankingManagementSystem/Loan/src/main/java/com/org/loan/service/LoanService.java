package com.org.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.loan.model.Loan;
import com.org.loan.repository.LoanRepository;

@Service
public class LoanService {
	
	@Autowired 
	LoanRepository loanRepo;
	
	public Loan saveLoan(Loan loan) {
		return loanRepo.save(loan);
	}
}
