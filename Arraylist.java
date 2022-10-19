package com.program.list;

import java.util.ArrayList;

public class Arraylist { 
	 public static void main(String args[]) {
		
				ArrayList name = new ArrayList();
				name.add("dileep");
			    name.add("anil");
			    name.add("gururaj");
			    name.add("mahesh");
			    name.add("raghu");
			    System.out.println(name);
			    System.out.println(name.get(2));
			    
			    name.add(1,"gopi");
			    System.out.println(name);
			    
			    name.remove(2);
			    System.out.println(name);
			    
				
	
		 
		 
	}

}
