package com.insurance.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Claim;
import com.insurance.model.User;
import com.insurance.service.ClaimService;
import com.insurance.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	// create object of logger
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	// Inject the service here
	@Autowired
	private UserService userService;

	@Autowired
	private ClaimService claimService;

	// Build the Restful web service to add user with multiple claim details

	@PostMapping("/saveUserClaim")
	ResponseEntity<User> saveUserClaim(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		List<Claim> claim1 = user.getClaimList();

		for (Claim claim : claim1) {
			claim.setUserid(user.getId());
			claimService.saveClaim(claim);
		}
		logger.info("In Rest Controller->saveUserClaim, Save UserClaim data");
		return ResponseEntity.ok().body(user);

	}

	// Build the Restful web service to fetch user with multiple claim details

	@GetMapping("/getUserClaim/{id}")
	public User getClaimById(@PathVariable("id") Integer id) {

		User user = userService.getClaimById(id);
		List<Claim> claim2 = user.getClaimList();

		for (Claim claim : claim2) {
			claim.setUserid(user.getId());
			claimService.saveClaim(claim);
		}
		logger.info("In Rest Controller->getUserClaim, Get UserClaim data");

		return user;

	}

}
