package com.framework.tests;

import org.testng.annotations.Test;

@Test(groups = "Regression")
public class TestGroups2 {
	
	@Test(groups = "Smoke")
	public void testForSmoke() {
		System.out.println("Test For Smoke");
	}
	
	
	@Test(groups = "Regression")
	public void testForRgression() {
		System.out.println("Test for Regression");
	}
	
	@Test(groups = {"Regression", "Smoke"})
	public void testForSmokeAndRgression() {
		System.out.println("Test for Smoke and Regression");
	}

}
