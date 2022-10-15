package com.orange_hrm.testcases;


import org.testng.annotations.Test;

import com.orange.Utility.ReadXLSdata;


public class PrintUSernameandPasswords {

	
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "NewReaddata")
	public static void LoginTest(String username, String password) throws InterruptedException {
		System.out.println(username );
		System.out.println(password);
	}
	

	
	

}

