package com.framework.automation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.framework.actions.SignIn_Action;
import com.framework.utility.*;
import static com.framework.utility.YamlReader.getYamlValue;
import static com.framework.utility.ConfigPropertyReader.getProperty;
import static com.framework.utility.YamlReader.setYamlFilePath;



public class SessionInitiator {
	
	protected WebDriver driver;
	private WebDriverFactory wdfactory;
	public ConfigPropertyReader configPropertyReader;
	String browser;
	String yamlFilePath;
	
	
	/**
	 * Initiating the page objects
	 * 
	 */
	
	public SignIn_Action signInAction;

	private void _initPage() {
		signInAction = new SignIn_Action(driver);
		
	}

	/**
	 * Page object Initiation done
	 * @return 
	 * 
	 */
	public SessionInitiator(String testname) {
		wdfactory = new WebDriverFactory();
		try {
			testInitiator(testname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SessionInitiator() {
		wdfactory = new WebDriverFactory();
		try {
			testInitiator();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void testInitiator() throws IOException {
		setYamlFilePath();
		try {
			_configureBrowser();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_initPage();
	}
	
	private void testInitiator(String testname) throws IOException {
		setYamlFilePath();
		try {
			_configureBrowser();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_initPage();
	}
	
	private void _configureBrowser() throws NumberFormatException, IOException {
		configPropertyReader = new ConfigPropertyReader();
		driver = wdfactory.getDriver(_getSessionConfig());
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		driver.manage()
				.timeouts()
				.implicitlyWait(Integer.parseInt(getProperty("timeout")),
						TimeUnit.SECONDS);
		driver.manage()
				.timeouts()
				.setScriptTimeout(Integer.parseInt(getProperty("timeout")),
						TimeUnit.SECONDS);
	}
	

	public Map<String, String> _getSessionConfig() throws IOException {
	      String[] configKeys = {"tier", "server", "host", "browser", "timeout", "driverpathChrome"};
	      Map<String, String> config = new HashMap<String, String>();
	      for (String string : configKeys) {
	        try {
	          if (System.getProperty(string).isEmpty())
	            config.put(string, getProperty("Config.properties", string));
	          else
	            config.put(string, System.getProperty(string));
	        } catch (NullPointerException e) {
	          config.put(string, getProperty("Config.properties", string));
	        }
	      }
	      return config;
	    }
	
	public void launchApplication(String baseurl) {
		Reporter.log("The application url is :- " + baseurl, true);
		try {
			Reporter.log("The test browser is :- " + _getSessionConfig().get("browser") + "\n", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().deleteAllCookies();
		driver.get(baseurl);
	}
	
	public void closeBrowserSession() {
		try {
			Reporter.log("Browser selected from 'Config.properties' file: "
					+ _getSessionConfig().get("browser"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
