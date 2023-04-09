package com.sundar.AutoWiring;

public class Engine {
  
	private String colour;
	
    public Engine(String colour) {
		this.colour = colour;
	}

	public void engineCC() {
    	System.out.println(colour+" colour engine Started..");
    }
}
