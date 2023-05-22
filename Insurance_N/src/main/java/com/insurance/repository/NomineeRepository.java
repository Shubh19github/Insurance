package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Nominee;

@Repository
public interface NomineeRepository extends CrudRepository<Nominee, Serializable> {

	public Nominee getNomineeById(Integer id);

}
