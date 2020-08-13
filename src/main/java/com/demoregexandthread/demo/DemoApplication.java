package com.demoregexandthread.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		
		/***
		
		//// match pattern
		System.out.println("match pattern");
		
		System.out.println(Pattern.matches("\\d", "1"));
		
		System.out.println(Pattern.matches("\\d*", "11"));
		
		//// with matcher object
		System.out.println("with matcher object");
		
		Pattern pattern = Pattern.compile("geeks");
		
		Matcher matcher = pattern.matcher("GeeksforGeeks.org");
		
		while(matcher.find()) {
			System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
		}
		
		if(matcher.matches()) {
			System.out.println("match");
		}else {
			System.out.println("no match");
		}
		
		
		//// case sensitive
		System.out.println("case sensitive");
		
		Pattern pattern2 = Pattern.compile("ge*", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher2 = pattern2.matcher("GeeksforGeeks.org");
		
		while(matcher2.find()) {
			System.out.println("Pattern found from " + matcher2.start() + 
                    " to " + (matcher2.end()-1)); 
		}
		
		*/
		
		
		//// thread
		
		Sender sender = new Sender();
		
		MyThreadClass myThreadClass = new MyThreadClass(sender);
		myThreadClass.setParam("naufal");
		myThreadClass.start();
		
		MyThreadClass myThreadClass2 = new MyThreadClass(sender);
		myThreadClass2.setParam("azwar");
		myThreadClass2.start();
		
		System.out.println("outside the thread");
		
	}

	
}
