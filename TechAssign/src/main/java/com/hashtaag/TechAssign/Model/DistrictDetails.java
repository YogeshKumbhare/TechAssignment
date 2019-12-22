package com.hashtaag.TechAssign.Model;

public class DistrictDetails {

	private String town;
	private String urbanStatus;
	private String state_code;
	private String state;
	private String districtCode;
	private String district;
	
	
	public DistrictDetails() {
		super();
	}
	
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getUrbanStatus() {
		return urbanStatus;
	}
	public void setUrbanStatus(String urbanStatus) {
		this.urbanStatus = urbanStatus;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
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

	@Override
	public String toString() {
		return "DistrictDetails [town=" + town + ", urbanStatus=" + urbanStatus + ", state_code=" + state_code
				+ ", state=" + state + ", districtCode=" + districtCode + ", district=" + district + "]";
	}
	
	
	
	
}
