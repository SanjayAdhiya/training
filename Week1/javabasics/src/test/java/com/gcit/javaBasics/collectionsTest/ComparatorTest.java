package com.gcit.javaBasics.collectionsTest;

import org.junit.Test;

import com.gcit.javaBasics.collections.ComperatorClass;

public class ComparatorTest extends ComperatorClass{
	
	@Test
	public void testOne() {
		ComperatorClass obj1 = new ComperatorClass();
		obj1.one("hi");
	}
}
