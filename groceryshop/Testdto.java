package com.java.groceryshop;

public class Testdto {
	public static void main(String[] args) {
	 Addressdto n=new Addressdto ();
	 n.setNameofproduct("dolll");
	 n.setMrpprice(150.34);
	 n.setBarcodenumber(89780989);
     n.setCompanyname("doll company");
     n.setContactno(978989788);
     n.setEmailid("dileep@123gmailcom");
	 n.setBuildno("gh123");
	 n.setCity("bidar");
	 n.setState("karnataka");
	 n.setCountry("india");
	 n.setZip(585411);
	 System.out.println(n.getNameofproduct());
	 n.detail();
	  
    }
}
