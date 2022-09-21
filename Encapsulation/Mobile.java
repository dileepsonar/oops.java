package Encapsulation;

public class Mobile {
	private String name;
	private String company;
	private int year;
	private String type;
	
	Mobile(){
	System.out.println("ABOUT MOBILE");
	}
	
	public String getname() {
	  return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getcompany() {
		return company;
     }
	
	public void setcompany(String company) {
		this.company=company;
	}
	 
	public int getyear() {
		return year;
	}
	
	public void setyear(int year) {
		this.year=year;
	}
	
	
	public String gettype() {
		return type;
	}
	
	public void settype(String type) {
		this.type=type;
	}
	
	public void print() {
		System.out.println(name+"\t"+company+"\t"+year+"\t+"+type);
	}


	public static void main(String [] args) {
		Mobile d = new Mobile();
		d.setname("MOTOROLA ONE MACRO");
		d.setcompany("MOTO");
		d.setyear(1928);
		
		d.settype("ANDROID");
		d.print();
	}
	
}














