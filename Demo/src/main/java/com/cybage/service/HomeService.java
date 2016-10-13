package com.cybage.service;

import com.cybage.model.User;

public interface HomeService {
	
	String registerUser(User user);
	String getUser(Integer id);
}
