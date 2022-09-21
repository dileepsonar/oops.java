package Encapsulation;

public class Tvv {
	private String brandname;
	private int price;
	private String color;
	private String type;
	 
	 Tvv(){
		 System.out.println("big tvv");
	   }
	 
	public String getbrandname() {
		return brandname;
	  }
	
	public void setbrandname(String brandname) {
		this.brandname=brandname;
	  }
	
	 
	 public int getprice() {
		 return price;
	 }
	 
	 public void setprice(int price) {
		 this.price=price;
	  }
	 
	 public String getcolor() {
		 return color;
	 }
	 
	  public void setcolor(String color) {
		 this.color=color;
	  }
	  
	 	 
	
	 
	 public String gettyepe() {
		 return type;
	   }
	 
	 public void setprocessor(String processor) {
		 this.type=type;
	   }
	
	 
     public void print() {
    	 System.out.println(brandname+"\t"+price+"\t"+color+"\t"+type);
         }
     
     
     public static void main (String[] args) {
			Tvv xyz = new Tvv();
			xyz.setbrandname("samsung");
			xyz.setprice(8000);
				xyz.setcolor("black");
			
			xyz.print();

	    }
     
     
     
     
     
}
     

     
     
     
     
