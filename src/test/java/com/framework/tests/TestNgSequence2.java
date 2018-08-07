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

public class TestNgSequence2 {//extends TestNgSequence {
	
	@BeforeClass
	public void beforeClass1() {
	System.out.println("Executing beforeClass1");
	}

	@AfterClass
	public void afterClass1() {
	System.out.println("Executing afterClass1");
	}


	@BeforeTest
	public void beforeTest1() {
	System.out.println("Executing beforeTest from TestNgSequecne2");
	}

	@AfterTest
	public void afterTest1() {
	System.out.println("Executing afterTest from TestNgSequecne2");
	}
	
	@BeforeSuite
	public void beforeSuite0(){
		System.out.println("Executing TestNgSequence2.beforeSuite");

	}
	
	@AfterSuite
	public void afterSuite0(){
		System.out.println("Executing TestNgSequence2.afterSuite");

	}
	
	/*@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}
	
	@BeforeGroups("selenium-test")
	public void setupSeleniumTest() {
		System.out.println("setup Selenium Test");
	}
	
	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}
	
	@AfterGroups("selenium-test")
	public void tearDownSeleniumTest() {
		System.out.println("Teardown Selenium Test");
	}*/
	
	
	/*@Test//(dependsOnGroups = {"database","selenium-test"})
	public void testCase1() {
	System.out.println("Executing test case 1");
	}
*/
	// test case 2

	/*@Test(groups= "selenium-test")
	public void testCase2() {
	System.out.println("Executing test case 2");
	}
	

	@Test(groups= "database")
	public void testCase3() {
	System.out.println("Executing test case 3");
	}*/
	
	
	@BeforeMethod
	public void beforeMethod3() {
	System.out.println("Executing beforeMethod3");
	}

	@AfterMethod
	public void afterMethod3() {
	System.out.println("Executing afterMethod3");
	}

	@Test
	public void testCase3() {
		System.out.println("Executing test case 3");
		}
}
