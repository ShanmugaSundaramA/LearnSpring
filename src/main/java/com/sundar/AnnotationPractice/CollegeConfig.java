package com.sundar.AnnotationPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.sundar.AnnotationPractice")
public class CollegeConfig {

	@Bean
	public Principal principal() {
		return new Principal();
	}
	
	@Bean
	public Teacher teacher() {
		return new MathsTeacher();
	}
	
	@Bean
	public Student student() {
		Student student=new Student();
		student.setPrincipal(principal());
		student.setTeacher(teacher());
		return student;
	}
}
 