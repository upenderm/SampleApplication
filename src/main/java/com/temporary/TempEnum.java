package com.temporary;

public enum TempEnum {
	DELHI("Delhi", "011", "Delhi STD code"), MUMBAI("Mumbai", "022",
			"Mumbai STD code"), CALCUTTA("Calcutta", "033", "Calcutta STD code"), CHENNAI(
			"Chennai", "044", "Chennai STD code"), HYDERABAD("Hyderabad",
			"040", "Hyderabad STD code"), BANGALORE("Bangalore", "080",
			"Bangalore");
	private String cityName;
	private String stdCode;
	private String description;

	TempEnum(String cityName, String stdCode, String description) {
		this.cityName = cityName;
		this.stdCode = stdCode;
		this.description = description;
	}

	public String getCityName() {
		return cityName;
	}

	public String getStdCode() {
		return stdCode;
	}

	public String getDescription() {
		return description;
	}
	
	
}
