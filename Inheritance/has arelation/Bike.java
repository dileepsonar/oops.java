package Inheritance;
public class Bike {
	private  String brandname;
	private String modelname;
	private int price;
	private String engine;
	
	public Bike(){
	System.out.println("About Bike HAS-A realationship with Engine");
	}
	
	public String getbrandname() {
	    return brandname;
    }
	public void setbrandname(String brandname) {
		this.brandname=brandname;
	}
	
	public String getmodelname(){
		return modelname;
	}
	
	public  void setmodelname(String modelname) {
		this.modelname=modelname;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price=price;
	}
	
	public String getengine() {
		return engine;
	}
	
	public void setengine(String engine) {
		this.engine=engine;
	}
}





