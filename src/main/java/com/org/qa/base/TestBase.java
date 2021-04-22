package com.org.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	

	public TestBase() throws IOException {
	
	prop=new Properties();
		FileInputStream ip= new FileInputStream("C:/Users/adey32/git/SeleniumProject2/src/main/java/com/org/qa/config/config.properties");
		
			prop.load(ip);
			//System.out.println(prop.getProperty("browser"));
}

	public static void init(){
		
		String browserName= prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			//System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win\\chromedriver.exe");
			driver= new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("FF")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
		

	}

}

