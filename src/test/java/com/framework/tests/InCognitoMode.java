package com.framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InCognitoMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxProfile options = new FirefoxProfile();
		options.setPreference("browser.privatebrowsing.autostart", false);
		
		WebDriver driver = new FirefoxDriver(options);
		//ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
//		System.setProperty("webdriver.chrome.driver", "D:\\MineFrameWork\\src\\test\\resources\\drivers\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver(capabilities);

	}

}
