package com.cybage.dao;

import com.cybage.model.User;

public interface HomeDao {
	
	String registerUser(User user);
	User getUser(Integer id);
	boolean authenticate(String emailId);
}
