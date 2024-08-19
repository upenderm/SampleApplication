package com.test.samples.java8features;

import java.util.List;

public class Institute {

	private String instituteName;
	private List<String> locations;
	
	public Institute(String instituteName, List<String> locations) {
		super();
		this.instituteName = instituteName;
		this.locations = locations;
	}

	public final String getInstituteName() {
		return instituteName;
	}

	public final void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public final List<String> getLocations() {
		return locations;
	}

	public final void setLocations(List<String> locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Institute [instituteName=");
		builder.append(instituteName);
		builder.append(", locations=");
		builder.append(locations);
		builder.append("]");
		return builder.toString();
	}

}
