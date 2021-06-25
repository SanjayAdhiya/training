package com.gcit.javaBasics;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.ForLoopExample;

public class ForLoopExampleTest extends ForLoopExample{
	@Test
	public void main() {
		int i=  ForLoopExampleTest.foreach();
		Assert.assertNotNull(i);
	}
}
