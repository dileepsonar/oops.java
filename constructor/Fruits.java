package com.java.program.constructor;

public class Fruits {
        String name;
		int size;
		
		public Fruits(){
			System.out.println("Invocking the Fruits");
		}
		public Fruits(String name) {
			this();
			System.out.println("Apple");	
		}
		public Fruits(int size) {
			System.out.println("Medium");
		}
	}

