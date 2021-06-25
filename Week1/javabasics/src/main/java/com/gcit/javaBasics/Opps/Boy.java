package com.gcit.javaBasics.Opps;

class Human {
	// Overridden method
	public static String eat() {
		return "Human is eating";
	}
}

public class Boy extends Human {
	// Overriding method
	public static String eat() {
		return "Boy is eating";
	}

	
}