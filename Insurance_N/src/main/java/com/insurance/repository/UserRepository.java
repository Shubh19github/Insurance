package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Serializable> {

	
	public User getUserById(Integer Id);
}
