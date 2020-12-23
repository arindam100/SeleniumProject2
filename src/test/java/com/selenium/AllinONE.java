// All in one3
// All in one3
package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllinONE {
WebDriver driver;	
@BeforeClass 

public void Browser_launch() {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\arindam\\\\driver5\\\\chromedriver.exe");
	
    driver= new ChromeDriver();
	
	
}

@Test
public void Website_launch() {
	driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
	driver.manage().window().maximize();
}

@Test(priority=1)
public void Text() {
	//WebElement name= driver.findElement(By.name("username"));
	
	WebDriverWait wait= new WebDriverWait(driver,20);
	
	WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	
	name.sendKeys("Arindam");
	driver.findElement(By.name("password")).sendKeys("Arindam");
	driver.findElement(By.name("comments")).sendKeys("Arindam");
	//driver.navigate().refresh();
	//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath("//*[@value='cbselenium']")).click();
	
	
	
}
@Test(priority=2)
public void Weblist_dropdown() {
	
	
	
	try {
		Thread.sleep(200);
		
		List<WebElement> Multi= driver.findElements(By.xpath("//*[@class='spTextField' and @name='multipleselect[]']/option"));
		
		
		for (WebElement x: Multi) {
			
			if(x.getText().contains("Agile Methodology")) {
				
				x.click();
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.getMessage();
	}
	
	List<WebElement> Multi1= driver.findElements(By.xpath("//*[@class='spTextField' and @name='dropdown']/option"));
	
	
	for (WebElement y: Multi1) {
		
		if(y.getText().contains("Automation Testing")) {
			
			y.click();
		}
	}
	
}

@AfterClass
public void close_browser() {
	
	driver.close();
}
}
