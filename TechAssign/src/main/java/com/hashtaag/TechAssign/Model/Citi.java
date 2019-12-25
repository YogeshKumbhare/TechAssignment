package com.hashtaag.TechAssign.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yogesh_kumbhare
 *
 */

@Entity
@Table(name = "citi")
public class Citi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "town")
	private String town;

	@Column(name = "urban_state")
	private String urbanState;

	@Column(name = "state_Code")
	private String stateCode;

	@Column(name = "state")
	private String state;

	@Column(name = "district_Code")
	private String districtCode;

	@Column(name = "district")
	private String district;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getUrbanState() {
		return urbanState;
	}

	public void setUrbanState(String urbanState) {
		this.urbanState = urbanState;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
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
		return "Citi [id=" + id + ", town=" + town + ", urbanState=" + urbanState + ", stateCode=" + stateCode
				+ ", state=" + state + ", districtCode=" + districtCode + ", district=" + district + "]";
	}
	
	

}
