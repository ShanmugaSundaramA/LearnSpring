package com.sundar.AutoWiring;

public class Bike {
	private Engine engine;

	public Bike() {}
	
	public Bike(Engine engine) {
		super();
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void speed() {
         engine.engineCC();
         System.out.println("very speed...500cc engineCC");
	}
	
}
