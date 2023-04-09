package com.sundar.PropertyFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
	 
	public static void main(String[] args) {
	    
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
	    Student sundar=context.getBean("sundar",Student.class);
	    System.out.println(sundar);
	    
	    
	}
}
