package com.orange_testData;

import org.testng.annotations.DataProvider;

public class AddMultipleEmpoyeesDDT {

	@DataProvider(name="addMultiemp")
	public String[][] addEmpdata() {
		String[][] addEmp= {{"ravi","raja"},
				{"Manoj","Tiwari"},
		        {"Krishna","murthy"},
				{"rama","raju"},
				{"Prabhas","raju"},
				{"manish","pandey"}};
				
		
		return addEmp;
		
	}
	
	
	
}