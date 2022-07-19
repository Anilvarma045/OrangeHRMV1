package com.orange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Orange_LoginPage  {

	WebDriver rdriver;
	
	public Orange_LoginPage(WebDriver ldriver){
		
		
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(name="txtUserName")
	WebElement txtUsername;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement loginbtn;	


public void setusername(String username) {
     txtUsername.sendKeys(username);
	
}
public void setpassword(String password) {
	txtPassword.sendKeys(password);
}

public void clicksubmit() {
	loginbtn.click();
}

}