package com.orange_hrm.testcases;


import org.testng.annotations.Test;

import com.orange.pageObjects.AddEmployee_page;
import com.orange.pageObjects.Orange_LoginPage;
import com.orange_testData.AddMultipleEmpoyeesDDT;


public class TC_011_H_DDT_AddEmployees extends BaseClass{
	
	@Test(priority = 0)
	public void login() {
	
		System.out.println("Im going to login");
	Orange_LoginPage login=new Orange_LoginPage(driver);
	
	login.setusername(username);
	logger.info("user name Entered SUccesssfully");
	login.setpassword(password);
	login.clicksubmit();
	logger.info("Login succeSsfully");
	}
	
	@Test(dataProviderClass =AddMultipleEmpoyeesDDT.class, dataProvider = "addMultiemp", priority = 1)
	public void add_multipleEMployee(String fname, String lname) {
		logger.info("going to ad New Employee");
		
		AddEmployee_page add=new AddEmployee_page(driver);
		
		add.clickAddNewEmployee();
		add.enterFirstName(fname);
		add.entrLastName(lname);
		add.clickSaveButton();
	    logger.info("add Employee SUccessfully");
		driver.get("http://127.0.0.1/orangehrm-2.6/index.php?menu_no_top=hr");
	   System.out.println("Going to add new Employee");
	}
	
	
		
	
}
