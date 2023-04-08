package com.sundar.CollectionDI;

public class Employee1 {
      private int id;
      private String name;
      private Address1 address;
      
    
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Employee1(int id, String name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
      
}
