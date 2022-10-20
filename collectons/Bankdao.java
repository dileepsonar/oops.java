package com.prpgram.collectons;
import java.util.HashSet;

import  com.prpgram.collectons.Testbankdto;



public class Bankdao {
HashSet <Bankdto> data = new HashSet<Bankdto>();
	
	public String save(Bankdto dto) {
		data.add(dto);
		return dto.getName()+"data saved";
	}
	
	public  Bankdto searchByAccountnumber(String accountnumber) {
		for(Bankdto object : data) {
			if(object.equals(accountnumber)) {
				 return  object;
			 }
			
		}
		return null;
	
	}
	
	public  Bankdto searchByIfsc(String ifsc) {
		for(Bankdto object : data) {
			if(object.equals(ifsc)) {
				 return object;
			 }
			
		}
		return null;
	
	}
	public  Bankdto removeByAccountnumber(String accountnumber) {
		
		for(Bankdto object : data) {
			if(object.equals(accountnumber)) {
				 return object;
			 }
			
		}
		return null;
	
	}
        public  Bankdto updateContactbyAccountnumber(long Contact ,long accountnumber) {
		
		Bankdto[] set;
		for(Bankdto object : set) {
			if(object.getAccountnumber() ==(accountnumber)) {
				 object setContact();
				 return object;
			 
			 }
			
		}
		return null;
	
	}

		 
	
	
	
	
	
	

}
	
	
	
	
	


