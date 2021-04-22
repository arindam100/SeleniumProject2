package com.org.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Org_recruitment {

WebDriver driver;
@BeforeClass

public void Browser() {
	
driver = new ChromeDriver();

}

@Test

public void org_login() {
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@name='Submit']")).click();
String url=driver.getCurrentUrl();
Assert.assertTrue(url.contains("dashboard"));
	
}

@Test(priority=1)
public void recruitment() {

if(driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]")).isDisplayed())
{
	driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]")).click();
}

}


@Test(priority=2)	
/*public void vacancy_search() {
List<WebElement> vac=driver.findElements(By.xpath("//*[@id='candidateSearch_jobVacancy']/option"));

for (WebElement v:vac) {
	
	System.out.println(v.getText());
	if(v.getText().contains("Software Engineer")) {
		
	v.click();
		
	}
}

	
}*/

public void vacancy_search() throws Exception {
	
	Thread.sleep(6000);
    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	List<WebElement> dropVacancy=driver.findElements(By.xpath("//*[@id='candidateSearch_jobVacancy']/option"));

	for (WebElement x:dropVacancy) {
		
	System.out.println(x.getText());
		
		if (x.getText().contains("Senior QA Lead")) {
			x.click();
		}
	}
	
	
}	
}
	
	
	
	
	
	

