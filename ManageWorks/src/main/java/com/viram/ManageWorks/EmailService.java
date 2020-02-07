package com.viram.ManageWorks;

public class EmailService {
	String message;
	String reciver;
	public EmailService(String message, String reciver) {
		super();
		this.message = message;
		this.reciver = reciver;
	}
	public void sendEmail()
	{
		System.out.println("the Email meassgaes:"+message+" has been sended to :"+reciver);
		
	}
}
