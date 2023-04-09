package com.sundar.AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Road {
	 
	public static void main(String[] args) {
	     ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
	     Bike bike=context.getBean("bike",Bike.class);
	     bike.speed();
	}
}
  