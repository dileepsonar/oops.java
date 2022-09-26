package com.java.typesofinheritance.singlelevel;

public class TestBank {
	public static void main(String args[]) {
		Sbi d= new Sbi("Sbi","bidar",(int)10000);
		d.intrestrate();
		System.out.println(d.name);
		System.out.println( (d.loan));
				
	}

}
