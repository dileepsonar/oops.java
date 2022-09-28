package com.program.cobined.dto.DAO;

 import com.program.cobined.dto.TigerDTO;

public class AnimalDAO {

private TigerDTO []tigerdto = new TigerDTO [5]; 
	
	public void save(TigerDTO tiger) {
	    tigerdto[0]=tiger;
	}
	public String deleteBypetname(String petname) {
		for(int i=0; i<tigerdto.length;i++) {
			if(tigerdto[0]!= null && tigerdto[i].getpetname().equals(petname)) {
				tigerdto[i]=null;
				return "Deleted"+ petname;
			}
		} 
		
		 return "petname"+ petname +"not present";
	}
		
	
	
	
	
	

}
