package com.test.samples.inheritance;

public class TwoWheeler extends Vehicles{
	
	private String vehicleName;
	
	private String vehicleType;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public TwoWheeler(){
		System.out.println("Im in Two wheeler constructor");
		vehicleType = "Petrol engine";
	}
	
	public void printMyName(String str){
		System.out.println("Sub class - Your name is :"+str);
		super.printMyName(str);
		System.out.println(getVehicleType());
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();
		tw.printMyName("Upender");		
	}

}
