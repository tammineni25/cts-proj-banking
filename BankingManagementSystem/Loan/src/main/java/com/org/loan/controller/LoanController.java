package com.org.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.loan.model.Loan;
import com.org.loan.service.LoanService;
import com.org.loan.config.ResponseEnvelope;



@RestController
@CrossOrigin
@RequestMapping("loan")
public class LoanController {
	@Autowired
	LoanService loanService;
	@PostMapping("/applyLoans")
	public ResponseEnvelope<Loan> loan( @RequestBody Loan loan) throws Exception {
		Loan loanObj = null;
		loanObj = loanService.saveLoan(loan);
		return ResponseEnvelope.of(loanObj);
	}
	
}
