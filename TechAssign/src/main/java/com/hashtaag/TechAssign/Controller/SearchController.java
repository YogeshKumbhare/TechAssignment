package com.hashtaag.TechAssign.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hashtaag.TechAssign.Model.DistrictDetails;
import com.hashtaag.TechAssign.Model.State;
import com.hashtaag.TechAssign.Model.TownDetails;
import com.hashtaag.TechAssign.Service.SearchService;

@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/state", method = RequestMethod.GET)
	public List<State> getStateDetails(@RequestParam(value = "q") String state) {

		
		List<State> searchStateResults = null;
		searchStateResults = searchService.getAllStateDetails(state);
		return searchStateResults;

	}

	@RequestMapping(value = "/town", method = RequestMethod.GET)
	public List<TownDetails> getTownDetails(@RequestParam(value = "q") String town) {

		List<TownDetails> searchTownDetails = null;
		searchTownDetails  = searchService.getAllTownDetails(town);
		return searchTownDetails;

	}
	
	@RequestMapping(value = "/district", method = RequestMethod.GET)
	public List<DistrictDetails> getDistrictDetails(@RequestParam(value = "q") String district) {

		List<DistrictDetails> dtDetails = null;
		dtDetails  = searchService.getAllDistrictDetails(district);
		return dtDetails;

	}
	
	
	
}
