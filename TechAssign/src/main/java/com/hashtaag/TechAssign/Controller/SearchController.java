package com.hashtaag.TechAssign.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hashtaag.TechAssign.Model.DistrictDetails;
import com.hashtaag.TechAssign.Model.State;
import com.hashtaag.TechAssign.Model.TownDetails;
import com.hashtaag.TechAssign.Service.SearchService;

@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/state/{state}", method = RequestMethod.GET)
	public List<State> getStateDetails(@PathVariable String state) {

		
		List<State> searchStateResults = null;
		searchStateResults = searchService.getAllStateDetails(state);
		return searchStateResults;

	}

	@RequestMapping(value = "/town/{town}", method = RequestMethod.GET)
	public List<TownDetails> getTownDetails(@PathVariable String town) {

		List<TownDetails> searchTownDetails = null;
		searchTownDetails  = searchService.getAllTownDetails(town);
		return searchTownDetails;

	}
	
	@RequestMapping(value = "/district/{district}", method = RequestMethod.GET)
	public List<DistrictDetails> getDistrictDetails(@PathVariable String district) {

		List<DistrictDetails> dtDetails = null;
		dtDetails  = searchService.getAllDistrictDetails(district);
		return dtDetails;

	}
	
	
	
}
