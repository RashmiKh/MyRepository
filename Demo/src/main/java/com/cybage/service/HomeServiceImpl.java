package com.cybage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.HomeDao;
import com.cybage.model.User;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeDao dao;
	
	public HomeServiceImpl() {
		System.out.println("HomeServiceImpl Ctor");
	}
	
	@Override
	public String registerUser(User user) 
	{
		return dao.registerUser(user);
	}

	@Override
	public String getUser(Integer id) {
		
		User user =  dao.getUser(id);
		user.setUserEmail("sameer.com");
		return user.toString();
	}

}
