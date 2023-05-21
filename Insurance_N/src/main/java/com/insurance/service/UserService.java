package com.insurance.service;


import com.insurance.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	//public User getUser(User user);

	public User getClaimById(Integer id);

}
