package com.orange_hrm.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.orange.pageObjects.AssignLeavePage;
import com.orange.pageObjects.Orange_LoginPage;


public class TC_10_G_AssignLeave extends BaseClass {

	@Test
	public void assignleave() throws Exception {
		
		Orange_LoginPage lg=new Orange_LoginPage(driver);
		lg.setusername(username);
		lg.setpassword(password);
		lg.clicksubmit();
		logger.info("login Successfully");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		AssignLeavePage asn=new AssignLeavePage(driver);
		
		asn.selectleaveMenu();
		asn.selectAssingLeave();
		asn.enterEmployeeFullname("Vishnu Rao");
		Thread.sleep(2000);
		asn.selectLeaveType();
    //    asn.selectToDate("2022-08-04");
          asn.selectToDate();
          Thread.sleep(2000);
		asn.enterAnyComment("lets assigne leave to this person for casuel reason");
		asn.selectFromdate("2022-08-03");
        Thread.sleep(2000);
		

		asn.clickAssingbtn();
        logger.info("Successfully Leave Assigned to Employee");
        captureScreen(driver, "leavepage");
        
     	
		
	}
}
