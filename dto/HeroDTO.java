package com.program.cobined.dto;

public class HeroDTO extends BikeDTO {
	private int speed;
	private String color;
	
	HeroDTO (){
		 System.out.println("Invoking HeroDTO  ");
		 
	 }

	public int getspeed() {
		return speed;
	}

	public void setspeed(int speed) {
		this.speed = speed;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
}
