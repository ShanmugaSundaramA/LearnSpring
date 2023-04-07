package com.sundar.ObjectDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Office {

	public static void main(String[] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext("springIOC.xml");
		Employee sundar=context.getBean("sundar",Employee.class);
		System.out.println(sundar);
		
		Employee jeeva=context.getBean("jeeva",Employee.class);
		System.out.println(jeeva);
	}
}
