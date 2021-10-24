package com.pavan.govtMicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pavan.govtMicroservice.model.Govt;
import com.pavan.govtMicroservice.service.GovtService;

@RestController
public class GovtController {
	
	@Autowired private GovtService govtService;
	
	@RequestMapping("/govt")
	private List<Govt> getAll(){
		return govtService.getAll();
		
	}
	
	@RequestMapping("/govt/{number}")
	private Govt getPenaltyVehicleDetails(@PathVariable String number) {
		Optional<Govt> temp = govtService.getPenaltyVehicleDetails(number);
		if(temp.isPresent()) {
			//Govt body = temp.get();
			//RestTemplate rt = new RestTemplate();
			//rt.getForObject("https://localhost:8082", Govt.class);
			//return "send notification mail to police with vehicle and penalty details";
			return temp.get();
		}
		return new Govt();
	}
	
	

}
