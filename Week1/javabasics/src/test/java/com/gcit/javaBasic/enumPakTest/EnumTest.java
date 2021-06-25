package com.gcit.javaBasic.enumPakTest;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.enumpak.Enumclass;

public class EnumTest extends Enumclass{
	@Test
	public void testOne() {
		String e = EnumTest.One();
		Assert.assertSame("its same ", "North", e);
	}
}
