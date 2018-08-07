package com.framework.tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTabNewWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/");
		String parentWindow = driver.getWindowHandle();

		//String select = Keys.chord(Keys.CONTROL);
		
		//driver.findElement(By.xpath("//a[@title='Java']")).sendKeys(Keys.CONTROL,Keys.SHIFT,Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("//a[@title='Java']"));
		Thread.sleep(3000);
		Actions newTab = new Actions(driver);
		newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(5000);
;
		driver.getCurrentUrl();
	
		/*Set<String> set = driver.getWindowHandles();
		
		set.forEach(System.out::println);
		set.remove(parentWindow);
		assert set.size() == 1;

			driver.switchTo().window((String) set.toArray()[0]);
			Thread.sleep(8000);*/
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//input[@id='search_submit']")).sendKeys(Keys.CONTROL + "w");
	

		/*WebElement el = driver.findElement(By.xpath("//input[@id='search_submit']"));
		
		el.click();*/
		driver.close();
				
	}

}
