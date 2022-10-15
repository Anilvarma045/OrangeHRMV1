package com.orange.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PostJobVacancyPage {

	WebDriver ldriver;
	public PostJobVacancyPage(WebDriver rdriver) {
	
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(linkText="Recruitment")
	WebElement selectRecrumentmenu;
	
	@FindBy(linkText="Job Vacancies")
	WebElement selectjobvacancies;
	
	@FindBy(xpath="//input[@value='Add']")
	WebElement addbtn;
	
	@FindBy(xpath="//select[@id='cmbJobTitle']")
	WebElement dropjobtitle;
	
	@FindBy(xpath="//input[@id='txtHiringManagerSearch']")
	WebElement hiremanagername;
	
	@FindBy(xpath="//textarea[@id='txtDesc']")
	WebElement postDescription;
	
	@FindBy(xpath="//input[@id='active']")
	WebElement activechekbox;
	
	@FindBy(xpath="//input[@id='editBtn']")
	WebElement savebtn;
	
public void openjobvacancypage() {
	
	Actions ac=new Actions(ldriver);
	ac.moveToElement(selectRecrumentmenu).perform();
    ac.moveToElement(selectjobvacancies).click().build().perform();
    System.out.println("Recurement page open Successfully");
    ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
}

	public void postJobvacancy() throws Exception{
		ldriver.switchTo().frame(0);
		System.out.println("Let's Add Developr job vacancey");
		addbtn.click();
		Select sc=new Select(dropjobtitle);
		sc.selectByIndex(1);
		System.out.println("JOb Title Added Succssfully");
	
	    hiremanagername.sendKeys("Anil Varma");
	    Thread.sleep(2000);
	    postDescription.sendKeys("we are Hireing Java Developer");
	    activechekbox.click();
	    savebtn.click();
	    System.out.println("new post Vacancey Added SUccessfully");
	
	}
	
	
}
