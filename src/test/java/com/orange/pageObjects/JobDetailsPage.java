package com.orange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JobDetailsPage {
	WebDriver ldriver;
	public JobDetailsPage(WebDriver rdriver) {
	
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		}
	
	@FindBy(xpath="//a[@id='jobLink']")
	WebElement jobbutton;
	
	@FindBy(xpath="//input[@id='btnEditJob']")
	WebElement editbtn;
	
	@FindBy(xpath="//select[@id='cmbType']")
	WebElement empstatusDropdown;
	
	@FindBy(xpath="//select[@id='cmbEEOCat']")
	WebElement EEOcatgeory;
	
	@FindBy(xpath="//input[@id='txtJoinedDate']")
	WebElement enterdoj;
	
	@FindBy(xpath="//input[@name='EditMain'][@id='btnEditJob']")
	WebElement saveButton;
	
	public void selectJobMenu() {
		jobbutton.click();
		System.out.println("select job option");
		}
	
	public void clickEditbutton() {
		editbtn.click();
		}
	
	public void selectEmployementStatus() {
		Select sc=new Select(empstatusDropdown);
		sc.selectByVisibleText("Full Time Permanent");
		System.out.println("EmployeMent status selected as: Technicians");
		}
	public void selectEEOCategory() {
		Select sc1=new Select(EEOcatgeory);
		sc1.selectByVisibleText("TECHNICIANS");
	   System.out.println("EEO category Selected");
	}
	
	public void enterJoingDate(String doj) {
		enterdoj.sendKeys(doj);
		}
	
	public void clickSaveButton() {
		saveButton.click();
		System.out.println("save the Employee job Profile");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
