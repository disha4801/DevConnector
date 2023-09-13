package com.dnb.DevConnector.service;


import java.util.Optional;

import com.dnb.DevConnector.dto.User;
import com.dnb.DevConnector.exceptions.InvalidIdException;
import com.dnb.DevConnector.exceptions.InvalidIdNotFoundException;

public interface UserService {
	
public User createUser(User user);
	
	public Optional<User> getUserByEmailId(String emailId);
	
	public Iterable<User> getAllUsers();
	
	public boolean deleteUserByEmailId(String emailId) throws InvalidIdNotFoundException;
}
