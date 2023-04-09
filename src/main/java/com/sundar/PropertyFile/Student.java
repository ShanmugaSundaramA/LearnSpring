package com.sundar.PropertyFile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    
	private int id;
    private String name;
    private String std;
    public Student(){
    	System.out.println("default constructor.");
    }
    @Value("${student.id}")
	public void setId(int id) {
		this.id = id;
	}
    @Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
    @Value("${student.std}")
    @Required
	public void setStd(String std) {
		this.std = std;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Std=" + std + "]";
	}
   
   
}
