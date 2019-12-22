package com.hashtaag.TechAssign.Model;

public class TownDetails {

	private String town;
	private String state;
	private String district;
	
	
	public TownDetails() {
		
	}
	
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "TownDetails [town=" + town + ", state=" + state + ", district=" + district + "]";
	}
	
	
}
