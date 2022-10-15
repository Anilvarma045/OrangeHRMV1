package com.orange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class AddEmployee_page {
 
	WebDriver ldriver;
	 
	 public AddEmployee_page(WebDriver rdriver) {	 
		 ldriver=rdriver;
		 
		 PageFactory.initElements(rdriver,this);
	 }
		@FindBy(xpath="//input[@value='Add']")
		WebElement Addempbtn;
		
		@FindBy(xpath="//input[@id='txtEmpFirstName']")
		WebElement FirstName;
		
		@FindBy(xpath="//input[@id='txtEmpLastName']")
		WebElement LastName;
		
		@FindBy(xpath="//input[@id='txtEmployeeId']")
		WebElement EmpId;
		
		@FindBy(xpath="//input[@id='txtEmpMiddleName']")
		WebElement MiddleName;
		
		@FindBy(xpath="//input[@id='txtEmpNickName']")
		WebElement NickName;
		
		@FindBy(xpath="//input[@id='photofile']")
		WebElement Photo;
		
		@FindBy(xpath="//input[@id='btnEdit']")
		WebElement SaveButton;

		@FindBy(xpath="//input[@value='Reset']")
		WebElement Restbtn;
	 
        
	
        	
        	 public void clickAddNewEmployee() {
        		 System.out.println("switch into frame");
        		 ldriver.switchTo().frame(0);
        		 
            	 System.out.println("I'm in frame now going to add employee");
            	    Addempbtn.click();
        				
        		}
        	 public String  getEmployeeId() {
        		 String empid=EmpId.getText();
        		 System.out.println("Added Employee EMPID: "+empid);
        		 return empid;
        		 
        	 }
        	 
        	 
        	 
        	 
        	 
        		public void enterFirstName(String fname) {
        			FirstName.sendKeys(fname);
        			
        		}
        		public void entrLastName(String lname) {
        			LastName.sendKeys(lname);
        		}
        		
        		public void enterMiddlename(String mname) {
        			MiddleName.sendKeys(mname);
        		}
        			
        		public void clickSaveButton() {
        			SaveButton.click();
        		      Reporter.log("SUcessfully Added");
        		      
        		     
        		}
 
}
		

