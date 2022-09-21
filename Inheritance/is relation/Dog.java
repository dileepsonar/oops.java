package Inheritance;

public class Dog extends Animal{
	String name ;
	String color;
	int legs;
	byte noofears;
	Dog(String name,String color,int legs,byte noofears){
		this. name=name;
		this.color=color;
		this.legs=legs;
		this .noofears=noofears;
	}
	
	public static void main(String args[]) {
	
		Animal a = new Animal("dog","red",(int)4,(byte)2,);
		
		
		System.out.println(a.name);
		System.out.println(a.color);
		System.out.println(a.legs);
	    System.out.println(a.noofears);
	
	}
	
	
	
}

