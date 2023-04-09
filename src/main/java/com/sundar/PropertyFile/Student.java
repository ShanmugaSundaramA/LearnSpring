package com.sundar.PropertyFile;

public class Student {
    
	private int id;
    private String name;
    private String Std;
   
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStd(String std) {
		Std = std;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Std=" + Std + "]";
	}
   
   
}
