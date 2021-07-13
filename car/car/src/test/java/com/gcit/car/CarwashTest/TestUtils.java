package com.gcit.car.CarwashTest;

import com.gcit.car.domain.Domain;

public final class TestUtils {
	
	private static TestUtils testUtil = null;

	public static TestUtils getInstance() {
		if(testUtil == null)
			testUtil = new TestUtils();
		return testUtil;
	}
	
	public Domain getCar() {
		Domain objDomain = new Domain();
		objDomain.setCarModel("suv");
		objDomain.setDescription("tire puncture");
		return objDomain;
	}
}
