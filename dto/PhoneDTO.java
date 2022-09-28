package com.program.cobined.dto;

public class PhoneDTO {
	private String brandname;
	private int price;
	
	PhoneDTO(){
		System.out.println("Invoking PhoneDTO");
		
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}





}
