package com.insurance.service;

import com.insurance.model.Nominee;

public interface NomineeService {
	
	public Nominee saveNominee(Nominee nominee);
	
	public Nominee updateNominee(Nominee nominee);
	
	public Nominee getNominee(Integer id);
	
	public void deleteNominee(Integer id);

}
