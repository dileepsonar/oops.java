package com.program.cobined.dto.DAO;
import  com.program.cobined.dto.MotoralaDTO;;

public class PhoneDAO {
	private  MotoralaDTO [] r = new   MotoralaDTO[6];
	   
	   public void save(MotoralaDTO phone) {
		   r[0]= phone;
	   }
	   
	   public String  deleteByBrandname(String brandname) {
		   System.out.println(r[0]);
		   
		   for( int i=0; i<r.length;i++) {
			  
			   if(r[0]!=null && r[i].getBrandname().equals(brandname)) {
				   r[i]=null;
				   return "Deleted " +brandname;
			   }
		   }
		   return "brandname"+brandname+"not present";
	
	
	

	   }}
