package com.framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.utility.Log;

public class LogIn_Page  {
	private static WebElement element = null;

	

	public static WebElement txtbx_EmailAddress(WebDriver driver) {
		try {
			element = driver.findElement(By.id("email"));
			Log.info("Email text box is found on the Login Page");
		} catch (Exception e) {
			Log.error("Email text box is not found on the Login Page");
		}
		return element;
	}

	public static WebElement txtbx_Password(WebDriver driver) {
		try {
			element = driver.findElement(By.id("password"));
			Log.info("Password text box is found on the Login page");
		} catch (Exception e) {
			Log.error("Password text box is not found on the Login Page");
		}
		return element;
	}

	public static WebElement btn_SignIn(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath("//input[@value='Sign In']"));
			Log.info("Sign In button is found on the Login page");
		} catch (Exception e) {
			Log.error("Sign In button is not found on the Login Page");
		}
		return element;
	}

}
