package com.org.user;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.org.user.model.User;
import com.org.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class UserTest {

	@Autowired
	private UserService service; 
		
	
	
	@Test
	public void testRegistration() {
		User user = new User("Ramesh","tammi1234","as.as@gmail.com", null, null, null, null, null, 0, null, null);
		assertNotNull(service.fetchUserByUserName("Ramesh123"));
	}
	
	
	
	@Test(expected=IllegalArgumentException.class)
	public void avoidInvalidEMail() {
		User user = new User("Ramesh","tammi1234","as.as@gmail.com",null, null, null, null, null, 0, null, null);
		service.saveUser(user);
	}
	
	@Test
	public void userNotInitiallyRegistered() {
		assertNull(service.fetchUserByUserName("Ravi123"));
	}
		
}