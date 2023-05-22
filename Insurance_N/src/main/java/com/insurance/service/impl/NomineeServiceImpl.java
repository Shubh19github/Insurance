package com.insurance.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Nominee;
import com.insurance.repository.NomineeRepository;
import com.insurance.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService {

	// create logger object
	private static final Logger logger = LoggerFactory.getLogger(NomineeServiceImpl.class);

	// inject repository reference
	@Autowired
	private NomineeRepository nomineeRepository;

	@Override
	public Nominee saveNominee(Nominee nominee) {
		// 1st
		logger.info("In Nominee Service Impl>> saveNominee()");

		return nomineeRepository.save(nominee);
	}

	@Override // updateNominee(Integer id)

	public Nominee updateNominee(Nominee nominee) {

		// 2nd
		logger.info("In Nominee Service Impl>> updateNominee()");

		Integer id = nominee.getUserid();
		Nominee nominee1 = nomineeRepository.findById(id).get();
		nominee1.setName(nominee.getName());
		nominee1.setRelation(nominee.getRelation());
		nominee1.setPercentage(nominee.getPercentage());
		Nominee nominee2 = nomineeRepository.save(nominee1);
		return nominee2;

	}

	@Override
	public Nominee getNominee(Integer id) {

		// 3rd
		logger.info("In Nominee Service Impl>> getNomineeByid()");

		Nominee nominee3 = nomineeRepository.getNomineeById(id);
		return nominee3;
	}

	@Override
	public void deleteNominee(Integer id) {

		// 4th
		logger.info("In Nominee Service Impl>> deleteNomineeByid()");
		nomineeRepository.deleteById(id);

	}

}
