package com.cybage.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cybage.model.User;

@Repository
@Transactional
public class HomeDaoImpl implements HomeDao {

	@Autowired
	private SessionFactory factory;
	
	public HomeDaoImpl() {
		System.out.println("HomeDaoImpl Ctor");
	}
	
	@Override
	public String registerUser(User user) {
		
		Integer id = (Integer) factory.getCurrentSession().save(user);
		
		System.out.println("*****ID : "+id);
		
		if(id == null)
			return "fail";
		return "success";
	}

	@Override
	public User getUser(Integer id) {
		
		User user = (User)factory.getCurrentSession().get(User.class, id);
		return user;
	}

	@Override
	public boolean authenticate(String emailId) 
	{
		boolean flag = false;
		
		
		return flag;
	}
	
	
	

}
