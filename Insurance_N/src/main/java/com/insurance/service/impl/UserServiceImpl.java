package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.User;
import com.insurance.repository.NomineeRepository;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// create logger object
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	// inject repository reference
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {

		// 1st
		logger.info("In User Service Impl>> saveUser()");

		return userRepository.save(user);

	}

	
	
	@Override
	public User getClaimById(Integer Id) {
		
		User user=userRepository.getUserById(Id);
		
		// 2nd
				logger.info("In User Service Impl>> getUser()");

		
		return user;
	}



	@Override
	public User getNomineeById(Integer id) {
		
		User user1=userRepository.getNomineeById(id);
		
		// 3rd
		logger.info("In User Service Impl>> getNominee()");
		
		return user1;
	}
}
