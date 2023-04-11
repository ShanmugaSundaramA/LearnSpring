package com.sundar.AnnotationPractice;

//import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
	@Override
	public String toString() {
		return "Student";
	}
	public void study() {
		System.out.println("3rd year Student.");
	}
}
