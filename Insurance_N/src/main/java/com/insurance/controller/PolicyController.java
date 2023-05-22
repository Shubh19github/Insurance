package com.insurance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	
	// create object of logger
		private static final Logger logger = LoggerFactory.getLogger(ClaimController.class);


	
	@Autowired
	private PolicyService policyService;

	@PostMapping("/savePolicy")
	public ResponseEntity<Policy> savePolicy(@RequestBody Policy policy) {
		
		Policy policy1=policyService.savePolicy(policy);
		
		logger.info("In Rest Controller->savePolicy, Save Policy data");
		
		return ResponseEntity.ok().body(policy1);
		
	}
}
