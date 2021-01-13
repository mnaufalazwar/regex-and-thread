package com.demoregexandthread.demo;

public class MyThreadClass extends Thread{
	
	private String param;
	
	private final Sender sender;
	
	public MyThreadClass(Sender sender) {
		this.sender = sender;
	}
	
//	public MyThreadClass() {
//	}
	
	public void setParam(String param) {
		this.param = param;
	}
	
	public String getParam() {
		return this.param;
	}
	
	public void run() {
		
//		System.out.println("sending\t" + param);
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Thread  interrupted."); 
		}
//		System.out.println(param + "\tSent" + "\n"); 
		
		synchronized(sender) {
			sender.send(param);
		}
		
	}
	
}
