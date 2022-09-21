package Inheritance;

public class TestEngine {
	    public static void main(String []args) {
	    	
	    	Bike b = new Bike();
	    	b.setbrandname("pulsar120");
	    	b.setmodelname("fz");
	    	b.setprice(66500);
	    	
	    	Engine e = new Engine();
	    	e.setbrandname("pulsar120");
	    	e.setcapacity(312);
	    	e.setnoOfstrokes((byte)4);
	    	
	    	System.out.println(b.getbrandname());
	    	System.out.println(b.getmodelname());
	    	System.out.println(b.getprice());
	    	
	    	System.out.println(e.getbrandname());
	    	System.out.println(e.getcapacity());
	    	System.out.println(e.getnoOfstrokes());
	    	
	    }
	}

