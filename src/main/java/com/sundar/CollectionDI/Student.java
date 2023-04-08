package com.sundar.CollectionDI;

import java.util.Iterator;
import java.util.List;

public class Student {

	private int id;
    private String name;
    private List<String> hobby;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}   
	
	public void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("hobbys  :");
		Iterator itr=hobby.iterator();
		while (itr.hasNext()) {
			System.out.println("    "+itr.next());
		}
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hobby=" + hobby + "]";
	}
}
