package com.framework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgSequence extends TestNgSequence2{

	@Test
	public void testCase3() {
	System.out.println("Executing test case 3");
	}
	
	@Test
	public void testCase1() {
	System.out.println("Executing test case 1");
	}

	// test case 2

	/*@Test
	public void testCase2() {
	System.out.println("Executing test case 2");
	}*/

	@BeforeMethod
	public void beforeMethod2() {
	System.out.println("Executing beforeMethod2");
	}
	
	@BeforeMethod//(dependsOnMethods="beforeMethod2")
	public void beforeMethod1() {
	System.out.println("Executing beforeMethod1");
	}
	
	

	@AfterMethod
	public void afterMethod1() {
	System.out.println("Executing afterMethod1");
	}
	
	@AfterMethod
	public void afterMethod2() {
	System.out.println("Executing afterMethod2");
	}


	@BeforeClass
	public void beforeClass2() {
	System.out.println("Executing beforeClass2");
	}

	@AfterClass
	public void afterClass2() {
	System.out.println("Executing afterClass2");
	}

	@BeforeTest
	public void beforeTest() {
	System.out.println("Executing beforeTest");
	}

	@AfterTest
	public void afterTest() {
	System.out.println("Executing afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Executing beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
	System.out.println("Executing afterSuite");
	}
	
}
