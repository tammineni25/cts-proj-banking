package com.org.user.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")
public class User {
	
	private String name;
	private String userName;
	private String password;
	private String guardianName;
	private String address;
	private String email;
	private String gender;
	private String maritalStatus;
	private long contactno;
	private String dob;
	private String acctType;	
}
