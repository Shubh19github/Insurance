package com.insurance.service;

import com.insurance.model.Policy;

public interface PolicyService {

	public Policy savePolicy(Policy policy);

	public void deletePolicy(Integer id);

	public Policy updatePolicy(int id);

}
