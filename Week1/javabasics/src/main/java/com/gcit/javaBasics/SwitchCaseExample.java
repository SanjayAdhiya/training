package com.gcit.javaBasics;

public class SwitchCaseExample {
	public static String switchfuc() {
		int num = 2;
		switch (num + 2) {
		case 1:
			return "Case1: Value is: " + String.valueOf(num);
		case 2:
			return "Case2: Value is: " + String.valueOf(num);
		case 3:
			return "Case3: Value is: " + String.valueOf(num);
		default:
			return "Default: Value is: " + String.valueOf(num);
		}
	}
}
