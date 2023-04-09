package com.sundar.AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Bike {
	private Engine engine;

	public Bike() {System.out.println("Default Construtor");}
	
	//@Autowired
	public Bike(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("constructor method is called.");
	}
    
	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("setter method is called.");
	}
	
	public void speed() {
         engine.engineCC();
         System.out.println("very speed...500cc engineCC");
	}
	
}
