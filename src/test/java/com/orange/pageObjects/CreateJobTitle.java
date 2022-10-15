package com.orange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateJobTitle {

	WebDriver ldriver;
	public CreateJobTitle(WebDriver rdriver) {
	
			ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	     @FindBy(linkText="Admin")
	     WebElement adminmenu;
	     
	     @FindBy(linkText="Job")
	     WebElement selectjob;
	     
	     @FindBy(xpath="//input[@class='plainbtn'][@value='Add']")
	     WebElement addJobtitle;
	     
	     @FindBy(linkText="Job Titles")
	     WebElement jobtitle;
	
         @FindBy(xpath="//input[@id='txtJobTitleName']")
         WebElement jobtitlebox;      
	
         @FindBy(xpath="//textarea[@id='txtJobTitleDesc']")
         WebElement Discriptionbox;
         
         @FindBy(xpath="//textarea[@id='txtJobTitleComments']")
         WebElement commentbox;
         
         @FindBy(xpath="//input[@value='Save']")
         WebElement savebtn;
	
	public void openjobpage() {
		Actions ac=new Actions(ldriver);
		ac.moveToElement(adminmenu).perform();
		System.out.println("click On Admin menu");
		ac.moveToElement(selectjob).perform();
		ac.moveToElement(jobtitle).click().build().perform();
		System.out.println("Click on job title sub menu of Job");
		
	}
	
	public void enterjobDiscription() {
		System.out.println("lets Add job details");
		ldriver.switchTo().frame(0);
		addJobtitle.click();
		jobtitlebox.sendKeys("Java Senior Developer");
		System.out.println("add job title");
		Discriptionbox.sendKeys("TO part of SDLC model to develop java based APp");
		System.out.println("description added Successfully");
		commentbox.sendKeys("plz contact by the company mail");
		System.out.println("job details Added Success fully");
		savebtn.submit();
		System.out.println("successfully created New Job");
		
	}
	
	
	
}
