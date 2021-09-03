package com.nisha.restAPIMain.serviceImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nisha.restAPIMain.exception.ResourceNotFoundException;
import com.nisha.restAPIMain.model.User;
import com.nisha.restAPIMain.respository.UserRespository;
import com.nisha.restAPIMain.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRespository;

	public List<User> getUser() {
		return userRespository.findAll();
	}

	public ResponseEntity<User> getUsersById(long id) throws ResourceNotFoundException {

		User user = userRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not found on :: " + id));

		return ResponseEntity.ok().body(user);
	}

	public User saveUser(User user) {
		return userRespository.save(user);
	}

	@Override
	public ResponseEntity<User> updateUser(long id, User user) throws ResourceNotFoundException {

		User user1 = userRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for::" + id));
		user1.setFirstName(user.getFirstName());
		user1.setLastName(user.getLastName());
		user1.setUpdatedAt(new Date());
		final User updatedUser = userRespository.save(user1);
		return ResponseEntity.ok(updatedUser);

	}

	@Override
	public Map<String, Boolean> deleteUser(long id) throws ResourceNotFoundException {
		User user = userRespository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for::" + id));
		userRespository.delete(user);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;

	}

}
