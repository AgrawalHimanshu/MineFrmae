package com.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.*;


public class AnnotationTest {
	
/*	WebDriver driver = new FirefoxDriver();
*/	
	
	
	@Test(priority = -9, dependsOnMethods = "b")
	public void a(){
		System.out.println("In a");
		//Assert.
		
	}
	
	@Test(priority = 1 )
	public void b(){
		System.out.println("In b");
	}
	
	@Test(enabled = true)
	public void e(){
		System.out.println("In c");
		//return "done";
	}
	
	@Test(priority = 0)
	public void d(){
		System.out.println("In d");
	}

}
