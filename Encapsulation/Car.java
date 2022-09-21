package Encapsulation;

public class Car {
		private String name;
		private int price;
		private char color;
		private byte noOfseats;
		
		Car(){
			System.out.println("About Car");
		}
		
		public String getname() {
			return name;
		}
		
		public void setname(String name) {
			this.name=name;
		}
		
		public int getprice() {
			return price;
		}
		
		public void setprice(int price) {
			this.price=price;
		}
		
		public char getcolor() {
			return color;
		}
		
		public void setcolor(char color) {
			this.color=color;
		}
		
		public byte getnoofseats() {
		     return noOfseats;
		}
		
		public void setnoOfseats(byte noOfseats) {
			this.noOfseats=noOfseats;
		}
		
		public void  print() {
			System.out.println(name +"\t"+price+"\t"+color+"\t"+noOfseats);
		}
		
	   public static void main(String [] args) {
		   Car a = new Car();
		   a.setname("BENZ");
		   a.setprice(100000000);
		   a.setcolor('R');
		   byte tyres = 4;
		   a.setnoOfseats(tyres);
		   a.print();
		 }
	}

