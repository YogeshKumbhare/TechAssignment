/**
 * 
 */
package com.hashtaag.TechAssign.Model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author yogesh_kumbhare
 *
 */
@JsonIgnoreProperties
@Component
public class State {


	private String state;
	private String districtCode;
	private String district;

	public State() {
		
	}
	public State(String state, String districtCode, String district) {
		super();
		this.state = state;
		this.districtCode = districtCode;
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	
	
}
