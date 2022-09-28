package com.program.cobined.dto;
import com.program.cobined.dto.DAO.AnimalDAO;
public class Testanimal {
	public static void main(String args[]) {
		TigerDTO tiger=new TigerDTO();
		tiger.setname("tiger");
		tiger.setpetname("golutiger");
		tiger.setColor("red");
		tiger.setlegs(4);
		
		AnimalDAO animal=new AnimalDAO ();
		animal.save(tiger);
		String g =animal.deleteBypetname("golutiger");
		System.out.println(g);
		
	}

}
