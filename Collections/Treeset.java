package com.dileep.Collections;



import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
    	
      
		TreeSet<String> set = new TreeSet<String>();
		set.add("mahesh");
		set.add("Kiran");
		set.add("raghu");
		set.add("Ravi");
		set.add("raj");
		set.add("tarun");
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.spliterator());
		System.out.println(set.descendingIterator());
		
		set.remove("Ravi");
		System.out.println(set);
	   }   
}