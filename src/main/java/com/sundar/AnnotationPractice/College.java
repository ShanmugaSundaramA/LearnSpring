package com.sundar.AnnotationPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class College {
	public static void main(String[] args) {
	    ApplicationContext context=new ClassPathXmlApplicationContext("Spring1.xml");
	    Student student1=context.getBean("student",Student.class);
	    System.out.println(student1);
	}    
}
