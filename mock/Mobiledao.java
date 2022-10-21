package com.program.mock;
import java.util.HashSet;

import com.program.mock.Testmobiledto;
import com.prpgram.collectons.Bankdto;


public class Mobiledao {
HashSet <Mobiledto > data = new HashSet<Mobiledto >();
	
	public String save(Mobiledto  dto) {
		data.add(dto);
		return dto.getBrandname()
				+"data saved";
	}
	
	public  Mobiledto deleteBymobileid(long mobileid) {
		
		for(Mobiledto object : data) {
			if(object.equals(mobileid)) {
				 return object;
			 }
			
		}
		return null;
	
	}
       public  Mobiledto  updatserialnobymobileid(byte serialno ,byte mobileid) {
		
    	 Mobiledto [] set = null;
		for(Bankdto object : set) {
			if(object.get( mobileid) ==(mobileid)) {
			 object .setMobileid((byte)657849);
				 return object;
			 
			}
			
		}
return null;
	
	}
   
    }
       
       
       
       

		
	
	
	
	
	
	
	
	


