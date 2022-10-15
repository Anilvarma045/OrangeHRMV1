package com.orange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmployee_Page {

	WebDriver ldriver;
	public DeleteEmployee_Page(WebDriver rdriver) {
		
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
	}
	//select Employee First then after Delete
	@FindBy(xpath="//input[@id='allCheck']")
	WebElement CheckBOx;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement DeleteButton;	
	
	public void selectCheckBox() {
		
		CheckBOx.click();
	}
	public void clickDeleteButton() {
		DeleteButton.click();
		System.out.println("Delete Employee Successfully");
	}
}
