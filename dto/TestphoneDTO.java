package com.program.cobined.dto;
import com.program.cobined.dto.DAO.PhoneDAO;
public class TestphoneDTO {
public static void main(String [] args) {
		MotoralaDTO phone = new MotoralaDTO();
		phone.setBrandname("MOTO");
		phone.setPrice(10000);
		phone.setRam((byte)4);
		phone.setcolor("red");
		
		
		PhoneDAO phone1=new PhoneDAO();
		phone1.save(phone);
		String response=phone1. deleteByBrandname("MOTO");
		System.out.println(response);
	
	
	
	

}
}