package com.org.loan.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private long customerId;
	private String name;
	private long accountNumber;
	private String country;
	private String state;
	private String gender;
	private String dob;
	private String registrationDate;
	private String bankName;
	private String branchName;
	private String identificationProofType;
	private int identificationDocNumber;
	private String refAccountHolderName;
	private long refAccountHolderAccountNumber;
	private String refAccountHolderAddress;
	private String Address;
	private long ContactNumber;
	private String mailId;
	private String maritalStatus;
	private String accountType;
	private String citizenship;
	private String citizenStatus;
	private String guardianType;
	private String guardianName;
//	
//	public Customer() {}
//	public Customer(long customerId, String name, long accountNumber, String country, String state, String gender,
//			String dob, String registrationDate, String bankName, String branchName, String identificationProofType,
//			int identificationDocNumber, String refAccountHolderName, long refAccountHolderAccountNumber,
//			String refAccountHolderAddress, String address, long contactNumber, String mailId, String maritalStatus,
//			String accountType, String citizenship, String citizenStatus, String guardianType, String guardianName) {
//		super();
//		this.customerId = customerId;
//		this.name = name;
//		this.accountNumber = accountNumber;
//		this.country = country;
//		this.state = state;
//		this.gender = gender;
//		this.dob = dob;
//		this.registrationDate = registrationDate;
//		this.bankName = bankName;
//		this.branchName = branchName;
//		this.identificationProofType = identificationProofType;
//		this.identificationDocNumber = identificationDocNumber;
//		this.refAccountHolderName = refAccountHolderName;
//		this.refAccountHolderAccountNumber = refAccountHolderAccountNumber;
//		this.refAccountHolderAddress = refAccountHolderAddress;
//		Address = address;
//		ContactNumber = contactNumber;
//		this.mailId = mailId;
//		this.maritalStatus = maritalStatus;
//		this.accountType = accountType;
//		this.citizenship = citizenship;
//		this.citizenStatus = citizenStatus;
//		this.guardianType = guardianType;
//		this.guardianName = guardianName;
//	}
//	public long getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(long customerId) {
//		this.customerId = customerId;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getDob() {
//		return dob;
//	}
//	public void setDob(String dob) {
//		this.dob = dob;
//	}
//	public String getRegistrationDate() {
//		return registrationDate;
//	}
//	public void setRegistrationDate(String registrationDate) {
//		this.registrationDate = registrationDate;
//	}
//	public String getBankName() {
//		return bankName;
//	}
//	public void setBankName(String bankName) {
//		this.bankName = bankName;
//	}
//	public String getBranchName() {
//		return branchName;
//	}
//	public void setBranchName(String branchName) {
//		this.branchName = branchName;
//	}
//	public String getIdentificationProofType() {
//		return identificationProofType;
//	}
//	public void setIdentificationProofType(String identificationProofType) {
//		this.identificationProofType = identificationProofType;
//	}
//	public int getIdentificationDocNumber() {
//		return identificationDocNumber;
//	}
//	public void setIdentificationDocNumber(int identificationDocNumber) {
//		this.identificationDocNumber = identificationDocNumber;
//	}
//	public String getRefAccountHolderName() {
//		return refAccountHolderName;
//	}
//	public void setRefAccountHolderName(String refAccountHolderName) {
//		this.refAccountHolderName = refAccountHolderName;
//	}
//	public long getRefAccountHolderAccountNumber() {
//		return refAccountHolderAccountNumber;
//	}
//	public void setRefAccountHolderAccountNumber(long refAccountHolderAccountNumber) {
//		this.refAccountHolderAccountNumber = refAccountHolderAccountNumber;
//	}
//	public String getRefAccountHolderAddress() {
//		return refAccountHolderAddress;
//	}
//	public void setRefAccountHolderAddress(String refAccountHolderAddress) {
//		this.refAccountHolderAddress = refAccountHolderAddress;
//	}
//	public String getAddress() {
//		return Address;
//	}
//	public void setAddress(String address) {
//		Address = address;
//	}
//	public long getContactNumber() {
//		return ContactNumber;
//	}
//	public void setContactNumber(long contactNumber) {
//		ContactNumber = contactNumber;
//	}
//	public String getMailId() {
//		return mailId;
//	}
//	public void setMailId(String mailId) {
//		this.mailId = mailId;
//	}
//	public String getMaritalStatus() {
//		return maritalStatus;
//	}
//	public void setMaritalStatus(String maritalStatus) {
//		this.maritalStatus = maritalStatus;
//	}
//	public String getAccountType() {
//		return accountType;
//	}
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
//	public String getCitizenship() {
//		return citizenship;
//	}
//	public void setCitizenship(String citizenship) {
//		this.citizenship = citizenship;
//	}
//	public String getCitizenStatus() {
//		return citizenStatus;
//	}
//	public void setCitizenStatus(String citizenStatus) {
//		this.citizenStatus = citizenStatus;
//	}
//	public String getGuardianType() {
//		return guardianType;
//	}
//	public void setGuardianType(String guardianType) {
//		this.guardianType = guardianType;
//	}
//	public String getGuardianName() {
//		return guardianName;
//	}
//	public void setGuardianName(String guardianName) {
//		this.guardianName = guardianName;
//	}
	
}
