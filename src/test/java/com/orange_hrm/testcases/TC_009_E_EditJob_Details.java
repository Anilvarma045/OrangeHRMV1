package com.orange_hrm.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.orange.pageObjects.JobDetailsPage;
import com.orange.pageObjects.Orange_LoginPage;
import com.orange.pageObjects.SearchEmployee;

public class TC_009_E_EditJob_Details extends BaseClass {
	@Test
	public void editEmployeeJob() throws Exception{
		
		 Orange_LoginPage login=new Orange_LoginPage(driver);
		 
		 login.setusername(username);
		 login.setpassword(password);
		 login.clicksubmit();
		 logger.info("loging succesfuly");
		 
		 SearchEmployee search=new SearchEmployee(driver);
		 search.empList();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		 search.dropDownSelect();
		 search.enterNameinSearch(newempname);
		search.clickSearchButton();
		search.viewEmployee();
		logger.info("Edit EMployee page opened going to enter job Details");
		
		
		JobDetailsPage jdp=new JobDetailsPage(driver);
		logger.info("currently handlel job job profile page");
		jdp.selectJobMenu();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		logger.info("selected the Job option from Left Menu");
		jdp.clickEditbutton();
		logger.info("click Edit button");
		jdp.selectEmployementStatus();
		logger.info("select Employee status full time:permenent");
		jdp.selectEEOCategory();
		jdp.enterJoingDate("2021-05-16");
		logger.info("enter date of joining");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		jdp.clickSaveButton();
		Thread.sleep(4000);
		logger.info("Job Details Added Successfully");
		logger.getName();
		captureScreen(driver, "UpdateJob");
		logger.info("Job Details Added Successfully");

		
		
	}
	
	
	
	

}
