package com.gcit.javaBasics.collections;

import java.util.ArrayList;

public class Arraylistexp {
	// create
    static ArrayList<String> students = new ArrayList<String>();
	// add
    public static void one() {
    	students.add("Sanjay");
    	students.add("yuvi");
    	students.add("rakesh");
    	students.add("mani");
    	students.add("dinesh");
    	
    	// search and update
    	students.contains("dinesh");

    	// delete
    	students.remove("yuvi");
    	
    	
    	for(String n : students) {
    		System.out.println(n);
    	}
    	
	}
}
