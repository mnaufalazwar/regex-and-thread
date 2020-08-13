package com.demoregexandthread.demo;

public class MyThreadClass extends Thread{
	
	private String param;
	
	private final Sender sender;
	
	public MyThreadClass(Sender sender) {
		this.sender = sender;
	}
	
	public void setParam(String param) {
		this.param = param;
	}
	
	public String getParam() {
		return this.param;
	}
	
	public void run() {
		
		synchronized(sender) {
			
			sender.send(param);
			
		}
		
	}
	
}
