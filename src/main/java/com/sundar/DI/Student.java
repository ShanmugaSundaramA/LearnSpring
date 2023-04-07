package com.sundar.DI;

public class Student {
   
	private int id;
    private String name;
    private String std;
   
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStd(String std) {
		this.std = std;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
   
}
