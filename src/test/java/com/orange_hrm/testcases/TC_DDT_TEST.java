package com.orange_hrm.testcases;

import org.testng.annotations.Test;

import com.orange.Utility.DataProvider1;
import com.orange.pageObjects.Orange_LoginPage;

public class TC_DDT_TEST extends BaseClass{

	@Test(dataProviderClass = DataProvider1.class, dataProvider = "loginset")
	public void login(String username1, String password1)  throws Exception {
		
		
		System.out.println("user Name is: "+username1);
		System.out.println("Password is: "+password1);
		
		Orange_LoginPage login=new Orange_LoginPage(driver);
		login.setusername(username1);
		login.setpassword(password1);
		login.clicksubmit();
		
		Thread.sleep(2000);
		
		login.logoutApp();
		driver.get(driver.getCurrentUrl());
	}
	
	
	
	
}
