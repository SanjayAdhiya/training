package com.gcit.javaBasics.enumpak;

public class Enumclass {
	public static String One() {
		Directions dir = Directions.NORTH;
		if (dir == Directions.EAST) {
			return "East";
		} else if (dir == Directions.WEST) {
			return "West";

		} else if (dir == Directions.NORTH) {
			return "North";

		} else {
			return "South";
		}
	}
}

enum Directions {
	EAST, WEST, NORTH, SOUTH
}
