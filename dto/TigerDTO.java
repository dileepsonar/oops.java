package com.program.cobined.dto;

public class TigerDTO extends AnimalDTO {
	
	private String petname;
    private int legs;
    
    TigerDTO(){
    	System.out.println("Invokig tigerDTO");
    }
    public String getpetname() {
		return petname;
	}

	public void setpetname(String petname) {
		this.petname = petname;
	}

	

	public int getlegs() {
		return legs;
	}

	public void setlegs(int legs) {
		this.legs = legs;
	}

    
}
	
	

