package com.sundar.CollectionDI;

import java.util.Iterator;
import java.util.Set;

public class Employee {
	
	private int id;
    private String name;
    private Set<String> role;
	
    public Employee(int id, String name, Set<String> role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public void display() {
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("Job roles  :");
		Iterator itr=role.iterator();
		while (itr.hasNext()) {
			System.out.println("    "+itr.next());
		}
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
    
}
