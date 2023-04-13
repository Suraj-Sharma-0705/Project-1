package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con=
				new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		
		Person per1=con.getBean("person1",Person.class);
		System.out.println(per1);
		System.out.println(per1.getFriends().getClass().getName());
		System.out.println("-----------------------------------------");
		System.out.println(per1.getFeestructure());
		System.out.println(per1.getFeestructure().getClass().getName());
		System.out.println("-----------------------------------------");
		System.out.println(per1.getProperties());
		System.out.println(per1.getProperties().getClass().getName());
		
	}

}
