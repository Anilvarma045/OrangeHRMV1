package com.orange_hrm.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orange.pageObjects.Orange_LoginPage;

public class TC007_Login_DataProvider  extends BaseClass{


	@Test(dataProvider = "loginData") 

	 public void loginTest(String usn, String psw) throws Exception, IOException {
		 Orange_LoginPage login=new Orange_LoginPage(driver);
		 try {
		 login.setusername(usn);
		 login.setpassword(psw);
			logger.info("Done with Username and password");

		 login.clicksubmit();
		 Thread.sleep(3000);
		  
		  driver.findElement(By.linkText("Logout")).click();
		 System.out.println("login SuccessFully"); 
		 
		driver.findElement(By.linkText("Logout")).click();
		 
	}catch(Exception e) {
		     driver.close();
		System.out.println(e.getMessage());
	}
	}


	@DataProvider(name="logindata")
	public String [][] getData() {
		String loginData[][]= {
				{"nareshit","nareshit"},
				{"admin","admin"},
				{"admin","nareshit"}
		};
		return loginData;
		}
            	  
	
	@DataProvider(name="mydata")                      //data provider Declaration with name
	public String [][] getData1() {                  // method with Return type String
		String loginData[][]={                      //  array with Data Set's 
			
				{"name","Anil"},
				{"age","25"}
	};
		return getData();
	}
	
	
	
              }
              

              
              
              
              
              
              
              
              
              
              
              
              
