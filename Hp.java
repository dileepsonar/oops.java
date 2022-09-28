package com.program.cobined;
import com.program.cobined.Hp;
public class Hp extends Laptop{
	private String disply;
	private String color;
	 Hp(){
		 System.out.println("invoking hp constructor");
	   }
	 public String getdisply() {
			return disply;
		  }
		
		public void setdisply(String disply) {
			this.disply=disply;
		  }
	 
	 public String getcolor() {
		return color;
	  }
	
	public void setbrandname(String color) {
		this.color=color;
	  }
	
	

}
	
	
	


