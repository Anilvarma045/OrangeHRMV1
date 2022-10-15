package com.orange_hrm.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.orange.pageObjects.DeleteEmployee_Page;
import com.orange.pageObjects.Orange_LoginPage;
import com.orange.pageObjects.SearchEmployee;

public class TC_005_I_DeleteEmployee extends BaseClass{
	
	@Test
	public void deleteEmployee() throws IOException {
		
		Orange_LoginPage login=new Orange_LoginPage(driver);
		login.setusername(username);
		login.setpassword(password);
		login.clicksubmit();
		logger.info("login SUccessFully");
	try {
		SearchEmployee searchemp=new SearchEmployee(driver);
		searchemp.empList();
		searchemp.dropDownSelect();
		searchemp.enterNameinSearch(deletempname);
		searchemp.clickSearchButton();
		logger.info("searchEmployee done result displayed");
	}
	catch(Exception  e) {
		captureScreen(driver,"searchPage");
		logger.info("Login test failed - Screen captured");

	}
		try {
		DeleteEmployee_Page delemp=new DeleteEmployee_Page(driver);
		delemp.selectCheckBox();
		delemp.clickDeleteButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
		catch(Exception e) {
		captureScreen(driver,"DeletePage");
		logger.info("Delete of Employee failed");
	
		}
	}
	

}
