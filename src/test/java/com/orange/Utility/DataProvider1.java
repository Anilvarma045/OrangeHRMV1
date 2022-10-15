package com.orange.Utility;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
	@DataProvider(name="loginset")
	public String[][]logindata(){
		
		String[][] login= {{"nareshit","nareshit"},
		                   {"admin","nareshit"},
		                   {"nareshit","admin"},
		                   {"nareshit","nareshit"}};
		return login;
	}

	
}
