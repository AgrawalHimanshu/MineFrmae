package com.framework.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.google.com");
	
	Actions ac = new Actions(driver);
	
	driver.findElement(By.id("lst-ib")).sendKeys();
	
	
		/*WebElement e = driver.findElement(By.id("Hello"));
		
		Select s = new Select(e);
		System.out.println("Before Hello");
		assert false;

		System.out.println("Helllo");*/


	}

}
