package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Premium;
import com.insurance.repository.PremiumRepository;
import com.insurance.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	// create logger object
	private static final Logger logger = LoggerFactory.getLogger(ClaimServiceImpl.class);

	// inject repository reference
	@Autowired
	private PremiumRepository premiumRepository;

	@Override
	public Premium getPremiumById(Integer Id) {
		Premium premium = premiumRepository.getPremiumById(Id);

		// 1st
		logger.info("In Premium Service Impl>> getPremiumById()");
		return premium;
	}

	@Override
	public Premium savePremium(Premium premium) {

		// 2nd
		logger.info("In Premium Service Impl>> savePremium()");

		return premiumRepository.save(premium);
	}

}
