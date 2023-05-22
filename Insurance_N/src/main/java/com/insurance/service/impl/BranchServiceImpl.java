package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Branch;
import com.insurance.repository.BranchRepository;
import com.insurance.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {
	
	// create logger object
		private static final Logger logger = LoggerFactory.getLogger(ClaimServiceImpl.class);

		// inject repository reference
	@Autowired
	private BranchRepository branchRepository;

	@Override
	public Branch saveBranch(Branch branch) {

		// 1st
		logger.info("In Branch Service Impl>> saveBranch()");
		
		return branchRepository.save(branch);
	
	}

}
