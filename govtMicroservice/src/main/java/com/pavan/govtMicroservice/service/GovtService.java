package com.pavan.govtMicroservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.govtMicroservice.model.Govt;
import com.pavan.govtMicroservice.repo.GovtRepository;

@Service
public class GovtService {
	
	@Autowired private GovtRepository govtRepository;
	
	public List<Govt> getAll() {
		return govtRepository.findAll();
	}

	public Optional<Govt> getPenaltyVehicleDetails(String number) {
		return govtRepository.findById(number);
	}
	
	

}
