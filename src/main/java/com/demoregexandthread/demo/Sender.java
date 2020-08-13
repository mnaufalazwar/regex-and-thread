package com.demoregexandthread.demo;

public class Sender {
	
	public void send(String msg) {
		
		System.out.println("sending\t" + msg);
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Thread  interrupted."); 
		}
		System.out.println("\n" + msg + "\tSent"); 
		
	}

}
