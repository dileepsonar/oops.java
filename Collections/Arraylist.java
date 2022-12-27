package com.dileep.Collections;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String [] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("mahesh");
	    name.add("ganesh");
	    name.add("Kiran");
	    name.add("raghu");
	    name.add("guru");
	    System.out.println(name);
	    System.out.println(name.get(3));
	    
	    name.add(1,"ravi");
	    System.out.println(name);
	    
	    name.remove(2);
	    System.out.println(name);
	    
		
}
}
