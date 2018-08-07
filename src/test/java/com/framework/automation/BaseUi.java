/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.framework.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Reporter;

public class BaseUi {

	protected WebDriver driver;
	private String pageName;
	WebDriverWait wait;



	protected BaseUi(WebDriver driver, String pageName) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.pageName = pageName;
	}

	protected void logMessage(String message) {
		Reporter.log(message, true);
	}
}
