package com.orange.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchEmployee {

	WebDriver ldriver;
	
     public SearchEmployee(WebDriver rdriver) {

	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(linkText="PIM")
	WebElement PIMMenu;
	
	@FindBy(xpath="//select[@id='loc_code']")
	WebElement DropDown;
	
	@FindBy(xpath="//input[@id='loc_name']")
	WebElement SearchBox;
	
	
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement SearchButton;
	
	@FindBy(xpath="//a[@target='_self']")
	WebElement resultName;
	
	public void empList() {

		Actions ac=new Actions(ldriver);
		ac.moveToElement(ldriver.findElement(By.linkText("PIM"))).perform();
		ac.moveToElement(ldriver.findElement(By.linkText("Employee List"))).click().build().perform();
	
	}
	
	 public void dropDownSelect()  {
   	        ldriver.switchTo().frame(0);
			Select drop=new Select(ldriver.findElement(By.id("loc_code")));
	        drop.selectByVisibleText("Emp. First Name");
	        System.out.println("Drop down select option by First Name");
           
	 }
	public void enterNameinSearch(String fname) {
		SearchBox.sendKeys(fname);
	}
	
	public void clickSearchButton() {
		SearchButton.click();
		System.out.println("search operation done Employee account displayed");
	
	
	
	}
	public void viewEmployee() {
	     resultName.click();
	     System.out.println("serach result Displayed");
	}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
