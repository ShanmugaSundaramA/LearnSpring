package com.sundar.CollectionDI;

public class Address1 {
     private String city;
     private String State;
     private String Country;
	public Address1(String city, String state, String country) {
		super();
		this.city = city;
		this.State = state;
		this.Country = country;
	}
	@Override
	public String toString() {
		return "Address1 [city=" + city + ", State=" + State + ", Country=" + Country + "]";
	}
}
