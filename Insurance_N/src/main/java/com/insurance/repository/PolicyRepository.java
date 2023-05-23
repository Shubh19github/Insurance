package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Policy;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Serializable> {

}
