package com.program.cobined.dto;

import com.program.cobined.dto.DAO.CollegeDAO;
public class TestcollegeDTO {
	public static void main(String [] args) {
		HsmDTO hsm = new HsmDTO();
		hsm.setname("gecr");
		hsm.setcollegename("hsmgecr");
		hsm.setnoofstudents(50);
	
		
		
		CollegeDAO dil=new CollegeDAO ();
		dil.save(hsm);
		String response=dil. deleteBycollegename("hsmgecr");
		System.out.println(response);
	
	
	
	
	

}}
