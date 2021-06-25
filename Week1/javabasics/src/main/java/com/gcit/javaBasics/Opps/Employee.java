package com.gcit.javaBasics.Opps;

public class Employee {
	static int empId;  
	   static String empName;  
		    
	   //parameterized constructor with two parameters
	   Employee(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   public static void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  
		   
	   
}
