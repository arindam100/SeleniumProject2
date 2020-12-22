package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Recruitment {
	
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

@Test(priority=2)
public void Menu() throws InterruptedException {
	
	List<WebElement> wb1= driver.findElements(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']/li"));
	//driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']/li//*[@id='menu_recruitment_viewRecruitmentModule']/b")).click();
    for (WebElement el:wb1) {
    	System.out.println(el.getText());
    	
    	    if (el.getText().contains("Recruitment")) {
    		
    		el.click();
    		
    	}
    }
	
}	
	
	
@Test(priority=3)	
public void vacancy_search() {
	
	List<WebElement> dropVacancy=driver.findElements(By.xpath("//*[@id='candidateSearch_jobVacancy']/option"));

	for (WebElement x:dropVacancy) {
		
	System.out.println(x.getText());
		
		if (x.getText().contains("Senior QA Lead")) {
			x.click();
		}
	}
	
	
}	

@AfterClass
public void close_browser() {
	
	driver.close();
}


	
}

