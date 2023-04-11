package com.sundar.AnnotationPractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.sundar.AnnotationPractice")
public class CollegeConfig {

	@Bean(name={"student","student1","student2"})
	public Student student() {
		return new Student();
	}
}
 