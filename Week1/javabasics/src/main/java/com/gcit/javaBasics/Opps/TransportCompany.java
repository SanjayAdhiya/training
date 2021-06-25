package com.gcit.javaBasics.Opps;

class CarClass {
	String carName;
	int carId;

	CarClass(String name, int id) {
		this.carName = name;
		this.carId = id;
	}
}

class Driver extends CarClass {
	String driverName;

	Driver(String name, String cname, int cid) {
		super(cname, cid);
		this.driverName = name;
	}
}

public class TransportCompany {
	public static void check() {
		Driver obj = new Driver("Andy", "Ford", 9988);
		System.out.println(obj.driverName + " is a driver of car Id: " + obj.carId);
	}
}