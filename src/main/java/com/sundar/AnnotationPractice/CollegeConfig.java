package com.sundar.AnnotationPractice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.sundar.AnnotationPractice")
@PropertySource(value="classpath:/college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean public Principal principal() { return new Principal(); }
	 * 
	 * @Bean public Teacher teacher() { return new MathsTeacher(); }
	 * 
	 * @Bean public Student student() { Student student=new Student();
	 * student.setPrincipal(principal()); student.setTeacher(teacher()); return
	 * student; }
	 */}
 