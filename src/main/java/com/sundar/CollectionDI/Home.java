package com.sundar.CollectionDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Home {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springIOc.xml");
		
		Student student=context.getBean("student",Student.class);
		Employee employee=context.getBean("emp",Employee.class);
		
		student.display();
		employee.display();
		
		/*
		 * System.out.println(student);
		 * System.out.println(employee); 
		 */	
	}
}
