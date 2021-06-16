package com.org.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.user.model.User;
import com.org.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired 
	UserRepository userRepo;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	public User fetchUserByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}
	public User fetchUserByUserNameAndPassword(String userName, String password) {
		return userRepo.findByUserNameAndPassword(userName, password);
	}

}
