package com.gcit.javaBasics.oppsTest;

import org.junit.Assert;
import org.junit.Test;

import com.gcit.javaBasics.Opps.Boy;

public class BoyTest extends Boy{
	@Test
	public void main() {
		String i = BoyTest.eat();
		Assert.assertEquals(i, "Boy is eating");
	}
}
