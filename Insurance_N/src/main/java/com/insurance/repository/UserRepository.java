package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
