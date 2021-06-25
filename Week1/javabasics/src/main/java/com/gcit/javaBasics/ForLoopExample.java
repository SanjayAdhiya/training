package com.gcit.javaBasics;

public class ForLoopExample {
	
	public static int foreach(){
	      int arr[]={2,11,45,9};
	      int num =0;
	      for (int n : arr) {
	         num+=n;
	      }
	      return num;
	      
	   }
}
