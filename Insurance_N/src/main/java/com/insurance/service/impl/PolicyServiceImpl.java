package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	// create logger object
			private static final Logger logger = LoggerFactory.getLogger(ClaimServiceImpl.class);

			// inject repository reference
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {

		Policy policy1 = policyRepository.save(policy);
		
		// 1st
		logger.info("In Policy Service Impl>> savePolicy()");

		return policy1;
	}

}
