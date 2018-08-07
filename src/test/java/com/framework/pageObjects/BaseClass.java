package com.framework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BaseClass {
	
	public static WebDriver driver;
	public static boolean bResult;
	
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}
	
	protected void verifyPageURL(String url){
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains(url));
			logMessage("TEST PASSED: PageURL contains:" + URL + "'.");
		}
	
	protected void logMessage(String message) {
		Reporter.log(message, true);
	}
	
	protected String getCurrentURL() {
		return driver.getCurrentUrl();
	}
}
