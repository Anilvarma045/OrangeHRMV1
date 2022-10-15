package com.orange_hrm.testcases;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orange.pageObjects.AddEmployee_page;
import com.orange.pageObjects.Orange_LoginPage;

public class TC_004_B_AddEmployee extends BaseClass {



	@Test
	public void createNewEmployee() throws Exception {
		

		 Orange_LoginPage login=new Orange_LoginPage(driver);
		 login.setusername(username);
		 login.setpassword(password);
			logger.info("Done with Username and password");

		 login.clicksubmit();
		 
		// File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 //FileUtils.copyFile(f1, new File("E:\\newfile.jpg"));
		 
		 System.out.println(driver.getTitle());
		 
		 Reporter.log(driver.getTitle());	
		 
		AddEmployee_page add=new AddEmployee_page(driver);
		Thread.sleep(2000);
		logger.info("Going to Add New Employee");
         add.clickAddNewEmployee();
         
         Thread.sleep(3);
         add.enterFirstName(newempname);
         add.entrLastName(newemplastname);
         add.enterMiddlename(middlename);
         Thread.sleep(3);
    //   System.out.println(empid); 
         
         add.clickSaveButton();
		
		logger.info("Successfully Employee Added");


}
}