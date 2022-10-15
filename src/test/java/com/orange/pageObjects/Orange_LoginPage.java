package com.orange.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jdk.internal.org.jline.utils.Log;



public class Orange_LoginPage  {

	WebDriver ldriver;
	
	public Orange_LoginPage(WebDriver driver){
		
		
		ldriver=driver;
		PageFactory.initElements(driver, this);	
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

public void logoutApp() {
	ldriver.switchTo().defaultContent();
ldriver.findElement(By.linkText("Logout")).click();

}


}