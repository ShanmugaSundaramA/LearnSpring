package com.sundar.AnnotationPractice;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements Teacher {

	public void teaching() {
            System.out.println("i am the maths teacher.");	
	}

}
