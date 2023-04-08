package com.sundar.CollectionDI;

public class Student2 {
    private int id;
    private String name;
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + "]";
	}
}
