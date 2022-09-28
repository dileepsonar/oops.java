package com.program.cobined.dto;

public class MotoralaDTO extends PhoneDTO{
	private byte ram;
	private String color;
	
	 MotoralaDTO(){
		 System.out.println("Invoking MotoralaDTO ");
		 
	 }

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}
	
	
	
	
	

}
