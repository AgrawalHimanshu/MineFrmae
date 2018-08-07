package com.framework.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNgSequence3 extends TestNgSequence{
	
	@BeforeSuite
	public void beforeSuite3(){
		System.out.println("Executing beforeSuite3");

	}
	
	@Test
	public void test0(){
		System.out.println("Executing Test 0");

	}
	
	@AfterSuite
	public void afterSuite3(){
		System.out.println("Executing afterSuite3");

	}
}
