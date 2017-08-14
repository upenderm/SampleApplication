package com.test.samples.inheritance;

public class Cars extends TwoWheeler{

	private String vehicleType;
	
	public Cars(){
		vehicleType = "BMW";
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
//		super.setVehicleType("Petrol emission");/
		this.vehicleType = vehicleType;
	}
	
	

	public static void main(String[] args) {
		

	}

}
