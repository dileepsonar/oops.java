package com.dileep.Collections;



import java.util.HashSet;

public class Hashset{
	public static void main(String[] args) {
	
		
		
		
		HashSet set = new HashSet();
		set.add("dileep");
		set.add("mahesh");
		set.add("giri");
		set.add("raj");
		set.add("Kiran");
		set.add(null);
		
		System.out.println(set);
		
		set.remove("mahesh");
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		
	
	}                          

}
