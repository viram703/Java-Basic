package com.viram.ManageWorks;

public class CliientApp {
	String name;
	EmailService email;
	public CliientApp(String name, EmailService email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	void processofSending()
	{
		System.out.println("successfully sending Email By "+name);
		email.sendEmail();
	}

}
