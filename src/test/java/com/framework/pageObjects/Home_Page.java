package com.framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.framework.utility.Log;


public class Home_Page{

	private static WebElement element = null;
	

	public static WebElement Text_Box(WebDriver driver) {
		try {
			element = driver.findElement(By.id("lst-ib"));
			Log.info("My Account link is found on the Home Page");
		} catch (Exception e) {
			Log.error("My Acocunt link is not found on the Home Page");
			
		}
		return element;
	}
	
	
}
