package com.gcit.javaBasics;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.WhileLoopExample;

public class WhileLoopExampleTest extends WhileLoopExample{
	@Test
	public  void main() {
		Assert.assertNotEquals(9,WhileLoopExampleTest.whilefunc());
	}
}
