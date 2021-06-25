package com.gcit.javaBasics;

public class IfElseIfExample {
	public static String ifelse() {
		int num = 1234;
		if (num < 100 && num >= 1) {
			return "Its a two digit number";
		} else if (num < 1000 && num >= 100) {
			return "Its a three digit number";
		} else if (num < 10000 && num >= 1000) {
			return "Its a four digit number";
		} else if (num < 100000 && num >= 10000) {
			return "Its a five digit number";
		} else {
		return "number is not between 1 & 99999";
		}
		
		
	}
}
