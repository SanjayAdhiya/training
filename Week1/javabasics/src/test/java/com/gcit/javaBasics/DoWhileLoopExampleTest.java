package com.gcit.javaBasics;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.DoWhileLoopExample;

public class DoWhileLoopExampleTest extends DoWhileLoopExample {
	@Test
	public void test01() {
		int i = DoWhileLoopExampleTest.whilefunc();
		System.out.println(i);
		Assert.assertEquals(4, i);
	}
}

