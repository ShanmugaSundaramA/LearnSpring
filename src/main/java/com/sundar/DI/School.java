package com.sundar.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {

	public static void main(String[] args) {
	    
		ApplicationContext context=new ClassPathXmlApplicationContext("springIOC.xml");
	     Student sundar=context.getBean("sundar",Student.class);
	     System.out.println(sundar);
	     
	     Student sabari=context.getBean("sabari",Student.class);
	     System.out.println(sabari);
	     
	     Student jeeva=context.getBean("jeeva",Student.class);
	     System.out.println(jeeva);
    }
}
