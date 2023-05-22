package com.insurance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Branch;
import com.insurance.service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	
	// create object of logger
		private static final Logger logger = LoggerFactory.getLogger(ClaimController.class);


	@Autowired
	private BranchService branchService;

	@PostMapping("/saveBranch")
	public ResponseEntity<Branch> saveBranch(@RequestBody Branch branch) {

		Branch branch1 = branchService.saveBranch(branch);
		
		logger.info("In Rest Controller->saveBranch, Save Branch data");

		return ResponseEntity.ok().body(branch1);

	}

	
}
