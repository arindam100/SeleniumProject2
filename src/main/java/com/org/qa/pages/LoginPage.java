package com.org.qa.pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.qa.base.TestBase;

public class LoginPage extends TestBase

{
	//Page objects/Page Factory - OR
	
	@FindBy(id="txtUsername")
	WebElement username;
	

	@FindBy(id="txtPassword")
	WebElement password;
	

	@FindBy(xpath="//input[@name='Submit']")
	WebElement submitLogin;
	
	
	//Now initializing  elements with the help of page factory
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	  public String ValLoginPage() {
	  return driver.getTitle(); 
	  }
	  
	  public String login(String un, String pwd){
	  
	  username.sendKeys(un); 
	  password.sendKeys(pwd);
	  submitLogin.click(); 
	  
	 return "test";
	  
	  
	
	  
	  
	  	  }
	 
	
	
	
	

	

}
