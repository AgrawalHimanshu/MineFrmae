package com.framework.tests;

import static com.framework.utility.YamlReader.getYamlValue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.framework.automation.SessionInitiator;

public class SignInToApplication {
	SessionInitiator test;

	@Test
	public void z(){
		System.out.println("In method z");
	}
	
	@Test (priority = -1)
	public void b(){
		System.out.println("In method b");
	}
	
	@Test (priority = 9)
	public void d(){
		System.out.println("In method d");
	}
	
	@Test (priority = 0)
	public void f(){System.out.println("In method f");}

	@Test (priority = -10)
	public void c(){System.out.println("In method c");}
	
	private static int i ;
	
	@Test
	public void simpleTest(){System.out.println("SimpleTest"); }//return 10;}

	 @Test
	 public void factoryMethod() { i =  10;//SimpleTest();
	       System.out.println(i);
	  }
	 
	 @Test
	public int cg(){
			System.out.println("In int return type method");
			return 10;
			
		}
	
	/*@DataProvider
	public Object[][] getData()
	{
		return object[][];
	}*/
	
	/*@BeforeClass
	public void Start_Test_Session() {
		test = new SessionInitiator();
	}
  
	@Test
	public void Step01_Launch_MyCengage_Application() {
		
		WebDriver driver = new FirefoxDriver();
		//driver.navigate()
		driver.findElement(By.xpath(""));
		
		test.launchApplication(getYamlValue("baseUrl"));
	//	test.signInAction.clickMyAccountLink();
		test.signInAction.enterEmailAddress("abc@xyg.com");
		test.signInAction.enterPassword("A111111");
		test.signInAction.clickSignInButton();
	}
		
	@AfterClass
	public void close_Test_Session() throws IOException {
		//test.closeBrowserSession();
	}*/
}
