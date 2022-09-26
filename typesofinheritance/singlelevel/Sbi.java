package com.java.typesofinheritance.singlelevel;

public class Sbi extends Bank {
	String Area;
	 String name;
	int loan;
	public Sbi (String name,  String Area,int loan ){
		this.name=name;
		this.Area = Area;
		this.loan=loan;
		
	
		
	}
	
	public void intrestrate() {
		System.out.println("intrest rate is 8%");
		
	}
}


