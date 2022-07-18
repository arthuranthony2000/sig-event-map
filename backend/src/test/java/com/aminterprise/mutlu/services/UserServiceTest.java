package com.aminterprise.mutlu.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.aminterprise.mutlu.entities.User;
import com.aminterprise.mutlu.entities.UserStatus;
import com.aminterprise.mutlu.repositories.UserRepository;
import com.aminterprise.mutlu.dto.UserDTO;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService service;
	
	@Autowired
	private UserRepository repository;
	
	@Test
	public void testFindAllUsers() {
		List<UserDTO> list = service.findAll();
		assert(list.size() > 0);
	}
	
	@Test
	public void testFindUsersActiveOrAdm() {
		List<UserDTO> list = service.findUsers();
		assert(list.size() > 0);
	}
	
	@Test
	public void testLoginUser() {
		User user = service.loginUser("btow.m@hotmail.com");
		assert(user != null);
	}
	
	@Test
	public void testInsertUser() {
		UserDTO user = new UserDTO(null, "Test", "test@gmail.com", "000.000-00", "test", UserStatus.USERATIVO, new ArrayList<>());
		UserDTO userReturned = service.insert(user);
		repository.deleteById(userReturned.getId());
		assert(userReturned != null);		
	}
	
	@Test
	public void testUpdateUser() {
		UserDTO oldUser = new UserDTO(null, "Test", "test@gmail.com", "000.000-00", "test", UserStatus.USERATIVO, new ArrayList<>());
		
		UserDTO oldUserReturned = service.insert(oldUser);
		oldUserReturned.setName("TestUpdated");		
		
		service.updateUser(oldUserReturned.getId(), oldUserReturned);
		
		User newUser = repository.findById(oldUserReturned.getId()).get();	
		
		repository.deleteById(newUser.getId());
		
		assert(newUser.getName() != oldUser.getName());	
	}
}

















