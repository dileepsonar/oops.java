package com.dileep.Collections;



import java.util.LinkedList;

public class Linkedlist {
       public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("hari");
		list.add("mahesh");
		list.add("raghu");
		list.add("yash");
	
		
		System.out.println(list);
		System.out.println(list.clone());
		System.out.println(list.contains("yash"));
		System.out.println(list.element());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.remove());
		
		
		list.remove(0);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		
	}
       
       
}