package com.sundar.PropertyFile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    
	private int id;
    private String name;
    private String Std;
   
    @Value("101")
	public void setId(int id) {
		this.id = id;
	}
    @Value("Sundaram")
	public void setName(String name) {
		this.name = name;
	}
    @Value("11th")
	public void setStd(String std) {
		Std = std;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Std=" + Std + "]";
	}
   
   
}
