package com.nisha.restAPIMain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.nisha.restAPIMain.exception.ResourceNotFoundException;
import com.nisha.restAPIMain.model.User;
import com.nisha.restAPIMain.service.UserService;

@RestController
@RequestMapping("/usr/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public String index() {
		return "Hello!";
	}

	@GetMapping("/user/")
	public List<User> getAllUser() {
		return userService.getUser();
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") long id) throws ResourceNotFoundException {
		return userService.getUsersById(id);
	}

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);

	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") long id, User user)
			throws ResourceNotFoundException {
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/user/{id}")
	public Map<String,Boolean> deleteUser(@PathVariable (value="id") long id ) throws ResourceNotFoundException{
		
		return userService.deleteUser(id);
	}

}
