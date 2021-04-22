//POM
package com.org.orn.qa.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.qa.base.TestBase;
import com.org.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	

	public LoginPageTest() throws IOException {
		super();
		
	}
	
  @BeforeMethod
  public void setup() throws IOException {
	  init();
	  lp=new LoginPage();
	  }	
  
  @Test()
  public void title() {
	  
	  String titleChk= lp.ValLoginPage();
	  Assert.assertEquals(titleChk, "OrangeHRM");
  }
  
  @Test(priority=1)
  public void loginTest() {
	  
	  lp.login(prop.getProperty("username"), prop.getProperty("password"));
	  System.out.println(prop.getProperty("username"));
  }

}
