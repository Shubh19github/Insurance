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

import com.insurance.model.Claim;
import com.insurance.service.ClaimService;

@RestController
@RequestMapping("/claim")
public class ClaimController {

	// create object of logger
	private static final Logger logger = LoggerFactory.getLogger(ClaimController.class);

	@Autowired
	private ClaimService claimService;

	// Design Restful web service to save/insert claim details into database

	@PostMapping("/save")
	public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim) {

		Claim claim1 = claimService.saveClaim(claim);

		logger.info("In Rest Controller->saveClaim, Save Claim data");

		return ResponseEntity.ok().body(claim1);

	}

	// Build the Restful web service to update claim details

	@PutMapping("/update")
	public Claim updateClaim(@RequestBody Claim claim) {

		Claim claim2 = claimService.updateClaim(claim);

		logger.info("In Rest Controller->updateClaim, Update Claim data");
		return claim2;

	}

	// Build the Restful web service to get claim details
	@GetMapping("/get/{id}")
	public ResponseEntity<Claim> getClaimById(@PathVariable("id") Integer id) {

		Claim claim3 = claimService.getClaimById(id);

		logger.info("In Rest Controller->getClaim, Get Claim data");

		return ResponseEntity.ok().body(claim3);

	}

	// Build the Restful web service to delete claim details
    @DeleteMapping("/delete/{id}")
	public void deleteClaimById(@PathVariable("id") Integer id) throws Exception {

		claimService.deleteClaim(id);
	}
}