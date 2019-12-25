package com.hashtaag.TechAssign.Service;

import java.util.List;

import com.hashtaag.TechAssign.Model.DistrictDetails;
import com.hashtaag.TechAssign.Model.State;
import com.hashtaag.TechAssign.Model.TownDetails;


public interface SearchService {

	List<State> getAllStateDetails(String searchString);

	List<TownDetails> getAllTownDetails(String town);

	List<DistrictDetails> getAllDistrictDetails(String district);

}
