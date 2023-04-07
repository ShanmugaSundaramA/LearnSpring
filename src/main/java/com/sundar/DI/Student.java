package com.sundar.DI;

public class Student {
   
	private int id;
    private String name;
    private int std;
   
    public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
    
    public Student(int id, String name, int std) {
		this.id = id;
		this.name = name;
		this.std = std;
	}

/* 
    public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStd(String std) {
		this.std = std;
	}
	
*/
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + "]";
	}
   
}
