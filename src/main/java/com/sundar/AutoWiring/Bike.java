package com.sundar.AutoWiring;

public class Bike {
	private Engine engine;

	public Bike() {System.out.println("Default Construtor");}
	
	public Bike(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("constructor method is called.");
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("setter method is called.");
	}
	
	public void speed() {
         engine.engineCC();
         System.out.println("very speed...500cc engineCC");
	}
	
}
