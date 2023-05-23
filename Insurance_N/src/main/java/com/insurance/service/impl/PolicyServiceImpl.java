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
		logger.info("In Policy Service Impl>> savePolicy()");
		Policy policy1 = policyRepository.save(policy);
		return policy1;
	}

	@Override
	public Policy updatePolicy(int id) {

		Policy policy = policyRepository.findById(id).get();
		policy.setPolicyId(policy.getPolicyId());
		policy.setPolicyNumber(policy.getPolicyNumber());
		policy.setPolicyEffectiveDate(policy.getPolicyEffectiveDate());
		policy.setPolicyExpDate(policy.getPolicyExpDate());
		policy.setPayment_Option(policy.getPayment_Option());
		policy.setTotalAmount(policy.getTotalAmount());
		policy.setCreatedDate(policy.getCreatedDate());
		policy.setAdditionalInfo(policy.getAdditionalInfo());
		Policy policy2 = policyRepository.save(policy);
		return policy2;

	}

	@Override
	public void deletePolicy(Integer id) {
		policyRepository.deleteById(id);

	}

}
