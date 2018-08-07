package com.framework.tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroup {

	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("setupDB()");
	}
	
	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("cleanDB()");
	}
	
	
	@BeforeGroups("selenium-test")
	public void setupSeleniumTest() {
		System.out.println("setup Selenium Test");
	}
	
	@BeforeGroups("Runner-test")
	public void setupRunner() {
		System.out.println("setup Runner Test");
	}
	
	@AfterGroups("selenium-test")
	public void tearDownSeleniumTest() {
		System.out.println("Teardown Selenium Test");
	}
	
	/*@Test(groups= "selenium-test")
	public void runSelenium() {
		System.out.println("runSelenium()");
	}

	@Test(groups= "selenium-test")
	public void runSelenium1() {
		System.out.println("runSelenium()1");
	}
	
	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	@Test(groups = "database")
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}*/
	
	@Test(groups = {"database","selenium-test"})
	public void runFinal() {
		System.out.println("runFinal");
	}
	
	@Test(dependsOnGroups = {"database","selenium-test"})//, "Runner-test"})
	public void runFinal2() {
		System.out.println("runFinal2");
	}
	
}