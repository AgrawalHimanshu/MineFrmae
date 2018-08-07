package com.framework.actions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.framework.automation.SessionInitiator;
import com.framework.pageObjects.Home_Page;
import com.framework.pageObjects.LogIn_Page;
import com.framework.utility.Constant;
import com.framework.utility.ExcelUtils;
import com.framework.utility.Log;
import com.framework.utility.Utils;
import static com.framework.utility.YamlReader.getYamlValue;

// This is called Modularization, when we club series of actions in to one Module

public class SignIn_Action {

	WebDriver driver;

	public SignIn_Action(WebDriver driver) {
		this.driver = driver;
	}

	public void clickMyAccountLink() {
		Home_Page.Text_Box(driver).sendKeys("xyg");
		Reporter.log("Click action is perfromed on My Account link");
	}

	public void enterEmailAddress(String email) {
		LogIn_Page.txtbx_EmailAddress(driver).sendKeys(email);
		// Printing the logs for what we have just performed
		Reporter.log(email + " is entered in UserName text box");
	}

	public void enterPassword(String password) {
		LogIn_Page.txtbx_Password(driver).sendKeys(password);
		Reporter.log(password + " is entered in Password text box");
	}

	public void clickSignInButton()  {
		LogIn_Page.btn_SignIn(driver).click();
		Reporter.log("Click action is performed on Submit button");
	//	Utils.waitForElement(Home_Page.lnk_welcomeMessage());

	}

}
