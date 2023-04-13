package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
//Using annotation method	
	private String subject;
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public Example() {
		super();
	}
	
	@Override
	public String toString() {
		return "Example [subject=" +subject+"]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}

}