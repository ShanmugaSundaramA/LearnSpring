package com.sundar.AnnotationPractice;

public class Student {
	
	private Principal principal;
	
	private Teacher teacher;
	
	/*
	 * public Student(Principal principal) { super(); this.principal = principal; }
	 */

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void study() {
		principal.hm();
		teacher.teaching();
		System.out.println("3rd year Student.");
	}
	
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@Override
	public String toString() {
		return "Student";
	}
	
}
