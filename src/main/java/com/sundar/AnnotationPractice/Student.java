package com.sundar.AnnotationPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${college.Name}")
	private String CollegeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("computerTeacher")
	private Teacher teacher;
	
	/*
	 * public Student(Principal principal) { super(); this.principal = principal; }
	 */
	
    //@Autowired
	public void setTeacher(Teacher teacher) {
		System.out.println("setter teacher");
		this.teacher = teacher;
	}

	public void study() {
		System.out.println("college Name : "+CollegeName);
		principal.hm();
		teacher.teaching();
		System.out.println("3rd year Student.");
	}
	//@Autowired
	public void setPrincipal(Principal principal) {
		System.out.println("setter principal");
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "Student";
	}
	
}
