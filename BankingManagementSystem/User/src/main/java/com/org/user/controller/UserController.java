package com.org.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.org.user.model.User;
import com.org.user.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin()
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/registration")
	public User registerUser(User user) throws Exception {
		String usrName = user.getUserName();
		if(usrName != null && !"".equals(usrName)) {
			User userObj = service.fetchUserByUserName(usrName);
			if(userObj != null) {
				throw new Exception("User with this::" +usrName+" is already Exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUserName = user.getUserName();
		String tempPassword = user.getPassword();
		User userObj = null;
		if( tempUserName !=null  && tempPassword != null) {
			userObj = service.fetchUserByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Wrong Credentials");
		}
		return userObj;
	}
}