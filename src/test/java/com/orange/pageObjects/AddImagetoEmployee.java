package com.orange.pageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddImagetoEmployee {

	WebDriver ldriver;
	
	public AddImagetoEmployee(WebDriver rdriver) {
	
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[normalize-space()='Photograph']")
	WebElement selectImagelink;
	
	@FindBy(xpath="//input[@id='photofile']")
	WebElement imagepath;
	
	@FindBy(xpath="/html/body/form/div[20]/div[1]/div[2]/div[2]/div/input")
	WebElement imagesavebtn;
	
	public void clickonImage() {
		selectImagelink.click();
	}
	public void setImagePath() {
		imagepath.sendKeys("E:\\Accord Solutions\\Anilimage.jpg");
		System.out.println("image path set");
	}
	
	public void clickSaveButton() {
		System.out.println("then click Save Button");
		JavascriptExecutor js=(JavascriptExecutor)this.ldriver;
		js.executeScript("arguments[0].click();", imagesavebtn);
		System.out.println("successfully saved");
	}
	
	
}
