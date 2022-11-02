package com.java.groceryshop;

public class Productdto {
void detail() {
	System.out.println("information of the company ");
	}
	 private  String nameofproduct;
	double mrpprice;
	long barcodenumber;
	 public String getNameofproduct() {
		return nameofproduct;
	}
	public void setNameofproduct(String nameofproduct) {
		this.nameofproduct = nameofproduct;
	}
	public double getMrpprice() {
		return mrpprice;
	}
	public void setMrpprice(double mrpprice) {
		this.mrpprice = mrpprice;
	}
	public long getBarcodenumber() {
		return barcodenumber;
	}
	public void setBarcodenumber(long barcodenumber) {
		this.barcodenumber = barcodenumber;
	}
	

}
