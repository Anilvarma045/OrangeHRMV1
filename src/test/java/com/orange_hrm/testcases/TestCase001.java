package com.orange_hrm.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orange.pageObjects.Orange_LoginPage;

public class TestCase001 extends BaseClass{


	@Test
	 public void loginTest() throws IOException {
		 Orange_LoginPage login=new Orange_LoginPage(driver);
		 login.setusername(username);
		 login.setpassword(password);
			logger.info("Done with Username and password");

		 login.clicksubmit();
		 
		 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f1, new File("E:\\newfile.jpg"));
		 
		 System.out.println(driver.getTitle());
		 
		 Reporter.log(driver.getTitle());	
		 
		 if((driver.getTitle().equals("OrangeHRM"))) {
			 Assert.assertTrue(true);
			 }
				 
			 
			 else{
				 Assert.assertTrue(false);
		
			 }
	logger.info("titleVerified Succesfully");
	              
	}
	
	      
	 }

	
	
	
	
	
	

