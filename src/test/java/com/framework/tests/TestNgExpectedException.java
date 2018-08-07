package com.framework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class TestNgExpectedException {
	
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void test_01(){
	int result = 1/0;
	System.out.println(result);
	}
	
	
	@Test()
	public void testSum() {
		int result = 1+0;
		System.out.println(result);
	}

}
