package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Claim;
import com.insurance.repository.ClaimRepository;
import com.insurance.service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService {

	// create logger object
	private static final Logger logger = LoggerFactory.getLogger(ClaimServiceImpl.class);

	// inject repository reference
	@Autowired
	private ClaimRepository claimRepository;

	@Override
	public Claim saveClaim(Claim claim) {

		// 1st
		logger.info("In Claim Service Impl>> saveClaim()");

		return claimRepository.save(claim);

	}

	@Override
	public Claim updateClaim(Claim claim) {

		// 2nd
		logger.info("In Claim Service Impl>> updateClaim()");

		Integer integer = claim.getId();
		Claim claim1 = claimRepository.getClaimById(integer);
		claim1.setPolicyId(claim.getPolicyId());
		claim1.setClaimId(claim.getClaimId());
		claim1.setClaimStatus(claim.getClaimStatus());
		claim1.setClaimAmount(claim.getClaimAmount());
		Claim claim2 = claimRepository.save(claim1);

		return claim2;
	}

	@Override
	public Claim getClaimById(Integer id) {

		// 3rd
		logger.info("In Claim Service Impl>> getClaimByid()");

		Claim claim3 = claimRepository.getClaimById(id);
		return claim3;
	}

	@Override
	public void deleteClaim(Integer id) {
	

		// 4th
		logger.info("In Claim Service Impl>> deleteClaimByid()");

		claimRepository.deleteById(id);
		
	}
}
