package com.insurance.service;

import com.insurance.model.Premium;

public interface PremiumService {
	
	public Premium getPremiumById(Integer Id);
	
	//public Premium getPremiumAll();
	
	public Premium savePremium(Premium premium);

}
