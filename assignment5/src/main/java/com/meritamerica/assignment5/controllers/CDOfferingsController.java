package com.meritamerica.assignment5.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.meritamerica.assignment5.models.CDOffering;

@RestController
public class CDOfferingsController {

	protected List<CDOffering> cdOfferingList = new ArrayList<CDOffering>();
	
	@PostMapping("/CDOfferings")
	@ResponseStatus(HttpStatus.CREATED)
	public CDOffering addCDOfferings(@RequestBody @Valid CDOffering cdOffering) {
		
		cdOfferingList.add(cdOffering);
		CDOffering.setCDOfferingList(cdOfferingList);
		return cdOffering;
	}
	
	@GetMapping("/CDOfferings")
	@ResponseStatus(HttpStatus.OK)
	public List<CDOffering> getCDOfferings() {
		
		return cdOfferingList;
	}
	
	public CDOffering getCDOfferingById(int id) {
		return cdOfferingList.get(id);
	}
}
