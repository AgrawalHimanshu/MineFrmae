package com.framework.automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class WebDriverFactory {
	private static String browser;
	
	public WebDriver getDriver(Map<String, String> seleniumconfig) {
        browser = seleniumconfig.get("browser");
        if (seleniumconfig.get("server").equalsIgnoreCase("local")) {
            if (browser.equalsIgnoreCase("firefox")) {
                return getFirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")) {
                return getChromeDriver(seleniumconfig.get("driverpathChrome"));
            }
        }   
        if(seleniumconfig.get("server").equalsIgnoreCase("remote")) {
        	return setRemoteDriver(seleniumconfig);
        }
        return new FirefoxDriver();
    }
        
    private static WebDriver getFirefoxDriver() {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.cache.disk.enable", false);
        return new FirefoxDriver(profile);
    }

    private static WebDriver getChromeDriver(String driverpath) {
        System.setProperty("webdriver.chrome.driver", driverpath);
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return new ChromeDriver(cap);
    }
   
    private WebDriver setRemoteDriver(Map<String, String> selConfig) {
        DesiredCapabilities cap = null;
        browser = selConfig.get("browser");
        if (browser.equalsIgnoreCase("firefox")) {
            cap = DesiredCapabilities.firefox();
        } else if (browser.equalsIgnoreCase("chrome")) {
            cap = DesiredCapabilities.chrome();
        }
        String hubaddress = selConfig.get("host");
        URL serverhost = null;
        try {
            serverhost = new URL(hubaddress);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        cap.setJavascriptEnabled(true);
        return new RemoteWebDriver(serverhost, cap);
    }
}

   