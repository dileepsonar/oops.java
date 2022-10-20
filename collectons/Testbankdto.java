package com.prpgram.collectons;
import com.prpgram.collectons.Bankdto;
import  com.prpgram.collectons.Bankdao;

public class Testbankdto {
	public static void main(String[] args) {
		Bankdto details = new 	Bankdto();
		details.setName("mahesh");
		details.setAccountnumber("62356667896");
		details.setContact("9756789765");
		details.setEmail("mahesh23@gmail.com");
		details.setIfse("SBIN7868");
		
		Bankdao abc = new Bankdao();
		abc.save(details);
		Bankdto  s = abc.searchByAccountnumber("62356667896");
		System.out.println(s);
		
		Bankdto  s1 = abc.searchByIfsc("mahesh");
		 System.out.println(s1);
		 
		 Bankdto  s2 = abc.removeByAccountnumber("62356667896");
		 System.out.println(s2);
	
		 Bankdto  s3= abc.updateByContact("9756789765");
		 System.out.println(s3);
	
	

	}}
