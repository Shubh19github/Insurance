package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Claim;

@Repository
public interface ClaimRepository extends CrudRepository<Claim, Integer> {

}
