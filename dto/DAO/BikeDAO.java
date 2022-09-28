package com.program.cobined.dto.DAO;

import com.program.cobined.dto.BikeDTO;

public class BikeDAO {
	private  BikeDTO[] r = new   BikeDTO[5];
	   
	   public void save(BikeDTO bike) {
		   r[0]= bike;
	   }
	   
	   public String  deleteBybrandname(String brandname) {
		   System.out.println(r[0]);
		   
		   for( int i=0; i<r.length;i++) {
			  
			   if(r[0]!=null && r[i].getbrandname().equals(brandname)) {
				   r[i]=null;
				   return "Deleted " +brandname;
			   }
		   }
		   return "brandname"+brandname+"not present";
	
	
	

	   }}



