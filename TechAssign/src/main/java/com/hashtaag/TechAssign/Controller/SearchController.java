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
import com.vfi.dtm.exception.DataNotFoundException;

import io.micrometer.core.instrument.util.StringUtils;

@RestController
public class SearchController {

	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/state", method = RequestMethod.GET)
	public List<State> getStateDetails(@RequestParam(value = "q") String state) {
		List<State> searchStateResults = null;
		try {
		if(StringUtils.isNotBlank(state)) {
		
		searchStateResults = searchService.getAllStateDetails(state);
		}else {
			throw new DataNotFoundException("Search Data Not Found");
		}
		}catch(Exception e ){
			e.printStackTrace();
		}
		return searchStateResults;

	}

	@RequestMapping(value = "/town", method = RequestMethod.GET)
	public List<TownDetails> getTownDetails(@RequestParam(value = "q") String town) {

		List<TownDetails> searchTownDetails = null;
		try {
			if (StringUtils.isNotBlank(town)) {
				searchTownDetails = searchService.getAllTownDetails(town);
			} else {
				throw new DataNotFoundException("Search Data Not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return searchTownDetails;

	}
	
	@RequestMapping(value = "/district", method = RequestMethod.GET)
	public List<DistrictDetails> getDistrictDetails(@RequestParam(value = "q") String district) {

		List<DistrictDetails> dtDetails = null;
		try {
		if(StringUtils.isNotBlank(district)) {
			dtDetails  = searchService.getAllDistrictDetails(district);
		}else {
			throw new DataNotFoundException("Search Data Not Found");
		}
		}catch(Exception e ) {
			e.printStackTrace();
		}
		return dtDetails;

	}
	
	
	
}
