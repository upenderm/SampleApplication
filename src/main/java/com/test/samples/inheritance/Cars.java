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
		this.vehicleType = vehicleType;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
