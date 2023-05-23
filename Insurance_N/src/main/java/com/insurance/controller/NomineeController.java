package com.insurance.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Nominee;
import com.insurance.service.NomineeService;

@RestController
@RequestMapping("/nominee")
public class NomineeController {

	// create object of logger
	private static final Logger logger = LoggerFactory.getLogger(ClaimController.class);

	@Autowired
	private NomineeService nomineeService;

	// Design Restful web service to save/insert nominee details into database

	@PostMapping("/save")
	public ResponseEntity<Nominee> saveNominee(@RequestBody Nominee nominee) {

		Nominee nominee1 = nomineeService.saveNominee(nominee);

		logger.info("In Rest Controller->saveNominee, Save Nominee data");

		return ResponseEntity.ok().body(nominee1);

	}

	// Build the Restful web service to update nominee details

	@PutMapping("/update")
	public Nominee updateNominee(@RequestBody Nominee nominee) {

		Nominee nominee2 = nomineeService.updateNominee(nominee);

		logger.info("In Rest Controller->updateNominee, Update Nominee data");
		return nominee2;

	}

	// Build the Restful web service to get nominee details
	@GetMapping("/get/{id}")
	public ResponseEntity<Nominee> getNomineeById(@PathVariable("id") Integer id) {

		Nominee nominee3 = nomineeService.getNominee(id);

		logger.info("In Rest Controller->getNominee, Get Nominee data");

		return ResponseEntity.ok().body(nominee3);

	}

	// Build the Restful web service to delete nominee details
	@DeleteMapping("/delete/{id}")
	public void deleteNomineeById(@PathVariable("id") Integer id) throws Exception {

		nomineeService.deleteNominee(id);
	}

}
