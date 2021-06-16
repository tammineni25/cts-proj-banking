package com.org.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.common.exception.BankManagementSystemException;
import com.org.common.handlers.ResponseHandlers;
import com.org.common.model.ServiceResponse;
import com.org.user.model.User;
import com.org.user.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin()
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/registration")
	public ResponseEntity<ServiceResponse<User>> registerUser(@RequestBody User user) throws BankManagementSystemException {
		String usrName = user.getUserName();
		if(usrName != null && !"".equals(usrName)) {
			User userObj = service.fetchUserByUserName(usrName);
			if(userObj != null) {
				throw new BankManagementSystemException("User with this::" +usrName+" is already Exist");
			}
		}
		 service.saveUser(user);
		return new ResponseHandlers<String>().defaultResponse("User Created Successfully.", HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<ServiceResponse<User>> loginUser(@RequestBody User user) throws BankManagementSystemException {
		User userObj = null;
		if( user.getUserName() !=null  && user.getPassword() != null) {
			userObj = service.fetchUserByUserNameAndPassword(user.getUserName(), user.getPassword());
		}
		if(userObj == null) {
			throw new BankManagementSystemException("Invalid Credentials");
		}
		return new ResponseHandlers<String>().defaultResponse("Login Successfully.", HttpStatus.CREATED);
	}
}
