package com.org.user.model;

import org.springframework.data.mongodb.core.mapping.Document;

//import lombok.Getter;
//import lombok.Setter;

@Document(collection = "user")
//@Setter
//@Getter
public class User {
	
	private String name;
	private String userName;
	private String password;
	private String guardianName;
	private String address;
	private String email;
	private String maritalStatus;
	private long contactno;
	private String dob;
	private String acctType;
	
	
	public User() {}
			
	public User(String name, String userName, String password, String guardianName, String address,
			String email, String maritalStatus, long contactno, String dob, String acctType) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.guardianName = guardianName;
		this.address = address;
		this.email = email;
		this.maritalStatus = maritalStatus;
		this.contactno = contactno;
		this.dob = dob;
		this.acctType = acctType;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	
}