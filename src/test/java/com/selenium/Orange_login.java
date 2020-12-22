package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orange_login {
	
	WebDriver driver;

	
@BeforeClass
public void browser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\arindam\\\\driver5\\\\chromedriver.exe");
	driver = new ChromeDriver();
	
}

@Test(priority=1)
public void launch_aap() throws InterruptedException {
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	Thread.sleep(600);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	String url=driver.getCurrentUrl();
	Assert.assertTrue(url.contains("/index.php/dashboard"));
	
}

@AfterClass
public void close_browser() {
	
	driver.close();
}

}
