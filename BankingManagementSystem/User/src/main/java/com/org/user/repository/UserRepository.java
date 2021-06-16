package com.org.user.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.org.user.model.User;


@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
	public User findByUserName(String userName);
	public User findByUserNameAndPassword(String userName, String password);
}
