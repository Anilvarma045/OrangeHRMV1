package com.orange_hrm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.orange.pageObjects.AddImagetoEmployee;
import com.orange.pageObjects.Orange_LoginPage;
import com.orange.pageObjects.SearchEmployee;

public class TC_008_F_Upload_photo extends BaseClass {

	@Test
	public void uploadimage() throws Exception,IOException{
		
		Orange_LoginPage login=new Orange_LoginPage(driver);
		login.setusername(username);
		login.setpassword(password);
		login.clicksubmit();
		logger.info("login SUccessfullY");
		
		//   Now Search Employee 
		
		SearchEmployee se=new SearchEmployee(driver);
		se.empList();
		se.dropDownSelect();
		se.enterNameinSearch(newempname);
		se.clickSearchButton();
		se.viewEmployee();
		logger.info("search employee done with first Name:");
		
		AddImagetoEmployee aimage=new  AddImagetoEmployee(driver);
		aimage.clickonImage();
		Thread.sleep(2000);
        logger.info("select image icon");
		aimage.setImagePath();
		Thread.sleep(2000);
		logger.info("select and write image path");
		Thread.sleep(2000);
		aimage.clickSaveButton();

		Thread.sleep(1000);
		logger.info("successfully image Added");
		Thread.sleep(3000);
		
		
		
		
		
		
	}
	
	
	
	
}
