package com.program.cobined.dto.DAO;

import com.program.cobined.dto.HsmDTO;

public class CollegeDAO {
	private HsmDTO [] dil = new  HsmDTO[6];
	   
	   public void save(HsmDTO hsm) {
		   dil[0]= hsm;
	   }
	   
	   public String  deleteBycollegename(String collegename) {
		   System.out.println(dil[0]);
		   
		   for( int i=0; i<dil.length;i++) {
			  
			   if(dil[0]!=null && dil[i].getcollegename().equals(collegename)) {
				   dil[i]=null;
				   return "Deleted " +collegename;
			   }
		   }
		   return "brandname"+collegename+"not present";
	
	
	

	   }}

	
	
	
	


