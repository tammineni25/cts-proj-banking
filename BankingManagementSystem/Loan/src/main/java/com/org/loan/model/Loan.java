package com.org.loan.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "loan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
	
	private String loanType;
	private double loanAmount;
	private String loanApplyDate;
	private double rateOfInterest;
	private int dourationOfLoan;
	private double courseFee;
	private String course;
	private String fatherName;
	private double anualIncome;
	private String companyName;
		
}
