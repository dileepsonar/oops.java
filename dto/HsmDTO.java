package com.program.cobined.dto;

public class HsmDTO extends CollegeDTO {
	private String collegename;
	private int noofstudents;
	HsmDTO (){
		 System.out.println("Invoking  HsmDTO  ");
		 
	 }

	public int getnoofstudents() {
		return noofstudents;
	}

	public void setnoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}

	public String getcollegename() {
		return collegename;
	}

	public void setcollegename(String collegename) {
		this.collegename = collegename;
	}
	
	
	
	
	
	

}
