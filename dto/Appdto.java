package com.program.appp.dto;

public class Appdto {
	private String name;
	private String email;
	private long contactno;
	private String password;
	private String confirmpassword;
	
	
	
	Appdto(){
		System.out.println(" Appdto class Construtor created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}