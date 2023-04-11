package com.sundar.AnnotationPractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class College {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
	    Student student=context.getBean("student",Student.class);
	    student.study();
	    context.close();
	}    
}
