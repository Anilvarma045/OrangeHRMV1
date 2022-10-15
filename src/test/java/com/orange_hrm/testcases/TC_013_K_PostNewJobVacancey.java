package com.orange_hrm.testcases;

import org.testng.annotations.Test;

import com.orange.pageObjects.Orange_LoginPage;
import com.orange.pageObjects.PostJobVacancyPage;

public class TC_013_K_PostNewJobVacancey extends BaseClass{

	@Test
	public void postNewJobVacanicey() throws Exception {
		
		
		Orange_LoginPage login=new Orange_LoginPage(driver);
		login.setusername(username);
		login.setpassword(password);
		login.clicksubmit();
		logger.info("login Successfully");
		
		PostJobVacancyPage pj=new PostJobVacancyPage(driver);
		pj.openjobvacancypage();
		pj.postJobvacancy();
		
		
		
	}
	
	
	
}
