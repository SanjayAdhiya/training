package com.gcit.javaBasics;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.IfElseIfExample;

public class IfElseIfExampleTest extends IfElseIfExample{
	@Test
	public void Test01() {
		String i = IfElseIfExampleTest.ifelse();
		Assert.assertSame(i, "Its a four digit number");
	}
}
