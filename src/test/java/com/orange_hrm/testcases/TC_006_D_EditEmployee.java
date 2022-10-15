package com.orange_hrm.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.orange.pageObjects.EditEmployee;
import com.orange.pageObjects.Orange_LoginPage;
import com.orange.pageObjects.SearchEmployee;

public class TC_006_D_EditEmployee extends BaseClass{

	@Test
	public void editEmployee() throws IOException {
		Orange_LoginPage login=new Orange_LoginPage(driver);
		
		logger.info("Application Opend SUccessfully");
		login.setusername(username);
		login.setpassword(password);
		login.clicksubmit();
		logger.info("Login SUuccessfully");
		
		try {
		SearchEmployee search=new  SearchEmployee(driver);
		search.empList();
		search.dropDownSelect();
		logger.info("search with Employee firstName");
		search.enterNameinSearch(newempname);
		search.clickSearchButton();
		logger.info("Search done select deisplayed Employee");
		search.viewEmployee();
		}catch(Exception e) {
			captureScreen(driver, "EditEmployeeonsearch");
			e.getMessage();
			}
	
	
	try {
		EditEmployee edit=new EditEmployee(driver);
	
		edit.clickEditButton();
		edit.enterOtherId("56936");
		edit.enterSSNNO("1234");
		edit.enterSINNO("36923");
		edit.selectIfSmoker();
		edit.enterDOB("1977-11-18");
		edit.selectMartialStatus();
		edit.enterLicienceNO("AVE123EEE564");
		edit.clickSaveButton();
		logger.info("changes happend");
		
		
	}catch(Exception e) {
		
		captureScreen(driver, "FailedEmployeeEdit");
		logger.info("EMplloyee edit Failed:");
	}
	
	}
	
	
	
	
	
}
