package Collections;
import java.util.ArrayList;

import  Collections.Traindao;
public class Testdto {
	public static void main(String[] args) {
	    Traindto details = new Traindto();
	    details.setName("nanded Express");
	    details.setOrigin("guntkal Jn");
	    details.setDestination("benglore Central");
	    details.setSpeed("150kmph");
	    
	    Traindto details1 = new Traindto();
	    details1.setName("Mumbai Express");
	    details1.setOrigin("Bangalore junction");
	    details1.setDestination("Nizamuddin");
	    details1.setSpeed("140kmph");
	    
	    Traindto details2 = new Traindto();
	    details2.setName("bidar Express");
	    details2.setOrigin("raichur ");
	    details2.setDestination("New Dahli");
	    details2.setSpeed("130kmph");
	    
	    
	  Traindao dao = new Traindao();
      dao.save(details);
      dao.save(details2);
      dao.save(details2);
      
      String response = dao.removeByname("mumbai Express");
      System.out.println(response);
      
      ArrayList  result = dao.getByname("mumbai Express");
      System.out.println(result);
       
      ArrayList  reply = dao.getByOrigin("raichur ");
      System.out.println(reply);
       
      ArrayList res  =  dao.getAll();
      System.out.println(res);
	}
}
	
	
	


