package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Serializable> {

}
