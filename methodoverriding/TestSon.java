package com.java.program.methodoverriding;
import com.java.program.methodoverriding.Son;
public class TestSon {
	public static void main(String args[]) {
		Father a= new Father ();
		a.bike();
		
		Son b =new Son();
		b.bike();
		b.eat();
	}
}
