package com.program.cobined.dto;

import com.program.cobined.dto.DAO.BikeDAO;

public class TestbikeDTO {
	public static void main(String [] args) {
		BikeDTO bike = new BikeDTO();
		bike.setbrandname("herohonda");
		bike.setPrice(10000);
		
		
		BikeDAO bike1=new BikeDAO ();
		bike1.save(bike);
		String response=bike1. deleteBybrandname("herohonda");
		System.out.println(response);
	
	
	
	
	

}}
