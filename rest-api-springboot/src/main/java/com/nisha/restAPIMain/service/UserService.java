package com.nisha.restAPIMain.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import com.nisha.restAPIMain.exception.ResourceNotFoundException;
import com.nisha.restAPIMain.model.User;



public interface UserService {

	public List<User> getUser();
	
	public ResponseEntity<User> getUsersById(long id) throws ResourceNotFoundException;
	
	public User saveUser(User user);
	
	public ResponseEntity<User> updateUser(long id, User user) throws ResourceNotFoundException;

	public Map<String, Boolean> deleteUser(long id) throws ResourceNotFoundException;
	
	
}
