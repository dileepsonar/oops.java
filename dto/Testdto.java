package com.program.appp.dto;
import com.program.appp.dto.dao.Appdao;
public class Testdto {
	public static void main(String [] args) {
		Appdto app = new Appdto();
		app.setName("mahesh");
		app.setEmail("mahesh@324gmail.com");
		app.setContactno(846378378);
		app.setPassword("dildil");
		
	      
	    Appdao dao =new Appdao();
	    dao.print();
	    dao.register(app);
	    String  ab = dao.login("mahesh","dildil");
	    System.out.println(ab);
	    
	    String h = dao.accountdeleteByIndex(0);
	    
	    System.out.println(h);
	    
		
	}

}

