package com.program.mock;

import com.program.mock.Mobiledao;
public class Testmobiledto {
	public static void main (String args[]) {
     Mobiledto mob=new Mobiledto();
	mob.setBrandname("moto");
	mob.setMemory("64gb");
	mob.setMobileid(657849);
	mob.setModelname("motoralonemacro");
	mob.setNoofcamera((byte) 4);
	mob.setPrice(1000);
	mob.setSerialno((byte)3);
	
	Mobiledao abc = new Mobiledao  ();
	
	Mobiledto  s1 = abc.deleteBymobileid(657849);
	 System.out.println(s1);
	 
	 Bankdto  s2 = abc.updatserialnobymobileid(657849, 0)
	 System.out.println(s2);

	
	
}}
