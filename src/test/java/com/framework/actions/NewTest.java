package com.framework.actions;

import org.openqa.selenium.By;
//import java.util.
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException{
	//public void LaunchGmail() throws InterruptedException{	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sarthi1009@gmail.com");
		//driver.findElement(By.linkText("Next")).click();

		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@#$1234");
		//driver.findElement(By.linkText("Next")).click();
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Reporter.log("Successfully Logged in",true);
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		//System.out.println("Hello");
	}
/*	@Test (priority=1)
	public void LaunchURL(){
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
	}
	
	@Test (priority=2)
	public void EnterUserName() throws InterruptedException{
		driver.findElement(By.id("identifierId")).sendKeys(" @gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
	}
	
	@Test (priority=3)
	public void EnterPassword(){
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gappo@#$1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}
	
	@Test (priority=4)
	public void VerifyUserGetLoggedIn(){
		Reporter.log("Successfully Logged in",true);
	}*/
	/*
	@Test (priority=1)
	public void LaunchURL(){
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test (priority=2)
	public void EnterUserName(){
		driver.findElement(By.id("email")).sendKeys("");
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		//Thread.sleep(5000);
	}
	
	@Test (priority=3)
	public void EnterPassword() throws InterruptedException{
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
	}
	
	@Test (priority=4)
	public void VerifyUserGetLoggedIn(){
		Assert.assertEquals(driver.findElement(By.xpath("(.//span[contains(text(),'Facebook')])[3]")).isDisplayed(),true);
		Reporter.log("Successfully Logged in",true);
	}*/

}
