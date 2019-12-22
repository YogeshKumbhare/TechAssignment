package com.hashtaag.TechAssign.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashtaag.TechAssign.Model.Citi;
import com.hashtaag.TechAssign.Model.DistrictDetails;
import com.hashtaag.TechAssign.Model.State;
import com.hashtaag.TechAssign.Model.TownDetails;
import com.hashtaag.TechAssign.Repository.CitiRepository;



@Service
public class SearchStringImpl implements SearchService{

	@Autowired
	private CitiRepository citiRepository;
	
	
	@Override
	public List<State> getAllStateDetails(String searchString) {

		
		
		List<Citi> listOfState = citiRepository.findAllByState(searchString);
		
		List<State> stateData = new ArrayList();
		
		for (Citi state : listOfState) {
		
			State st = new State();
			st.setState(state.getState());
			st.setDistrict(state.getDistrict());
			st.setDistrictCode(state.getDistrictCode());
			stateData.add(st);
		}
		System.out.println(stateData.toString());
		
		return stateData;
	}


	@Override
	public List<TownDetails> getAllTownDetails(String town) {

		List<Citi> listOfTown = citiRepository.findAllByTownInIgnoreCase(town);

		List<TownDetails> townData = new ArrayList();
		
		for (Citi citi : listOfTown) {
			TownDetails tw = new TownDetails();
			tw.setTown(citi.getTown());
			tw.setState(citi.getState());
			tw.setDistrict(citi.getDistrict());
			
			townData.add(tw);
		}
		System.out.println(townData.toString());
		
		return townData;
	}


	@Override
	public List<DistrictDetails> getAllDistrictDetails(String district) {
		// TODO Auto-generated method stub
		List<Citi> listOfDist = citiRepository.findAllByDistrictInIgnoreCase(district);

		List<DistrictDetails> dtData = new ArrayList();
		
		for (Citi citi : listOfDist) {
			DistrictDetails tw = new DistrictDetails();
			tw.setTown(citi.getTown());
			tw.setState(citi.getState());
			tw.setDistrict(citi.getDistrict());
			tw.setDistrictCode(citi.getDistrictCode());
			tw.setState_code(citi.getStateCode());
			tw.setUrbanStatus(citi.getUrbanState());
			dtData.add(tw);
		}
		System.out.println(dtData.toString());
		
		return dtData;
	}

}
