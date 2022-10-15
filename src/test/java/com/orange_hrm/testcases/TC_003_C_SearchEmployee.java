package com.orange_hrm.testcases;


import org.testng.annotations.Test;


import com.orange.pageObjects.Orange_LoginPage;
import com.orange.pageObjects.SearchEmployee;

public class TC_003_C_SearchEmployee  extends BaseClass  {
	
	@Test
	public void searchEmployee() throws Exception {
		
		Orange_LoginPage login=new Orange_LoginPage(driver);
		login.setusername(username);
		login.setpassword(password);
		login.clicksubmit();
		logger.info("Login with postive set of data");
    

		
		SearchEmployee search=new SearchEmployee(driver);
	
	
		search.empList();
		logger.info("PIM OPEN BY ACTION CLASS");
		search.dropDownSelect();
		logger.info("Drop down handled by Select Class");
		Thread.sleep(2000);

		// Write Here Employee First name TO Search
		search.enterNameinSearch(newempname);    // to search using first name from create emp base page
		logger.info("Search box Handled with Profile firstName");
		Thread.sleep(3);
		search.clickSearchButton();
		logger.info("Search button perfomed search emp will Displayed");
		
		Thread.sleep(2000);
		
		try {
			search.viewEmployee();
	    System.out.println("Employee Displayed SucceSsfully");
		} catch(Exception e) {
			
			System.out.println("we Don't have Employee with that Name or Duplicate Entry");
		e.getMessage();
		}
		  
			captureScreen(driver, "searchPage");
			Thread.sleep(2000);
			logger.info("EMployee details displayed");
	}


	
	
}
