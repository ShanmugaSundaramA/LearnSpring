package com.sundar.AnnotationPractice;

import org.springframework.stereotype.Component;

@Component
public class ComputerTeacher implements Teacher {

	public void teaching() {
		System.out.println("i am your computer teacher");
		
	}

}
