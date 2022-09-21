package com.java.program.methodoverriding;

public class TestBank {
	public static void main(String args[]) {
		Sbi a=new Sbi();
		a.rateofintrest();
		
		Hdfc  b=new Hdfc();
		b.rateofintrest();
		Bank c= new Bank();
		c.rateofintrest();

	}
}
