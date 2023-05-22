package com.insurance.controller;

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

import com.insurance.model.Premium;
import com.insurance.service.PremiumService;

@RestController
@RequestMapping("/premium")
public class PremiumController {
	
	// create object of logger
		private static final Logger logger = LoggerFactory.getLogger(ClaimController.class);


	@Autowired
	private PremiumService premiumService;
	
	
	//Design API to get all the premium details from database
	//Design API to get user with multiple premium details from database

	@GetMapping("/get/{id}")
	public ResponseEntity<Premium> getPremiumById(@PathVariable("id") Integer id) {

		Premium premium = premiumService.getPremiumById(id);
		
		logger.info("In Rest Controller->getPremiumbyId, Get Premium data");
		
		return ResponseEntity.ok().body(premium);

	}
 
	/*@GetMapping("/get/all")
	public ResponseEntity<Premium> getPremiumAll() {

		Premium premium = premiumService.getPremiumAll();
		
		logger.info("In Rest Controller->getPremium, Get All Premium data");
		
		return ResponseEntity.ok().body(premium);

	
}*/
	
	// Design API to save all the premium details into database
	@PostMapping("/save")
	public ResponseEntity<Premium> savePremium (@RequestBody Premium premium){
		
		Premium premium1=premiumService.savePremium(premium);
		
		logger.info("In Rest Controller-> savePremium, save Premium data");
		
		return ResponseEntity.ok().body(premium1);
		
		
	}
}