package com.gcit.javaBasics;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.SwitchCaseExample;

public class SwitchCaseExample1Test extends SwitchCaseExample {
	@Test
	public void test01() {
		String i = SwitchCaseExample1Test.switchfuc();
		Assert.assertEquals(i, i);
	}
}
