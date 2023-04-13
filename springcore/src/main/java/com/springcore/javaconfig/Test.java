package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
				new AnnotationConfigApplicationContext(javaconfig.class);
		
		Student stu=context.getBean("student",Student.class);
		System.out.println(stu);
		stu.study();
		
		
	}

}
