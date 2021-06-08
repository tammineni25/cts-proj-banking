package com.org.loan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.loan.model.Loan;
@Repository
public interface LoanRepository extends MongoRepository<Loan, Integer> {
	
}
