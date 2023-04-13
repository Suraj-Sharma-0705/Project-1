package com.springcore.lifecycle;

public class Samosa {
	private double price;	
	
	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		System.out.println("Setting Property");
		this.price=price;
	}
	
	public Samosa() {
		super();
	}
	
	@Override
	public String toString() {
		return "Samosa[ price=" + price +"]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy");
	}
	
	
}
