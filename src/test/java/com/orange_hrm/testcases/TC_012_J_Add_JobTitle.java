package com.orange_hrm.testcases;

import org.testng.annotations.Test;

import com.orange.pageObjects.CreateJobTitle;
import com.orange.pageObjects.Orange_LoginPage;

public class TC_012_J_Add_JobTitle extends BaseClass{

	@Test
	public void createJobTitle() {
		Orange_LoginPage login=new Orange_LoginPage(driver);
		login.setusername(username);
		login.setpassword(password);
		login.clicksubmit();
		logger.info("Successfully Loged the Application");
		
		CreateJobTitle jtl=new CreateJobTitle(driver);
		jtl.openjobpage();
		logger.info("job title page opened");
		jtl.enterjobDiscription();
		logger.info("new Job created Successfully");
		
		
	}
	
	
	
}
