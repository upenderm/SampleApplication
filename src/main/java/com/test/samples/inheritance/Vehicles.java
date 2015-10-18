package com.test.samples.inheritance;

public class Vehicles {
	
	private String vehicleType;

	public Vehicles(){
		System.out.println("I'm in Vehicles");
		vehicleType = "Diesel engine";
	}
	
	public void printMyName(String str){
		System.out.println("Super class - Your name is :"+str);
	}
	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public static void main(String[] args) {
		System.out.println("I'm in main of Vehciles");

	}

}
